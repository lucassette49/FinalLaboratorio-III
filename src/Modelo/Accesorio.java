package Modelo;

import java.util.Objects;

public class Accesorio extends Producto{
    private String conexion;
    private String compatibilidad;

    public Accesorio(String nombre, String marca, double precio, int stock, String conexion, String compatibilidad) {
        super(nombre, marca, precio, stock);
        this.conexion = conexion;
        this.compatibilidad = compatibilidad;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accesorio accesorio)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(conexion, accesorio.conexion) && Objects.equals(compatibilidad, accesorio.compatibilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conexion, compatibilidad);
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "conexion='" + conexion + '\'' +
                ", compatibilidad='" + compatibilidad + '\'' +
                "} " + super.toString();
    }
}
