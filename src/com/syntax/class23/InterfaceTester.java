package com.syntax.class23;

public class InterfaceTester {

    public static void main(String[] args) {

        IDataBase idatabase = new IBM();
        idatabase.readDate();
        idatabase.openDatabase();
        idatabase.writeData();

    }


}


