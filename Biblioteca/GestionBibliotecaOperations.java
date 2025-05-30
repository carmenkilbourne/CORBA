package Biblioteca;


/**
* Biblioteca/GestionBibliotecaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Biblioteca.idl
* jueves 24 de abril de 2025 16H47' CEST
*/


// Define la interfaz para el sistema de gestión de la biblioteca
public interface GestionBibliotecaOperations 
{

  // Busca un libro por título y devuelve los detalles del libro
  Biblioteca.Libro buscarLibro (String titulo);

  // Presta un libro, cambiando su estado a no disponible
  boolean prestarLibro (String ISBN);

  // Devuelve un libro, cambiando su estado a disponible
  boolean devolverLibro (String ISBN);

  //Mostrar todos los libros
  Biblioteca.Libro[] mostrarTodosLosLibros ();

  //Mostrar todos los libros por categoria
  Biblioteca.Libro[] mostrarLibrosCategoria (String categoria);
} // interface GestionBibliotecaOperations
