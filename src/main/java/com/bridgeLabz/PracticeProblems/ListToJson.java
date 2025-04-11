package com.bridgeLabz.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;

class StudentData{
    public String Name;
    public int Age;
    public int Id;
    public StudentData(String Name,int Age,int Id){
        this.Name = Name;
        this.Age = Age;
        this.Id = Id;
    }
}
public class ListToJson {
    public static void main(String[] args) throws Exception{
        ArrayList<StudentData> list = new ArrayList<>();
        list.add(new StudentData("Harman",21,1));
        list.add(new StudentData("Sachin",22,2));
        list.add(new StudentData("Rachin",26,3));
        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(list);
        System.out.println(jsonArray);
    }
}
