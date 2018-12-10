package org.apache.tika.tikatest;



public class App 
{
    public static void main( String[] args )throws Exception
    {
//    	//Type extraction part
//  	    TypeExtraction fileType = new TypeExtraction() ; 
//  	    fileType.extractType();  	    
//    	
//    	//content extraction part
//  	    ContentExtraction fileContent = new ContentExtraction() ; 
//	    fileContent.extractContent(); 
//    	      
//        //metadata extraction part
//    	MetadataExtractor fileMetadata = new MetadataExtractor();
//    	fileMetadata.extractMetaData();
    	
    	//language detection part
    	LangDetection fileLang = new LangDetection();
    	fileLang.detectLang();
        
   }
}
