/**
 * ListarSucursaisRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarsusursais.canonico.v1;

public class ListarSucursaisRequest  implements java.io.Serializable {
    private br.com.bradseg.sare.listarsusursais.canonico.v1.IdentificadorPrograma identificadorPrograma;

    private java.lang.String ufEstado;

    private java.lang.String nomeCidade;

    public ListarSucursaisRequest() {
    }

    public ListarSucursaisRequest(
           br.com.bradseg.sare.listarsusursais.canonico.v1.IdentificadorPrograma identificadorPrograma,
           java.lang.String ufEstado,
           java.lang.String nomeCidade) {
           this.identificadorPrograma = identificadorPrograma;
           this.ufEstado = ufEstado;
           this.nomeCidade = nomeCidade;
    }


    /**
     * Gets the identificadorPrograma value for this ListarSucursaisRequest.
     * 
     * @return identificadorPrograma
     */
    public br.com.bradseg.sare.listarsusursais.canonico.v1.IdentificadorPrograma getIdentificadorPrograma() {
        return identificadorPrograma;
    }


    /**
     * Sets the identificadorPrograma value for this ListarSucursaisRequest.
     * 
     * @param identificadorPrograma
     */
    public void setIdentificadorPrograma(br.com.bradseg.sare.listarsusursais.canonico.v1.IdentificadorPrograma identificadorPrograma) {
        this.identificadorPrograma = identificadorPrograma;
    }


    /**
     * Gets the ufEstado value for this ListarSucursaisRequest.
     * 
     * @return ufEstado
     */
    public java.lang.String getUfEstado() {
        return ufEstado;
    }


    /**
     * Sets the ufEstado value for this ListarSucursaisRequest.
     * 
     * @param ufEstado
     */
    public void setUfEstado(java.lang.String ufEstado) {
        this.ufEstado = ufEstado;
    }


    /**
     * Gets the nomeCidade value for this ListarSucursaisRequest.
     * 
     * @return nomeCidade
     */
    public java.lang.String getNomeCidade() {
        return nomeCidade;
    }


    /**
     * Sets the nomeCidade value for this ListarSucursaisRequest.
     * 
     * @param nomeCidade
     */
    public void setNomeCidade(java.lang.String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarSucursaisRequest)) return false;
        ListarSucursaisRequest other = (ListarSucursaisRequest) obj;
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
            ((this.ufEstado==null && other.getUfEstado()==null) || 
             (this.ufEstado!=null &&
              this.ufEstado.equals(other.getUfEstado()))) &&
            ((this.nomeCidade==null && other.getNomeCidade()==null) || 
             (this.nomeCidade!=null &&
              this.nomeCidade.equals(other.getNomeCidade())));
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
        if (getUfEstado() != null) {
            _hashCode += getUfEstado().hashCode();
        }
        if (getNomeCidade() != null) {
            _hashCode += getNomeCidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarSucursaisRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "ListarSucursaisRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificadorPrograma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "identificadorPrograma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "IdentificadorPrograma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "ufEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "nomeCidade"));
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
