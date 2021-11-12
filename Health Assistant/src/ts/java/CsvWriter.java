package src.ts.java;
import java.util.regex.*;

import src.ts.exceptions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.util.jar.Attributes.Name;

public class CsvWriter {
 static int id;
static String name;
String s;

  //method for storing patient id and name
 public  void addDetails(int uid , String n)
  {
   id = uid;
   name= n;

    
    
  }

//method creating new csv file
  void WriteTOCsv(String data,String dises ) throws EmptyFileNameException,MissingExtensionException,CsvOnlyException,SpecialCharacterException,LongFileNameException{
    
    String symptom = data;
    String disease = dises;
    String a = "F:\\projects\\Final Projects\\Health Assistant\\csvs\\";
    Scanner sc=new Scanner(System.in);
    screenclean z=new screenclean();
    System.out.println("==============================================================");
    System.err.println("press 1 to continue");
    sc.nextInt();

    // print the required details
    try{
      z.clearScreen();} catch(Exception e){e.getMessage();}
      String format = "%1$-10s,%2$-20s,%3$-20s,%4$-10s\n";
      System.out.println("                    PATIENT DETAILS                         ");  
    System.out.println("==============================================================");
    System.out.format(format,"Patient id","Name","symptoms","disease");
    System.out.format(format,id,name,symptom,disease);
    System.out.println("==============================================================");
    System.out.println("==============================================================");
    System.out.println("Enter file name in which you want to save your details:");
   
      sc.nextLine();
      String filename =sc.nextLine();
       s = a+filename;
       
    String pattern="(\\.)";             String pattern1="[@#$%^&(,)_]";       String pattern2="(\\.csv)";
    Pattern p=Pattern.compile(pattern); Pattern p1=Pattern.compile(pattern1); Pattern p2=Pattern.compile(pattern2);
    Matcher m=p.matcher(filename);      Matcher m1=p1.matcher(filename);      Matcher m2=p2.matcher(filename);
    
      if(filename.isEmpty()||filename.equals(" ")){ 
        throw new EmptyFileNameException("\nEmptyFileName Exception: ");
        
       }
      else if(filename.length()>20){
       
        throw new LongFileNameException("\nLongFileName Exception: ");
      
      }else if(m1.find()){
       throw new SpecialCharacterException("\nSpecialCharacter Exception: ");

      } else if(m.find()==false){
        throw new MissingExtensionException("\nMissingExtension Exception: ");
        
      }else if(m2.find()==false){
       
        throw new CsvOnlyException("\nCsvOnly Extension: ");
      }
      
      else{
    
    
    try (PrintWriter writer = new PrintWriter(new File(s))) {
     //creating string stream to append csv data 
      StringBuilder sb = new StringBuilder();
      sb.append("Patient id");
     
      sb.append(',');
      sb.append("Name");
      sb.append(',');
      sb.append(',');
      sb.append("symptoms");
      sb.append(',');
      sb.append(',');
      sb.append("disease");
      sb.append('\n');
     
      sb.append(id);
      sb.append(',');
      sb.append(name);
      sb.append(',');
      sb.append(',');
      sb.append(symptom);
      sb.append(',');
      sb.append(',');
      sb.append(disease); 
      sb.append('\n');
      
    
      
      writer.write(sb.toString());

      System.out.println("Information saved successfully!");
      if(sc.nextLine().isEmpty())
      {
        try{
          z.clearScreen();} catch(Exception e){e.getMessage();} 
          System.out.println("");
          System.out.println("");
       System.out.println("          |===========================================================================|");
       System.out.println("          |                 THANK YOU FOR USING MEDICAL ASSISTANT                     |");
       System.out.println("          |                             STAY HEALTHY                                  |");
       System.out.println("          |                               STAY SAFE                                   |");
       System.out.println("          |                                BYE BYE                                    |");
       System.out.println("          |===========================================================================|");
     //  for(int i=0;i<5;i++)
       //{
         //System.out.println("");
       //}
       sc.nextLine();
      }
sc.close();
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } 
  } 
}
}