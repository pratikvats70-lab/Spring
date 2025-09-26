package com.example.helloworld.dto.ext;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDto")
@XmlSeeAlso(NestedDto.class)
public abstract class BaseDto {

    @XmlElement(name = "baseField")   // single value
    protected String baseField;

    @XmlElement(name = "item")             // child element
    protected List<String> baseItems;

    // getters and setters (important if you’re using Lombok, add @Data)
    public String getBaseField() { return baseField; }
    public void setBaseField(String baseField) { this.baseField = baseField; }

    public List<String> getBaseItems() { return baseItems; }
    public void setBaseItems(List<String> baseItems) { this.baseItems = baseItems; }
}
