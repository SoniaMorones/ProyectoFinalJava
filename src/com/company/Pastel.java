package com.company;

public class Pastel {


	    private String sabor;
        private double precio;


    public Pastel() {
            this.sabor = "Vainilla";
            //this.precio = precio;
        }

   public Pastel(String sabor){
            this.sabor=sabor;
        }


        public String getSabor() {

            return sabor;
        }

        public double getPrecio() {
            return precio;
        }

        public void setSabor(String sabor) {
            this.sabor = sabor;

        }

        public void setPrecio(double precio)

        {
            this.precio = precio;
        }


    }

