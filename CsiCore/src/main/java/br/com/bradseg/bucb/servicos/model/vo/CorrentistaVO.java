/**
 * CorrentistaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class CorrentistaVO  implements java.io.Serializable {
    private java.util.Calendar dataNascimento;

    private java.lang.String nomeCorrentista;

    private java.lang.String nomeMae;

    private java.lang.String nomePai;

    private java.lang.Integer codigoTipoPessoa;

    private java.lang.Integer codigoTitular;

    private java.lang.Long numeroCpfCnpj;

    public CorrentistaVO() {
    }

    public CorrentistaVO(
           java.util.Calendar dataNascimento,
           java.lang.String nomeCorrentista,
           java.lang.String nomeMae,
           java.lang.String nomePai,
           java.lang.Integer codigoTipoPessoa,
           java.lang.Integer codigoTitular,
           java.lang.Long numeroCpfCnpj) {
           this.dataNascimento = dataNascimento;
           this.nomeCorrentista = nomeCorrentista;
           this.nomeMae = nomeMae;
           this.nomePai = nomePai;
           this.codigoTipoPessoa = codigoTipoPessoa;
           this.codigoTitular = codigoTitular;
           this.numeroCpfCnpj = numeroCpfCnpj;
    }


    /**
     * Gets the dataNascimento value for this CorrentistaVO.
     * 
     * @return dataNascimento
     */
    public java.util.Calendar getDataNascimento() {
        return dataNascimento;
    }


    /**
     * Sets the dataNascimento value for this CorrentistaVO.
     * 
     * @param dataNascimento
     */
    public void setDataNascimento(java.util.Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    /**
     * Gets the nomeCorrentista value for this CorrentistaVO.
     * 
     * @return nomeCorrentista
     */
    public java.lang.String getNomeCorrentista() {
        return nomeCorrentista;
    }


    /**
     * Sets the nomeCorrentista value for this CorrentistaVO.
     * 
     * @param nomeCorrentista
     */
    public void setNomeCorrentista(java.lang.String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }


    /**
     * Gets the nomeMae value for this CorrentistaVO.
     * 
     * @return nomeMae
     */
    public java.lang.String getNomeMae() {
        return nomeMae;
    }


    /**
     * Sets the nomeMae value for this CorrentistaVO.
     * 
     * @param nomeMae
     */
    public void setNomeMae(java.lang.String nomeMae) {
        this.nomeMae = nomeMae;
    }


    /**
     * Gets the nomePai value for this CorrentistaVO.
     * 
     * @return nomePai
     */
    public java.lang.String getNomePai() {
        return nomePai;
    }


    /**
     * Sets the nomePai value for this CorrentistaVO.
     * 
     * @param nomePai
     */
    public void setNomePai(java.lang.String nomePai) {
        this.nomePai = nomePai;
    }


    /**
     * Gets the codigoTipoPessoa value for this CorrentistaVO.
     * 
     * @return codigoTipoPessoa
     */
    public java.lang.Integer getCodigoTipoPessoa() {
        return codigoTipoPessoa;
    }


    /**
     * Sets the codigoTipoPessoa value for this CorrentistaVO.
     * 
     * @param codigoTipoPessoa
     */
    public void setCodigoTipoPessoa(java.lang.Integer codigoTipoPessoa) {
        this.codigoTipoPessoa = codigoTipoPessoa;
    }


    /**
     * Gets the codigoTitular value for this CorrentistaVO.
     * 
     * @return codigoTitular
     */
    public java.lang.Integer getCodigoTitular() {
        return codigoTitular;
    }


    /**
     * Sets the codigoTitular value for this CorrentistaVO.
     * 
     * @param codigoTitular
     */
    public void setCodigoTitular(java.lang.Integer codigoTitular) {
        this.codigoTitular = codigoTitular;
    }


    /**
     * Gets the numeroCpfCnpj value for this CorrentistaVO.
     * 
     * @return numeroCpfCnpj
     */
    public java.lang.Long getNumeroCpfCnpj() {
        return numeroCpfCnpj;
    }


    /**
     * Sets the numeroCpfCnpj value for this CorrentistaVO.
     * 
     * @param numeroCpfCnpj
     */
    public void setNumeroCpfCnpj(java.lang.Long numeroCpfCnpj) {
        this.numeroCpfCnpj = numeroCpfCnpj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrentistaVO)) return false;
        CorrentistaVO other = (CorrentistaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataNascimento==null && other.getDataNascimento()==null) || 
             (this.dataNascimento!=null &&
              this.dataNascimento.equals(other.getDataNascimento()))) &&
            ((this.nomeCorrentista==null && other.getNomeCorrentista()==null) || 
             (this.nomeCorrentista!=null &&
              this.nomeCorrentista.equals(other.getNomeCorrentista()))) &&
            ((this.nomeMae==null && other.getNomeMae()==null) || 
             (this.nomeMae!=null &&
              this.nomeMae.equals(other.getNomeMae()))) &&
            ((this.nomePai==null && other.getNomePai()==null) || 
             (this.nomePai!=null &&
              this.nomePai.equals(other.getNomePai()))) &&
            ((this.codigoTipoPessoa==null && other.getCodigoTipoPessoa()==null) || 
             (this.codigoTipoPessoa!=null &&
              this.codigoTipoPessoa.equals(other.getCodigoTipoPessoa()))) &&
            ((this.codigoTitular==null && other.getCodigoTitular()==null) || 
             (this.codigoTitular!=null &&
              this.codigoTitular.equals(other.getCodigoTitular()))) &&
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
        if (getDataNascimento() != null) {
            _hashCode += getDataNascimento().hashCode();
        }
        if (getNomeCorrentista() != null) {
            _hashCode += getNomeCorrentista().hashCode();
        }
        if (getNomeMae() != null) {
            _hashCode += getNomeMae().hashCode();
        }
        if (getNomePai() != null) {
            _hashCode += getNomePai().hashCode();
        }
        if (getCodigoTipoPessoa() != null) {
            _hashCode += getCodigoTipoPessoa().hashCode();
        }
        if (getCodigoTitular() != null) {
            _hashCode += getCodigoTitular().hashCode();
        }
        if (getNumeroCpfCnpj() != null) {
            _hashCode += getNumeroCpfCnpj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorrentistaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "CorrentistaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataNascimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCorrentista");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeCorrentista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeMae");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeMae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomePai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTipoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
