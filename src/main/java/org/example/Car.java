package org.example;


public class Car {
    private  int combustible;
    private int velocidad;
    private String modelo;



    public Car(int i, int i1, String ford) {
    }

    public  Car() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void Car() {

    }
    public void Car(int x, int y, String modelo) {
        this.combustible = combustible;
        this.velocidad=velocidad;
        this.modelo=modelo;
    }

    public int getCombustible() {
        return combustible;
    }
    public int getCombustible( int x) {
        this.combustible=x;
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    //metodos

    public void mostrarvelocidad(int x)
    {
           this.velocidad=x;
        System.out.println(x);
    }
    public void mostrarcombustible(int y)
    {
         this.combustible=y;
        System.out.println(y);
    }
    public void mostrarmodelo(String cadena)
    {
        this.modelo=cadena;
        System.out.println("cadena");
    }


}
