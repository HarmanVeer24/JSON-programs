package com.bridgeLabz.PracticeProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidatateJson {
    public static void main(String[] args) {
        String data = "{ \"name\": \"Harman\", \"email\": \"harman@example.com\", \"age\":21 }";
        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.readTree(data);
            System.out.println("valid");
        }
        catch (JsonProcessingException e){
            System.out.println("Invalid");
            System.out.println(e.getMessage());
        }
    }
}
