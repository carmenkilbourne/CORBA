# Práctica 'Biblioteca' en CORBA

## Versiones Utilizadas

- **Java**: Versión 8.
- **IDL**: Visual Studio Code.

## Ejecución de la Práctica

1. Compilar los archivos IDL y Java: **Ventana Terminal** se compila y ejecuta.
   ```sh
   idlj -fall Biblioteca.idl
   $ tnameserv -ORBInitialPort 1050
   ```

**Ventana Servidor** se compila y ejecuta.

```sh
$ javac ServidorBiblioteca.java
$ java ServidorBiblioteca -ORBInitialHost localhost -ORBInitialPort 1050
```

**Ventana Cliente** se compila y ejecuta.

```
$  javac ClienteBiblioteca.java
$ java ClienteBiblioteca -ORBInitialHost localhost -ORBInitialPort 1050
```

