/**
 * PlusoftUseVOSaida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.central.model.pessoa.vo;

public class PlusoftUseVOSaida  implements java.io.Serializable {
    private br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO[] listaPlusoftUseVO;

    private java.lang.Long numeroOcorrencias;

    public PlusoftUseVOSaida() {
    }

    public PlusoftUseVOSaida(
           br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO[] listaPlusoftUseVO,
           java.lang.Long numeroOcorrencias) {
           this.listaPlusoftUseVO = listaPlusoftUseVO;
           this.numeroOcorrencias = numeroOcorrencias;
    }


    /**
     * Gets the listaPlusoftUseVO value for this PlusoftUseVOSaida.
     * 
     * @return listaPlusoftUseVO
     */
    public br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO[] getListaPlusoftUseVO() {
        return listaPlusoftUseVO;
    }


    /**
     * Sets the listaPlusoftUseVO value for this PlusoftUseVOSaida.
     * 
     * @param listaPlusoftUseVO
     */
    public void setListaPlusoftUseVO(br.com.bradseg.bucb.central.model.pessoa.vo.PlusoftUseVO[] listaPlusoftUseVO) {
        this.listaPlusoftUseVO = listaPlusoftUseVO;
    }


    /**
     * Gets the numeroOcorrencias value for this PlusoftUseVOSaida.
     * 
     * @return numeroOcorrencias
     */
    public java.lang.Long getNumeroOcorrencias() {
        return numeroOcorrencias;
    }


    /**
     * Sets the numeroOcorrencias value for this PlusoftUseVOSaida.
     * 
     * @param numeroOcorrencias
     */
    public void setNumeroOcorrencias(java.lang.Long numeroOcorrencias) {
        this.numeroOcorrencias = numeroOcorrencias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlusoftUseVOSaida)) return false;
        PlusoftUseVOSaida other = (PlusoftUseVOSaida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaPlusoftUseVO==null && other.getListaPlusoftUseVO()==null) || 
             (this.listaPlusoftUseVO!=null &&
              java.util.Arrays.equals(this.listaPlusoftUseVO, other.getListaPlusoftUseVO()))) &&
            ((this.numeroOcorrencias==null && other.getNumeroOcorrencias()==null) || 
             (this.numeroOcorrencias!=null &&
              this.numeroOcorrencias.equals(other.getNumeroOcorrencias())));
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
        if (getListaPlusoftUseVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaPlusoftUseVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaPlusoftUseVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumeroOcorrencias() != null) {
            _hashCode += getNumeroOcorrencias().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlusoftUseVOSaida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.pessoa.model.central.bucb.bradseg.com.br", "PlusoftUseVOSaida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaPlusoftUseVO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.pessoa.model.central.bucb.bradseg.com.br", "listaPlusoftUseVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.pessoa.model.central.bucb.bradseg.com.br", "PlusoftUseVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://vo.pessoa.model.central.bucb.bradseg.com.br", "PlusoftUseVO"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOcorrencias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.pessoa.model.central.bucb.bradseg.com.br", "numeroOcorrencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
