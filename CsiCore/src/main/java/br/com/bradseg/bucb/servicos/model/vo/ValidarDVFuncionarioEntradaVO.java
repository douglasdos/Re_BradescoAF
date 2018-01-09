/**
 * ValidarDVFuncionarioEntradaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ValidarDVFuncionarioEntradaVO  implements java.io.Serializable {
    private java.lang.String cdvContaCorrente;

    private java.lang.Long codigoAgencia;

    private java.lang.Long cpfCnpj;

    private java.lang.Long numeroContaCorrente;

    private java.lang.Long tipoPesquisa;

    private java.lang.Long razaoContaCorrente;

    public ValidarDVFuncionarioEntradaVO() {
    }

    public ValidarDVFuncionarioEntradaVO(
           java.lang.String cdvContaCorrente,
           java.lang.Long codigoAgencia,
           java.lang.Long cpfCnpj,
           java.lang.Long numeroContaCorrente,
           java.lang.Long tipoPesquisa,
           java.lang.Long razaoContaCorrente) {
           this.cdvContaCorrente = cdvContaCorrente;
           this.codigoAgencia = codigoAgencia;
           this.cpfCnpj = cpfCnpj;
           this.numeroContaCorrente = numeroContaCorrente;
           this.tipoPesquisa = tipoPesquisa;
           this.razaoContaCorrente = razaoContaCorrente;
    }


    /**
     * Gets the cdvContaCorrente value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @return cdvContaCorrente
     */
    public java.lang.String getCdvContaCorrente() {
        return cdvContaCorrente;
    }


    /**
     * Sets the cdvContaCorrente value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @param cdvContaCorrente
     */
    public void setCdvContaCorrente(java.lang.String cdvContaCorrente) {
        this.cdvContaCorrente = cdvContaCorrente;
    }


    /**
     * Gets the codigoAgencia value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @return codigoAgencia
     */
    public java.lang.Long getCodigoAgencia() {
        return codigoAgencia;
    }


    /**
     * Sets the codigoAgencia value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @param codigoAgencia
     */
    public void setCodigoAgencia(java.lang.Long codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }


    /**
     * Gets the cpfCnpj value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @return cpfCnpj
     */
    public java.lang.Long getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(java.lang.Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the numeroContaCorrente value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @return numeroContaCorrente
     */
    public java.lang.Long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }


    /**
     * Sets the numeroContaCorrente value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @param numeroContaCorrente
     */
    public void setNumeroContaCorrente(java.lang.Long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }


    /**
     * Gets the tipoPesquisa value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @return tipoPesquisa
     */
    public java.lang.Long getTipoPesquisa() {
        return tipoPesquisa;
    }


    /**
     * Sets the tipoPesquisa value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @param tipoPesquisa
     */
    public void setTipoPesquisa(java.lang.Long tipoPesquisa) {
        this.tipoPesquisa = tipoPesquisa;
    }


    /**
     * Gets the razaoContaCorrente value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @return razaoContaCorrente
     */
    public java.lang.Long getRazaoContaCorrente() {
        return razaoContaCorrente;
    }


    /**
     * Sets the razaoContaCorrente value for this ValidarDVFuncionarioEntradaVO.
     * 
     * @param razaoContaCorrente
     */
    public void setRazaoContaCorrente(java.lang.Long razaoContaCorrente) {
        this.razaoContaCorrente = razaoContaCorrente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarDVFuncionarioEntradaVO)) return false;
        ValidarDVFuncionarioEntradaVO other = (ValidarDVFuncionarioEntradaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdvContaCorrente==null && other.getCdvContaCorrente()==null) || 
             (this.cdvContaCorrente!=null &&
              this.cdvContaCorrente.equals(other.getCdvContaCorrente()))) &&
            ((this.codigoAgencia==null && other.getCodigoAgencia()==null) || 
             (this.codigoAgencia!=null &&
              this.codigoAgencia.equals(other.getCodigoAgencia()))) &&
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.numeroContaCorrente==null && other.getNumeroContaCorrente()==null) || 
             (this.numeroContaCorrente!=null &&
              this.numeroContaCorrente.equals(other.getNumeroContaCorrente()))) &&
            ((this.tipoPesquisa==null && other.getTipoPesquisa()==null) || 
             (this.tipoPesquisa!=null &&
              this.tipoPesquisa.equals(other.getTipoPesquisa()))) &&
            ((this.razaoContaCorrente==null && other.getRazaoContaCorrente()==null) || 
             (this.razaoContaCorrente!=null &&
              this.razaoContaCorrente.equals(other.getRazaoContaCorrente())));
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
        if (getCdvContaCorrente() != null) {
            _hashCode += getCdvContaCorrente().hashCode();
        }
        if (getCodigoAgencia() != null) {
            _hashCode += getCodigoAgencia().hashCode();
        }
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getNumeroContaCorrente() != null) {
            _hashCode += getNumeroContaCorrente().hashCode();
        }
        if (getTipoPesquisa() != null) {
            _hashCode += getTipoPesquisa().hashCode();
        }
        if (getRazaoContaCorrente() != null) {
            _hashCode += getRazaoContaCorrente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarDVFuncionarioEntradaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDVFuncionarioEntradaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdvContaCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdvContaCorrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContaCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroContaCorrente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPesquisa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPesquisa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razaoContaCorrente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "razaoContaCorrente"));
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
