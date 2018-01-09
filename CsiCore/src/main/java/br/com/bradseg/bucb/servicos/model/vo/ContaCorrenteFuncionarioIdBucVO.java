/**
 * ContaCorrenteFuncionarioIdBucVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ContaCorrenteFuncionarioIdBucVO  implements java.io.Serializable {
    private br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteIdBucVO[] contas;

    private long matricula;

    private int numeroContas;

    public ContaCorrenteFuncionarioIdBucVO() {
    }

    public ContaCorrenteFuncionarioIdBucVO(
           br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteIdBucVO[] contas,
           long matricula,
           int numeroContas) {
           this.contas = contas;
           this.matricula = matricula;
           this.numeroContas = numeroContas;
    }


    /**
     * Gets the contas value for this ContaCorrenteFuncionarioIdBucVO.
     * 
     * @return contas
     */
    public br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteIdBucVO[] getContas() {
        return contas;
    }


    /**
     * Sets the contas value for this ContaCorrenteFuncionarioIdBucVO.
     * 
     * @param contas
     */
    public void setContas(br.com.bradseg.bucb.servicos.model.vo.ContaCorrenteIdBucVO[] contas) {
        this.contas = contas;
    }


    /**
     * Gets the matricula value for this ContaCorrenteFuncionarioIdBucVO.
     * 
     * @return matricula
     */
    public long getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this ContaCorrenteFuncionarioIdBucVO.
     * 
     * @param matricula
     */
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the numeroContas value for this ContaCorrenteFuncionarioIdBucVO.
     * 
     * @return numeroContas
     */
    public int getNumeroContas() {
        return numeroContas;
    }


    /**
     * Sets the numeroContas value for this ContaCorrenteFuncionarioIdBucVO.
     * 
     * @param numeroContas
     */
    public void setNumeroContas(int numeroContas) {
        this.numeroContas = numeroContas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContaCorrenteFuncionarioIdBucVO)) return false;
        ContaCorrenteFuncionarioIdBucVO other = (ContaCorrenteFuncionarioIdBucVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contas==null && other.getContas()==null) || 
             (this.contas!=null &&
              java.util.Arrays.equals(this.contas, other.getContas()))) &&
            this.matricula == other.getMatricula() &&
            this.numeroContas == other.getNumeroContas();
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
        if (getContas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getMatricula()).hashCode();
        _hashCode += getNumeroContas();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContaCorrenteFuncionarioIdBucVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteFuncionarioIdBucVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ContaCorrenteIdBucVO"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ContaCorrenteIdBucVO"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroContas"));
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
