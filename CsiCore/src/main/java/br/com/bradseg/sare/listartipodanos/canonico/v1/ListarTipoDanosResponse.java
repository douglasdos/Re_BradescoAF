/**
 * ListarTipoDanosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listartipodanos.canonico.v1;

public class ListarTipoDanosResponse  implements java.io.Serializable {
    private br.com.bradseg.sare.listartipodanos.canonico.v1.TipoDanosTipoDano[] tipoDanos;

    private br.com.bradseg.sare.listartipodanos.canonico.v1.RetornoListarTipoDanos retorno;

    public ListarTipoDanosResponse() {
    }

    public ListarTipoDanosResponse(
           br.com.bradseg.sare.listartipodanos.canonico.v1.TipoDanosTipoDano[] tipoDanos,
           br.com.bradseg.sare.listartipodanos.canonico.v1.RetornoListarTipoDanos retorno) {
           this.tipoDanos = tipoDanos;
           this.retorno = retorno;
    }


    /**
     * Gets the tipoDanos value for this ListarTipoDanosResponse.
     * 
     * @return tipoDanos
     */
    public br.com.bradseg.sare.listartipodanos.canonico.v1.TipoDanosTipoDano[] getTipoDanos() {
        return tipoDanos;
    }


    /**
     * Sets the tipoDanos value for this ListarTipoDanosResponse.
     * 
     * @param tipoDanos
     */
    public void setTipoDanos(br.com.bradseg.sare.listartipodanos.canonico.v1.TipoDanosTipoDano[] tipoDanos) {
        this.tipoDanos = tipoDanos;
    }


    /**
     * Gets the retorno value for this ListarTipoDanosResponse.
     * 
     * @return retorno
     */
    public br.com.bradseg.sare.listartipodanos.canonico.v1.RetornoListarTipoDanos getRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this ListarTipoDanosResponse.
     * 
     * @param retorno
     */
    public void setRetorno(br.com.bradseg.sare.listartipodanos.canonico.v1.RetornoListarTipoDanos retorno) {
        this.retorno = retorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarTipoDanosResponse)) return false;
        ListarTipoDanosResponse other = (ListarTipoDanosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDanos==null && other.getTipoDanos()==null) || 
             (this.tipoDanos!=null &&
              java.util.Arrays.equals(this.tipoDanos, other.getTipoDanos()))) &&
            ((this.retorno==null && other.getRetorno()==null) || 
             (this.retorno!=null &&
              this.retorno.equals(other.getRetorno())));
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
        if (getTipoDanos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTipoDanos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTipoDanos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetorno() != null) {
            _hashCode += getRetorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarTipoDanosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "ListarTipoDanosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDanos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "tipoDanos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", ">TipoDanos>tipoDano"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "tipoDano"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listartipodanos.sare.bradseg.com.br/v1", "RetornoListarTipoDanos"));
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
