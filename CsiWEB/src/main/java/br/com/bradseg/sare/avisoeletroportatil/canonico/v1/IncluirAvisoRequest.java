/**
 * IncluirAvisoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisoeletroportatil.canonico.v1;

public class IncluirAvisoRequest  implements java.io.Serializable {
    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosIdentificacaoPrograma dadosIdentificacaoPrograma;

    private br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Aviso aviso;

    public IncluirAvisoRequest() {
    }

    public IncluirAvisoRequest(
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosIdentificacaoPrograma dadosIdentificacaoPrograma,
           br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Aviso aviso) {
           this.dadosIdentificacaoPrograma = dadosIdentificacaoPrograma;
           this.aviso = aviso;
    }


    /**
     * Gets the dadosIdentificacaoPrograma value for this IncluirAvisoRequest.
     * 
     * @return dadosIdentificacaoPrograma
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosIdentificacaoPrograma getDadosIdentificacaoPrograma() {
        return dadosIdentificacaoPrograma;
    }


    /**
     * Sets the dadosIdentificacaoPrograma value for this IncluirAvisoRequest.
     * 
     * @param dadosIdentificacaoPrograma
     */
    public void setDadosIdentificacaoPrograma(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.DadosIdentificacaoPrograma dadosIdentificacaoPrograma) {
        this.dadosIdentificacaoPrograma = dadosIdentificacaoPrograma;
    }


    /**
     * Gets the aviso value for this IncluirAvisoRequest.
     * 
     * @return aviso
     */
    public br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Aviso getAviso() {
        return aviso;
    }


    /**
     * Sets the aviso value for this IncluirAvisoRequest.
     * 
     * @param aviso
     */
    public void setAviso(br.com.bradseg.sare.avisoeletroportatil.canonico.v1.Aviso aviso) {
        this.aviso = aviso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncluirAvisoRequest)) return false;
        IncluirAvisoRequest other = (IncluirAvisoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dadosIdentificacaoPrograma==null && other.getDadosIdentificacaoPrograma()==null) || 
             (this.dadosIdentificacaoPrograma!=null &&
              this.dadosIdentificacaoPrograma.equals(other.getDadosIdentificacaoPrograma()))) &&
            ((this.aviso==null && other.getAviso()==null) || 
             (this.aviso!=null &&
              this.aviso.equals(other.getAviso())));
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
        if (getDadosIdentificacaoPrograma() != null) {
            _hashCode += getDadosIdentificacaoPrograma().hashCode();
        }
        if (getAviso() != null) {
            _hashCode += getAviso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncluirAvisoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "IncluirAvisoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosIdentificacaoPrograma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "dadosIdentificacaoPrograma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "DadosIdentificacaoPrograma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aviso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "aviso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "Aviso"));
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
