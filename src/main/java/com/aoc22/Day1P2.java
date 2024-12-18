package com.aoc22;
import java.io.*;
import java.util.*;
public class Day1P2{

    public int getThreeMax(String filePath) throws IOException{
	File file = new File(filePath);
	Scanner scanner = new Scanner(file);
	    List<Integer> list = new ArrayList<>();
	int sum = 0;
	while(scanner.hasNextLine()){
	    String currSum = scanner.nextLine();
	    try{
		sum += Integer.parseInt(currSum);
	    }catch(NumberFormatException e){
		list.add(sum);
		sum =0;
	    }
	}
		list.add(sum);
	Collections.sort(list);
	int ans = list.get(list.size()-1) + list.get(list.size()-2)+ list.get(list.size()-3);
	return ans;
    }
}
