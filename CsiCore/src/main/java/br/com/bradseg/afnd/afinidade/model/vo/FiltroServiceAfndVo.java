/**
 * FiltroServiceAfndVo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.afnd.afinidade.model.vo;

public class FiltroServiceAfndVo  implements java.io.Serializable {
    private java.lang.Long codigoAfinidade;

    private java.lang.Integer tipoFuncionalidade;

    public FiltroServiceAfndVo() {
    }

    public FiltroServiceAfndVo(
           java.lang.Long codigoAfinidade,
           java.lang.Integer tipoFuncionalidade) {
           this.codigoAfinidade = codigoAfinidade;
           this.tipoFuncionalidade = tipoFuncionalidade;
    }


    /**
     * Gets the codigoAfinidade value for this FiltroServiceAfndVo.
     * 
     * @return codigoAfinidade
     */
    public java.lang.Long getCodigoAfinidade() {
        return codigoAfinidade;
    }


    /**
     * Sets the codigoAfinidade value for this FiltroServiceAfndVo.
     * 
     * @param codigoAfinidade
     */
    public void setCodigoAfinidade(java.lang.Long codigoAfinidade) {
        this.codigoAfinidade = codigoAfinidade;
    }


    /**
     * Gets the tipoFuncionalidade value for this FiltroServiceAfndVo.
     * 
     * @return tipoFuncionalidade
     */
    public java.lang.Integer getTipoFuncionalidade() {
        return tipoFuncionalidade;
    }


    /**
     * Sets the tipoFuncionalidade value for this FiltroServiceAfndVo.
     * 
     * @param tipoFuncionalidade
     */
    public void setTipoFuncionalidade(java.lang.Integer tipoFuncionalidade) {
        this.tipoFuncionalidade = tipoFuncionalidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FiltroServiceAfndVo)) return false;
        FiltroServiceAfndVo other = (FiltroServiceAfndVo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoAfinidade==null && other.getCodigoAfinidade()==null) || 
             (this.codigoAfinidade!=null &&
              this.codigoAfinidade.equals(other.getCodigoAfinidade()))) &&
            ((this.tipoFuncionalidade==null && other.getTipoFuncionalidade()==null) || 
             (this.tipoFuncionalidade!=null &&
              this.tipoFuncionalidade.equals(other.getTipoFuncionalidade())));
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
        if (getCodigoAfinidade() != null) {
            _hashCode += getCodigoAfinidade().hashCode();
        }
        if (getTipoFuncionalidade() != null) {
            _hashCode += getTipoFuncionalidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FiltroServiceAfndVo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "FiltroServiceAfndVo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAfinidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "codigoAfinidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFuncionalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "tipoFuncionalidade"));
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
