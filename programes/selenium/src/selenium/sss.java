package selenium;

import java.io.File;

public class sss {

	public static void main(String[] args) {
		
		
//	    	File file = new File("home/ajay");
//	    	long totalSpace = file.getTotalSpace(); //total disk space in bytes.
//	    	long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
//	    	long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.
//
//	    	System.out.println(" === Partition Detail ===");
//
//	    	System.out.println(" === bytes ===");
//	    	System.out.println("Total size : " + totalSpace + " bytes");
//	    	System.out.println("Space free : " + usableSpace + " bytes");
//	    	System.out.println("Space free : " + freeSpace + " bytes");
//
//	    	System.out.println(" === mega bytes ===");
//	    	System.out.println("Total size : " + totalSpace /1024 /1024 + " mb");
//	    	System.out.println("Space free : " + usableSpace /1024 /1024 + " mb");
//	    	System.out.println("Space free : " + freeSpace /1024 /1024 + " mb");  
		
		 int sum = 0;
	        for (int i = 0; i < args.length; i++) {
	            sum = sum + Integer.parseInt(args[i]);
	        }
	        System.out.println("The sum of the arguments passed is " + sum);
	    
		    
		
	    
	}

}