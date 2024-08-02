package Envoltorio;

import Interfaz.ManejoCollecion;
import Modelo.Producto;
import Exception.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Tienda implements ManejoCollecion <Producto> {
    private Map<String, Producto> productos;  //elegi hashmap para tener un rapido acceso a los datos cargados en el con el clave valor

    public Tienda(Map<String, Producto> productos) {
        this.productos = productos;
    }
    public Tienda() {
        this.productos = new HashMap<>();
    }

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public void setProductos(Map<String, Producto> productos) {
        this.productos = productos;
    }

    @Override
    public boolean add(Producto dato) {
        boolean flag=false;

        if (!productos.containsKey(dato.getNombre())){
            productos.put(dato.getNombre(), dato);
            flag=true;
        }

        return flag;
    }

    @Override
    public Producto getByName(String name) {
        Producto aux=null;
        if (productos.containsKey(name)){
            aux=productos.get(name);
        }
        return aux;
    }

    @Override
    public boolean deleteByName(String name) {
        boolean flag=false;
        if (productos.containsKey(name)){
            productos.remove(name);
            flag=true;
        }

        return flag;
    }

    @Override
    public String listAll() {
        return productos.toString();
    }

    @Override
    public boolean buy(String name) {
        boolean flag = false;
        Producto aux=getByName(name);
        if (aux!=null){
            try{
                if(aux.getStock()==0){
                    throw new ProductNotAvailableException("No hay stock de este producto "+ aux.getNombre());
                }else {
                    aux.setStock(aux.getStock()-1);
                    flag= true;
                }

            }catch (RuntimeException e){
                System.out.println("error:" + e.getMessage());
            }

        }

        return flag;
    }

    public void guardarEnArchivoJson(){
        File file=new File("productos.json");
        ObjectMapper mapper= new ObjectMapper();

        try {
            mapper.writeValue(file,productos);
        }catch (IOException e){
            System.out.println("Error al cargar el archivo"+e.getMessage());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tienda tienda)) return false;
        return Objects.equals(productos, tienda.productos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productos);
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "productos=" + productos +
                '}';
    }
}
