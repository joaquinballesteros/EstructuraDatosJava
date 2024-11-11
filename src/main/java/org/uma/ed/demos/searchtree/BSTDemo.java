package org.uma.ed.demos.searchtree;

import org.uma.ed.dataestructure.searchtree.BST;
import org.uma.ed.dataestructure.searchtree.SearchTree;

import java.util.Iterator;
import java.util.StringJoiner;

/**
 * Simple BST demo.
 *
 * @author Joaquín Ballesteros, Data Structures, Grado en Informática. UMA.
 */


public class BSTDemo {

    public static String iter2String(Iterator<Integer> iter,String type){
        StringJoiner sj = new StringJoiner(", ",type+" {","}");
        while(iter.hasNext()){
            sj.add(iter.next().toString());
        }
       return sj.toString();
    }
    public static void main(String[] args) {

        SearchTree<Integer> t = BST.empty();

        int[] array = new int[]{8, 5, 7, 1, 9, 6};

        //                 8
        //          5            9
        //      1        7
        //            6

        for (int x : array) {
            t.insert(x);
        }

        System.out.println(iter2String(t.preOrder().iterator(),"Preorder"));
        System.out.println(iter2String(t.preOrder().iterator(), "PostOrder"));
        System.out.println(iter2String(t.inOrder().iterator(), "InOrder"));

        System.out.println("Minim " + t.minimum());
        System.out.println("Maxim " + t.maximum());

        System.out.println("Delete 5 " );
        t.delete(5);
        System.out.println(iter2String(t.inOrder().iterator(), "InOrder"));

        System.out.println("Minim " + t.minimum());
        System.out.println("Maxim " + t.maximum());

        System.out.println("Delete " + + t.minimum());
        t.deleteMinimum();
        System.out.println(iter2String(t.inOrder().iterator(), "InOrder"));

        System.out.println("Minim " + t.minimum());
        System.out.println("Maxim " + t.maximum());

        System.out.println("Delete " + + t.minimum());
        t.deleteMinimum();
        System.out.println(iter2String(t.inOrder().iterator(), "InOrder"));

        System.out.println("Minim " + t.minimum());
        System.out.println("Maxim " + t.maximum());

        System.out.println("Delete " + + t.minimum());
        t.deleteMinimum();
        System.out.println(iter2String(t.inOrder().iterator(), "InOrder"));

        System.out.println("Minim " + t.minimum());
        System.out.println("Maxim " + t.maximum());

        System.out.println("Delete " + + t.minimum());
        t.deleteMinimum();
        System.out.println(iter2String(t.inOrder().iterator(), "InOrder"));

        System.out.println("Minim " + t.minimum());
        System.out.println("Maxim " + t.maximum());
    }
}

/*Output:
Preorder {8, 5, 1, 7, 6, 9}
PostOrder {8, 5, 1, 7, 6, 9}
InOrder {1, 5, 6, 7, 8, 9}
Minim 1
Maxim 9
Delete 1
InOrder {5, 6, 7, 8, 9}
Minim 5
Maxim 9
Delete 5
InOrder {6, 7, 8, 9}
Minim 6
Maxim 9
Delete 6
InOrder {7, 8, 9}
Minim 7
Maxim 9
Delete 7
InOrder {8, 9}
Minim 8
Maxim 9
Delete 8
InOrder {9}
Minim 9
Maxim 9
 */