package reading_json;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.io.*;


public class App {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("/home/kuda/Desktop/Dev/Private_Projects/Java/Algorithms/demo/src/main/java/reading_json/people.json");
            JSONParser json = new JSONParser();
            Object peopleArray=json.parse(file);
            JSONArray people = (JSONArray) peopleArray;
for(Object i: people){
    System.out.println(i);
}
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
