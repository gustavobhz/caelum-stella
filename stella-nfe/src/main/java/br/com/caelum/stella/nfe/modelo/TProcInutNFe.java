//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.23 at 03:29:37 PM BRT 
//

package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcInutNFe", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = { "inutNFe", "retInutNFe" })
@XmlRootElement
public class TProcInutNFe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
    protected TInutNFe inutNFe;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
    protected TRetInutNFe retInutNFe;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    public TInutNFe getInutNFe() {
        return inutNFe;
    }

    public void setInutNFe(final TInutNFe value) {
        inutNFe = value;
    }

    public TRetInutNFe getRetInutNFe() {
        return retInutNFe;
    }

    public void setRetInutNFe(final TRetInutNFe value) {
        retInutNFe = value;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(final String value) {
        versao = value;
    }

}