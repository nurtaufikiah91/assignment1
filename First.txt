package org.kodejava.example.io;

import java.io.*;

public class First {
    public static void main(String[] args) {
        File file = new File("First.txt");

        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            String contents = " A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
            writer.write(contents);
            } 
           catch (IOException e) {
            e.printStackTrace();
        }
    }
}
