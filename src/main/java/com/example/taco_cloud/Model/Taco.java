package com.example.taco_cloud.Model;

import java.util.List;


import lombok.Data;

@Data
public class Taco {
    private String name;
    private List<Inrgedient> ingredients;
}
