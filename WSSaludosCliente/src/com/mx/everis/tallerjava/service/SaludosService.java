/**
 * SaludosService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mx.everis.tallerjava.service;

public interface SaludosService extends javax.xml.rpc.Service {
    public java.lang.String getSaludosAddress();

    public com.mx.everis.tallerjava.service.Saludos getSaludos() throws javax.xml.rpc.ServiceException;

    public com.mx.everis.tallerjava.service.Saludos getSaludos(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
