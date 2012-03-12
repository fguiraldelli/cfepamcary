package com.hivelog.pamcard.cfe.imp;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import br.com.hst.jee.core.to.webservice.FieldTO;
import br.com.hst.jee.core.to.webservice.RequestTO;
import br.com.hst.jee.core.to.webservice.ResponseTO;
import br.com.pamcary.jee.pamcard.webservice.WSPamcardServiceLocator;

import com.hivelog.pamcard.cfe.CfeFacade;
import com.hivelog.pamcard.util.PamcardUtil;

public class CfeFacadeImp implements CfeFacade {

	private String viagemId;
	private String ciotNumero;
	private static final String ciotNumeroKey = "viagem.antt.ciot.numero";
	private static final String viagemIdKey = "viagem.id";
	private static final String mensagemRetornoKey = "mensagem.codigo";
	private static final String codigoOperacaoSucessoKey = "0";
	private static final String mensagemOperacaoErro = "mensagem.descricao";
	private static final String contextIncluirContratoFrete = "InsertFreightContract";
	private static final String contextCancelarContratoFrete = "CancelTrip";

	private Map<String, String> processResponseTO(RequestTO request)
			throws RemoteException, ServiceException {
		WSPamcardServiceLocator locator = new WSPamcardServiceLocator();
		ResponseTO response = locator.getWSPamcard().execute(request);
		Map<String, String> responseFields = new HashMap<String, String>();
		for (int i = 0; i < response.getFields().length; i++) {
			responseFields.put(response.getFields()[i].getKey(),
					response.getFields()[i].getValue().toString());
		}
		return responseFields;
	}

	private RequestTO processRequestTO(String context,
			String certificateFilepath, Map<String, String> fields)
			throws CertificateException, IOException {
		RequestTO request = new RequestTO();
		request.setCertificate(PamcardUtil.getBytesFromFile(new File(
				certificateFilepath)));
		request.setContext(context);
		List<FieldTO> listFieldTo = new ArrayList<FieldTO>();
		for (Map.Entry<String, String> entry : fields.entrySet()) {
			FieldTO fieldTO = new FieldTO();
			fieldTO.setKey(entry.getKey());
			fieldTO.setValue(entry.getValue());
			listFieldTo.add(fieldTO);
		}
		request.setFields(listFieldTo.toArray(new FieldTO[listFieldTo.size()]));
		return request;
	}

	public void incluirContratoFrete(String certificateFilepath,
			Map<String, String> fields) throws Exception {
		RequestTO request = processRequestTO(contextIncluirContratoFrete,
				certificateFilepath, fields);
		Map<String, String> responseMap = processResponseTO(request);
		validarOperacaoSucesso(responseMap);
		this.setCiotNumero(responseMap.get(ciotNumeroKey));
		this.setViagemId(responseMap.get(viagemIdKey));
	}

	private void validarOperacaoSucesso(Map<String, String> responseMap)
			throws Exception {
		String mensagem = responseMap.get(mensagemRetornoKey);
		if (!mensagem.equals(codigoOperacaoSucessoKey))
			throw new Exception(responseMap.get(mensagemOperacaoErro));
	}

	public void cancelarContratoFrete(String certificateFilepath,
			Map<String, String> fields) throws Exception {
		RequestTO request = processRequestTO(contextCancelarContratoFrete,
				certificateFilepath, fields);
		Map<String, String> responseMap = processResponseTO(request);
		validarOperacaoSucesso(responseMap);
	}

	public String getViagemId() {
		return viagemId;
	}

	public void setViagemId(String viagemId) {
		this.viagemId = viagemId;
	}

	public String getCiotNumero() {
		return ciotNumero;
	}

	public void setCiotNumero(String ciotNumero) {
		this.ciotNumero = ciotNumero;
	}

}
