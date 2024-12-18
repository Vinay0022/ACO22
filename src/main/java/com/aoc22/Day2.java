package com.aoc22;
import java.util.*;
import java.io.*;

public class Day2{
    public int getScore(String filePath) throws IOException{
	File file = new File(filePath);
	Scanner scanner = new Scanner(file);
	HashMap<String,Integer> list = new HashMap<>();
	list.put("X",1); //rock
	list.put("Y",2); //paper
	list.put("Z",3); //scissor
	int score = 0;
	    int n = 0;
	while(scanner.hasNextLine()){
	    n++;
	    try{
		System.out.println(n);
	    String value = scanner.nextLine();
	    System.out.println(value);
	    }
	    catch(Exception e){
		System.out.println("Uhh here we go again!");
	    }
	    }

	return score;

    }
}
