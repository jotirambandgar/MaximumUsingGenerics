package com.bridgelabz.maximum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Maximum   <T extends Comparable> {

    private T first;
    private T second;
    private T third;

    public Maximum() {
    }

    public Maximum(T first, T second, T third) {

        this.first = first;
        this.second = second;
        this.third = third;

    }

    public T getMaximum(T first, T second, T third) {

        if((first.compareTo(second)>0) && (first.compareTo(third)>0))
            return first;
        if((second.compareTo(first)>0) && (second.compareTo(third)>0))
            return second;

        return third;
    }


    public T getMaximum() {

        if((this.first.compareTo(this.second)>0) && (this.first.compareTo(this.third)>0))
            return this.first;
        if((this.second.compareTo(this.first)>0) && (this.second.compareTo(this.third)>0))
            return this.second;
        return this.third;
    }

    public T getMaximum(T... element) {
        Arrays.sort(element);
        return element[0];
    }


}
