/**
 * IdentificadorPrograma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarsusursais.canonico.v1;

public class IdentificadorPrograma  implements java.io.Serializable {
    private java.lang.String headerComunicacao;

    private java.lang.Short tipoRegistro;

    private java.lang.Short codigoOrigem;

    public IdentificadorPrograma() {
    }

    public IdentificadorPrograma(
           java.lang.String headerComunicacao,
           java.lang.Short tipoRegistro,
           java.lang.Short codigoOrigem) {
           this.headerComunicacao = headerComunicacao;
           this.tipoRegistro = tipoRegistro;
           this.codigoOrigem = codigoOrigem;
    }


    /**
     * Gets the headerComunicacao value for this IdentificadorPrograma.
     * 
     * @return headerComunicacao
     */
    public java.lang.String getHeaderComunicacao() {
        return headerComunicacao;
    }


    /**
     * Sets the headerComunicacao value for this IdentificadorPrograma.
     * 
     * @param headerComunicacao
     */
    public void setHeaderComunicacao(java.lang.String headerComunicacao) {
        this.headerComunicacao = headerComunicacao;
    }


    /**
     * Gets the tipoRegistro value for this IdentificadorPrograma.
     * 
     * @return tipoRegistro
     */
    public java.lang.Short getTipoRegistro() {
        return tipoRegistro;
    }


    /**
     * Sets the tipoRegistro value for this IdentificadorPrograma.
     * 
     * @param tipoRegistro
     */
    public void setTipoRegistro(java.lang.Short tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }


    /**
     * Gets the codigoOrigem value for this IdentificadorPrograma.
     * 
     * @return codigoOrigem
     */
    public java.lang.Short getCodigoOrigem() {
        return codigoOrigem;
    }


    /**
     * Sets the codigoOrigem value for this IdentificadorPrograma.
     * 
     * @param codigoOrigem
     */
    public void setCodigoOrigem(java.lang.Short codigoOrigem) {
        this.codigoOrigem = codigoOrigem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificadorPrograma)) return false;
        IdentificadorPrograma other = (IdentificadorPrograma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.headerComunicacao==null && other.getHeaderComunicacao()==null) || 
             (this.headerComunicacao!=null &&
              this.headerComunicacao.equals(other.getHeaderComunicacao()))) &&
            ((this.tipoRegistro==null && other.getTipoRegistro()==null) || 
             (this.tipoRegistro!=null &&
              this.tipoRegistro.equals(other.getTipoRegistro()))) &&
            ((this.codigoOrigem==null && other.getCodigoOrigem()==null) || 
             (this.codigoOrigem!=null &&
              this.codigoOrigem.equals(other.getCodigoOrigem())));
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
        if (getHeaderComunicacao() != null) {
            _hashCode += getHeaderComunicacao().hashCode();
        }
        if (getTipoRegistro() != null) {
            _hashCode += getTipoRegistro().hashCode();
        }
        if (getCodigoOrigem() != null) {
            _hashCode += getCodigoOrigem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificadorPrograma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "IdentificadorPrograma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerComunicacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "headerComunicacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "tipoRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "codigoOrigem"));
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
