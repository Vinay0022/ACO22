package com.aoc22;
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
	Day1P2 day1p2 = new Day1P2();
	Day2 day2 = new Day2();
	// int ans = day1p2.getThreeMax("src/resources/inputs/test01.txt");
	 int ans = day2.getScore("src/resources/inputs/test02.txt");
	System.out.println(ans);
    }
}
