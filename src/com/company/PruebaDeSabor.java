package com.company;

public class PruebaDeSabor extends Pastel {


    public static void main(String[] args){
        System.out.println("******************PASTEL BASICO****************************");
        Pastel pastel = new Pastel();
        pastel.setPrecio(400);
        System.out.println("Sabor de Pastel Basico: " + pastel.getSabor());
        System.out.println("Costo del Pastel " + "$" + pastel.getPrecio());

        System.out.println("******************PASTEL CUMPLEAÑOS****************************");
        PastelFiestaCumple pastelFiestaCumple = new PastelFiestaCumple();
        pastelFiestaCumple.setVelas(6);
        pastelFiestaCumple.setPrecio(655.5);
        System.out.println("Sabor de Pastel de Cumpleaños: " + pastelFiestaCumple.getSabor());
        System.out.println("Cantidad de velas en el Pastel: " + pastelFiestaCumple.getVelas());
        System.out.println("Costo de Pastel de Cumpleaños " + "$" + pastelFiestaCumple.getPrecio());

        System.out.println("******************PASTEL BODAS********************************");
        PastelBoda pastelBoda = new PastelBoda();
        pastelBoda.setPrecio(1500.5);
        pastelBoda.setSabor("Piña Colada");
        pastelBoda.setNiveles(4);
        System.out.println("Sabor de Pastel de Bodas: " + pastelBoda.getSabor());
        System.out.println("Niveles que componen al Pastel de Bodas: " + pastelBoda.getNiveles());
        System.out.println("Costo de Pastel de Bodas " + "$" + pastelBoda.getPrecio());


    }
}
