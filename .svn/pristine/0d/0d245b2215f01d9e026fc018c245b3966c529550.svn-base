/**
 * CepCompletoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice;

public class CepCompletoVO  extends br.com.bradseg.ccep.consultacep.presentation.consultacep.webservice.CepVO  implements java.io.Serializable {
    private java.lang.Long codigoBairro;

    private java.lang.Long codigoCidade;

    public CepCompletoVO() {
    }

    public CepCompletoVO(
           java.lang.String descricaoLogradouro,
           java.lang.String numeroInicial,
           java.lang.String numeroFinal,
           java.lang.String complemento,
           java.lang.String bairro,
           java.lang.String cidade,
           java.lang.String siglaUf,
           java.lang.String cep,
           java.lang.Long tipoCep,
           java.lang.Long cepMunicSubor,
           java.lang.String bairroAbrev,
           java.lang.String logradouroAbrev,
           java.lang.String siglaUfIBGE,
           java.lang.String nomeUf,
           java.lang.String municipioIBGE,
           java.lang.String unidadeOper,
           java.lang.Long codigoLogradouro,
           java.lang.Long codigoBairro,
           java.lang.Long codigoCidade) {
        super(
            descricaoLogradouro,
            numeroInicial,
            numeroFinal,
            complemento,
            bairro,
            cidade,
            siglaUf,
            cep,
            tipoCep,
            cepMunicSubor,
            bairroAbrev,
            logradouroAbrev,
            siglaUfIBGE,
            nomeUf,
            municipioIBGE,
            unidadeOper,
            codigoLogradouro);
        this.codigoBairro = codigoBairro;
        this.codigoCidade = codigoCidade;
    }


    /**
     * Gets the codigoBairro value for this CepCompletoVO.
     * 
     * @return codigoBairro
     */
    public java.lang.Long getCodigoBairro() {
        return codigoBairro;
    }


    /**
     * Sets the codigoBairro value for this CepCompletoVO.
     * 
     * @param codigoBairro
     */
    public void setCodigoBairro(java.lang.Long codigoBairro) {
        this.codigoBairro = codigoBairro;
    }


    /**
     * Gets the codigoCidade value for this CepCompletoVO.
     * 
     * @return codigoCidade
     */
    public java.lang.Long getCodigoCidade() {
        return codigoCidade;
    }


    /**
     * Sets the codigoCidade value for this CepCompletoVO.
     * 
     * @param codigoCidade
     */
    public void setCodigoCidade(java.lang.Long codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CepCompletoVO)) return false;
        CepCompletoVO other = (CepCompletoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codigoBairro==null && other.getCodigoBairro()==null) || 
             (this.codigoBairro!=null &&
              this.codigoBairro.equals(other.getCodigoBairro()))) &&
            ((this.codigoCidade==null && other.getCodigoCidade()==null) || 
             (this.codigoCidade!=null &&
              this.codigoCidade.equals(other.getCodigoCidade())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCodigoBairro() != null) {
            _hashCode += getCodigoBairro().hashCode();
        }
        if (getCodigoCidade() != null) {
            _hashCode += getCodigoCidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CepCompletoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.consultacep.presentation.consultacep.ccep.bradseg.com.br/", "cepCompletoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoBairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoBairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
//        return typeDesc;
    	return null;
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
