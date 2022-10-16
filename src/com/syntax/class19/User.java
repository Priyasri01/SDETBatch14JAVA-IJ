package com.syntax.class19;

public class User {

    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
     Print users name, mobile number and address in userDetails method. Test your code.
     */

  String name;
  String phoneNumber;

    User(String name,String phoneNumber){

        this.name=name;
        this.phoneNumber=phoneNumber;

    }
}

class UserInfo  extends User{

    String userAddress;

    UserInfo(String name, String phoneNumber,String userAddress){
        super(name,phoneNumber); //calling from parent class
      this.userAddress=userAddress;

        }

        void userDetails(){

            System.out.println("User Name "+name+" Mobile number "+ phoneNumber + " and their address " + userAddress);
        }


}
