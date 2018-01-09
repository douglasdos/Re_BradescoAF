/**
 * ListarCorrentistasPorAgCcVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ListarCorrentistasPorAgCcVO  implements java.io.Serializable {
    private java.lang.Integer agencia;

    private java.lang.Long contaCorrente;

    private java.lang.Integer opcaoTitular;

    private java.lang.Integer tpConta;

    private java.lang.String dvConta;

    public ListarCorrentistasPorAgCcVO() {
    }

    public ListarCorrentistasPorAgCcVO(
           java.lang.Integer agencia,
           java.lang.Long contaCorrente,
           java.lang.Integer opcaoTitular,
           java.lang.Integer tpConta,
           java.lang.String dvConta) {
           this.agencia = agencia;
           this.contaCorrente = contaCorrente;
           this.opcaoTitular = opcaoTitular;
           this.tpConta = tpConta;
           this.dvConta = dvConta;
    }


    /**
     * Gets the agencia value for this ListarCorrentistasPorAgCcVO.
     * 
     * @return agencia
     */
    public java.lang.Integer getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this ListarCorrentistasPorAgCcVO.
     * 
     * @param agencia
     */
    public void setAgencia(java.lang.Integer agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the contaCorrente value for this ListarCorrentistasPorAgCcVO.
     * 
     * @return contaCorrente
     */
    public java.lang.Long getContaCorrente() {
        return contaCorrente;
    }


    /**
     * Sets the contaCorrente value for this ListarCorrentistasPorAgCcVO.
     * 
     * @param contaCorrente
     */
    public void setContaCorrente(java.lang.Long contaCorrente) {
        this.contaCorrente = contaCorrente;
    }


    /**
     * Gets the opcaoTitular value for this ListarCorrentistasPorAgCcVO.
     * 
     * @return opcaoTitular
     */
    public java.lang.Integer getOpcaoTitular() {
        return opcaoTitular;
    }


    /**
     * Sets the opcaoTitular value for this ListarCorrentistasPorAgCcVO.
     * 
     * @param opcaoTitular
     */
    public void setOpcaoTitular(java.lang.Integer opcaoTitular) {
        this.opcaoTitular = opcaoTitular;
    }


    /**
     * Gets the tpConta value for this ListarCorrentistasPorAgCcVO.
     * 
     * @return tpConta
     */
    public java.lang.Integer getTpConta() {
        return tpConta;
    }


    /**
     * Sets the tpConta value for this ListarCorrentistasPorAgCcVO.
     * 
     * @param tpConta
     */
    public void setTpConta(java.lang.Integer tpConta) {
        this.tpConta = tpConta;
    }


    /**
     * Gets the dvConta value for this ListarCorrentistasPorAgCcVO.
     * 
     * @return dvConta
     */
    public java.lang.String getDvConta() {
        return dvConta;
    }


    /**
     * Sets the dvConta value for this ListarCorrentistasPorAgCcVO.
     * 
     * @param dvConta
     */
    public void setDvConta(java.lang.String dvConta) {
        this.dvConta = dvConta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarCorrentistasPorAgCcVO)) return false;
        ListarCorrentistasPorAgCcVO other = (ListarCorrentistasPorAgCcVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.contaCorrente==null && other.getContaCorrente()==null) || 
             (this.contaCorrente!=null &&
              this.contaCorrente.equals(other.getContaCorrente()))) &&
            ((this.opcaoTitular==null && other.getOpcaoTitular()==null) || 
             (this.opcaoTitular!=null &&
              this.opcaoTitular.equals(other.getOpcaoTitular()))) &&
            ((this.tpConta==null && other.getTpConta()==null) || 
             (this.tpConta!=null &&
              this.tpConta.equals(other.getTpConta()))) &&
            ((this.dvConta==null && other.getDvConta()==null) || 
             (this.dvConta!=null &&
              this.dvConta.equals(other.getDvConta())));
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
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getContaCorrente() != null) {
            _hashCode += getContaCorrente().hashCode();
        }
        if (getOpcaoTitular() != null) {
            _hashCode += getOpcaoTitular().hashCode();
        }
        if (getTpConta() != null) {
            _hashCode += getTpConta().hashCode();
        }
        if (getDvConta() != null) {
            _hashCode += getDvConta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarCorrentistasPorAgCcVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarCorrentistasPorAgCcVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaCorrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opcaoTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opcaoTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpConta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tpConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvConta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dvConta"));
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
