/**
 * ListarSucursaisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarsusursais.canonico.v1;

public class ListarSucursaisResponse  implements java.io.Serializable {
    private br.com.bradseg.sare.listarsusursais.canonico.v1.SucursaisSucursal[] sucursais;

    private br.com.bradseg.sare.listarsusursais.canonico.v1.RetornoListarSucursais retorno;

    public ListarSucursaisResponse() {
    }

    public ListarSucursaisResponse(
           br.com.bradseg.sare.listarsusursais.canonico.v1.SucursaisSucursal[] sucursais,
           br.com.bradseg.sare.listarsusursais.canonico.v1.RetornoListarSucursais retorno) {
           this.sucursais = sucursais;
           this.retorno = retorno;
    }


    /**
     * Gets the sucursais value for this ListarSucursaisResponse.
     * 
     * @return sucursais
     */
    public br.com.bradseg.sare.listarsusursais.canonico.v1.SucursaisSucursal[] getSucursais() {
        return sucursais;
    }


    /**
     * Sets the sucursais value for this ListarSucursaisResponse.
     * 
     * @param sucursais
     */
    public void setSucursais(br.com.bradseg.sare.listarsusursais.canonico.v1.SucursaisSucursal[] sucursais) {
        this.sucursais = sucursais;
    }


    /**
     * Gets the retorno value for this ListarSucursaisResponse.
     * 
     * @return retorno
     */
    public br.com.bradseg.sare.listarsusursais.canonico.v1.RetornoListarSucursais getRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this ListarSucursaisResponse.
     * 
     * @param retorno
     */
    public void setRetorno(br.com.bradseg.sare.listarsusursais.canonico.v1.RetornoListarSucursais retorno) {
        this.retorno = retorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarSucursaisResponse)) return false;
        ListarSucursaisResponse other = (ListarSucursaisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sucursais==null && other.getSucursais()==null) || 
             (this.sucursais!=null &&
              java.util.Arrays.equals(this.sucursais, other.getSucursais()))) &&
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
        if (getSucursais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSucursais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSucursais(), i);
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
        new org.apache.axis.description.TypeDesc(ListarSucursaisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "ListarSucursaisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucursais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "sucursais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", ">Sucursais>sucursal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "sucursal"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listarsusursais.sare.bradseg.com.br/v1", "RetornoListarSucursais"));
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
