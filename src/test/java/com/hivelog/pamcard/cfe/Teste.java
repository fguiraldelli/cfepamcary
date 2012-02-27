package com.hivelog.pamcard.cfe;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.hst.jee.core.to.webservice.FieldTO;
import br.com.hst.jee.core.to.webservice.RequestTO;
import br.com.hst.jee.core.to.webservice.ResponseTO;
import br.com.pamcary.jee.pamcard.webservice.WSPamcardServiceLocator;

public class Teste {
	
	public static void main (String [] args) throws RemoteException, ServiceException{
		RequestTO request = new RequestTO();
		request.setCertificate("");
		request.setContext("FindCard");
		FieldTO field = new FieldTO();
		field.setKey("viagem.cartao.status.id");
		field.setValue("1");
		request.setFields(new FieldTO[] { field });
		WSPamcardServiceLocator locator = new WSPamcardServiceLocator();		ResponseTO response = locator.getWSPamcard().execute(request);
		System.out.println(response.getContext());
		System.out.println(response.getCertificate());
		System.out.println(response.getToken());
	}

}
