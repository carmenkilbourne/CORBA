package Biblioteca;


/**
* Biblioteca/GestionBibliotecaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Biblioteca.idl
* mi�rcoles 2 de abril de 2025 10H02' CEST
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
} // interface GestionBibliotecaOperations
