/**
 * ListarTipoDanosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listartipodanos.canonico.v1;

public class ListarTipoDanosRequest  implements java.io.Serializable {
    private br.com.bradseg.sare.listartipodanos.canonico.v1.IdentificadorPrograma identificadorPrograma;

    private java.lang.Integer categoria;

    public ListarTipoDanosRequest() {
    }

    public ListarTipoDanosRequest(
           br.com.bradseg.sare.listartipodanos.canonico.v1.IdentificadorPrograma identificadorPrograma,
           java.lang.Integer categoria) {
           this.identificadorPrograma = identificadorPrograma;
           this.categoria = categoria;
    }


    /**
     * Gets the identificadorPrograma value for this ListarTipoDanosRequest.
     * 
     * @return identificadorPrograma
     */
    public br.com.bradseg.sare.listartipodanos.canonico.v1.IdentificadorPrograma getIdentificadorPrograma() {
        return identificadorPrograma;
    }


    /**
     * Sets the identificadorPrograma value for this ListarTipoDanosRequest.
     * 
     * @param identificadorPrograma
     */
    public void setIdentificadorPrograma(br.com.bradseg.sare.listartipodanos.canonico.v1.IdentificadorPrograma identificadorPrograma) {
        this.identificadorPrograma = identificadorPrograma;
    }


    /**
     * Gets the categoria value for this ListarTipoDanosRequest.
     * 
     * @return categoria
     */
    public java.lang.Integer getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this ListarTipoDanosRequest.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.Integer categoria) {
        this.categoria = categoria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarTipoDanosRequest)) return false;
        ListarTipoDanosRequest other = (ListarTipoDanosRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificadorPrograma==null && other.getIdentificadorPrograma()==null) || 
             (this.identificadorPrograma!=null &&
              this.identificadorPrograma.equals(other.getIdentificadorPrograma()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria())));
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
        if (getIdentificadorPrograma() != null) {
            _hashCode += getIdentificadorPrograma().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarTipoDanosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "ListarTipoDanosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorPrograma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "identificadorPrograma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "IdentificadorPrograma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "categoria"));
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
