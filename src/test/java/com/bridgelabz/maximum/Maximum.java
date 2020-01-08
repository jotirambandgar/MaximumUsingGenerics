package com.bridgelabz.maximum;

public class Maximum   <T extends Comparable> {

    public T getMaximum(T first, T second, T third){
        if((first.compareTo(second)>0) && (first.compareTo(third)>0))
            return first;
        if((second.compareTo(first)>0) && (second.compareTo(third)>0))
            return second;

        return third;
    }

}
