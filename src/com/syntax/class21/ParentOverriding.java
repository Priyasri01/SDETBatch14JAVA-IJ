package com.syntax.class21;

public class ParentOverriding {

    void getMarry(){

        System.out.println("You will marry the girl that we will select for you");
    }
}

class Zam extends ParentOverriding {

    @Override
    void getMarry() {
        System.out.println("I want marry taylor swift");
    }
}

class Test{

    public static void main(String[] args) {
        Zam zam= new Zam();

        zam.getMarry();
    }
}
