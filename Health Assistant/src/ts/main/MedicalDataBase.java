package src.ts.main;  //create main package
import src.ts.exceptions.*;
import src.ts.java.*;
import src.ts.validations.*;

import java.util.Scanner;    //for taking input from user
import java.util.Formatter;   //for format of registration panel
// import java.util.regex.*; //for validation and matching of the user input data
import java.util.Random; 
public class MedicalDataBase{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    Random rand = new Random(); //for generating random int
		Formatter f = new Formatter(); // aligning //constructs a new formatter
    screenclean s=new screenclean();

 int uid=rand.nextInt(1000);
    
    String heading="Registration Pannel";
    String s1 = "= = = = = = = = = = = = = = = = = = = = = = = =";
    String s2 = "                 WELCOME TO                    ";
    String s3 = "             HEALTH ASSISTANT                  ";
    String s4 = "= = = = = = = = = = = = = = = = = = = = = = = ="  ;

      try{
        s.clearScreen();} catch(Exception e){e.getMessage();}
      
        for (int i=0;i<5;i++);
        {
          System.out.println("");
        }
        Formatter f1 = new Formatter(); 
     f1.format("%85s",s1);
   System.out.println(f1);
   Formatter f2 = new Formatter(); 
     f2.format("%85s",s2); 
     System.out.println(f2);
   Formatter f3 = new Formatter(); 
     f3.format("%85s",s3);
     System.out.println(f3); 
     Formatter f4 = new Formatter(); 
     f4.format("%85s",s1);
     System.out.println(f4);
        sc.nextLine();
        System.out.println("");
       
     //   try{
       //   s.clearScreen();} catch(Exception e){e.getMessage();}

      f.format("%71s", heading);  //center aligned
      System.out.println(f);
      System.out.println();
      f.close(); //end of formatter constructor

     System.out.print("\nEnter patient name: ");       // taking input from user
        String name = sc.nextLine();
     
     
     
     System.out.print("Enter age: ");
        int age = sc.nextInt();
       AgeValidation a=new AgeValidation(); //object of age validator
        a.Agevalidation(age);
        

     System.out.print("Enter gender(m/f): ");
       char gender = sc.next().charAt(0);
       GenderValidation g=new GenderValidation(); //object of gender validator
       g.Gendervalidation(gender);
       

     System.out.print("Enter contact number: ");
       String contact=sc.next();
       valid1 n=new valid1(); //object for contact validator
       n.valid(contact);
       CsvWriter c1 = new CsvWriter(); //object for Csv Writer class
      
       if(a.isage()==true&&g.isGender()==true&&n.isNumberValid()==true){
       
        c1.addDetails(uid, name);//method of csv writer
       try{
        s.clearScreen();} catch(Exception e){e.getMessage();}
         //Generating random Patient ID
        System.out.println("=============================================================");

       System.out.println("     Registration successful and your patient id is:"+uid);
       System.out.println("=============================================================");
       System.out.println("press 1 to continue");
       sc.nextInt();
       try{ s.clearScreen();}catch(Exception e){e.getMessage();}
        menu(); }
        else {
          System.out.println("=============================================================");
          System.out.println("\nDetails entered above are Incorrect\nRegistration Unsuccesful\nRegister Again");
           System.out.println("=============================================================");
          System.out.println("press 1 to continue");
          sc.nextInt();
         try{ s.clearScreen();
          main(args);}catch(Exception e){e.getMessage();}
        }
      
       sc.close();
       
 
   
  }
  
   //Defining menu() method
   public static void menu()
   {Scanner sc=new Scanner(System.in);
    screenclean z=new screenclean();
    find f1 = new find();
    
    System.out.println("             |# # # # # # # # # # # # # # # # # # # # # # # #|");
    System.out.println("              |#                 WELCOME TO                  #|");
    System.out.println("              |#             HEALTH  ASSISTANT               #|");
    System.out.println("              |# # # # # # # # # # # # # # # # # # # # # # # #|");
    System.out.println("Press 1 if you want to know disease associated with your Symptoms from our data base");
     System.out.println("Press 2 if you want to know symptoms of any perticular disease from our database");

    System.out.println("Enter Your Choice");
    int i = sc.nextInt();
    //creating switch statement for menu() method
    switch(i){
      case 1 :
      { try{ screenclean s=new screenclean();
             s.clearScreen();
          f1.findsymptom();} 
          catch(UnrecognizedSymptomException e){ //Handling Exception
            System.out.println(e);
          } catch(Exception e){e.getMessage();}
          break;
      }
      case 2 :
      { try{ screenclean s=new screenclean();
        s.clearScreen();
        f1.findDisease();}
        catch(UnrecognizedDiseaseException e){ //Handling Exception
          System.out.println(e);
        }catch(Exception e){e.getMessage();}
        break;
      }
      default :
      {
        System.out.println("invalid choice\n try again");
        System.out.println("=============================================================");
        System.out.println("press 1 to continue");
        sc.nextInt();
        try{ z.clearScreen();}catch(Exception e){e.getMessage();}
         menu();


      }
    }
      sc.close();
   } 

}

    
      