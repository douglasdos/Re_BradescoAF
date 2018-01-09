/**
 * WsRetornoListaApoliceVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.servicos.apolice.webservice;

public class WsRetornoListaApoliceVO  implements java.io.Serializable {
    private br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO[] apolices;

    private long codigoErro;

    private java.lang.String descricaoErro;

    public WsRetornoListaApoliceVO() {
    }

    public WsRetornoListaApoliceVO(
           br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO[] apolices,
           long codigoErro,
           java.lang.String descricaoErro) {
           this.apolices = apolices;
           this.codigoErro = codigoErro;
           this.descricaoErro = descricaoErro;
    }


    /**
     * Gets the apolices value for this WsRetornoListaApoliceVO.
     * 
     * @return apolices
     */
    public br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO[] getApolices() {
        return apolices;
    }


    /**
     * Sets the apolices value for this WsRetornoListaApoliceVO.
     * 
     * @param apolices
     */
    public void setApolices(br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO[] apolices) {
        this.apolices = apolices;
    }

    public br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO getApolices(int i) {
        return this.apolices[i];
    }

    public void setApolices(int i, br.com.bradseg.sare.servicos.apolice.webservice.ListaApoliceVO _value) {
        this.apolices[i] = _value;
    }


    /**
     * Gets the codigoErro value for this WsRetornoListaApoliceVO.
     * 
     * @return codigoErro
     */
    public long getCodigoErro() {
        return codigoErro;
    }


    /**
     * Sets the codigoErro value for this WsRetornoListaApoliceVO.
     * 
     * @param codigoErro
     */
    public void setCodigoErro(long codigoErro) {
        this.codigoErro = codigoErro;
    }


    /**
     * Gets the descricaoErro value for this WsRetornoListaApoliceVO.
     * 
     * @return descricaoErro
     */
    public java.lang.String getDescricaoErro() {
        return descricaoErro;
    }


    /**
     * Sets the descricaoErro value for this WsRetornoListaApoliceVO.
     * 
     * @param descricaoErro
     */
    public void setDescricaoErro(java.lang.String descricaoErro) {
        this.descricaoErro = descricaoErro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsRetornoListaApoliceVO)) return false;
        WsRetornoListaApoliceVO other = (WsRetornoListaApoliceVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apolices==null && other.getApolices()==null) || 
             (this.apolices!=null &&
              java.util.Arrays.equals(this.apolices, other.getApolices()))) &&
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
        if (getApolices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApolices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApolices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(WsRetornoListaApoliceVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "wsRetornoListaApoliceVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apolices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apolices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.apolice.servicos.sare.bradseg.com.br/", "listaApoliceVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
