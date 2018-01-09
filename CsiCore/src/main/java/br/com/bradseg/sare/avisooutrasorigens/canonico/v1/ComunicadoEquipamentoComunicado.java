/**
 * ComunicadoEquipamentoComunicado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisooutrasorigens.canonico.v1;

public class ComunicadoEquipamentoComunicado  implements java.io.Serializable {
    private java.lang.String flagAlteracao;

    private java.lang.Integer item;

    private java.lang.Short anoFabricacao;

    private java.lang.String serie;

    private java.lang.String nome;

    private java.lang.String marca;

    private java.lang.String modelo;

    public ComunicadoEquipamentoComunicado() {
    }

    public ComunicadoEquipamentoComunicado(
           java.lang.String flagAlteracao,
           java.lang.Integer item,
           java.lang.Short anoFabricacao,
           java.lang.String serie,
           java.lang.String nome,
           java.lang.String marca,
           java.lang.String modelo) {
           this.flagAlteracao = flagAlteracao;
           this.item = item;
           this.anoFabricacao = anoFabricacao;
           this.serie = serie;
           this.nome = nome;
           this.marca = marca;
           this.modelo = modelo;
    }


    /**
     * Gets the flagAlteracao value for this ComunicadoEquipamentoComunicado.
     * 
     * @return flagAlteracao
     */
    public java.lang.String getFlagAlteracao() {
        return flagAlteracao;
    }


    /**
     * Sets the flagAlteracao value for this ComunicadoEquipamentoComunicado.
     * 
     * @param flagAlteracao
     */
    public void setFlagAlteracao(java.lang.String flagAlteracao) {
        this.flagAlteracao = flagAlteracao;
    }


    /**
     * Gets the item value for this ComunicadoEquipamentoComunicado.
     * 
     * @return item
     */
    public java.lang.Integer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ComunicadoEquipamentoComunicado.
     * 
     * @param item
     */
    public void setItem(java.lang.Integer item) {
        this.item = item;
    }


    /**
     * Gets the anoFabricacao value for this ComunicadoEquipamentoComunicado.
     * 
     * @return anoFabricacao
     */
    public java.lang.Short getAnoFabricacao() {
        return anoFabricacao;
    }


    /**
     * Sets the anoFabricacao value for this ComunicadoEquipamentoComunicado.
     * 
     * @param anoFabricacao
     */
    public void setAnoFabricacao(java.lang.Short anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    /**
     * Gets the serie value for this ComunicadoEquipamentoComunicado.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this ComunicadoEquipamentoComunicado.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the nome value for this ComunicadoEquipamentoComunicado.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ComunicadoEquipamentoComunicado.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the marca value for this ComunicadoEquipamentoComunicado.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this ComunicadoEquipamentoComunicado.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the modelo value for this ComunicadoEquipamentoComunicado.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this ComunicadoEquipamentoComunicado.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComunicadoEquipamentoComunicado)) return false;
        ComunicadoEquipamentoComunicado other = (ComunicadoEquipamentoComunicado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flagAlteracao==null && other.getFlagAlteracao()==null) || 
             (this.flagAlteracao!=null &&
              this.flagAlteracao.equals(other.getFlagAlteracao()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.anoFabricacao==null && other.getAnoFabricacao()==null) || 
             (this.anoFabricacao!=null &&
              this.anoFabricacao.equals(other.getAnoFabricacao()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo())));
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
        if (getFlagAlteracao() != null) {
            _hashCode += getFlagAlteracao().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getAnoFabricacao() != null) {
            _hashCode += getAnoFabricacao().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComunicadoEquipamentoComunicado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", ">ComunicadoEquipamento>comunicado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAlteracao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "flagAlteracao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoFabricacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "anoFabricacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
