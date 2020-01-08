package com.bridgelabz.maximum;

public class Maximum {
    public Integer getMaxNum(Integer first, Integer second, Integer third) {
        if((first.compareTo(second)==1) && (first.compareTo(third)==1))
            return first;
        if((second.compareTo(first)==1) && (second.compareTo(third)==1))
            return second;

        return third;
    }

    public Float getMaxFloatNum(Float first, Float second, Float third) {
        if((first.compareTo(second)==1) && (first.compareTo(third)==1))
            return first;
        if((second.compareTo(first)==1) && (second.compareTo(third)==1))
            return second;

        return third;
    }

    public String getHigherString(String first, String second, String third) {
        System.out.println("first");
        System.out.println(first.compareTo(second));
        System.out.println(first.compareTo(third));
        System.out.println("second");
        System.out.println(second.compareTo(first));
        System.out.println(second.compareTo(third));
        if((first.compareTo(second)>0) && (first.compareTo(third)>0))
            return first;
        if((second.compareTo(first)>0) && (second.compareTo(third)>0))
            return second;

        return third;
    }
}
