package com.company;
import java.util.Objects;

public class Prenda {

    private final TipoDePrenda tipo;
    private final MaterialDePrenda material;
    private final TramaDeTela trama;
    private final ColorDePrenda colorPrimario;
    private final ColorDePrenda colorSecundario;


    Prenda(PrendaBuilder builder) {
        this.tipo = builder.tipo;
        this.material = builder.material;
        this.trama = builder.trama;
        this.colorPrimario = builder.colorPrimario;
        this.colorSecundario = builder.colorSecundario;
    }


    private CategoriaDePrenda categoria() {
        return tipo.categoria();
    }
}
