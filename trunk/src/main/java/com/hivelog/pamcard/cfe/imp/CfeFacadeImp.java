package com.hivelog.pamcard.cfe.imp;

import java.rmi.RemoteException;
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

public class CfeFacadeImp implements CfeFacade {
	private String context;
	private String certificate;
	private Map<String, String> fields;

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public Map<String, String> getFields() {
		return fields;
	}

	public void setFields(HashMap<String, String> map) {
		this.fields = map;
	}

	public void execute() throws RemoteException, ServiceException {
		
		RequestTO request = new RequestTO();
		request.setCertificate(this.getCertificate());
		request.setContext(this.getContext());
		List<FieldTO> listFieldTo = new ArrayList<FieldTO>();
		for (Map.Entry<String, String> entry : getFields().entrySet()) {
			FieldTO fieldTO = new FieldTO();
			fieldTO.setKey(entry.getKey());
			fieldTO.setValue(entry.getValue());
			listFieldTo.add(fieldTO);
		}
		request.setFields( (FieldTO[]) listFieldTo.toArray() );
		WSPamcardServiceLocator locator = new WSPamcardServiceLocator();		
		ResponseTO response = locator.getWSPamcard().execute(request);
		this.setContext(response.getContext());
		this.setCertificate(response.getCertificate().toString());
	}

}
