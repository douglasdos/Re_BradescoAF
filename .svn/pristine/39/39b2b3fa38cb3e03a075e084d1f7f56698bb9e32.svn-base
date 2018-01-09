/**
 * ValidarDadosFuncionarioSinergiaEntradaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ValidarDadosFuncionarioSinergiaEntradaVO  implements java.io.Serializable {
    private java.lang.Long matricula;

    private java.lang.Long corretor;

    public ValidarDadosFuncionarioSinergiaEntradaVO() {
    }

    public ValidarDadosFuncionarioSinergiaEntradaVO(
           java.lang.Long matricula,
           java.lang.Long corretor) {
           this.matricula = matricula;
           this.corretor = corretor;
    }


    /**
     * Gets the matricula value for this ValidarDadosFuncionarioSinergiaEntradaVO.
     * 
     * @return matricula
     */
    public java.lang.Long getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this ValidarDadosFuncionarioSinergiaEntradaVO.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.Long matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the corretor value for this ValidarDadosFuncionarioSinergiaEntradaVO.
     * 
     * @return corretor
     */
    public java.lang.Long getCorretor() {
        return corretor;
    }


    /**
     * Sets the corretor value for this ValidarDadosFuncionarioSinergiaEntradaVO.
     * 
     * @param corretor
     */
    public void setCorretor(java.lang.Long corretor) {
        this.corretor = corretor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarDadosFuncionarioSinergiaEntradaVO)) return false;
        ValidarDadosFuncionarioSinergiaEntradaVO other = (ValidarDadosFuncionarioSinergiaEntradaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.corretor==null && other.getCorretor()==null) || 
             (this.corretor!=null &&
              this.corretor.equals(other.getCorretor())));
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
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getCorretor() != null) {
            _hashCode += getCorretor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarDadosFuncionarioSinergiaEntradaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ValidarDadosFuncionarioSinergiaEntradaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corretor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corretor"));
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
