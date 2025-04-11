package com.bridgeLabz.PracticeProblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class MergeTwoJsonFiles {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node1 = mapper.readTree(new File("src/main/java/com/bridgeLabz/PracticeProblems/File1.json"));
            JsonNode node2 = mapper.readTree(new File("src/main/java/com/bridgeLabz/PracticeProblems/File2.json"));
            ObjectNode mergedNode = (ObjectNode) node1;
            mergedNode.setAll((ObjectNode) node2);
            System.out.println("Merged JSON:\n" + mergedNode.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
