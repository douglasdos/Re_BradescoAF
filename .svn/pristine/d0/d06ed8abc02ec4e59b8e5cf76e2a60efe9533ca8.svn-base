/**
 * CosseguradoraVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.servicos.apolice.webservice;

public class CosseguradoraVO  implements java.io.Serializable {
    private java.lang.Integer codigoCiaCongenere;

    private java.lang.Double percentualParticipacao;

    public CosseguradoraVO() {
    }

    public CosseguradoraVO(
           java.lang.Integer codigoCiaCongenere,
           java.lang.Double percentualParticipacao) {
           this.codigoCiaCongenere = codigoCiaCongenere;
           this.percentualParticipacao = percentualParticipacao;
    }


    /**
     * Gets the codigoCiaCongenere value for this CosseguradoraVO.
     * 
     * @return codigoCiaCongenere
     */
    public java.lang.Integer getCodigoCiaCongenere() {
        return codigoCiaCongenere;
    }


    /**
     * Sets the codigoCiaCongenere value for this CosseguradoraVO.
     * 
     * @param codigoCiaCongenere
     */
    public void setCodigoCiaCongenere(java.lang.Integer codigoCiaCongenere) {
        this.codigoCiaCongenere = codigoCiaCongenere;
    }


    /**
     * Gets the percentualParticipacao value for this CosseguradoraVO.
     * 
     * @return percentualParticipacao
     */
    public java.lang.Double getPercentualParticipacao() {
        return percentualParticipacao;
    }


    /**
     * Sets the percentualParticipacao value for this CosseguradoraVO.
     * 
     * @param percentualParticipacao
     */
    public void setPercentualParticipacao(java.lang.Double percentualParticipacao) {
        this.percentualParticipacao = percentualParticipacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CosseguradoraVO)) return false;
        CosseguradoraVO other = (CosseguradoraVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCiaCongenere==null && other.getCodigoCiaCongenere()==null) || 
             (this.codigoCiaCongenere!=null &&
              this.codigoCiaCongenere.equals(other.getCodigoCiaCongenere()))) &&
            ((this.percentualParticipacao==null && other.getPercentualParticipacao()==null) || 
             (this.percentualParticipacao!=null &&
              this.percentualParticipacao.equals(other.getPercentualParticipacao())));
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
        if (getCodigoCiaCongenere() != null) {
            _hashCode += getCodigoCiaCongenere().hashCode();
        }
        if (getPercentualParticipacao() != null) {
            _hashCode += getPercentualParticipacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CosseguradoraVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "cosseguradoraVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCiaCongenere");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCiaCongenere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentualParticipacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentualParticipacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
