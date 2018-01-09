/**
 * ListarAgenciaPorCpfCnpjSaidaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ListarAgenciaPorCpfCnpjSaidaVO  implements java.io.Serializable {
    private br.com.bradseg.bucb.servicos.model.vo.AgenciaSegmentosVO[] listarAgenciaSegmentosVO;

    private java.lang.Long qtdAgencia;

    public ListarAgenciaPorCpfCnpjSaidaVO() {
    }

    public ListarAgenciaPorCpfCnpjSaidaVO(
           br.com.bradseg.bucb.servicos.model.vo.AgenciaSegmentosVO[] listarAgenciaSegmentosVO,
           java.lang.Long qtdAgencia) {
           this.listarAgenciaSegmentosVO = listarAgenciaSegmentosVO;
           this.qtdAgencia = qtdAgencia;
    }


    /**
     * Gets the listarAgenciaSegmentosVO value for this ListarAgenciaPorCpfCnpjSaidaVO.
     * 
     * @return listarAgenciaSegmentosVO
     */
    public br.com.bradseg.bucb.servicos.model.vo.AgenciaSegmentosVO[] getListarAgenciaSegmentosVO() {
        return listarAgenciaSegmentosVO;
    }


    /**
     * Sets the listarAgenciaSegmentosVO value for this ListarAgenciaPorCpfCnpjSaidaVO.
     * 
     * @param listarAgenciaSegmentosVO
     */
    public void setListarAgenciaSegmentosVO(br.com.bradseg.bucb.servicos.model.vo.AgenciaSegmentosVO[] listarAgenciaSegmentosVO) {
        this.listarAgenciaSegmentosVO = listarAgenciaSegmentosVO;
    }


    /**
     * Gets the qtdAgencia value for this ListarAgenciaPorCpfCnpjSaidaVO.
     * 
     * @return qtdAgencia
     */
    public java.lang.Long getQtdAgencia() {
        return qtdAgencia;
    }


    /**
     * Sets the qtdAgencia value for this ListarAgenciaPorCpfCnpjSaidaVO.
     * 
     * @param qtdAgencia
     */
    public void setQtdAgencia(java.lang.Long qtdAgencia) {
        this.qtdAgencia = qtdAgencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarAgenciaPorCpfCnpjSaidaVO)) return false;
        ListarAgenciaPorCpfCnpjSaidaVO other = (ListarAgenciaPorCpfCnpjSaidaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listarAgenciaSegmentosVO==null && other.getListarAgenciaSegmentosVO()==null) || 
             (this.listarAgenciaSegmentosVO!=null &&
              java.util.Arrays.equals(this.listarAgenciaSegmentosVO, other.getListarAgenciaSegmentosVO()))) &&
            ((this.qtdAgencia==null && other.getQtdAgencia()==null) || 
             (this.qtdAgencia!=null &&
              this.qtdAgencia.equals(other.getQtdAgencia())));
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
        if (getListarAgenciaSegmentosVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListarAgenciaSegmentosVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListarAgenciaSegmentosVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQtdAgencia() != null) {
            _hashCode += getQtdAgencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarAgenciaPorCpfCnpjSaidaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarAgenciaPorCpfCnpjSaidaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listarAgenciaSegmentosVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listarAgenciaSegmentosVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "AgenciaSegmentosVO"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AgenciaSegmentosVO"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qtdAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
