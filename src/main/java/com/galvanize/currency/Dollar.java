package com.galvanize.currency;

public class Dollar implements Currency{
    @Override
    public boolean equals(Object object){
        if(object==this) {return true;}
        return object instanceof Dollar;
    }
}
