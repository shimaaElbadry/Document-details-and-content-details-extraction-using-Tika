package org.apache.tika.tikatest;

import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.language.*;

import org.xml.sax.SAXException;


public class LangDetection {
	
	public void detectLang () throws Exception{
		    System.out.println("Enter your file location you want to detect it's language: ");
			Scanner scanner = new Scanner(System.in);
			String file_location = scanner.nextLine();
		    scanner.close();

		        
	        File file = new File(file_location);
	        
	        //Parser method parameters
	        Parser parser = new AutoDetectParser();
	        BodyContentHandler handler = new BodyContentHandler();
	        Metadata metadata = new Metadata();
	        FileInputStream content = new FileInputStream(file);

	        //Parsing the given document
	        parser.parse(content, handler, metadata, new ParseContext());

	        LanguageIdentifier lang = new LanguageIdentifier(handler.toString());
	     
	      
	      
	        System.out.println("----------------------------------------------");
	        System.out.println("detected Language:" + lang);
	        System.out.println("----------------------------------------------");

		
	}

}
