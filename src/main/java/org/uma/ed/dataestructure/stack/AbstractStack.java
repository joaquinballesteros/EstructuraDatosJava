package org.uma.ed.dataestructure.stack;

import java.util.Objects;
import java.util.StringJoiner;

public abstract class AbstractStack <T>{
    protected abstract Iterable<T> elements(); //Abstracto
    public abstract int size(); //Abstracto

    private boolean equals(Iterable<T> it1, Iterable<?> it2){ // recomendación para facilitar el equals
        return false;

    }
    //Comprueba si son el mismo, o si es instanca de Abstract class, tiene el mismo tamaño y son iguales
    public boolean equals(Object obj) {
        return false;
    }

        //Itera sobre los elementos
    public int hashCode(){
        int hc = 1;
        return hc;
    }

    //Usa el StringJoiner y el this.getClass().getSimpleName() para poner el nombre de la clase primero
    public String toString(){
        return null;
    }
}
