/**
 * ListarCausasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarcausas.canonico.v1;

public class ListarCausasResponse  implements java.io.Serializable {
    private br.com.bradseg.sare.listarcausas.canonico.v1.Causa[] causa;

    private br.com.bradseg.sare.listarcausas.canonico.v1.RetornoListarCausas retorno;

    public ListarCausasResponse() {
    }

    public ListarCausasResponse(
           br.com.bradseg.sare.listarcausas.canonico.v1.Causa[] causa,
           br.com.bradseg.sare.listarcausas.canonico.v1.RetornoListarCausas retorno) {
           this.causa = causa;
           this.retorno = retorno;
    }


    /**
     * Gets the causa value for this ListarCausasResponse.
     * 
     * @return causa
     */
    public br.com.bradseg.sare.listarcausas.canonico.v1.Causa[] getCausa() {
        return causa;
    }


    /**
     * Sets the causa value for this ListarCausasResponse.
     * 
     * @param causa
     */
    public void setCausa(br.com.bradseg.sare.listarcausas.canonico.v1.Causa[] causa) {
        this.causa = causa;
    }

    public br.com.bradseg.sare.listarcausas.canonico.v1.Causa getCausa(int i) {
        return this.causa[i];
    }

    public void setCausa(int i, br.com.bradseg.sare.listarcausas.canonico.v1.Causa _value) {
        this.causa[i] = _value;
    }


    /**
     * Gets the retorno value for this ListarCausasResponse.
     * 
     * @return retorno
     */
    public br.com.bradseg.sare.listarcausas.canonico.v1.RetornoListarCausas getRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this ListarCausasResponse.
     * 
     * @param retorno
     */
    public void setRetorno(br.com.bradseg.sare.listarcausas.canonico.v1.RetornoListarCausas retorno) {
        this.retorno = retorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarCausasResponse)) return false;
        ListarCausasResponse other = (ListarCausasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.causa==null && other.getCausa()==null) || 
             (this.causa!=null &&
              java.util.Arrays.equals(this.causa, other.getCausa()))) &&
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
        if (getCausa() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCausa());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCausa(), i);
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
        new org.apache.axis.description.TypeDesc(ListarCausasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "ListarCausasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "causa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "Causa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listarcausas.sare.bradseg.com.br/v1", "RetornoListarCausas"));
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
