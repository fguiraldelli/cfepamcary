/**
 * BaseTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.hst.jee.core.to.webservice;

public class BaseTO  implements java.io.Serializable {
    private java.lang.Object certificate;

    private java.lang.String context;

    private br.com.hst.jee.core.to.webservice.FieldTO[] fields;

    private java.lang.String token;

    public BaseTO() {
    }

    public BaseTO(
           java.lang.Object certificate,
           java.lang.String context,
           br.com.hst.jee.core.to.webservice.FieldTO[] fields,
           java.lang.String token) {
           this.certificate = certificate;
           this.context = context;
           this.fields = fields;
           this.token = token;
    }


    /**
     * Gets the certificate value for this BaseTO.
     * 
     * @return certificate
     */
    public java.lang.Object getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this BaseTO.
     * 
     * @param certificate
     */
    public void setCertificate(java.lang.Object certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the context value for this BaseTO.
     * 
     * @return context
     */
    public java.lang.String getContext() {
        return context;
    }


    /**
     * Sets the context value for this BaseTO.
     * 
     * @param context
     */
    public void setContext(java.lang.String context) {
        this.context = context;
    }


    /**
     * Gets the fields value for this BaseTO.
     * 
     * @return fields
     */
    public br.com.hst.jee.core.to.webservice.FieldTO[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this BaseTO.
     * 
     * @param fields
     */
    public void setFields(br.com.hst.jee.core.to.webservice.FieldTO[] fields) {
        this.fields = fields;
    }


    /**
     * Gets the token value for this BaseTO.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this BaseTO.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseTO)) return false;
        BaseTO other = (BaseTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            ((this.context==null && other.getContext()==null) || 
             (this.context!=null &&
              this.context.equals(other.getContext()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        if (getContext() != null) {
            _hashCode += getContext().hashCode();
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.to.core.jee.hst.com.br", "BaseTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("context");
        elemField.setXmlName(new javax.xml.namespace.QName("", "context"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.to.core.jee.hst.com.br", "FieldTO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
