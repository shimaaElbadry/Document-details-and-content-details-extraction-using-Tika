package org.apache.tika.tikatest;

import java.io.File;

import java.util.Scanner;

import org.apache.tika.Tika;


public class TypeExtraction {
	
		public void extractType() throws Exception{
				System.out.println("Enter your file location you want to know it's type: ");
			    Scanner scanner = new Scanner(System.in);
		  	    String file_location = scanner.nextLine();
		        scanner.close();

		  	    
				File file = new File(file_location);
				
				//Instantiating tika facade class        
				Tika tika = new Tika();
				
				//detecting the file type using detect method
				String filetype = tika.detect(file);
		        System.out.println("----------------------------------------------");
				System.out.println(filetype);
		        System.out.println("----------------------------------------------");
			}      
        
	
 }