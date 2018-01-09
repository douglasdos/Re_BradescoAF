/**
 * FiancaLocaticia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.sare.avisooutrasorigens.canonico.v1;

public class FiancaLocaticia  implements java.io.Serializable {
    private java.util.Date dataSegundoVencimento;

    private java.lang.String imovelOcupado;

    private java.lang.Short menorDiaVencimento;

    private java.lang.String pessoaResideImovel;

    private java.lang.String advogadoProprio;

    private java.lang.String itemComun;

    public FiancaLocaticia() {
    }

    public FiancaLocaticia(
           java.util.Date dataSegundoVencimento,
           java.lang.String imovelOcupado,
           java.lang.Short menorDiaVencimento,
           java.lang.String pessoaResideImovel,
           java.lang.String advogadoProprio,
           java.lang.String itemComun) {
           this.dataSegundoVencimento = dataSegundoVencimento;
           this.imovelOcupado = imovelOcupado;
           this.menorDiaVencimento = menorDiaVencimento;
           this.pessoaResideImovel = pessoaResideImovel;
           this.advogadoProprio = advogadoProprio;
           this.itemComun = itemComun;
    }


    /**
     * Gets the dataSegundoVencimento value for this FiancaLocaticia.
     * 
     * @return dataSegundoVencimento
     */
    public java.util.Date getDataSegundoVencimento() {
        return dataSegundoVencimento;
    }


    /**
     * Sets the dataSegundoVencimento value for this FiancaLocaticia.
     * 
     * @param dataSegundoVencimento
     */
    public void setDataSegundoVencimento(java.util.Date dataSegundoVencimento) {
        this.dataSegundoVencimento = dataSegundoVencimento;
    }


    /**
     * Gets the imovelOcupado value for this FiancaLocaticia.
     * 
     * @return imovelOcupado
     */
    public java.lang.String getImovelOcupado() {
        return imovelOcupado;
    }


    /**
     * Sets the imovelOcupado value for this FiancaLocaticia.
     * 
     * @param imovelOcupado
     */
    public void setImovelOcupado(java.lang.String imovelOcupado) {
        this.imovelOcupado = imovelOcupado;
    }


    /**
     * Gets the menorDiaVencimento value for this FiancaLocaticia.
     * 
     * @return menorDiaVencimento
     */
    public java.lang.Short getMenorDiaVencimento() {
        return menorDiaVencimento;
    }


    /**
     * Sets the menorDiaVencimento value for this FiancaLocaticia.
     * 
     * @param menorDiaVencimento
     */
    public void setMenorDiaVencimento(java.lang.Short menorDiaVencimento) {
        this.menorDiaVencimento = menorDiaVencimento;
    }


    /**
     * Gets the pessoaResideImovel value for this FiancaLocaticia.
     * 
     * @return pessoaResideImovel
     */
    public java.lang.String getPessoaResideImovel() {
        return pessoaResideImovel;
    }


    /**
     * Sets the pessoaResideImovel value for this FiancaLocaticia.
     * 
     * @param pessoaResideImovel
     */
    public void setPessoaResideImovel(java.lang.String pessoaResideImovel) {
        this.pessoaResideImovel = pessoaResideImovel;
    }


    /**
     * Gets the advogadoProprio value for this FiancaLocaticia.
     * 
     * @return advogadoProprio
     */
    public java.lang.String getAdvogadoProprio() {
        return advogadoProprio;
    }


    /**
     * Sets the advogadoProprio value for this FiancaLocaticia.
     * 
     * @param advogadoProprio
     */
    public void setAdvogadoProprio(java.lang.String advogadoProprio) {
        this.advogadoProprio = advogadoProprio;
    }


    /**
     * Gets the itemComun value for this FiancaLocaticia.
     * 
     * @return itemComun
     */
    public java.lang.String getItemComun() {
        return itemComun;
    }


    /**
     * Sets the itemComun value for this FiancaLocaticia.
     * 
     * @param itemComun
     */
    public void setItemComun(java.lang.String itemComun) {
        this.itemComun = itemComun;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FiancaLocaticia)) return false;
        FiancaLocaticia other = (FiancaLocaticia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataSegundoVencimento==null && other.getDataSegundoVencimento()==null) || 
             (this.dataSegundoVencimento!=null &&
              this.dataSegundoVencimento.equals(other.getDataSegundoVencimento()))) &&
            ((this.imovelOcupado==null && other.getImovelOcupado()==null) || 
             (this.imovelOcupado!=null &&
              this.imovelOcupado.equals(other.getImovelOcupado()))) &&
            ((this.menorDiaVencimento==null && other.getMenorDiaVencimento()==null) || 
             (this.menorDiaVencimento!=null &&
              this.menorDiaVencimento.equals(other.getMenorDiaVencimento()))) &&
            ((this.pessoaResideImovel==null && other.getPessoaResideImovel()==null) || 
             (this.pessoaResideImovel!=null &&
              this.pessoaResideImovel.equals(other.getPessoaResideImovel()))) &&
            ((this.advogadoProprio==null && other.getAdvogadoProprio()==null) || 
             (this.advogadoProprio!=null &&
              this.advogadoProprio.equals(other.getAdvogadoProprio()))) &&
            ((this.itemComun==null && other.getItemComun()==null) || 
             (this.itemComun!=null &&
              this.itemComun.equals(other.getItemComun())));
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
        if (getDataSegundoVencimento() != null) {
            _hashCode += getDataSegundoVencimento().hashCode();
        }
        if (getImovelOcupado() != null) {
            _hashCode += getImovelOcupado().hashCode();
        }
        if (getMenorDiaVencimento() != null) {
            _hashCode += getMenorDiaVencimento().hashCode();
        }
        if (getPessoaResideImovel() != null) {
            _hashCode += getPessoaResideImovel().hashCode();
        }
        if (getAdvogadoProprio() != null) {
            _hashCode += getAdvogadoProprio().hashCode();
        }
        if (getItemComun() != null) {
            _hashCode += getItemComun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FiancaLocaticia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "FiancaLocaticia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSegundoVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "dataSegundoVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imovelOcupado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "imovelOcupado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menorDiaVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "menorDiaVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pessoaResideImovel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "pessoaResideImovel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advogadoProprio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "advogadoProprio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemComun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://canonico.avisooutrasorigens.sare.bradseg.com.br/v1", "itemComun"));
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
