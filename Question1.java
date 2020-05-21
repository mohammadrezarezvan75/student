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
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student st1=new student();
        st1.Firstname="Mohammad Reza";
        st1.Lasttname="Rezvan";
        st1.Academicrank="lisans";
        st1.setage(23);
        System.out.println("Student is : "+st1.Firstname+ " Last Name : "+st1.Lasttname+" Academicrank = " + st1.Academicrank+st1.getage());
    }
    
}
