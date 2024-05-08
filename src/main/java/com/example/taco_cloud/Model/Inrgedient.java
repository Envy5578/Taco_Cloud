package com.example.taco_cloud.Model;

import lombok.Data;

@Data
public class Inrgedient {
    private final String id;
    private final String name;
    private final Type type;
    public enum Type {WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE}
}
