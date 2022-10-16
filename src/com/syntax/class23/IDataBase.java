package com.syntax.class23;

public interface IDataBase {

    void openDatabase();
    void readDate();
    void writeData();

// we can't have instance variable in interface. all the method
}
class IBM implements IDataBase {
    @Override
    public void openDatabase() {

        System.out.println("Opening the IBM Database");

    }

    @Override
    public void readDate() {
        System.out.println("Reading the data from the IBM DataBase");

    }

    @Override
    public void writeData() {

        System.out.println("Writing the data from the IBM DataBase");

    }
}

