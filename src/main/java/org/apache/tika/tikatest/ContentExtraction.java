package org.apache.tika.tikatest;

import java.util.Scanner;


import java.io.File;

import org.apache.tika.Tika;


public class ContentExtraction {
	
	public void extractContent() throws Exception{

	    System.out.println("Enter your file location you want to extract it's content: ");
		Scanner scanner = new Scanner(System.in);
		String file_location = scanner.nextLine();
	    scanner.close();

	        
        File file = new File(file_location);
        
        //Instantiating Tika facade class
        Tika tika = new Tika();
      
        String filecontent = tika.parseToString(file);
      
      
        System.out.println("----------------------------------------------");
        System.out.println("Extracted Content: " + filecontent);
        System.out.println("----------------------------------------------");

    }
}