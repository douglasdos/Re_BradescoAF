/**
 * IDBucPorContaCorrenteCpfCnpjVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class IDBucPorContaCorrenteCpfCnpjVO  implements java.io.Serializable {
    private java.lang.Integer codigoAgencia;

    private java.lang.Integer dvContaCorrente;

    private java.lang.Long numeroContaCorrente;

    private java.lang.Long numeroCpfCnpj;

    public IDBucPorContaCorrenteCpfCnpjVO() {
    }

    public IDBucPorContaCorrenteCpfCnpjVO(
           java.lang.Integer codigoAgencia,
           java.lang.Integer dvContaCorrente,
           java.lang.Long numeroContaCorrente,
           java.lang.Long numeroCpfCnpj) {
           this.codigoAgencia = codigoAgencia;
           this.dvContaCorrente = dvContaCorrente;
           this.numeroContaCorrente = numeroContaCorrente;
           this.numeroCpfCnpj = numeroCpfCnpj;
    }


    /**
     * Gets the codigoAgencia value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @return codigoAgencia
     */
    public java.lang.Integer getCodigoAgencia() {
        return codigoAgencia;
    }


    /**
     * Sets the codigoAgencia value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @param codigoAgencia
     */
    public void setCodigoAgencia(java.lang.Integer codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }


    /**
     * Gets the dvContaCorrente value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @return dvContaCorrente
     */
    public java.lang.Integer getDvContaCorrente() {
        return dvContaCorrente;
    }


    /**
     * Sets the dvContaCorrente value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @param dvContaCorrente
     */
    public void setDvContaCorrente(java.lang.Integer dvContaCorrente) {
        this.dvContaCorrente = dvContaCorrente;
    }


    /**
     * Gets the numeroContaCorrente value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @return numeroContaCorrente
     */
    public java.lang.Long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }


    /**
     * Sets the numeroContaCorrente value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @param numeroContaCorrente
     */
    public void setNumeroContaCorrente(java.lang.Long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }


    /**
     * Gets the numeroCpfCnpj value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @return numeroCpfCnpj
     */
    public java.lang.Long getNumeroCpfCnpj() {
        return numeroCpfCnpj;
    }


    /**
     * Sets the numeroCpfCnpj value for this IDBucPorContaCorrenteCpfCnpjVO.
     * 
     * @param numeroCpfCnpj
     */
    public void setNumeroCpfCnpj(java.lang.Long numeroCpfCnpj) {
        this.numeroCpfCnpj = numeroCpfCnpj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDBucPorContaCorrenteCpfCnpjVO)) return false;
        IDBucPorContaCorrenteCpfCnpjVO other = (IDBucPorContaCorrenteCpfCnpjVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoAgencia==null && other.getCodigoAgencia()==null) || 
             (this.codigoAgencia!=null &&
              this.codigoAgencia.equals(other.getCodigoAgencia()))) &&
            ((this.dvContaCorrente==null && other.getDvContaCorrente()==null) || 
             (this.dvContaCorrente!=null &&
              this.dvContaCorrente.equals(other.getDvContaCorrente()))) &&
            ((this.numeroContaCorrente==null && other.getNumeroContaCorrente()==null) || 
             (this.numeroContaCorrente!=null &&
              this.numeroContaCorrente.equals(other.getNumeroContaCorrente()))) &&
            ((this.numeroCpfCnpj==null && other.getNumeroCpfCnpj()==null) || 
             (this.numeroCpfCnpj!=null &&
              this.numeroCpfCnpj.equals(other.getNumeroCpfCnpj())));
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
        if (getCodigoAgencia() != null) {
            _hashCode += getCodigoAgencia().hashCode();
        }
        if (getDvContaCorrente() != null) {
            _hashCode += getDvContaCorrente().hashCode();
        }
        if (getNumeroContaCorrente() != null) {
            _hashCode += getNumeroContaCorrente().hashCode();
        }
        if (getNumeroCpfCnpj() != null) {
            _hashCode += getNumeroCpfCnpj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDBucPorContaCorrenteCpfCnpjVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IDBucPorContaCorrenteCpfCnpjVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvContaCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dvContaCorrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContaCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroContaCorrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
