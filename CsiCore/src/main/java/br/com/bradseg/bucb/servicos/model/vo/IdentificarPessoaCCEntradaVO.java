/**
 * IdentificarPessoaCCEntradaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class IdentificarPessoaCCEntradaVO  implements java.io.Serializable {
    private java.lang.Long cpf;

    private java.lang.String dataNasc;

    public IdentificarPessoaCCEntradaVO() {
    }

    public IdentificarPessoaCCEntradaVO(
           java.lang.Long cpf,
           java.lang.String dataNasc) {
           this.cpf = cpf;
           this.dataNasc = dataNasc;
    }


    /**
     * Gets the cpf value for this IdentificarPessoaCCEntradaVO.
     * 
     * @return cpf
     */
    public java.lang.Long getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this IdentificarPessoaCCEntradaVO.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.Long cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the dataNasc value for this IdentificarPessoaCCEntradaVO.
     * 
     * @return dataNasc
     */
    public java.lang.String getDataNasc() {
        return dataNasc;
    }


    /**
     * Sets the dataNasc value for this IdentificarPessoaCCEntradaVO.
     * 
     * @param dataNasc
     */
    public void setDataNasc(java.lang.String dataNasc) {
        this.dataNasc = dataNasc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificarPessoaCCEntradaVO)) return false;
        IdentificarPessoaCCEntradaVO other = (IdentificarPessoaCCEntradaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.dataNasc==null && other.getDataNasc()==null) || 
             (this.dataNasc!=null &&
              this.dataNasc.equals(other.getDataNasc())));
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
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getDataNasc() != null) {
            _hashCode += getDataNasc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificarPessoaCCEntradaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarPessoaCCEntradaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNasc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataNasc"));
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
