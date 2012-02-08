package br.com.pamcary.jee.pamcard.webservice;

public class WSPamcardProxy implements br.com.pamcary.jee.pamcard.webservice.WSPamcard {
  private String _endpoint = null;
  private br.com.pamcary.jee.pamcard.webservice.WSPamcard wSPamcard = null;
  
  public WSPamcardProxy() {
    _initWSPamcardProxy();
  }
  
  public WSPamcardProxy(String endpoint) {
    _endpoint = endpoint;
    _initWSPamcardProxy();
  }
  
  private void _initWSPamcardProxy() {
    try {
      wSPamcard = (new br.com.pamcary.jee.pamcard.webservice.WSPamcardServiceLocator()).getWSPamcard();
      if (wSPamcard != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wSPamcard)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wSPamcard)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wSPamcard != null)
      ((javax.xml.rpc.Stub)wSPamcard)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.pamcary.jee.pamcard.webservice.WSPamcard getWSPamcard() {
    if (wSPamcard == null)
      _initWSPamcardProxy();
    return wSPamcard;
  }
  
  public br.com.hst.jee.core.to.webservice.ResponseTO execute(br.com.hst.jee.core.to.webservice.RequestTO requestTO) throws java.rmi.RemoteException{
    if (wSPamcard == null)
      _initWSPamcardProxy();
    return wSPamcard.execute(requestTO);
  }
  
  
}