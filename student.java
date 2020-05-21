/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author mrzr
 */
public class student {
    
        public String Firstname;
         public String Lasttname;
          private int age;
          public String Academicrank;
          
          
          public void study(){
              System.out.println("student is studying...");
          }
          
          public student(){
          
              
          }
          
          public int getage(){
              return age;
          }
          
          public void setage(int age){
              this.age=age;
          }
}
