/**
 * ObterListaPorRaizCep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice;

public class ObterListaPorRaizCep  implements java.io.Serializable {
    private java.lang.String raizCep;

    public ObterListaPorRaizCep() {
    }

    public ObterListaPorRaizCep(
           java.lang.String raizCep) {
           this.raizCep = raizCep;
    }


    /**
     * Gets the raizCep value for this ObterListaPorRaizCep.
     * 
     * @return raizCep
     */
    public java.lang.String getRaizCep() {
        return raizCep;
    }


    /**
     * Sets the raizCep value for this ObterListaPorRaizCep.
     * 
     * @param raizCep
     */
    public void setRaizCep(java.lang.String raizCep) {
        this.raizCep = raizCep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObterListaPorRaizCep)) return false;
        ObterListaPorRaizCep other = (ObterListaPorRaizCep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.raizCep==null && other.getRaizCep()==null) || 
             (this.raizCep!=null &&
              this.raizCep.equals(other.getRaizCep())));
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
        if (getRaizCep() != null) {
            _hashCode += getRaizCep().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObterListaPorRaizCep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "obterListaPorRaizCep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raizCep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raizCep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
