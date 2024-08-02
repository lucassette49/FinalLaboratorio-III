package Modelo;

import java.util.Objects;

public class Telefono extends Producto {
    private String sistemaOP;
    private String tamañoDePantalla;
    private int almacenamiento;

    public Telefono(String nombre, String marca, double precio, int stock, String sistemaOP, String tamañoDePantalla, int almacenamiento) {
        super(nombre, marca, precio, stock);
        this.sistemaOP = sistemaOP;
        this.tamañoDePantalla = tamañoDePantalla;
        this.almacenamiento = almacenamiento;
    }

    public String getSistemaOP() {
        return sistemaOP;
    }

    public void setSistemaOP(String sistemaOP) {
        this.sistemaOP = sistemaOP;
    }

    public String getTamañoDePantalla() {
        return tamañoDePantalla;
    }

    public void setTamañoDePantalla(String tamañoDePantalla) {
        this.tamañoDePantalla = tamañoDePantalla;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefono telefono)) return false;
        if (!super.equals(o)) return false;
        return almacenamiento == telefono.almacenamiento && Objects.equals(sistemaOP, telefono.sistemaOP) && Objects.equals(tamañoDePantalla, telefono.tamañoDePantalla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sistemaOP, tamañoDePantalla, almacenamiento);
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "sistemaOP='" + sistemaOP + '\'' +
                ", tamañoDePantalla='" + tamañoDePantalla + '\'' +
                ", almacenamiento=" + almacenamiento +
                "} " + super.toString();
    }
}
