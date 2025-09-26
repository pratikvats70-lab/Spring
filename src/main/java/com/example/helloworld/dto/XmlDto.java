package com.example.helloworld.dto;

import com.example.helloworld.dto.ext.NestedDto;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlDto")
@XmlRootElement(name = "XmlDto")
@Data
public class XmlDto {
    private String message;
    private List<String> items;
    private NestedDto nested;
}
