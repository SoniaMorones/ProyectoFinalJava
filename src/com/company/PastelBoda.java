package com.company;

public class PastelBoda extends Pastel {



    private int niveles;

    public PastelBoda() {
        super("Almendras");
    }


    public void setNiveles(int niveles) {

        this.niveles=niveles;
    }

    public int getNiveles(){
        return niveles;
    }
}
