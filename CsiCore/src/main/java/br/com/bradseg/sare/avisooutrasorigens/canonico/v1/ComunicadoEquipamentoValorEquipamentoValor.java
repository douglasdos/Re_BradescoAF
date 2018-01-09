/**
 * ComunicadoEquipamentoValorEquipamentoValor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisooutrasorigens.canonico.v1;

public class ComunicadoEquipamentoValorEquipamentoValor  implements java.io.Serializable {
    private java.lang.Integer quantidade;

    private java.math.BigDecimal valorUnitario;

    private java.math.BigDecimal valorEstimado;

    public ComunicadoEquipamentoValorEquipamentoValor() {
    }

    public ComunicadoEquipamentoValorEquipamentoValor(
           java.lang.Integer quantidade,
           java.math.BigDecimal valorUnitario,
           java.math.BigDecimal valorEstimado) {
           this.quantidade = quantidade;
           this.valorUnitario = valorUnitario;
           this.valorEstimado = valorEstimado;
    }


    /**
     * Gets the quantidade value for this ComunicadoEquipamentoValorEquipamentoValor.
     * 
     * @return quantidade
     */
    public java.lang.Integer getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this ComunicadoEquipamentoValorEquipamentoValor.
     * 
     * @param quantidade
     */
    public void setQuantidade(java.lang.Integer quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the valorUnitario value for this ComunicadoEquipamentoValorEquipamentoValor.
     * 
     * @return valorUnitario
     */
    public java.math.BigDecimal getValorUnitario() {
        return valorUnitario;
    }


    /**
     * Sets the valorUnitario value for this ComunicadoEquipamentoValorEquipamentoValor.
     * 
     * @param valorUnitario
     */
    public void setValorUnitario(java.math.BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


    /**
     * Gets the valorEstimado value for this ComunicadoEquipamentoValorEquipamentoValor.
     * 
     * @return valorEstimado
     */
    public java.math.BigDecimal getValorEstimado() {
        return valorEstimado;
    }


    /**
     * Sets the valorEstimado value for this ComunicadoEquipamentoValorEquipamentoValor.
     * 
     * @param valorEstimado
     */
    public void setValorEstimado(java.math.BigDecimal valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComunicadoEquipamentoValorEquipamentoValor)) return false;
        ComunicadoEquipamentoValorEquipamentoValor other = (ComunicadoEquipamentoValorEquipamentoValor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quantidade==null && other.getQuantidade()==null) || 
             (this.quantidade!=null &&
              this.quantidade.equals(other.getQuantidade()))) &&
            ((this.valorUnitario==null && other.getValorUnitario()==null) || 
             (this.valorUnitario!=null &&
              this.valorUnitario.equals(other.getValorUnitario()))) &&
            ((this.valorEstimado==null && other.getValorEstimado()==null) || 
             (this.valorEstimado!=null &&
              this.valorEstimado.equals(other.getValorEstimado())));
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
        if (getQuantidade() != null) {
            _hashCode += getQuantidade().hashCode();
        }
        if (getValorUnitario() != null) {
            _hashCode += getValorUnitario().hashCode();
        }
        if (getValorEstimado() != null) {
            _hashCode += getValorEstimado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComunicadoEquipamentoValorEquipamentoValor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", ">ComunicadoEquipamentoValor>equipamentoValor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "quantidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorUnitario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "valorUnitario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorEstimado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "valorEstimado"));
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
