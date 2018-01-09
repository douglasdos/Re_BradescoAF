/**
 * ComunicadoEmpresa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisoeletroportatil.canonico.v1;

public class ComunicadoEmpresa  implements java.io.Serializable {
    private java.lang.Integer item;

    private java.math.BigDecimal valorLucroCesante;

    private java.math.BigDecimal valorRiscoDano;

    public ComunicadoEmpresa() {
    }

    public ComunicadoEmpresa(
           java.lang.Integer item,
           java.math.BigDecimal valorLucroCesante,
           java.math.BigDecimal valorRiscoDano) {
           this.item = item;
           this.valorLucroCesante = valorLucroCesante;
           this.valorRiscoDano = valorRiscoDano;
    }


    /**
     * Gets the item value for this ComunicadoEmpresa.
     * 
     * @return item
     */
    public java.lang.Integer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ComunicadoEmpresa.
     * 
     * @param item
     */
    public void setItem(java.lang.Integer item) {
        this.item = item;
    }


    /**
     * Gets the valorLucroCesante value for this ComunicadoEmpresa.
     * 
     * @return valorLucroCesante
     */
    public java.math.BigDecimal getValorLucroCesante() {
        return valorLucroCesante;
    }


    /**
     * Sets the valorLucroCesante value for this ComunicadoEmpresa.
     * 
     * @param valorLucroCesante
     */
    public void setValorLucroCesante(java.math.BigDecimal valorLucroCesante) {
        this.valorLucroCesante = valorLucroCesante;
    }


    /**
     * Gets the valorRiscoDano value for this ComunicadoEmpresa.
     * 
     * @return valorRiscoDano
     */
    public java.math.BigDecimal getValorRiscoDano() {
        return valorRiscoDano;
    }


    /**
     * Sets the valorRiscoDano value for this ComunicadoEmpresa.
     * 
     * @param valorRiscoDano
     */
    public void setValorRiscoDano(java.math.BigDecimal valorRiscoDano) {
        this.valorRiscoDano = valorRiscoDano;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComunicadoEmpresa)) return false;
        ComunicadoEmpresa other = (ComunicadoEmpresa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.valorLucroCesante==null && other.getValorLucroCesante()==null) || 
             (this.valorLucroCesante!=null &&
              this.valorLucroCesante.equals(other.getValorLucroCesante()))) &&
            ((this.valorRiscoDano==null && other.getValorRiscoDano()==null) || 
             (this.valorRiscoDano!=null &&
              this.valorRiscoDano.equals(other.getValorRiscoDano())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getValorLucroCesante() != null) {
            _hashCode += getValorLucroCesante().hashCode();
        }
        if (getValorRiscoDano() != null) {
            _hashCode += getValorRiscoDano().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComunicadoEmpresa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "ComunicadoEmpresa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorLucroCesante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "valorLucroCesante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorRiscoDano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "valorRiscoDano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
