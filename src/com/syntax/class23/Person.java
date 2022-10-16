package com.syntax.class23;

public interface Person {

    void eat();

}
interface Employee{

    void work();

}//this is muiltple inhertance. one interface can extends another interface.
interface  SynataxEmployee extends Employee,Person{ // The reason we are usig extends because we are adding both interface in syntax


}
class Asghar implements SynataxEmployee{

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}