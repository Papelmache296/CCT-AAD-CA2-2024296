/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schoolproject;

/**
 *
 * @author sanch
 */
public class SchoolProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Creates a School object
        School school = new School();
        
        //Read the staff info from the file
        school.readFile("Applicants_Form.txt");
        
        //Display the total number of staff members
        System.out.println("Ttotal staff members: " + school.getStaffMembers().size());
    }
    
}
