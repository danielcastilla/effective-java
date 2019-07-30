package com.dancas.objects.creating;

import com.dancas.objects.model.Bicycle;
import com.dancas.objects.model.Vehicle;

public class CreateObjectExample {


    public static Boolean valueOf(boolean b){
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    //Static factory method can return an object of any subtypes of their return type
    public static Vehicle valueOf(){
        return new Bicycle();
    }


}
