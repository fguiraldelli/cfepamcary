package com.hivelog.pamcard.cfe;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import com.hivelog.pamcard.cfe.imp.CfeFacadeImp;

public class Teste {

	public static void main(String[] args) throws RemoteException,
			ServiceException {
		CfeFacade cfe = new CfeFacadeImp();
		cfe.setCertificate("");
		cfe.setContext("FindCard");
		Map<String, String> map = new HashMap<String, String>();
		map.put("viagem.cartao.status.id", "1");
		cfe.setFields(map);
		cfe.execute();
		System.out.println(cfe.getContext());
		System.out.println(cfe.getCertificate());
	}

}
