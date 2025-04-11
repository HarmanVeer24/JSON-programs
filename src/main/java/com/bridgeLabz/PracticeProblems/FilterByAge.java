package com.bridgeLabz.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FilterByAge {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(new File("src/main/java/com/bridgeLabz/PracticeProblems/Filter.json"));
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    JsonNode ageNode = node.get("age");
                    if (ageNode != null && ageNode.isInt()) {
                        int age = ageNode.asInt();
                        if (age > 25) {
                            String name =node.get("name").asText();
                            System.out.println(name+" "+age);
                        }
                    }
                }
            }

        }
        catch(Exception e) {
            e.getMessage();
        }
    }
}
