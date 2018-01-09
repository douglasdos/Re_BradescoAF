/**
 * DetalheSinistroExtensaoSinistro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisoeletroportatil.canonico.v1;

public class DetalheSinistroExtensaoSinistro  implements java.io.Serializable {
    private java.lang.Short categoria;

    private java.lang.Integer tipo;

    private java.lang.Integer marca;

    private java.lang.Integer quantidade;

    private java.math.BigDecimal valorUnitario;

    private java.math.BigDecimal valorEstimado;

    private java.lang.String descricaoOutros;

    public DetalheSinistroExtensaoSinistro() {
    }

    public DetalheSinistroExtensaoSinistro(
           java.lang.Short categoria,
           java.lang.Integer tipo,
           java.lang.Integer marca,
           java.lang.Integer quantidade,
           java.math.BigDecimal valorUnitario,
           java.math.BigDecimal valorEstimado,
           java.lang.String descricaoOutros) {
           this.categoria = categoria;
           this.tipo = tipo;
           this.marca = marca;
           this.quantidade = quantidade;
           this.valorUnitario = valorUnitario;
           this.valorEstimado = valorEstimado;
           this.descricaoOutros = descricaoOutros;
    }


    /**
     * Gets the categoria value for this DetalheSinistroExtensaoSinistro.
     * 
     * @return categoria
     */
    public java.lang.Short getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this DetalheSinistroExtensaoSinistro.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.Short categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the tipo value for this DetalheSinistroExtensaoSinistro.
     * 
     * @return tipo
     */
    public java.lang.Integer getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this DetalheSinistroExtensaoSinistro.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.Integer tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the marca value for this DetalheSinistroExtensaoSinistro.
     * 
     * @return marca
     */
    public java.lang.Integer getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this DetalheSinistroExtensaoSinistro.
     * 
     * @param marca
     */
    public void setMarca(java.lang.Integer marca) {
        this.marca = marca;
    }


    /**
     * Gets the quantidade value for this DetalheSinistroExtensaoSinistro.
     * 
     * @return quantidade
     */
    public java.lang.Integer getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this DetalheSinistroExtensaoSinistro.
     * 
     * @param quantidade
     */
    public void setQuantidade(java.lang.Integer quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the valorUnitario value for this DetalheSinistroExtensaoSinistro.
     * 
     * @return valorUnitario
     */
    public java.math.BigDecimal getValorUnitario() {
        return valorUnitario;
    }


    /**
     * Sets the valorUnitario value for this DetalheSinistroExtensaoSinistro.
     * 
     * @param valorUnitario
     */
    public void setValorUnitario(java.math.BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


    /**
     * Gets the valorEstimado value for this DetalheSinistroExtensaoSinistro.
     * 
     * @return valorEstimado
     */
    public java.math.BigDecimal getValorEstimado() {
        return valorEstimado;
    }


    /**
     * Sets the valorEstimado value for this DetalheSinistroExtensaoSinistro.
     * 
     * @param valorEstimado
     */
    public void setValorEstimado(java.math.BigDecimal valorEstimado) {
        this.valorEstimado = valorEstimado;
    }


    /**
     * Gets the descricaoOutros value for this DetalheSinistroExtensaoSinistro.
     * 
     * @return descricaoOutros
     */
    public java.lang.String getDescricaoOutros() {
        return descricaoOutros;
    }


    /**
     * Sets the descricaoOutros value for this DetalheSinistroExtensaoSinistro.
     * 
     * @param descricaoOutros
     */
    public void setDescricaoOutros(java.lang.String descricaoOutros) {
        this.descricaoOutros = descricaoOutros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetalheSinistroExtensaoSinistro)) return false;
        DetalheSinistroExtensaoSinistro other = (DetalheSinistroExtensaoSinistro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.quantidade==null && other.getQuantidade()==null) || 
             (this.quantidade!=null &&
              this.quantidade.equals(other.getQuantidade()))) &&
            ((this.valorUnitario==null && other.getValorUnitario()==null) || 
             (this.valorUnitario!=null &&
              this.valorUnitario.equals(other.getValorUnitario()))) &&
            ((this.valorEstimado==null && other.getValorEstimado()==null) || 
             (this.valorEstimado!=null &&
              this.valorEstimado.equals(other.getValorEstimado()))) &&
            ((this.descricaoOutros==null && other.getDescricaoOutros()==null) || 
             (this.descricaoOutros!=null &&
              this.descricaoOutros.equals(other.getDescricaoOutros())));
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
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getQuantidade() != null) {
            _hashCode += getQuantidade().hashCode();
        }
        if (getValorUnitario() != null) {
            _hashCode += getValorUnitario().hashCode();
        }
        if (getValorEstimado() != null) {
            _hashCode += getValorEstimado().hashCode();
        }
        if (getDescricaoOutros() != null) {
            _hashCode += getDescricaoOutros().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetalheSinistroExtensaoSinistro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", ">DetalheSinistro>extensaoSinistro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "quantidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorUnitario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "valorUnitario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorEstimado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "valorEstimado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisoeletroportatil.sare.bradseg.com.br/v1", "descricaoOutros"));
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
