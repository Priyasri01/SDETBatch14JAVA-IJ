package com.syntax.class30;

import java.io.IOException;

public class ThrowsException {

    public static void main(String[] args) {
        try {
            displayFile();
        } catch (IOException ioExp) {
          ioExp.printStackTrace();
        }
    }

    static void displayFile() throws IOException {
        System.out.println("In displayFile method");
        throw new IOException();
    }
}
