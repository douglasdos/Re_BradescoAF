/**
 * AvisoVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.servicos.apolice.webservice;

public class AvisoVO  implements java.io.Serializable {
    private java.util.Calendar dataOcorrenciaSinistro;

    private java.lang.String descricaoSinistro;

    private java.lang.String horaOcorrenciaSinistro;

    private java.lang.Long numeroComunicado;

    public AvisoVO() {
    }

    public AvisoVO(
           java.util.Calendar dataOcorrenciaSinistro,
           java.lang.String descricaoSinistro,
           java.lang.String horaOcorrenciaSinistro,
           java.lang.Long numeroComunicado) {
           this.dataOcorrenciaSinistro = dataOcorrenciaSinistro;
           this.descricaoSinistro = descricaoSinistro;
           this.horaOcorrenciaSinistro = horaOcorrenciaSinistro;
           this.numeroComunicado = numeroComunicado;
    }


    /**
     * Gets the dataOcorrenciaSinistro value for this AvisoVO.
     * 
     * @return dataOcorrenciaSinistro
     */
    public java.util.Calendar getDataOcorrenciaSinistro() {
        return dataOcorrenciaSinistro;
    }


    /**
     * Sets the dataOcorrenciaSinistro value for this AvisoVO.
     * 
     * @param dataOcorrenciaSinistro
     */
    public void setDataOcorrenciaSinistro(java.util.Calendar dataOcorrenciaSinistro) {
        this.dataOcorrenciaSinistro = dataOcorrenciaSinistro;
    }


    /**
     * Gets the descricaoSinistro value for this AvisoVO.
     * 
     * @return descricaoSinistro
     */
    public java.lang.String getDescricaoSinistro() {
        return descricaoSinistro;
    }


    /**
     * Sets the descricaoSinistro value for this AvisoVO.
     * 
     * @param descricaoSinistro
     */
    public void setDescricaoSinistro(java.lang.String descricaoSinistro) {
        this.descricaoSinistro = descricaoSinistro;
    }


    /**
     * Gets the horaOcorrenciaSinistro value for this AvisoVO.
     * 
     * @return horaOcorrenciaSinistro
     */
    public java.lang.String getHoraOcorrenciaSinistro() {
        return horaOcorrenciaSinistro;
    }


    /**
     * Sets the horaOcorrenciaSinistro value for this AvisoVO.
     * 
     * @param horaOcorrenciaSinistro
     */
    public void setHoraOcorrenciaSinistro(java.lang.String horaOcorrenciaSinistro) {
        this.horaOcorrenciaSinistro = horaOcorrenciaSinistro;
    }


    /**
     * Gets the numeroComunicado value for this AvisoVO.
     * 
     * @return numeroComunicado
     */
    public java.lang.Long getNumeroComunicado() {
        return numeroComunicado;
    }


    /**
     * Sets the numeroComunicado value for this AvisoVO.
     * 
     * @param numeroComunicado
     */
    public void setNumeroComunicado(java.lang.Long numeroComunicado) {
        this.numeroComunicado = numeroComunicado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvisoVO)) return false;
        AvisoVO other = (AvisoVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataOcorrenciaSinistro==null && other.getDataOcorrenciaSinistro()==null) || 
             (this.dataOcorrenciaSinistro!=null &&
              this.dataOcorrenciaSinistro.equals(other.getDataOcorrenciaSinistro()))) &&
            ((this.descricaoSinistro==null && other.getDescricaoSinistro()==null) || 
             (this.descricaoSinistro!=null &&
              this.descricaoSinistro.equals(other.getDescricaoSinistro()))) &&
            ((this.horaOcorrenciaSinistro==null && other.getHoraOcorrenciaSinistro()==null) || 
             (this.horaOcorrenciaSinistro!=null &&
              this.horaOcorrenciaSinistro.equals(other.getHoraOcorrenciaSinistro()))) &&
            ((this.numeroComunicado==null && other.getNumeroComunicado()==null) || 
             (this.numeroComunicado!=null &&
              this.numeroComunicado.equals(other.getNumeroComunicado())));
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
        if (getDataOcorrenciaSinistro() != null) {
            _hashCode += getDataOcorrenciaSinistro().hashCode();
        }
        if (getDescricaoSinistro() != null) {
            _hashCode += getDescricaoSinistro().hashCode();
        }
        if (getHoraOcorrenciaSinistro() != null) {
            _hashCode += getHoraOcorrenciaSinistro().hashCode();
        }
        if (getNumeroComunicado() != null) {
            _hashCode += getNumeroComunicado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvisoVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "avisoVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataOcorrenciaSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataOcorrenciaSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaOcorrenciaSinistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horaOcorrenciaSinistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroComunicado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroComunicado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
