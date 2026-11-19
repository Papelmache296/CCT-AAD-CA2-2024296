/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author sanch
 */
public class School {
    
    private ArrayList<Staff> staffMembers;
    
    //constructor
    public School(){
        staffMembers = new ArrayList<>();
    }
    
    //Reads the file with the staff information
    public void readFile(String filename){
        
        try{
        
            BufferedReader reader = new BufferedReader(new FileReader(filename));
               
            String line;
            
            //Skips the first line with the column names
            reader.readLine();
            
            while((line = reader.readLine()) != null){
                
                //Skip empty lines
                if(line.trim().isEmpty()){
                    continue;
                }   
            
                String[] data = line.split(",");
                
                //Check if the line contains all 9 fields
                if(data.length != 9){
                    System.out.println("There has been a problem with line: " + line);
                    continue;
                }
                
                //Create a new Staff object using the file info
                Staff staff = new Staff(
                        
                        data[0].trim(),
                        data[1].trim(),
                        data[2].trim(),
                        data[3].trim(),
                        Double.parseDouble(data[4].trim()),
                        data[5].trim(),
                        data[6].trim(),
                        data[7].trim(),
                        data[8].trim()
                );
                
                // Add the staff member to the ArrayList
                staffMembers.add(staff);
            }
            
            reader.close();
            
            System.out.println("The File has been read Successfully");
                       
        } catch(IOException e){
            System.out.println("An error ocurred while reading file: " + e.getMessage());
            
        }catch (NumberFormatException e){
            
            System.out.println("Invalid salary format in the file");
        
        }
    }
    
    public ArrayList<Staff> getStaffMembers(){
        return staffMembers;
    }
}
