package com.syntax.class18;
public class Cat extends Animal {
    public Cat(String catName,String catBreed
        ){
            name=catName;
            breed=catBreed;

        }
        public Cat(String catName,String catBreed,
                   int catAge,double catWeight){
            name=catName;
            breed=catBreed;
            age=catAge;
            weight=catWeight;
        }
        public void printInfo(){
            System.out.println("Name "+name+ " Breed "+breed+
                    " age "+age+" Weight "+weight);
        }

    }

//Access Modifier : private=same class, default=same package, public=same project


