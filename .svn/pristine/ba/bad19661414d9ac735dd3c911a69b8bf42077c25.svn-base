/**
 * IdentificarPessoaCCSaidaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class IdentificarPessoaCCSaidaVO  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String nomeMae;

    public IdentificarPessoaCCSaidaVO() {
    }

    public IdentificarPessoaCCSaidaVO(
           java.lang.String nome,
           java.lang.String nomeMae) {
           this.nome = nome;
           this.nomeMae = nomeMae;
    }


    /**
     * Gets the nome value for this IdentificarPessoaCCSaidaVO.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this IdentificarPessoaCCSaidaVO.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the nomeMae value for this IdentificarPessoaCCSaidaVO.
     * 
     * @return nomeMae
     */
    public java.lang.String getNomeMae() {
        return nomeMae;
    }


    /**
     * Sets the nomeMae value for this IdentificarPessoaCCSaidaVO.
     * 
     * @param nomeMae
     */
    public void setNomeMae(java.lang.String nomeMae) {
        this.nomeMae = nomeMae;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificarPessoaCCSaidaVO)) return false;
        IdentificarPessoaCCSaidaVO other = (IdentificarPessoaCCSaidaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.nomeMae==null && other.getNomeMae()==null) || 
             (this.nomeMae!=null &&
              this.nomeMae.equals(other.getNomeMae())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getNomeMae() != null) {
            _hashCode += getNomeMae().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificarPessoaCCSaidaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "IdentificarPessoaCCSaidaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeMae");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomeMae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
