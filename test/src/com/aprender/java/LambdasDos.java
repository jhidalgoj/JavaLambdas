package com.aprender.java;

import java.util.Arrays;
import java.util.List;

public class LambdasDos {
    public static void main(String[] args) {
        List<String> palabra = Arrays.asList("hello", null,"");
        palabra.stream()
                .filter(t -> t !=null) //filtra solo los que no son null
                .filter(t ->!t.isEmpty()) //filtra los que no estan vacios
                .forEach(System.out::println);
    }
}
