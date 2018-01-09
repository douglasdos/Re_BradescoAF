/**
 * EntradaListaApoliceVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.servicos.apolice.webservice;

public class EntradaListaApoliceVO  implements java.io.Serializable {
    private java.lang.String cdMatricula;

    private java.lang.Long cpfCnpjSegurado;

    private java.util.Calendar dataOcorrenciaSinistro;

    private java.lang.Integer origemAvisoSinistro;

    public EntradaListaApoliceVO() {
    }

    public EntradaListaApoliceVO(
           java.lang.String cdMatricula,
           java.lang.Long cpfCnpjSegurado,
           java.util.Calendar dataOcorrenciaSinistro,
           java.lang.Integer origemAvisoSinistro) {
           this.cdMatricula = cdMatricula;
           this.cpfCnpjSegurado = cpfCnpjSegurado;
           this.dataOcorrenciaSinistro = dataOcorrenciaSinistro;
           this.origemAvisoSinistro = origemAvisoSinistro;
    }


    /**
     * Gets the cdMatricula value for this EntradaListaApoliceVO.
     * 
     * @return cdMatricula
     */
    public java.lang.String getCdMatricula() {
        return cdMatricula;
    }


    /**
     * Sets the cdMatricula value for this EntradaListaApoliceVO.
     * 
     * @param cdMatricula
     */
    public void setCdMatricula(java.lang.String cdMatricula) {
        this.cdMatricula = cdMatricula;
    }


    /**
     * Gets the cpfCnpjSegurado value for this EntradaListaApoliceVO.
     * 
     * @return cpfCnpjSegurado
     */
    public java.lang.Long getCpfCnpjSegurado() {
        return cpfCnpjSegurado;
    }


    /**
     * Sets the cpfCnpjSegurado value for this EntradaListaApoliceVO.
     * 
     * @param cpfCnpjSegurado
     */
    public void setCpfCnpjSegurado(java.lang.Long cpfCnpjSegurado) {
        this.cpfCnpjSegurado = cpfCnpjSegurado;
    }


    /**
     * Gets the dataOcorrenciaSinistro value for this EntradaListaApoliceVO.
     * 
     * @return dataOcorrenciaSinistro
     */
    public java.util.Calendar getDataOcorrenciaSinistro() {
        return dataOcorrenciaSinistro;
    }


    /**
     * Sets the dataOcorrenciaSinistro value for this EntradaListaApoliceVO.
     * 
     * @param dataOcorrenciaSinistro
     */
    public void setDataOcorrenciaSinistro(java.util.Calendar dataOcorrenciaSinistro) {
        this.dataOcorrenciaSinistro = dataOcorrenciaSinistro;
    }


    /**
     * Gets the origemAvisoSinistro value for this EntradaListaApoliceVO.
     * 
     * @return origemAvisoSinistro
     */
    public java.lang.Integer getOrigemAvisoSinistro() {
        return origemAvisoSinistro;
    }


    /**
     * Sets the origemAvisoSinistro value for this EntradaListaApoliceVO.
     * 
     * @param origemAvisoSinistro
     */
    public void setOrigemAvisoSinistro(java.lang.Integer origemAvisoSinistro) {
        this.origemAvisoSinistro = origemAvisoSinistro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntradaListaApoliceVO)) return false;
        EntradaListaApoliceVO other = (EntradaListaApoliceVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdMatricula==null && other.getCdMatricula()==null) || 
             (this.cdMatricula!=null &&
              this.cdMatricula.equals(other.getCdMatricula()))) &&
            ((this.cpfCnpjSegurado==null && other.getCpfCnpjSegurado()==null) || 
             (this.cpfCnpjSegurado!=null &&
              this.cpfCnpjSegurado.equals(other.getCpfCnpjSegurado()))) &&
            ((this.dataOcorrenciaSinistro==null && other.getDataOcorrenciaSinistro()==null) || 
             (this.dataOcorrenciaSinistro!=null &&
              this.dataOcorrenciaSinistro.equals(other.getDataOcorrenciaSinistro()))) &&
            ((this.origemAvisoSinistro==null && other.getOrigemAvisoSinistro()==null) || 
             (this.origemAvisoSinistro!=null &&
              this.origemAvisoSinistro.equals(other.getOrigemAvisoSinistro())));
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
        if (getCdMatricula() != null) {
            _hashCode += getCdMatricula().hashCode();
        }
        if (getCpfCnpjSegurado() != null) {
            _hashCode += getCpfCnpjSegurado().hashCode();
        }
        if (getDataOcorrenciaSinistro() != null) {
            _hashCode += getDataOcorrenciaSinistro().hashCode();
        }
        if (getOrigemAvisoSinistro() != null) {
            _hashCode += getOrigemAvisoSinistro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntradaListaApoliceVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "entradaListaApoliceVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdMatricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpjSegurado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfCnpjSegurado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOcorrenciaSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataOcorrenciaSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origemAvisoSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origemAvisoSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
