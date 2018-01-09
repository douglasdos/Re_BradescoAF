/**
 * ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO  implements java.io.Serializable {
    private long[] agencias;

    private java.lang.Long qtdAgencia;

    private int segmentoRenc;

    public ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO() {
    }

    public ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO(
           long[] agencias,
           java.lang.Long qtdAgencia,
           int segmentoRenc) {
           this.agencias = agencias;
           this.qtdAgencia = qtdAgencia;
           this.segmentoRenc = segmentoRenc;
    }


    /**
     * Gets the agencias value for this ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.
     * 
     * @return agencias
     */
    public long[] getAgencias() {
        return agencias;
    }


    /**
     * Sets the agencias value for this ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.
     * 
     * @param agencias
     */
    public void setAgencias(long[] agencias) {
        this.agencias = agencias;
    }


    /**
     * Gets the qtdAgencia value for this ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.
     * 
     * @return qtdAgencia
     */
    public java.lang.Long getQtdAgencia() {
        return qtdAgencia;
    }


    /**
     * Sets the qtdAgencia value for this ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.
     * 
     * @param qtdAgencia
     */
    public void setQtdAgencia(java.lang.Long qtdAgencia) {
        this.qtdAgencia = qtdAgencia;
    }


    /**
     * Gets the segmentoRenc value for this ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.
     * 
     * @return segmentoRenc
     */
    public int getSegmentoRenc() {
        return segmentoRenc;
    }


    /**
     * Sets the segmentoRenc value for this ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.
     * 
     * @param segmentoRenc
     */
    public void setSegmentoRenc(int segmentoRenc) {
        this.segmentoRenc = segmentoRenc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO)) return false;
        ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO other = (ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencias==null && other.getAgencias()==null) || 
             (this.agencias!=null &&
              java.util.Arrays.equals(this.agencias, other.getAgencias()))) &&
            ((this.qtdAgencia==null && other.getQtdAgencia()==null) || 
             (this.qtdAgencia!=null &&
              this.qtdAgencia.equals(other.getQtdAgencia()))) &&
            this.segmentoRenc == other.getSegmentoRenc();
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
        if (getAgencias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgencias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgencias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQtdAgencia() != null) {
            _hashCode += getQtdAgencia().hashCode();
        }
        _hashCode += getSegmentoRenc();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSubsegmentoRencRespectivasAgenciasSaidaWsVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtdAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentoRenc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentoRenc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
