package com.dancas.item1;

import com.dancas.objects.model.Pet;
import com.dancas.objects.model.Cat;
import com.dancas.objects.model.Dog;

public class PetGenerator {

    public static Pet getPetByName(String name){
        if(name.equals("Dog")){
            return new Dog();
        }else{
            return new Cat();
        }
    }

}
