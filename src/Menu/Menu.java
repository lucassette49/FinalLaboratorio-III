package Menu;
import Envoltorio.*;
import Modelo.*;

import java.util.Scanner;

public class Menu {
   public static void menu (){
       Accesorio accesorio1= new Accesorio("Auriculares","sony",50,10,"Inalambrica","Pc/Celular");
       Accesorio accesorio2= new Accesorio("Teclado","RedDragon",100,9,"Inalambrica","Pc");
       Computadora computadora1= new Computadora("LG 520", "LG", 5000, 2, "ryzen 5600g",10,500);
       Telefono telefono1= new Telefono("Iphone 15", "Iphone", 1000, 4, "Ios", "10x4", 68);
       Tienda tiendita= new Tienda();
       tiendita.add(accesorio1);
       tiendita.add(computadora1);
       tiendita.add(telefono1);
       int opcion=0;
       boolean flag=false;

       do {
           System.out.println("\n\n\n");

           Scanner scan = new Scanner(System.in);

           System.out.println("1)Agregar producto");
           System.out.println("2)Comprar producto");
           System.out.println("3)Listado de producto");
           System.out.println("4)Eliminar Producto por nombre // el elemento que elimina es el que se agrega en la opcion 1");
           System.out.println("5)Buscar Producto por nombre");
           System.out.println("6)Guardar en el archivo json");


           opcion=scan.nextInt();


           switch (opcion){
               case 1:
                   flag=tiendita.add(accesorio2);
                   if (flag==true){
                       System.out.println("El Producto se agrego con exito");
                   }else {
                       System.out.println("No se puede agregar el producto porque ya existe");
                   }
                   break;
               case 2:
                   flag= tiendita.buy("Iphone 15");
                   if (flag==true){
                       System.out.println("La compra se realizo con exito");
                       System.out.println(tiendita.listAll());
                   }else {
                       System.out.println("no se pudo realizar la compra");
                   }
                   break;
               case 3:

                   System.out.println("listado de productos");
                   System.out.println(tiendita.listAll());
                   break;
               case 4:

                   flag= tiendita.deleteByName("Teclado");
                   if (flag==true){
                       System.out.println("Se ha eliminado el producto correctamente");
                       System.out.println(tiendita.listAll());
                   }else {
                       System.out.println("no se pudo eliminar el producto");
                   }

                   break;
               case 5:
                   Producto aux= tiendita.getByName("LG 520");
                   System.out.println(aux);
                   break;
               case 6:
                   tiendita.guardarEnArchivoJson();
                   break;
               case 0:
                   System.out.println("Saliendo del sistema");
                   break;
               default:
                   System.out.println("opcion incorrecta");
                   break;
           }

       }while (opcion!=0);

   }


}
