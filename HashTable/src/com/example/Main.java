package com.example;

import com.example.structure.HashMap;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Hash Tables Class");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("JAVA", "JAVA");
        hashMap.put("Amman", "Amman");
        hashMap.put("Jordan", "Jordan");
        hashMap.put("J", "J");
        hashMap.put("Bob", "Bob");
        hashMap.put("Carl", "Carl");

        System.out.println(hashMap);





    }

}
