package Modelo;

import java.util.Objects;

public class Computadora extends Producto {
    private String procesador;
    private int ram;
    private int tamañoDisco;

    public Computadora(String nombre, String marca, double precio, int stock, String procesador, int ram, int tamañoDisco) {
        super(nombre, marca, precio, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.tamañoDisco = tamañoDisco;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getTamañoDisco() {
        return tamañoDisco;
    }

    public void setTamañoDisco(int tamañoDisco) {
        this.tamañoDisco = tamañoDisco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computadora that)) return false;
        if (!super.equals(o)) return false;
        return ram == that.ram && tamañoDisco == that.tamañoDisco && Objects.equals(procesador, that.procesador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), procesador, ram, tamañoDisco);
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", tamañoDisco=" + tamañoDisco +
                "} " + super.toString();
    }
}
