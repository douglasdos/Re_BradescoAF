/**
 * AgenciaSegmentosVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class AgenciaSegmentosVO  implements java.io.Serializable {
    private java.lang.Long agencias;

    private java.lang.Long segmentoPobj;

    private java.lang.Long segmentoRenc;

    public AgenciaSegmentosVO() {
    }

    public AgenciaSegmentosVO(
           java.lang.Long agencias,
           java.lang.Long segmentoPobj,
           java.lang.Long segmentoRenc) {
           this.agencias = agencias;
           this.segmentoPobj = segmentoPobj;
           this.segmentoRenc = segmentoRenc;
    }


    /**
     * Gets the agencias value for this AgenciaSegmentosVO.
     * 
     * @return agencias
     */
    public java.lang.Long getAgencias() {
        return agencias;
    }


    /**
     * Sets the agencias value for this AgenciaSegmentosVO.
     * 
     * @param agencias
     */
    public void setAgencias(java.lang.Long agencias) {
        this.agencias = agencias;
    }


    /**
     * Gets the segmentoPobj value for this AgenciaSegmentosVO.
     * 
     * @return segmentoPobj
     */
    public java.lang.Long getSegmentoPobj() {
        return segmentoPobj;
    }


    /**
     * Sets the segmentoPobj value for this AgenciaSegmentosVO.
     * 
     * @param segmentoPobj
     */
    public void setSegmentoPobj(java.lang.Long segmentoPobj) {
        this.segmentoPobj = segmentoPobj;
    }


    /**
     * Gets the segmentoRenc value for this AgenciaSegmentosVO.
     * 
     * @return segmentoRenc
     */
    public java.lang.Long getSegmentoRenc() {
        return segmentoRenc;
    }


    /**
     * Sets the segmentoRenc value for this AgenciaSegmentosVO.
     * 
     * @param segmentoRenc
     */
    public void setSegmentoRenc(java.lang.Long segmentoRenc) {
        this.segmentoRenc = segmentoRenc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgenciaSegmentosVO)) return false;
        AgenciaSegmentosVO other = (AgenciaSegmentosVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencias==null && other.getAgencias()==null) || 
             (this.agencias!=null &&
              this.agencias.equals(other.getAgencias()))) &&
            ((this.segmentoPobj==null && other.getSegmentoPobj()==null) || 
             (this.segmentoPobj!=null &&
              this.segmentoPobj.equals(other.getSegmentoPobj()))) &&
            ((this.segmentoRenc==null && other.getSegmentoRenc()==null) || 
             (this.segmentoRenc!=null &&
              this.segmentoRenc.equals(other.getSegmentoRenc())));
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
        if (getAgencias() != null) {
            _hashCode += getAgencias().hashCode();
        }
        if (getSegmentoPobj() != null) {
            _hashCode += getSegmentoPobj().hashCode();
        }
        if (getSegmentoRenc() != null) {
            _hashCode += getSegmentoRenc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgenciaSegmentosVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "AgenciaSegmentosVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentoPobj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentoPobj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentoRenc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentoRenc"));
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
