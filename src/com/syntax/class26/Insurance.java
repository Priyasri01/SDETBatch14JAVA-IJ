package com.syntax.class26;

public abstract class Insurance {
   /* Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
    */


    String insuranceName;

        Insurance(String insuranceName){

            this.insuranceName= insuranceName;
        }

     abstract void getQute();
     abstract  void cancelInsurance();

    }
    class Car extends Insurance {

        String carModel;

        Car(String insuranceName, String carModel) {
            super(insuranceName);//call the parent class constructor
            this.carModel = carModel;
        }

        @Override
        void getQute() {

            System.out.println(insuranceName + "charge 3% of the car value");


        }

        @Override
        void cancelInsurance() {

            System.out.println(insuranceName +"has been canceled ");


        }
    }
        class Pet extends Insurance {

            String petType;

            Pet(String insuranceName,String petType) {
                super(insuranceName);
                this.petType = petType;

            }

            @Override
            void getQute() {

                System.out.println(insuranceName+ "charges $1500.00 for "+petType);


            }

            @Override
            void cancelInsurance() {

                System.out.println(insuranceName+ "has been canceled for "+petType);

            }
        }
        class Health extends Insurance{

             Health(String insuranceName){

                 super(insuranceName);
             }

                @Override
                void getQute() {

                    System.out.println(insuranceName+ " charges $2000.00 for the health");

                }

                @Override
                void cancelInsurance() {

                    System.out.println("we will help you to cancel the pervios insurance");


                }
            }



