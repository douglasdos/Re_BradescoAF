/**
 * ListarSegmentacoesPOBJeRENCSaidaVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.bradseg.bucb.servicos.model.vo;

public class ListarSegmentacoesPOBJeRENCSaidaVO  implements java.io.Serializable {
    private java.lang.String descSegPobj;

    private java.lang.String descSegRenc;

    private int segmentoPobj;

    private int segmentoRenc;

    public ListarSegmentacoesPOBJeRENCSaidaVO() {
    }

    public ListarSegmentacoesPOBJeRENCSaidaVO(
           java.lang.String descSegPobj,
           java.lang.String descSegRenc,
           int segmentoPobj,
           int segmentoRenc) {
           this.descSegPobj = descSegPobj;
           this.descSegRenc = descSegRenc;
           this.segmentoPobj = segmentoPobj;
           this.segmentoRenc = segmentoRenc;
    }


    /**
     * Gets the descSegPobj value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @return descSegPobj
     */
    public java.lang.String getDescSegPobj() {
        return descSegPobj;
    }


    /**
     * Sets the descSegPobj value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @param descSegPobj
     */
    public void setDescSegPobj(java.lang.String descSegPobj) {
        this.descSegPobj = descSegPobj;
    }


    /**
     * Gets the descSegRenc value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @return descSegRenc
     */
    public java.lang.String getDescSegRenc() {
        return descSegRenc;
    }


    /**
     * Sets the descSegRenc value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @param descSegRenc
     */
    public void setDescSegRenc(java.lang.String descSegRenc) {
        this.descSegRenc = descSegRenc;
    }


    /**
     * Gets the segmentoPobj value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @return segmentoPobj
     */
    public int getSegmentoPobj() {
        return segmentoPobj;
    }


    /**
     * Sets the segmentoPobj value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @param segmentoPobj
     */
    public void setSegmentoPobj(int segmentoPobj) {
        this.segmentoPobj = segmentoPobj;
    }


    /**
     * Gets the segmentoRenc value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @return segmentoRenc
     */
    public int getSegmentoRenc() {
        return segmentoRenc;
    }


    /**
     * Sets the segmentoRenc value for this ListarSegmentacoesPOBJeRENCSaidaVO.
     * 
     * @param segmentoRenc
     */
    public void setSegmentoRenc(int segmentoRenc) {
        this.segmentoRenc = segmentoRenc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarSegmentacoesPOBJeRENCSaidaVO)) return false;
        ListarSegmentacoesPOBJeRENCSaidaVO other = (ListarSegmentacoesPOBJeRENCSaidaVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descSegPobj==null && other.getDescSegPobj()==null) || 
             (this.descSegPobj!=null &&
              this.descSegPobj.equals(other.getDescSegPobj()))) &&
            ((this.descSegRenc==null && other.getDescSegRenc()==null) || 
             (this.descSegRenc!=null &&
              this.descSegRenc.equals(other.getDescSegRenc()))) &&
            this.segmentoPobj == other.getSegmentoPobj() &&
            this.segmentoRenc == other.getSegmentoRenc();
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
        if (getDescSegPobj() != null) {
            _hashCode += getDescSegPobj().hashCode();
        }
        if (getDescSegRenc() != null) {
            _hashCode += getDescSegRenc().hashCode();
        }
        _hashCode += getSegmentoPobj();
        _hashCode += getSegmentoRenc();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarSegmentacoesPOBJeRENCSaidaVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vo.model.servicos.bucb.bradseg.com.br", "ListarSegmentacoesPOBJeRENCSaidaVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descSegPobj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descSegPobj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descSegRenc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descSegRenc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentoPobj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentoPobj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentoRenc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentoRenc"));
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
