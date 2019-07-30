package com.dancas.item1;

import com.dancas.objects.model.Cat;
import com.dancas.objects.model.Dog;

public class Main {

    public static void main(String args[]){
        Object obj = PetGenerator.getPetByName("Other");

        if(obj instanceof Dog){
            System.out.println("Is a Dog");
        }

        if(obj instanceof Cat){
            System.out.println("Is a Cat");
        }
    }

}


