/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayesha Shabbir
 */
public class recepit {
   private String name;
    public String  sig;
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
    
    
}
