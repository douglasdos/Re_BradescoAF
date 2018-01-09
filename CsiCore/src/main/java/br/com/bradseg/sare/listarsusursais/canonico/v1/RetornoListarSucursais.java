/**
 * RetornoListarSucursais.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarsusursais.canonico.v1;

public class RetornoListarSucursais  implements java.io.Serializable {
    private java.lang.Short codigo;

    private java.lang.String descricao;

    private java.lang.Short codigoSQL;

    public RetornoListarSucursais() {
    }

    public RetornoListarSucursais(
           java.lang.Short codigo,
           java.lang.String descricao,
           java.lang.Short codigoSQL) {
           this.codigo = codigo;
           this.descricao = descricao;
           this.codigoSQL = codigoSQL;
    }


    /**
     * Gets the codigo value for this RetornoListarSucursais.
     * 
     * @return codigo
     */
    public java.lang.Short getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RetornoListarSucursais.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Short codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the descricao value for this RetornoListarSucursais.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this RetornoListarSucursais.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the codigoSQL value for this RetornoListarSucursais.
     * 
     * @return codigoSQL
     */
    public java.lang.Short getCodigoSQL() {
        return codigoSQL;
    }


    /**
     * Sets the codigoSQL value for this RetornoListarSucursais.
     * 
     * @param codigoSQL
     */
    public void setCodigoSQL(java.lang.Short codigoSQL) {
        this.codigoSQL = codigoSQL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoListarSucursais)) return false;
        RetornoListarSucursais other = (RetornoListarSucursais) obj;
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
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.codigoSQL==null && other.getCodigoSQL()==null) || 
             (this.codigoSQL!=null &&
              this.codigoSQL.equals(other.getCodigoSQL())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getCodigoSQL() != null) {
            _hashCode += getCodigoSQL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoListarSucursais.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "RetornoListarSucursais"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSQL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "codigoSQL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
