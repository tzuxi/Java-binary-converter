/*
 * Copyright (c) 2017, 2018, Javis Development and Computer Engineering. All rights reserved.
 * 
 */
package main;
import java.util.Scanner;

import function.*;

/**
 * This Program converts all letters and some other ASCII characters into binary code (8-bit)
 * @author tzuxi
 * @version 0.2
 */
public class BinaryConverter {

	public static void main(String[] args) {
		
		TextToBinary tc = new TextToBinary();
		Scanner scr = new Scanner(System.in);
		System.out.println(tc.convertToBinary(scr.nextLine()));
		scr.close();
	}
}				