package src.ts.validations;
//import java.util.Formatter; 
import java.util.regex.*;

public class valid1
{     public int count=0;
	public String contact;
public void valid(String contact)
{
	this.contact=contact;
if (isNumberValid())
 {
     
     count++;
 }
 else{
 
     
 }
}
  
 
 

 public  boolean isNumberValid() 
{
  
        Pattern p= Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$");
      
      Matcher m = p.matcher(contact);
 return (m.find() && m.group().equals(contact));
 /*
 m.find() finds the matcher class
 m.group().equals(contact) -->Matcher Class is used to get the input subsequence matched by the previous match result*/
   
 } 

}
