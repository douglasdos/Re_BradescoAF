/**
 * ComunicadoTerceirosTerceiro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisooutrasorigens.canonico.v1;

public class ComunicadoTerceirosTerceiro  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.Long cpfCnpj;

    private java.lang.Short tipoPessoa;

    public ComunicadoTerceirosTerceiro() {
    }

    public ComunicadoTerceirosTerceiro(
           java.lang.String nome,
           java.lang.Long cpfCnpj,
           java.lang.Short tipoPessoa) {
           this.nome = nome;
           this.cpfCnpj = cpfCnpj;
           this.tipoPessoa = tipoPessoa;
    }


    /**
     * Gets the nome value for this ComunicadoTerceirosTerceiro.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ComunicadoTerceirosTerceiro.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the cpfCnpj value for this ComunicadoTerceirosTerceiro.
     * 
     * @return cpfCnpj
     */
    public java.lang.Long getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this ComunicadoTerceirosTerceiro.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(java.lang.Long cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the tipoPessoa value for this ComunicadoTerceirosTerceiro.
     * 
     * @return tipoPessoa
     */
    public java.lang.Short getTipoPessoa() {
        return tipoPessoa;
    }


    /**
     * Sets the tipoPessoa value for this ComunicadoTerceirosTerceiro.
     * 
     * @param tipoPessoa
     */
    public void setTipoPessoa(java.lang.Short tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComunicadoTerceirosTerceiro)) return false;
        ComunicadoTerceirosTerceiro other = (ComunicadoTerceirosTerceiro) obj;
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
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.tipoPessoa==null && other.getTipoPessoa()==null) || 
             (this.tipoPessoa!=null &&
              this.tipoPessoa.equals(other.getTipoPessoa())));
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
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getTipoPessoa() != null) {
            _hashCode += getTipoPessoa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComunicadoTerceirosTerceiro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", ">ComunicadoTerceiros>terceiro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "tipoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
