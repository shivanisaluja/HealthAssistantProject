package src.ts.java;
import java.io.*;
import java.util.Properties;
//import src.ncu.main.*;
//import src.ncu.java.*;
import java.util.Scanner;

import src.ts.exceptions.*;

public class find{
    screenclean a=new screenclean();
    Scanner sc=new Scanner(System.in);
	// check whether the symptom entered is present in database or not
public void findsymptom() throws UnrecognizedSymptomException {
BufferedReader getIt = new BufferedReader(new InputStreamReader(System.in));
String symp = "";
int count=0;
showOutput s = new showOutput();
Properties prop=new Properties();
try {  FileInputStream input=new FileInputStream("F:\\projects\\Final Projects\\Health Assistant\\configs\\constants\\exception.properties");
       prop.load(input);
    // Open the file that is the first command line parameter
    FileInputStream fstream = new FileInputStream(
        "F:\\projects\\Final Projects\\Health Assistant\\txt\\symptoms.txt");
    // Get the object of DataInputStream
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine;
    //Read File Line By Line
    System.out.println("\nEnter Symptom");
     symp = getIt.readLine();
    

    while ((strLine = br.readLine()) != null) {
        // Print the content on the console#    
        if (symp.equals(strLine)) {
           System.out.println("\nSymptom found\n");
           s.AddSymptoms(symp);
            break;
        } else {
           count++;
        }
    }
    if (count>10)
    {
        throw new UnrecognizedSymptomException("\nUnrecognised Symptom: ");
       
     
        
    	
    }
    //Close the input stream
    
    
}catch(UnrecognizedSymptomException e){System.out.println(e+prop.getProperty("UnrecognisedsymptomMessage"));
System.out.println("=============================================================");
System.out.println("press 1 to continue");
sc.nextInt();

try{
    a.clearScreen();} catch(Exception b){b.getMessage();}
findsymptom();}
catch(Exception e){
    System.out.println(e);
   

}
 
}

// check whether the disease entered is present in database or not
public void findDisease() throws UnrecognizedDiseaseException {
BufferedReader getIt = new BufferedReader(new InputStreamReader(System.in));
String symp = "";
int count=0;
Properties prop=new Properties();
try { showOutput s=new showOutput(); 
    FileInputStream input=new FileInputStream("F:\\projects\\Final Projects\\Health Assistant\\configs\\constants\\exception.properties");
     prop.load(input);
    // Open the file that is the first command line parameter
    FileInputStream fstream = new FileInputStream(
        "F:\\projects\\Final Projects\\Health Assistant\\txt\\disease.txt");
    // Get the object of DataInputStream
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine;
    //Read File Line By Line
    System.out.println("\nEnter disease");
     symp = getIt.readLine();
    

    while ((strLine = br.readLine()) != null) {
        // Print the content on the console#    
        if (symp.equals(strLine)) {
           System.out.println("\nDisease Found\n");
           s.Diagnosis(symp);
           break;
           
            
        } else {

           count++;
        }
    }
    if (count>=10)
    {
    	throw new UnrecognizedDiseaseException("\nUnrecognised DiseasC:\\Users\\Shivani Saluja\\Desktop ");
    	
    }
    //Close the input stream
    
}catch(UnrecognizedDiseaseException e){System.out.println(e+prop.getProperty("UnrecogniseddiseaseMessage"));
System.out.println("=============================================================");
System.out.println("press 1 to continue");
sc.nextInt();

try{
    a.clearScreen();} catch(Exception b){b.getMessage();}
findDisease();}
catch(Exception e){
    System.out.println(e); 
   
}
 
  
    
}



}
