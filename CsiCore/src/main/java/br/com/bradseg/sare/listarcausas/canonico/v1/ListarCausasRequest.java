/**
 * ListarCausasRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarcausas.canonico.v1;

public class ListarCausasRequest  implements java.io.Serializable {
    private java.lang.String ramo;

    private java.lang.String headerComunicacao;

    private java.lang.Short tipoRegistro;

    public ListarCausasRequest() {
    }

    public ListarCausasRequest(
           java.lang.String ramo,
           java.lang.String headerComunicacao,
           java.lang.Short tipoRegistro) {
           this.ramo = ramo;
           this.headerComunicacao = headerComunicacao;
           this.tipoRegistro = tipoRegistro;
    }


    /**
     * Gets the ramo value for this ListarCausasRequest.
     * 
     * @return ramo
     */
    public java.lang.String getRamo() {
        return ramo;
    }


    /**
     * Sets the ramo value for this ListarCausasRequest.
     * 
     * @param ramo
     */
    public void setRamo(java.lang.String ramo) {
        this.ramo = ramo;
    }


    /**
     * Gets the headerComunicacao value for this ListarCausasRequest.
     * 
     * @return headerComunicacao
     */
    public java.lang.String getHeaderComunicacao() {
        return headerComunicacao;
    }


    /**
     * Sets the headerComunicacao value for this ListarCausasRequest.
     * 
     * @param headerComunicacao
     */
    public void setHeaderComunicacao(java.lang.String headerComunicacao) {
        this.headerComunicacao = headerComunicacao;
    }


    /**
     * Gets the tipoRegistro value for this ListarCausasRequest.
     * 
     * @return tipoRegistro
     */
    public java.lang.Short getTipoRegistro() {
        return tipoRegistro;
    }


    /**
     * Sets the tipoRegistro value for this ListarCausasRequest.
     * 
     * @param tipoRegistro
     */
    public void setTipoRegistro(java.lang.Short tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarCausasRequest)) return false;
        ListarCausasRequest other = (ListarCausasRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ramo==null && other.getRamo()==null) || 
             (this.ramo!=null &&
              this.ramo.equals(other.getRamo()))) &&
            ((this.headerComunicacao==null && other.getHeaderComunicacao()==null) || 
             (this.headerComunicacao!=null &&
              this.headerComunicacao.equals(other.getHeaderComunicacao()))) &&
            ((this.tipoRegistro==null && other.getTipoRegistro()==null) || 
             (this.tipoRegistro!=null &&
              this.tipoRegistro.equals(other.getTipoRegistro())));
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
        if (getRamo() != null) {
            _hashCode += getRamo().hashCode();
        }
        if (getHeaderComunicacao() != null) {
            _hashCode += getHeaderComunicacao().hashCode();
        }
        if (getTipoRegistro() != null) {
            _hashCode += getTipoRegistro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarCausasRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "ListarCausasRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ramo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "ramo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerComunicacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "headerComunicacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "tipoRegistro"));
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
