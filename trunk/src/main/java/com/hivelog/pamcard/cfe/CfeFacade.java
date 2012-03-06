package com.hivelog.pamcard.cfe;

import java.rmi.RemoteException;
import java.util.HashMap;

import javax.xml.rpc.ServiceException;

/**
 * Implementação dos requisitos do projeto Pamcard
 * 
 * @author rasf
 *
 */
public interface CfeFacade {
	
	public void setContext(String string);
	public String getContext();
	public void setCertificate(String string);
	public String getCertificate();
	public void setFields(HashMap<String, String> fields);
	public void execute() throws RemoteException, ServiceException;
}
