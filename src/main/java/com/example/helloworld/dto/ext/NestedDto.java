package com.example.helloworld.dto.ext;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nested")
@XmlRootElement(name = "nested")
@Data
public class NestedDto extends BaseDto {

}
