package com.arellano.lambda;

import com.arellano.entity.Persona;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgramming {
    public Integer caracteres(String text){
        Function<String, Integer> sizeString = String::length;

        return sizeString.apply(text);
    }

    public List<String> regresarListaConEspecificacion(String especificacion, List<Persona> myList){
        Stream<Persona> stream = myList.stream();

        List<String> nombres = stream.filter(p -> p.getNombre().equals(especificacion))
                .map(Persona::getNombre).collect(Collectors.toList());

        return nombres;
    }
}
