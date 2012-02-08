/**
 * WSPamcardServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.pamcary.jee.pamcard.webservice;

public class WSPamcardServiceLocator extends org.apache.axis.client.Service implements br.com.pamcary.jee.pamcard.webservice.WSPamcardService {

    public WSPamcardServiceLocator() {
    }


    public WSPamcardServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WSPamcardServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WSPamcard
    private java.lang.String WSPamcard_address = "https://qualidade.gps-pamcary.com.br/pamcardbrvisa/services/WSPamcard";

    public java.lang.String getWSPamcardAddress() {
        return WSPamcard_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WSPamcardWSDDServiceName = "WSPamcard";

    public java.lang.String getWSPamcardWSDDServiceName() {
        return WSPamcardWSDDServiceName;
    }

    public void setWSPamcardWSDDServiceName(java.lang.String name) {
        WSPamcardWSDDServiceName = name;
    }

    public br.com.pamcary.jee.pamcard.webservice.WSPamcard getWSPamcard() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WSPamcard_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWSPamcard(endpoint);
    }

    public br.com.pamcary.jee.pamcard.webservice.WSPamcard getWSPamcard(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.pamcary.jee.pamcard.webservice.WSPamcardSoapBindingStub _stub = new br.com.pamcary.jee.pamcard.webservice.WSPamcardSoapBindingStub(portAddress, this);
            _stub.setPortName(getWSPamcardWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWSPamcardEndpointAddress(java.lang.String address) {
        WSPamcard_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.pamcary.jee.pamcard.webservice.WSPamcard.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.pamcary.jee.pamcard.webservice.WSPamcardSoapBindingStub _stub = new br.com.pamcary.jee.pamcard.webservice.WSPamcardSoapBindingStub(new java.net.URL(WSPamcard_address), this);
                _stub.setPortName(getWSPamcardWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WSPamcard".equals(inputPortName)) {
            return getWSPamcard();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.pamcard.jee.pamcary.com.br", "WSPamcardService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.pamcard.jee.pamcary.com.br", "WSPamcard"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WSPamcard".equals(portName)) {
            setWSPamcardEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
