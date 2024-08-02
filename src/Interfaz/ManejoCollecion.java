package Interfaz;

public interface ManejoCollecion <T>{
    public boolean add (T dato);
    public T getByName (String name);
    public boolean deleteByName (String name);
    public String listAll ();
    public boolean buy (String name);
}
