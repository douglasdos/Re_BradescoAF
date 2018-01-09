/**
 * ListarNaturezasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.listarnaturezas.canonico.v1;

public class ListarNaturezasResponse  implements java.io.Serializable {
    private br.com.bradseg.sare.listarnaturezas.canonico.v1.Natureza[] natureza;

    private br.com.bradseg.sare.listarnaturezas.canonico.v1.RetornoListarNaturezas retorno;

    public ListarNaturezasResponse() {
    }

    public ListarNaturezasResponse(
           br.com.bradseg.sare.listarnaturezas.canonico.v1.Natureza[] natureza,
           br.com.bradseg.sare.listarnaturezas.canonico.v1.RetornoListarNaturezas retorno) {
           this.natureza = natureza;
           this.retorno = retorno;
    }


    /**
     * Gets the natureza value for this ListarNaturezasResponse.
     * 
     * @return natureza
     */
    public br.com.bradseg.sare.listarnaturezas.canonico.v1.Natureza[] getNatureza() {
        return natureza;
    }


    /**
     * Sets the natureza value for this ListarNaturezasResponse.
     * 
     * @param natureza
     */
    public void setNatureza(br.com.bradseg.sare.listarnaturezas.canonico.v1.Natureza[] natureza) {
        this.natureza = natureza;
    }

    public br.com.bradseg.sare.listarnaturezas.canonico.v1.Natureza getNatureza(int i) {
        return this.natureza[i];
    }

    public void setNatureza(int i, br.com.bradseg.sare.listarnaturezas.canonico.v1.Natureza _value) {
        this.natureza[i] = _value;
    }


    /**
     * Gets the retorno value for this ListarNaturezasResponse.
     * 
     * @return retorno
     */
    public br.com.bradseg.sare.listarnaturezas.canonico.v1.RetornoListarNaturezas getRetorno() {
        return retorno;
    }


    /**
     * Sets the retorno value for this ListarNaturezasResponse.
     * 
     * @param retorno
     */
    public void setRetorno(br.com.bradseg.sare.listarnaturezas.canonico.v1.RetornoListarNaturezas retorno) {
        this.retorno = retorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarNaturezasResponse)) return false;
        ListarNaturezasResponse other = (ListarNaturezasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.natureza==null && other.getNatureza()==null) || 
             (this.natureza!=null &&
              java.util.Arrays.equals(this.natureza, other.getNatureza()))) &&
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
        if (getNatureza() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNatureza());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNatureza(), i);
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
        new org.apache.axis.description.TypeDesc(ListarNaturezasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "ListarNaturezasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natureza");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "natureza"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "Natureza"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://canonico.listarnaturezas.sare.bradseg.com.br/v1", "RetornoListarNaturezas"));
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
