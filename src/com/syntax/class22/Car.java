package com.syntax.class22;

    public class Car {
        void start(){
            System.out.println("Use the key to start me");
        }
        void stop(){
            System.out.println("Use brakes to stop me");
        }
        void park(){
            System.out.println("Park me manually");
        }
    }
    class BMW extends Car{

        void start(){
            System.out.println("Use Push start to start me");
        }


        void stop() {
            super.stop(); /*reusing the same method  from parent class,
          see we have conflict here (line 21 stop(), and 22 also stop() ,
           so we used  super keyword  to tell compiler explicitly that we are interested in parent method also */
            System.out.println("you can also use auto-breaking to stop me");

        }
    }

    class Toyota extends Car{

        void start(){
            System.out.println("push me to start");
        }

    }
    class Tesla extends Car{

        void start(){
            System.out.println("Use the App to start me"
            );
        }
        void stop(){
            System.out.println("Use AI and AutoBreaking to stop me");
        }
        void park(){
            System.out.println("I can auto park myself");
        }
    }

