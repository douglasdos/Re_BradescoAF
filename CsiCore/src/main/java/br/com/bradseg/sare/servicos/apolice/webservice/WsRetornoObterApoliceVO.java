/**
 * WsRetornoObterApoliceVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.servicos.apolice.webservice;

public class WsRetornoObterApoliceVO  implements java.io.Serializable {
    private br.com.bradseg.sare.servicos.apolice.webservice.WsApoliceVO apolice;

    private long codigoErro;

    private java.lang.String descricaoErro;

    public WsRetornoObterApoliceVO() {
    }

    public WsRetornoObterApoliceVO(
           br.com.bradseg.sare.servicos.apolice.webservice.WsApoliceVO apolice,
           long codigoErro,
           java.lang.String descricaoErro) {
           this.apolice = apolice;
           this.codigoErro = codigoErro;
           this.descricaoErro = descricaoErro;
    }


    /**
     * Gets the apolice value for this WsRetornoObterApoliceVO.
     * 
     * @return apolice
     */
    public br.com.bradseg.sare.servicos.apolice.webservice.WsApoliceVO getApolice() {
        return apolice;
    }


    /**
     * Sets the apolice value for this WsRetornoObterApoliceVO.
     * 
     * @param apolice
     */
    public void setApolice(br.com.bradseg.sare.servicos.apolice.webservice.WsApoliceVO apolice) {
        this.apolice = apolice;
    }


    /**
     * Gets the codigoErro value for this WsRetornoObterApoliceVO.
     * 
     * @return codigoErro
     */
    public long getCodigoErro() {
        return codigoErro;
    }


    /**
     * Sets the codigoErro value for this WsRetornoObterApoliceVO.
     * 
     * @param codigoErro
     */
    public void setCodigoErro(long codigoErro) {
        this.codigoErro = codigoErro;
    }


    /**
     * Gets the descricaoErro value for this WsRetornoObterApoliceVO.
     * 
     * @return descricaoErro
     */
    public java.lang.String getDescricaoErro() {
        return descricaoErro;
    }


    /**
     * Sets the descricaoErro value for this WsRetornoObterApoliceVO.
     * 
     * @param descricaoErro
     */
    public void setDescricaoErro(java.lang.String descricaoErro) {
        this.descricaoErro = descricaoErro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsRetornoObterApoliceVO)) return false;
        WsRetornoObterApoliceVO other = (WsRetornoObterApoliceVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apolice==null && other.getApolice()==null) || 
             (this.apolice!=null &&
              this.apolice.equals(other.getApolice()))) &&
            this.codigoErro == other.getCodigoErro() &&
            ((this.descricaoErro==null && other.getDescricaoErro()==null) || 
             (this.descricaoErro!=null &&
              this.descricaoErro.equals(other.getDescricaoErro())));
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
        if (getApolice() != null) {
            _hashCode += getApolice().hashCode();
        }
        _hashCode += new Long(getCodigoErro()).hashCode();
        if (getDescricaoErro() != null) {
            _hashCode += getDescricaoErro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsRetornoObterApoliceVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "wsRetornoObterApoliceVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apolice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apolice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "wsApoliceVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoErro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoErro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
//        return typeDesc;
    	return null;
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
