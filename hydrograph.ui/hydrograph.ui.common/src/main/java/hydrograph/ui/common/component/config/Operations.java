/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.17 at 01:02:05 PM IST 
//


package hydrograph.ui.common.component.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interface" type="{hydrograph/ui/ComponentConfig}TypeInfo" minOccurs="0"/>
 *         &lt;element name="stdOperation" type="{hydrograph/ui/ComponentConfig}TypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operations", propOrder = {
    "_interface",
    "stdOperation"
})
public class Operations {

    @XmlElement(name = "interface")
    protected TypeInfo _interface;
    protected List<TypeInfo> stdOperation;

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link TypeInfo }
     *     
     */
    public TypeInfo getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeInfo }
     *     
     */
    public void setInterface(TypeInfo value) {
        this._interface = value;
    }

    /**
     * Gets the value of the stdOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stdOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeInfo }
     * 
     * 
     */
    public List<TypeInfo> getStdOperation() {
        if (stdOperation == null) {
            stdOperation = new ArrayList<TypeInfo>();
        }
        return this.stdOperation;
    }

}