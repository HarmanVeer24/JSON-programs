package com.bridgeLabz.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJsonFile {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("src/main/java/com/bridgeLabz/PracticeProblems/data.json"));

            String name = root.get("name").asText();
            String email = root.get("email").asText();

            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } catch (IOException e) {
            System.out.println("Error reading JSON: " + e.getMessage());
        }
    }
}
