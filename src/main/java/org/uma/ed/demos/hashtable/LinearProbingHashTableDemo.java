package org.uma.ed.demos.hashtable;

import org.uma.ed.dataestructure.hashtable.LinearProbingHashTable;
import org.uma.ed.dataestructure.hashtable.SeparateChainingHashTable;

import java.util.function.Predicate;
import java.util.function.Function;

public class LinearProbingHashTableDemo {
    public static void main(String[] args) {
        // Crear una tabla hash usando LinearProbingHashTable
        LinearProbingHashTable<String> table = new LinearProbingHashTable<>();

        // Insertar algunas claves
        System.out.println("Insertando claves...");
        table.insert("clave1");
        table.insert("clave2");
        table.insert("clave3");
        table.insert("clave4");

        // Ver el tamaño después de las inserciones
        System.out.println("Tamaño de la tabla (debe ser 4): " + table.size());

        // Buscar claves
        System.out.println("\nBuscando claves...");
        System.out.println("¿Contiene 'clave1'? " + table.contains("clave1"));
        System.out.println("¿Contiene 'clave2'? " + table.contains("clave2"));
        System.out.println("¿Contiene 'clave5'? " + table.contains("clave5")); // No existe

        // Eliminar una clave
        System.out.println("\nEliminando clave 'clave3'...");
        table.delete("clave3");

        // Ver el tamaño después de eliminar
        System.out.println("Tamaño de la tabla después de eliminar 'clave3' (debe ser 3): " + table.size());

        // Mostrar contenido de la tabla hash
        System.out.println("\nContenido de la tabla:");
        for (String key : table) {
            System.out.println(key);
        }

        // Probar la búsqueda después de eliminación
        System.out.println("\nBuscando clave 'clave3' después de eliminarla...");
        System.out.println("¿Contiene 'clave3'? " + table.contains("clave3")); // No existe

        // Insertar una clave que ya existe y verificar que se actualice
        System.out.println("\nInsertando 'clave2' nuevamente (debería actualizarse)...");
        table.insert("clave2");

        // Mostrar el contenido final de la tabla
        System.out.println("\nContenido final de la tabla:");
        for (String key : table) {
            System.out.println(key);
        }
    }
}
