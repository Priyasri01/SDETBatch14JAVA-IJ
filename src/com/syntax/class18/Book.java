package com.syntax.class18;

public class Book {
    /*
        Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
         */
    String bookName;
        int published;
        String typeOfBook;


        public Book(String bookName, int published,String typeOfBook) {
            this(bookName,published);
          /*  this.bookName = bookName;
            this.published = published;*/
            this.typeOfBook = typeOfBook;

            System.out.println("BookName " + bookName + "published on " + published + " typeOfBook " + typeOfBook);
        }

   public Book(String bookName, int published) {
      // this(bookName,published);
        this.bookName = bookName;
        this.published = published;
        System.out.println("BookName " + bookName + "published on " + published);
    }

    }


