package com.course.microservices.limitsservice.bean;

public class LimitConfiguration {


   private int maxmimum;

   private int minimum;


    protected LimitConfiguration() {
    }

    public LimitConfiguration(int maxmimum, int minimum) {
        super();
        this.maxmimum = maxmimum;
        this.minimum = minimum;
    }

    public int getMaxmimum() {
        return maxmimum;
    }


    public int getMinimum() {
        return minimum;
    }

}
