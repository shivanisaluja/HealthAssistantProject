 package src.ts.validations;
 //for gender validation

public class GenderValidation{
    char gender;
    public int count=0;
	public boolean Gendervalidation(char gender)
	{
       this.gender=gender;
       if (isGender())
       {
       	return true;
       }
       else {
       	return false;
       }
	}
	public  boolean isGender(){
         
    if(gender=='m'||gender=='f'||gender=='M'||gender=='F')
    {
    
    count++;
    return true;
    }
          else
          {
           
        return false;
    }
    
}
}
