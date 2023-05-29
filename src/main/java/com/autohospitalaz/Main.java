package com.autohospitalaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list1 = Arrays.asList(26,56,21,33,99,45,9,18,122);
        System.out.println(Methods.bolunenMethodu(list1));
        System.out.println("----------------------");
        System.out.println(Methods.findAvrage(list1));
        System.out.println("----------------------");
        String str = "Div-Academy-2023-Java";
        System.out.println(Methods.splitMethod(str));
        System.out.println("----------------------");
        int average = Methods.findMaxInt(list1) + Methods.findMinInt(list1) / 2;
        System.out.println(average);
        System.out.println("----------------------");
        String  string  = "    Hello World   ";
        System.out.println(Methods.deleteAbsent(string));
        System.out.println("----------------------");
        File file = new File("File");
        try{
        Methods.fileMethod(file);
        }catch (FileNotFoundException e){
            e.getMessage();
            }
        String java = "Java is a programing language";
        System.out.println(Methods.arrayDoldurmag(java));
        System.out.println("----------------------");
        List<String> array = new ArrayList<>();
        array.add(new String("Java"));
        array.add(new String("Astonmartin"));
        array.add(new String("Jeva"));
        System.out.println(Methods.stringarrayDetected(array));
        System.out.println("----------------------");
        System.out.println(Methods.stringLenght(array));
        System.out.println("----------------------");
    }

    }
