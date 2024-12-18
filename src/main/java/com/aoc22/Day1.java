package com.aoc22;
import java.io.*;
import java.util.*;
public class Day1{

    public int getSumMax(String filePath) throws IOException{
	int maxSum = 0;
	int elfSum = 0;
	File file = new File(filePath);
	Scanner scanner = new Scanner(file);
	while(scanner.hasNextLine()){
	    String currSum = scanner.nextLine();
	    try{
		elfSum+= Integer.parseInt(currSum);
	    }catch(NumberFormatException e){
		maxSum = Math.max(maxSum,elfSum);
		elfSum =0;
	    }
	}
		maxSum = Math.max(maxSum,elfSum);
		scanner.close();
		return maxSum;
    }

}
