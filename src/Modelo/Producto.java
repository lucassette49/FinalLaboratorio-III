package Modelo;

import java.util.Objects;

public class Producto {
    private String nombre;
    private String marca;
    private double precio;
    private int stock;

    public Producto(String nombre, String marca, double precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return Double.compare(producto.precio, precio) == 0 && stock == producto.stock && Objects.equals(nombre, producto.nombre) && Objects.equals(marca, producto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, marca, precio, stock);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock + "\n"+
                '}';
    }
}
