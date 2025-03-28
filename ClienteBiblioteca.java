import Biblioteca.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

import java.util.Scanner;

import org.omg.CORBA.*;

public class ClienteBiblioteca {
    public static void main(String args[]) {
        try {
            // Inicializar el ORB (Object Request Broker)
            ORB orb = ORB.init(args, null);

            // Obtener referencia al servicio de nombres
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Buscar la referencia del objeto (servidor) en el servicio de nombres
            String name = "GestionBiblioteca";
            GestionBiblioteca gestionBiblioteca = GestionBibliotecaHelper.narrow(ncRef.resolve_str(name));

            // Usar la interfaz para llamar a las operaciones del servidor
            // Ejemplo: Buscar un libro
             Scanner myObj = new Scanner(System.in); 

            System.out.println("Que libro desea buscar:");
            String tituloLibro = myObj.nextLine();  

            Libro libro = gestionBiblioteca.buscarLibro(tituloLibro);
            System.out.println("Libro encontrado: " + libro.titulo + ", " + libro.autor + ", ISBN: " + libro.ISBN);
            // Ejemplo: Prestar un libro
            boolean resultadoPrestamo = gestionBiblioteca.prestarLibro(libro.ISBN);
            if (resultadoPrestamo) {
                System.out.println("Libro prestado con éxito.");
            } else {
                System.out.println("El libro no está disponible para préstamo.");
            }
            
            System.out.println("¿Quieres devolver? S/N");
            int opcion = myObj.nextInt(); 
            if(opcion == 1){
                System.out.println("Prestar");

                // Ejemplo:devolver libro
                boolean resultadoDevolucion = gestionBiblioteca.devolverLibro(libro.ISBN);
                if (resultadoDevolucion) {
                    System.out.println("Libro devuelto con éxito.");
                } else {
                    System.out.println("El libro no está disponible para devolver.");
                }
            }
            else{
                System.out.println("Nada");
            }
            myObj.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}

