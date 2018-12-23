/**
 * Conversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka;

public interface Conversion extends java.rmi.Remote {
    public int feetToInches(int feet) throws java.rmi.RemoteException;
    public int mtrsToCms(int mtrs) throws java.rmi.RemoteException;
    public java.lang.String registerUser(java.lang.String name, java.lang.String phone, java.lang.String email) throws java.rmi.RemoteException;
}
