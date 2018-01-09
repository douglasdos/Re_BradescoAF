/**
 * FiltroServiceVo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.afnd.afinidade.model.vo;

public class FiltroServiceVo  implements java.io.Serializable {
    private java.lang.String numeroDocumento;

    private java.lang.String dataFimVigencia;

    private java.lang.Integer codigoProduto;

    private java.lang.String dataInicioVigencia;

    private java.lang.Integer tipoFuncionalidade;

    private java.lang.Integer tipoDocumento;

    public FiltroServiceVo() {
    }

    public FiltroServiceVo(
           java.lang.String numeroDocumento,
           java.lang.String dataFimVigencia,
           java.lang.Integer codigoProduto,
           java.lang.String dataInicioVigencia,
           java.lang.Integer tipoFuncionalidade,
           java.lang.Integer tipoDocumento) {
           this.numeroDocumento = numeroDocumento;
           this.dataFimVigencia = dataFimVigencia;
           this.codigoProduto = codigoProduto;
           this.dataInicioVigencia = dataInicioVigencia;
           this.tipoFuncionalidade = tipoFuncionalidade;
           this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the numeroDocumento value for this FiltroServiceVo.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this FiltroServiceVo.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the dataFimVigencia value for this FiltroServiceVo.
     * 
     * @return dataFimVigencia
     */
    public java.lang.String getDataFimVigencia() {
        return dataFimVigencia;
    }


    /**
     * Sets the dataFimVigencia value for this FiltroServiceVo.
     * 
     * @param dataFimVigencia
     */
    public void setDataFimVigencia(java.lang.String dataFimVigencia) {
        this.dataFimVigencia = dataFimVigencia;
    }


    /**
     * Gets the codigoProduto value for this FiltroServiceVo.
     * 
     * @return codigoProduto
     */
    public java.lang.Integer getCodigoProduto() {
        return codigoProduto;
    }


    /**
     * Sets the codigoProduto value for this FiltroServiceVo.
     * 
     * @param codigoProduto
     */
    public void setCodigoProduto(java.lang.Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }


    /**
     * Gets the dataInicioVigencia value for this FiltroServiceVo.
     * 
     * @return dataInicioVigencia
     */
    public java.lang.String getDataInicioVigencia() {
        return dataInicioVigencia;
    }


    /**
     * Sets the dataInicioVigencia value for this FiltroServiceVo.
     * 
     * @param dataInicioVigencia
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia) {
        this.dataInicioVigencia = dataInicioVigencia;
    }


    /**
     * Gets the tipoFuncionalidade value for this FiltroServiceVo.
     * 
     * @return tipoFuncionalidade
     */
    public java.lang.Integer getTipoFuncionalidade() {
        return tipoFuncionalidade;
    }


    /**
     * Sets the tipoFuncionalidade value for this FiltroServiceVo.
     * 
     * @param tipoFuncionalidade
     */
    public void setTipoFuncionalidade(java.lang.Integer tipoFuncionalidade) {
        this.tipoFuncionalidade = tipoFuncionalidade;
    }


    /**
     * Gets the tipoDocumento value for this FiltroServiceVo.
     * 
     * @return tipoDocumento
     */
    public java.lang.Integer getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this FiltroServiceVo.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FiltroServiceVo)) return false;
        FiltroServiceVo other = (FiltroServiceVo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.dataFimVigencia==null && other.getDataFimVigencia()==null) || 
             (this.dataFimVigencia!=null &&
              this.dataFimVigencia.equals(other.getDataFimVigencia()))) &&
            ((this.codigoProduto==null && other.getCodigoProduto()==null) || 
             (this.codigoProduto!=null &&
              this.codigoProduto.equals(other.getCodigoProduto()))) &&
            ((this.dataInicioVigencia==null && other.getDataInicioVigencia()==null) || 
             (this.dataInicioVigencia!=null &&
              this.dataInicioVigencia.equals(other.getDataInicioVigencia()))) &&
            ((this.tipoFuncionalidade==null && other.getTipoFuncionalidade()==null) || 
             (this.tipoFuncionalidade!=null &&
              this.tipoFuncionalidade.equals(other.getTipoFuncionalidade()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento())));
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
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getDataFimVigencia() != null) {
            _hashCode += getDataFimVigencia().hashCode();
        }
        if (getCodigoProduto() != null) {
            _hashCode += getCodigoProduto().hashCode();
        }
        if (getDataInicioVigencia() != null) {
            _hashCode += getDataInicioVigencia().hashCode();
        }
        if (getTipoFuncionalidade() != null) {
            _hashCode += getTipoFuncionalidade().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FiltroServiceVo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "FiltroServiceVo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFimVigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "dataFimVigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProduto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "codigoProduto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicioVigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "dataInicioVigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFuncionalidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "tipoFuncionalidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vo.model.afinidade.afnd.bradseg.com.br", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
