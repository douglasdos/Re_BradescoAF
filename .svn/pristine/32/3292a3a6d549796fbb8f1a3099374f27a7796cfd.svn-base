/**
 * ComunicadoResidencial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisooutrasorigens.canonico.v1;

public class ComunicadoResidencial  implements java.io.Serializable {
    private java.lang.Integer item;

    private java.lang.String moradiaHabitcao;

    private java.math.BigDecimal valorDanos;

    public ComunicadoResidencial() {
    }

    public ComunicadoResidencial(
           java.lang.Integer item,
           java.lang.String moradiaHabitcao,
           java.math.BigDecimal valorDanos) {
           this.item = item;
           this.moradiaHabitcao = moradiaHabitcao;
           this.valorDanos = valorDanos;
    }


    /**
     * Gets the item value for this ComunicadoResidencial.
     * 
     * @return item
     */
    public java.lang.Integer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ComunicadoResidencial.
     * 
     * @param item
     */
    public void setItem(java.lang.Integer item) {
        this.item = item;
    }


    /**
     * Gets the moradiaHabitcao value for this ComunicadoResidencial.
     * 
     * @return moradiaHabitcao
     */
    public java.lang.String getMoradiaHabitcao() {
        return moradiaHabitcao;
    }


    /**
     * Sets the moradiaHabitcao value for this ComunicadoResidencial.
     * 
     * @param moradiaHabitcao
     */
    public void setMoradiaHabitcao(java.lang.String moradiaHabitcao) {
        this.moradiaHabitcao = moradiaHabitcao;
    }


    /**
     * Gets the valorDanos value for this ComunicadoResidencial.
     * 
     * @return valorDanos
     */
    public java.math.BigDecimal getValorDanos() {
        return valorDanos;
    }


    /**
     * Sets the valorDanos value for this ComunicadoResidencial.
     * 
     * @param valorDanos
     */
    public void setValorDanos(java.math.BigDecimal valorDanos) {
        this.valorDanos = valorDanos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComunicadoResidencial)) return false;
        ComunicadoResidencial other = (ComunicadoResidencial) obj;
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
            ((this.moradiaHabitcao==null && other.getMoradiaHabitcao()==null) || 
             (this.moradiaHabitcao!=null &&
              this.moradiaHabitcao.equals(other.getMoradiaHabitcao()))) &&
            ((this.valorDanos==null && other.getValorDanos()==null) || 
             (this.valorDanos!=null &&
              this.valorDanos.equals(other.getValorDanos())));
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
        if (getMoradiaHabitcao() != null) {
            _hashCode += getMoradiaHabitcao().hashCode();
        }
        if (getValorDanos() != null) {
            _hashCode += getValorDanos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComunicadoResidencial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "ComunicadoResidencial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moradiaHabitcao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "moradiaHabitcao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDanos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "valorDanos"));
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
