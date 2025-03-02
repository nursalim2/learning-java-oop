package com.nursalim.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileApp {
    public static void main(String[] args) {
        readFileWithTryWithResource();
    }

    public static void readFileWithTryWithResource() {
        try(BufferedReader br = new BufferedReader(new FileReader("myfile.txt"))) {
            while (true) {
                String text = br.readLine();
                if(text == null) {
                    break;
                }
                System.out.println(text);
            }
        } catch (IOException ex) {
            System.out.println("Error reading file " + ex.getMessage());
        }
    }

    public static void readFile() {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("myfile.txt"));
            while (true) {
                String text = reader.readLine();
                if(text == null) {
                    break;
                }
                System.out.println(text);
            }
        } catch (Throwable throwable) {
            System.out.println("Error reading file " + throwable.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("file closed");
                } catch (IOException ex) {
                    System.out.println("Error while closing resource " + ex.getMessage());
                }

            }
        }
    }
}
