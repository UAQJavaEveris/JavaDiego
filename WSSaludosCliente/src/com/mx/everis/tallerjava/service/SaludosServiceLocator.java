/**
 * SaludosServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.everis.tallerjava.service;

public class SaludosServiceLocator extends org.apache.axis.client.Service implements com.mx.everis.tallerjava.service.SaludosService {

    public SaludosServiceLocator() {
    }


    public SaludosServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaludosServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Saludos
    private java.lang.String Saludos_address = "http://localhost:8082/WSSaludos/services/Saludos";

    public java.lang.String getSaludosAddress() {
        return Saludos_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaludosWSDDServiceName = "Saludos";

    public java.lang.String getSaludosWSDDServiceName() {
        return SaludosWSDDServiceName;
    }

    public void setSaludosWSDDServiceName(java.lang.String name) {
        SaludosWSDDServiceName = name;
    }

    public com.mx.everis.tallerjava.service.Saludos getSaludos() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Saludos_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaludos(endpoint);
    }

    public com.mx.everis.tallerjava.service.Saludos getSaludos(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mx.everis.tallerjava.service.SaludosSoapBindingStub _stub = new com.mx.everis.tallerjava.service.SaludosSoapBindingStub(portAddress, this);
            _stub.setPortName(getSaludosWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaludosEndpointAddress(java.lang.String address) {
        Saludos_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mx.everis.tallerjava.service.Saludos.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mx.everis.tallerjava.service.SaludosSoapBindingStub _stub = new com.mx.everis.tallerjava.service.SaludosSoapBindingStub(new java.net.URL(Saludos_address), this);
                _stub.setPortName(getSaludosWSDDServiceName());
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
        if ("Saludos".equals(inputPortName)) {
            return getSaludos();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.tallerjava.everis.mx.com", "SaludosService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.tallerjava.everis.mx.com", "Saludos"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Saludos".equals(portName)) {
            setSaludosEndpointAddress(address);
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
