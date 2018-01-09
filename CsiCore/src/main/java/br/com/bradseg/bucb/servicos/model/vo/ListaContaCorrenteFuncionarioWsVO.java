/**
 * ListaContaCorrenteFuncionarioWsVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ListaContaCorrenteFuncionarioWsVO  implements java.io.Serializable {
    private long matricula;

    private br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioVO[] contaCorrenteFuncionario;

    private long quantidadeRegistros;

    public ListaContaCorrenteFuncionarioWsVO() {
    }

    public ListaContaCorrenteFuncionarioWsVO(
           long matricula,
           br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioVO[] contaCorrenteFuncionario,
           long quantidadeRegistros) {
           this.matricula = matricula;
           this.contaCorrenteFuncionario = contaCorrenteFuncionario;
           this.quantidadeRegistros = quantidadeRegistros;
    }


    /**
     * Gets the matricula value for this ListaContaCorrenteFuncionarioWsVO.
     * 
     * @return matricula
     */
    public long getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this ListaContaCorrenteFuncionarioWsVO.
     * 
     * @param matricula
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the contaCorrenteFuncionario value for this ListaContaCorrenteFuncionarioWsVO.
     * 
     * @return contaCorrenteFuncionario
     */
    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioVO[] getContaCorrenteFuncionario() {
        return contaCorrenteFuncionario;
    }


    /**
     * Sets the contaCorrenteFuncionario value for this ListaContaCorrenteFuncionarioWsVO.
     * 
     * @param contaCorrenteFuncionario
     */
    public void setContaCorrenteFuncionario(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteFuncionarioVO[] contaCorrenteFuncionario) {
        this.contaCorrenteFuncionario = contaCorrenteFuncionario;
    }


    /**
     * Gets the quantidadeRegistros value for this ListaContaCorrenteFuncionarioWsVO.
     * 
     * @return quantidadeRegistros
     */
    public long getQuantidadeRegistros() {
        return quantidadeRegistros;
    }


    /**
     * Sets the quantidadeRegistros value for this ListaContaCorrenteFuncionarioWsVO.
     * 
     * @param quantidadeRegistros
     */
    public void setQuantidadeRegistros(long quantidadeRegistros) {
        this.quantidadeRegistros = quantidadeRegistros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaContaCorrenteFuncionarioWsVO)) return false;
        ListaContaCorrenteFuncionarioWsVO other = (ListaContaCorrenteFuncionarioWsVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.matricula == other.getMatricula() &&
            ((this.contaCorrenteFuncionario==null && other.getContaCorrenteFuncionario()==null) || 
             (this.contaCorrenteFuncionario!=null &&
              java.util.Arrays.equals(this.contaCorrenteFuncionario, other.getContaCorrenteFuncionario()))) &&
            this.quantidadeRegistros == other.getQuantidadeRegistros();
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
        _hashCode += new Long(getMatricula()).hashCode();
        if (getContaCorrenteFuncionario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContaCorrenteFuncionario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContaCorrenteFuncionario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getQuantidadeRegistros()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaContaCorrenteFuncionarioWsVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListaContaCorrenteFuncionarioWsVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaCorrenteFuncionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaCorrenteFuncionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteFuncionarioVO"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ContaCorrenteFuncionarioVO"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeRegistros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantidadeRegistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
