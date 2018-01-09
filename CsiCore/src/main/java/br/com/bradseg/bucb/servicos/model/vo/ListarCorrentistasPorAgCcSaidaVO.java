/**
 * ListarCorrentistasPorAgCcSaidaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ListarCorrentistasPorAgCcSaidaVO  implements java.io.Serializable {
    private java.lang.Long agenciaDestino;

    private java.lang.Integer cdPosto;

    private java.lang.Long contaDestino;

    private java.lang.String descPosto;

    private java.lang.String descSegmento;

    private java.lang.String dvContaDestino;

    private java.lang.String indTragueada;

    private java.lang.Integer nrOcorrencias;

    private java.lang.Integer razao;

    private java.lang.Integer segmento;

    private java.lang.Integer tipoConta;

    private br.com.bradseg.bucb.servicos.model.vo.CorrentistasPorFiltrosVO[] listCorrentistasPorFiltrosVO;

    public ListarCorrentistasPorAgCcSaidaVO() {
    }

    public ListarCorrentistasPorAgCcSaidaVO(
           java.lang.Long agenciaDestino,
           java.lang.Integer cdPosto,
           java.lang.Long contaDestino,
           java.lang.String descPosto,
           java.lang.String descSegmento,
           java.lang.String dvContaDestino,
           java.lang.String indTragueada,
           java.lang.Integer nrOcorrencias,
           java.lang.Integer razao,
           java.lang.Integer segmento,
           java.lang.Integer tipoConta,
           br.com.bradseg.bucb.servicos.model.vo.CorrentistasPorFiltrosVO[] listCorrentistasPorFiltrosVO) {
           this.agenciaDestino = agenciaDestino;
           this.cdPosto = cdPosto;
           this.contaDestino = contaDestino;
           this.descPosto = descPosto;
           this.descSegmento = descSegmento;
           this.dvContaDestino = dvContaDestino;
           this.indTragueada = indTragueada;
           this.nrOcorrencias = nrOcorrencias;
           this.razao = razao;
           this.segmento = segmento;
           this.tipoConta = tipoConta;
           this.listCorrentistasPorFiltrosVO = listCorrentistasPorFiltrosVO;
    }


    /**
     * Gets the agenciaDestino value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return agenciaDestino
     */
    public java.lang.Long getAgenciaDestino() {
        return agenciaDestino;
    }


    /**
     * Sets the agenciaDestino value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param agenciaDestino
     */
    public void setAgenciaDestino(java.lang.Long agenciaDestino) {
        this.agenciaDestino = agenciaDestino;
    }


    /**
     * Gets the cdPosto value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return cdPosto
     */
    public java.lang.Integer getCdPosto() {
        return cdPosto;
    }


    /**
     * Sets the cdPosto value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param cdPosto
     */
    public void setCdPosto(java.lang.Integer cdPosto) {
        this.cdPosto = cdPosto;
    }


    /**
     * Gets the contaDestino value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return contaDestino
     */
    public java.lang.Long getContaDestino() {
        return contaDestino;
    }


    /**
     * Sets the contaDestino value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param contaDestino
     */
    public void setContaDestino(java.lang.Long contaDestino) {
        this.contaDestino = contaDestino;
    }


    /**
     * Gets the descPosto value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return descPosto
     */
    public java.lang.String getDescPosto() {
        return descPosto;
    }


    /**
     * Sets the descPosto value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param descPosto
     */
    public void setDescPosto(java.lang.String descPosto) {
        this.descPosto = descPosto;
    }


    /**
     * Gets the descSegmento value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return descSegmento
     */
    public java.lang.String getDescSegmento() {
        return descSegmento;
    }


    /**
     * Sets the descSegmento value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param descSegmento
     */
    public void setDescSegmento(java.lang.String descSegmento) {
        this.descSegmento = descSegmento;
    }


    /**
     * Gets the dvContaDestino value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return dvContaDestino
     */
    public java.lang.String getDvContaDestino() {
        return dvContaDestino;
    }


    /**
     * Sets the dvContaDestino value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param dvContaDestino
     */
    public void setDvContaDestino(java.lang.String dvContaDestino) {
        this.dvContaDestino = dvContaDestino;
    }


    /**
     * Gets the indTragueada value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return indTragueada
     */
    public java.lang.String getIndTragueada() {
        return indTragueada;
    }


    /**
     * Sets the indTragueada value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param indTragueada
     */
    public void setIndTragueada(java.lang.String indTragueada) {
        this.indTragueada = indTragueada;
    }


    /**
     * Gets the nrOcorrencias value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return nrOcorrencias
     */
    public java.lang.Integer getNrOcorrencias() {
        return nrOcorrencias;
    }


    /**
     * Sets the nrOcorrencias value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param nrOcorrencias
     */
    public void setNrOcorrencias(java.lang.Integer nrOcorrencias) {
        this.nrOcorrencias = nrOcorrencias;
    }


    /**
     * Gets the razao value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return razao
     */
    public java.lang.Integer getRazao() {
        return razao;
    }


    /**
     * Sets the razao value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param razao
     */
    public void setRazao(java.lang.Integer razao) {
        this.razao = razao;
    }


    /**
     * Gets the segmento value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return segmento
     */
    public java.lang.Integer getSegmento() {
        return segmento;
    }


    /**
     * Sets the segmento value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param segmento
     */
    public void setSegmento(java.lang.Integer segmento) {
        this.segmento = segmento;
    }


    /**
     * Gets the tipoConta value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return tipoConta
     */
    public java.lang.Integer getTipoConta() {
        return tipoConta;
    }


    /**
     * Sets the tipoConta value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param tipoConta
     */
    public void setTipoConta(java.lang.Integer tipoConta) {
        this.tipoConta = tipoConta;
    }


    /**
     * Gets the listCorrentistasPorFiltrosVO value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @return listCorrentistasPorFiltrosVO
     */
    public br.com.bradseg.bucb.servicos.model.vo.CorrentistasPorFiltrosVO[] getListCorrentistasPorFiltrosVO() {
        return listCorrentistasPorFiltrosVO;
    }


    /**
     * Sets the listCorrentistasPorFiltrosVO value for this ListarCorrentistasPorAgCcSaidaVO.
     * 
     * @param listCorrentistasPorFiltrosVO
     */
    public void setListCorrentistasPorFiltrosVO(br.com.bradseg.bucb.servicos.model.vo.CorrentistasPorFiltrosVO[] listCorrentistasPorFiltrosVO) {
        this.listCorrentistasPorFiltrosVO = listCorrentistasPorFiltrosVO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarCorrentistasPorAgCcSaidaVO)) return false;
        ListarCorrentistasPorAgCcSaidaVO other = (ListarCorrentistasPorAgCcSaidaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agenciaDestino==null && other.getAgenciaDestino()==null) || 
             (this.agenciaDestino!=null &&
              this.agenciaDestino.equals(other.getAgenciaDestino()))) &&
            ((this.cdPosto==null && other.getCdPosto()==null) || 
             (this.cdPosto!=null &&
              this.cdPosto.equals(other.getCdPosto()))) &&
            ((this.contaDestino==null && other.getContaDestino()==null) || 
             (this.contaDestino!=null &&
              this.contaDestino.equals(other.getContaDestino()))) &&
            ((this.descPosto==null && other.getDescPosto()==null) || 
             (this.descPosto!=null &&
              this.descPosto.equals(other.getDescPosto()))) &&
            ((this.descSegmento==null && other.getDescSegmento()==null) || 
             (this.descSegmento!=null &&
              this.descSegmento.equals(other.getDescSegmento()))) &&
            ((this.dvContaDestino==null && other.getDvContaDestino()==null) || 
             (this.dvContaDestino!=null &&
              this.dvContaDestino.equals(other.getDvContaDestino()))) &&
            ((this.indTragueada==null && other.getIndTragueada()==null) || 
             (this.indTragueada!=null &&
              this.indTragueada.equals(other.getIndTragueada()))) &&
            ((this.nrOcorrencias==null && other.getNrOcorrencias()==null) || 
             (this.nrOcorrencias!=null &&
              this.nrOcorrencias.equals(other.getNrOcorrencias()))) &&
            ((this.razao==null && other.getRazao()==null) || 
             (this.razao!=null &&
              this.razao.equals(other.getRazao()))) &&
            ((this.segmento==null && other.getSegmento()==null) || 
             (this.segmento!=null &&
              this.segmento.equals(other.getSegmento()))) &&
            ((this.tipoConta==null && other.getTipoConta()==null) || 
             (this.tipoConta!=null &&
              this.tipoConta.equals(other.getTipoConta()))) &&
            ((this.listCorrentistasPorFiltrosVO==null && other.getListCorrentistasPorFiltrosVO()==null) || 
             (this.listCorrentistasPorFiltrosVO!=null &&
              java.util.Arrays.equals(this.listCorrentistasPorFiltrosVO, other.getListCorrentistasPorFiltrosVO())));
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
        if (getAgenciaDestino() != null) {
            _hashCode += getAgenciaDestino().hashCode();
        }
        if (getCdPosto() != null) {
            _hashCode += getCdPosto().hashCode();
        }
        if (getContaDestino() != null) {
            _hashCode += getContaDestino().hashCode();
        }
        if (getDescPosto() != null) {
            _hashCode += getDescPosto().hashCode();
        }
        if (getDescSegmento() != null) {
            _hashCode += getDescSegmento().hashCode();
        }
        if (getDvContaDestino() != null) {
            _hashCode += getDvContaDestino().hashCode();
        }
        if (getIndTragueada() != null) {
            _hashCode += getIndTragueada().hashCode();
        }
        if (getNrOcorrencias() != null) {
            _hashCode += getNrOcorrencias().hashCode();
        }
        if (getRazao() != null) {
            _hashCode += getRazao().hashCode();
        }
        if (getSegmento() != null) {
            _hashCode += getSegmento().hashCode();
        }
        if (getTipoConta() != null) {
            _hashCode += getTipoConta().hashCode();
        }
        if (getListCorrentistasPorFiltrosVO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListCorrentistasPorFiltrosVO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListCorrentistasPorFiltrosVO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarCorrentistasPorAgCcSaidaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarCorrentistasPorAgCcSaidaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agenciaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agenciaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdPosto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdPosto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descPosto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descPosto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descSegmento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descSegmento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvContaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dvContaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indTragueada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indTragueada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrOcorrencias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nrOcorrencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "razao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoConta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listCorrentistasPorFiltrosVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listCorrentistasPorFiltrosVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "CorrentistasPorFiltrosVO"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "CorrentistasPorFiltrosVO"));
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
