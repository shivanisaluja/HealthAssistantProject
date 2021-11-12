 package src.ts.validations;

/*import java.util.regex.Matcher;
import java.util.regex.Pattern;*/

public class PatientNameValidation{ 
    String name;
    public int count=0;
    public  boolean PatientNamevalidation( String name ) {
        if( name.matches( "[A-Z][a-z]*" )){
           
           count++;
           return true;
        }
        else {
           
              return false;         
        }
    }
}

//public  boolean isname() {


   /* String name= "^[a-zA-Z\\s]+"; //no special characters
    // only alphabets(caps and small both) 
    //(\s) -->the space between names
    Pattern p=Pattern.compile(name);
    Matcher m=p.matcher(this.name);
    m.matches();
       return true;  
}*/
