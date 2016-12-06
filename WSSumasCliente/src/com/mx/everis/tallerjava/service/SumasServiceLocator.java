/**
 * SumasServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.everis.tallerjava.service;

public class SumasServiceLocator extends org.apache.axis.client.Service implements com.mx.everis.tallerjava.service.SumasService {

    public SumasServiceLocator() {
    }


    public SumasServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SumasServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Sumas
    private java.lang.String Sumas_address = "http://localhost:8082/WSSumas/services/Sumas";

    public java.lang.String getSumasAddress() {
        return Sumas_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SumasWSDDServiceName = "Sumas";

    public java.lang.String getSumasWSDDServiceName() {
        return SumasWSDDServiceName;
    }

    public void setSumasWSDDServiceName(java.lang.String name) {
        SumasWSDDServiceName = name;
    }

    public com.mx.everis.tallerjava.service.Sumas getSumas() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Sumas_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSumas(endpoint);
    }

    public com.mx.everis.tallerjava.service.Sumas getSumas(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mx.everis.tallerjava.service.SumasSoapBindingStub _stub = new com.mx.everis.tallerjava.service.SumasSoapBindingStub(portAddress, this);
            _stub.setPortName(getSumasWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSumasEndpointAddress(java.lang.String address) {
        Sumas_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mx.everis.tallerjava.service.Sumas.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mx.everis.tallerjava.service.SumasSoapBindingStub _stub = new com.mx.everis.tallerjava.service.SumasSoapBindingStub(new java.net.URL(Sumas_address), this);
                _stub.setPortName(getSumasWSDDServiceName());
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
        if ("Sumas".equals(inputPortName)) {
            return getSumas();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.tallerjava.everis.mx.com", "SumasService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.tallerjava.everis.mx.com", "Sumas"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Sumas".equals(portName)) {
            setSumasEndpointAddress(address);
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
