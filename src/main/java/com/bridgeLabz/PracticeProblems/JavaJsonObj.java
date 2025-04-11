package com.bridgeLabz.PracticeProblems;

import org.json.JSONArray;
import org.json.JSONObject;
public class JavaJsonObj {
    public static void main(String[] args){
        JSONArray subject = new JSONArray();
        subject.put("Java");
        subject.put("Spring");
        subject.put("SQL");


        JSONObject user = new JSONObject();
        user.put("subject", subject);
        user.put("Age",21);
        user.put("name", "Harman");
        

        System.out.println(user.toString());
    }
}
