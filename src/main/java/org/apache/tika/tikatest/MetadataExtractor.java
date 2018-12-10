package org.apache.tika.tikatest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

public class MetadataExtractor {
	
	public void extractMetaData() throws Exception{
		
		System.out.println("Enter your file location you want to extract it's metadata: ");
		Scanner scanner = new Scanner(System.in);
		String file_location = scanner.nextLine();
	    scanner.close();

	        
        File file = new File(file_location);
        
        //Parser method parameters
        Parser parser = new AutoDetectParser();
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream inputstream = new FileInputStream(file);
        ParseContext context = new ParseContext();
        
        parser.parse(inputstream, handler, metadata, context);
        System.out.println(handler.toString());

        //getting the list of all meta data elements 
        String[] metadataNames = metadata.names();

        for(String name : metadataNames) {		        
           System.out.println(name + ": " + metadata.get(name));
    	 }
	}

}
