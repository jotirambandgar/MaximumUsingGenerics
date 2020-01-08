package com.bridgelabz.maximum;

public class Maximum {
    public Integer getMaxNum(Integer first, Integer second, Integer third) {
        if((first.compareTo(second)==1) && (first.compareTo(third)==1))
            return first;
        if((second.compareTo(first)==1) && (second.compareTo(third)==1))
            return second;

        return third;
    }
}
