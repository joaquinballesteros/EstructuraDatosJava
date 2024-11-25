package org.uma.ed.demos.hashtable;

import org.uma.ed.dataestructure.hashtable.SeparateChainingHashTable;

public class SeparateChainHashDemo {

        public static void main(String[] args) {
            // Crear una nueva tabla hash con el tamaño por defecto
            SeparateChainingHashTable<String> hashTable = new SeparateChainingHashTable<>();

            // Insertar algunas claves
            System.out.println("Insertando claves...");
            hashTable.insert("clave1");
            hashTable.insert("clave2");
            hashTable.insert("clave3");
            hashTable.insert("clave4");

            // Ver el tamaño después de las inserciones
            System.out.println("Tamaño de la tabla (debe ser 4): " + hashTable.size());

            // Buscar claves
            System.out.println("\nBuscando claves...");
            System.out.println("¿Contiene 'clave1'? " + hashTable.contains("clave1"));
            System.out.println("¿Contiene 'clave2'? " + hashTable.contains("clave2"));
            System.out.println("¿Contiene 'clave5'? " + hashTable.contains("clave5")); // No existe

            // Eliminar una clave
            System.out.println("\nEliminando clave 'clave3'...");
            hashTable.delete("clave3");

            // Ver el tamaño después de eliminar
            System.out.println("Tamaño de la tabla después de eliminar 'clave3' (debe ser 3): " + hashTable.size());

            // Mostrar contenido de la tabla hash
            System.out.println("\nContenido de la tabla:");
            for (String key : hashTable) {
                System.out.println(key);
            }

            // Probar la búsqueda después de eliminación
            System.out.println("\nBuscando clave 'clave3' después de eliminarla...");
            System.out.println("¿Contiene 'clave3'? " + hashTable.contains("clave3")); // No existe

            // Insertar una clave que ya existe y verificar que se actualice
            System.out.println("\nInsertando 'clave2' nuevamente (debería actualizarse)...");
            hashTable.insert("clave2");

            // Mostrar el contenido final de la tabla
            System.out.println("\nContenido final de la tabla:");
            for (String key : hashTable) {
                System.out.println(key);
            }
        }


}
