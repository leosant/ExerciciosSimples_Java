package com.cursoTeste.Enums;

public enum Genero {

    MASCULINO('M'), FEMNINO('F');

    private char genero;

    Genero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

}
