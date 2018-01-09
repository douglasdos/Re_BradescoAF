/**
 * Certificado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisoeletroportatil.canonico.v1;

public class Certificado  implements java.io.Serializable {
    private java.lang.Integer produto;

    private java.lang.Integer codigoEstipulado;

    private java.lang.Short unidadeProduto;

    private java.lang.Long numero;

    public Certificado() {
    }

    public Certificado(
           java.lang.Integer produto,
           java.lang.Integer codigoEstipulado,
           java.lang.Short unidadeProduto,
           java.lang.Long numero) {
           this.produto = produto;
           this.codigoEstipulado = codigoEstipulado;
           this.unidadeProduto = unidadeProduto;
           this.numero = numero;
    }


    /**
     * Gets the produto value for this Certificado.
     * 
     * @return produto
     */
    public java.lang.Integer getProduto() {
        return produto;
    }


    /**
     * Sets the produto value for this Certificado.
     * 
     * @param produto
     */
    public void setProduto(java.lang.Integer produto) {
        this.produto = produto;
    }


    /**
     * Gets the codigoEstipulado value for this Certificado.
     * 
     * @return codigoEstipulado
     */
    public java.lang.Integer getCodigoEstipulado() {
        return codigoEstipulado;
    }


    /**
     * Sets the codigoEstipulado value for this Certificado.
     * 
     * @param codigoEstipulado
     */
    public void setCodigoEstipulado(java.lang.Integer codigoEstipulado) {
        this.codigoEstipulado = codigoEstipulado;
    }


    /**
     * Gets the unidadeProduto value for this Certificado.
     * 
     * @return unidadeProduto
     */
    public java.lang.Short getUnidadeProduto() {
        return unidadeProduto;
    }


    /**
     * Sets the unidadeProduto value for this Certificado.
     * 
     * @param unidadeProduto
     */
    public void setUnidadeProduto(java.lang.Short unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }


    /**
     * Gets the numero value for this Certificado.
     * 
     * @return numero
     */
    public java.lang.Long getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Certificado.
     * 
     * @param numero
     */
    public void setNumero(java.lang.Long numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Certificado)) return false;
        Certificado other = (Certificado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.produto==null && other.getProduto()==null) || 
             (this.produto!=null &&
              this.produto.equals(other.getProduto()))) &&
            ((this.codigoEstipulado==null && other.getCodigoEstipulado()==null) || 
             (this.codigoEstipulado!=null &&
              this.codigoEstipulado.equals(other.getCodigoEstipulado()))) &&
            ((this.unidadeProduto==null && other.getUnidadeProduto()==null) || 
             (this.unidadeProduto!=null &&
              this.unidadeProduto.equals(other.getUnidadeProduto()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero())));
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
        if (getProduto() != null) {
            _hashCode += getProduto().hashCode();
        }
        if (getCodigoEstipulado() != null) {
            _hashCode += getCodigoEstipulado().hashCode();
        }
        if (getUnidadeProduto() != null) {
            _hashCode += getUnidadeProduto().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Certificado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "Certificado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstipulado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "codigoEstipulado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "unidadeProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "numero"));
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
