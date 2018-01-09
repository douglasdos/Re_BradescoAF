/**
 * CoberturaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.servicos.apolice.webservice;

public class CoberturaVO  implements java.io.Serializable {
    private java.lang.Integer codigoCobertura;

    private java.lang.Long codigoCoberturaTecnica;

    private java.lang.String nomeCobertura;

    private java.lang.Double valorLmi;

    public CoberturaVO() {
    }

    public CoberturaVO(
           java.lang.Integer codigoCobertura,
           java.lang.Long codigoCoberturaTecnica,
           java.lang.String nomeCobertura,
           java.lang.Double valorLmi) {
           this.codigoCobertura = codigoCobertura;
           this.codigoCoberturaTecnica = codigoCoberturaTecnica;
           this.nomeCobertura = nomeCobertura;
           this.valorLmi = valorLmi;
    }


    /**
     * Gets the codigoCobertura value for this CoberturaVO.
     * 
     * @return codigoCobertura
     */
    public java.lang.Integer getCodigoCobertura() {
        return codigoCobertura;
    }


    /**
     * Sets the codigoCobertura value for this CoberturaVO.
     * 
     * @param codigoCobertura
     */
    public void setCodigoCobertura(java.lang.Integer codigoCobertura) {
        this.codigoCobertura = codigoCobertura;
    }


    /**
     * Gets the codigoCoberturaTecnica value for this CoberturaVO.
     * 
     * @return codigoCoberturaTecnica
     */
    public java.lang.Long getCodigoCoberturaTecnica() {
        return codigoCoberturaTecnica;
    }


    /**
     * Sets the codigoCoberturaTecnica value for this CoberturaVO.
     * 
     * @param codigoCoberturaTecnica
     */
    public void setCodigoCoberturaTecnica(java.lang.Long codigoCoberturaTecnica) {
        this.codigoCoberturaTecnica = codigoCoberturaTecnica;
    }


    /**
     * Gets the nomeCobertura value for this CoberturaVO.
     * 
     * @return nomeCobertura
     */
    public java.lang.String getNomeCobertura() {
        return nomeCobertura;
    }


    /**
     * Sets the nomeCobertura value for this CoberturaVO.
     * 
     * @param nomeCobertura
     */
    public void setNomeCobertura(java.lang.String nomeCobertura) {
        this.nomeCobertura = nomeCobertura;
    }


    /**
     * Gets the valorLmi value for this CoberturaVO.
     * 
     * @return valorLmi
     */
    public java.lang.Double getValorLmi() {
        return valorLmi;
    }


    /**
     * Sets the valorLmi value for this CoberturaVO.
     * 
     * @param valorLmi
     */
    public void setValorLmi(java.lang.Double valorLmi) {
        this.valorLmi = valorLmi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CoberturaVO)) return false;
        CoberturaVO other = (CoberturaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCobertura==null && other.getCodigoCobertura()==null) || 
             (this.codigoCobertura!=null &&
              this.codigoCobertura.equals(other.getCodigoCobertura()))) &&
            ((this.codigoCoberturaTecnica==null && other.getCodigoCoberturaTecnica()==null) || 
             (this.codigoCoberturaTecnica!=null &&
              this.codigoCoberturaTecnica.equals(other.getCodigoCoberturaTecnica()))) &&
            ((this.nomeCobertura==null && other.getNomeCobertura()==null) || 
             (this.nomeCobertura!=null &&
              this.nomeCobertura.equals(other.getNomeCobertura()))) &&
            ((this.valorLmi==null && other.getValorLmi()==null) || 
             (this.valorLmi!=null &&
              this.valorLmi.equals(other.getValorLmi())));
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
        if (getCodigoCobertura() != null) {
            _hashCode += getCodigoCobertura().hashCode();
        }
        if (getCodigoCoberturaTecnica() != null) {
            _hashCode += getCodigoCoberturaTecnica().hashCode();
        }
        if (getNomeCobertura() != null) {
            _hashCode += getNomeCobertura().hashCode();
        }
        if (getValorLmi() != null) {
            _hashCode += getValorLmi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoberturaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "coberturaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCobertura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCobertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCoberturaTecnica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCoberturaTecnica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCobertura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeCobertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorLmi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorLmi"));
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
