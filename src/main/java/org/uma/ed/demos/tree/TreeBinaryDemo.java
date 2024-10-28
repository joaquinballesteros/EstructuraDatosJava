package org.uma.ed.demos.tree;
import org.uma.ed.dataestructure.tree.BinaryTree;
import org.uma.ed.dataestructure.tree.BinaryTree.Node;


import java.util.Comparator;


public class TreeBinaryDemo {
    public static void main(String[] args) {
        Node<Integer> tree =
                Node.of(1,
                        Node.of(2,
                                Node.of(3),
                                null
                        ),
                        Node.of(4,
                                Node.of(5),
                                Node.of(6,
                                        null,
                                        Node.of(7)
                                )
                        )
                );

        //        1
        //   2        4
        // 3   N    5   6
        //             N 7
        System.out.println("Size del arbol");
        System.out.println(BinaryTree.size(tree));

        System.out.println("Altura del arbol");
        System.out.println(BinaryTree.height(tree));

        System.out.println("Suma de elementos del arbol");
        System.out.println(BinaryTree.sum(tree));

        System.out.println("Máximo elemento del arbol");
        System.out.println(BinaryTree.maximum(tree, Comparator.naturalOrder()));

        System.out.println("Número de veces que aparece 4 en el arbol");
        System.out.println(BinaryTree.count(tree,4));

        System.out.println("Hojas del arbol");
        System.out.println(BinaryTree.leaves(tree));

        System.out.println("Preorder del arbol");
        System.out.println(BinaryTree.preorder(tree));

        System.out.println("Postorder del arbol");
        System.out.println(BinaryTree.postorder(tree));

        System.out.println("Orden de anchura del arbol");
        System.out.println(BinaryTree.breadthFirst(tree));



    }
}
