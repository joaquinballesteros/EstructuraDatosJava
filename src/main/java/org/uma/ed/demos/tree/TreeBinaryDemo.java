package org.uma.ed.demos.tree;
import org.uma.ed.dataestructure.tree.Tree;
import org.uma.ed.dataestructure.tree.Tree.Node;

import java.util.Comparator;


public class TreeDemo {
    public static void main(String[] args) {
        Node<Integer> tree =
            Node.of(1,
                Node.of(2,
                Node.of(3)
                ),
                Node.of(4),
                Node.of(5,
                Node.of(6),
                Node.of(7),
                Node.of(8)
            ) );

        //        1
        //   2    4       5
        //   3         6  7  8
        System.out.println("Size del arbol");
        System.out.println(Tree.size(tree));

        System.out.println("Altura del arbol");
        System.out.println(Tree.height(tree));

        System.out.println("Suma de elementos del arbol");
        System.out.println(Tree.sum(tree));

        System.out.println("Máximo elemento del arbol");
        System.out.println(Tree.maximum(tree, Comparator.naturalOrder()));

        System.out.println("Número de veces que aparece 4 en el arbol");
        System.out.println(Tree.count(tree,4));

        System.out.println("Hojas del arbol");
        System.out.println(Tree.leaves(tree));

        System.out.println("Preorder del arbol");
        System.out.println(Tree.preorder(tree));

        System.out.println("Postorder del arbol");
        System.out.println(Tree.postorder(tree));

        System.out.println("Orden de anchura del arbol");
        System.out.println(Tree.breadthFirst(tree));



    }
}
