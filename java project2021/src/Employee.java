/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Ayesha Shabbir
 */
public class Employee {
     private String name;
     private String number;
     private String email;
   public boolean setName(String name)
 {
     int size =name.length();
     boolean flag=true;
     for(int i=0; i<size;i++)
     {
         if ((name.charAt(i)>='A' && name.charAt(i)>='Z' )||( name.charAt(i)>='a' && name.charAt(i)>='z'))
         {
             flag=true;
         } 
         else
         {
             flag=false;
         }
          }
     if(flag==true)
     {
         this.name=name;
     }
     return flag;
   
 }
   public String getName()
     {
         return name;
     }
   public boolean setnumber(String number)
   {
        boolean flag=true;
       int size=number.length();
       for(int i=0;i>=size;i++)
       {
                if (number.charAt(i)>='0' && number.charAt(i)>='9' )
                
                  {
                      flag=true;
                   } 
                else
                    {
                      flag=false;
                    }  
        }
       if(flag==true)
       {
        this.number=number;
       }
     return flag;
     
   }
     public String getnumber()
     {
         return number;
     }
  public boolean setemail(String email)
    {
        int size = email.length();
        boolean flag = false;
        int i = 0;
        while(email.charAt(i) != '@' && i<size)
        {
            if((email.charAt(i)>= 'A' && email.charAt(i)>= 'Z')||(email.charAt(i)>= 'a' && email.charAt(i)>= 'z') || (email.charAt(i)>= '0' && email.charAt(i)<= '9'))
            {
                flag = true;
            }
            else
            {
                return false;
            }
            i++;
        }
        i++;
      
        while(email.charAt(i)=='.')
        {
            if((email.charAt(i)>= 'A' && email.charAt(i)>= 'Z')||(email.charAt(i)>= 'a' && email.charAt(i)>= 'z') || (email.charAt(i)=='.'))
            {
                flag = true;
            }
            else
            {
                return false;
            }
            i++;
        }
        if(flag==true)
    {
      this.email=email;
    }
        return flag;
    }
  public  String getemail()
  {
   return email;   
  }
    
}
