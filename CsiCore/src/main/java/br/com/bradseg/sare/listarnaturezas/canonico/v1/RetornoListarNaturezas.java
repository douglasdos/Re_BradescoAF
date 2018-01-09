/**
 * RetornoListarNaturezas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarnaturezas.canonico.v1;

public class RetornoListarNaturezas  implements java.io.Serializable {
    private java.lang.Short codigo;

    private java.lang.Short codigoSQL;

    private java.lang.String mensagem;

    public RetornoListarNaturezas() {
    }

    public RetornoListarNaturezas(
           java.lang.Short codigo,
           java.lang.Short codigoSQL,
           java.lang.String mensagem) {
           this.codigo = codigo;
           this.codigoSQL = codigoSQL;
           this.mensagem = mensagem;
    }


    /**
     * Gets the codigo value for this RetornoListarNaturezas.
     * 
     * @return codigo
     */
    public java.lang.Short getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RetornoListarNaturezas.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Short codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the codigoSQL value for this RetornoListarNaturezas.
     * 
     * @return codigoSQL
     */
    public java.lang.Short getCodigoSQL() {
        return codigoSQL;
    }


    /**
     * Sets the codigoSQL value for this RetornoListarNaturezas.
     * 
     * @param codigoSQL
     */
    public void setCodigoSQL(java.lang.Short codigoSQL) {
        this.codigoSQL = codigoSQL;
    }


    /**
     * Gets the mensagem value for this RetornoListarNaturezas.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this RetornoListarNaturezas.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoListarNaturezas)) return false;
        RetornoListarNaturezas other = (RetornoListarNaturezas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.codigoSQL==null && other.getCodigoSQL()==null) || 
             (this.codigoSQL!=null &&
              this.codigoSQL.equals(other.getCodigoSQL()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getCodigoSQL() != null) {
            _hashCode += getCodigoSQL().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoListarNaturezas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "RetornoListarNaturezas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSQL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "codigoSQL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
