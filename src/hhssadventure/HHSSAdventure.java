/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class HHSSAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HHSSAdventure f = new HHSSAdventure();
        //make an array of scenes 
//        Locations[] = new Locations[];
    }
    
    public void getScene(){
       //used to help read a file
        FileReader file = null;
        try {
            file = new FileReader("pics/pics.txt");
        } catch (Exception e) {
            //prints out error message
            e.printStackTrace();
            //stops the program
            System.exit(0);
        }

        //creates a scanner to read the file
        Scanner input = new Scanner(file);

        //keep scanning as long as theres something to scan
        //left blank to fill in later
//        while (input.hasNext()) {
//            //adding a class from the file
//            Class c = new Class();
//            //addint the clas to the list
//            classes.add(c);
//        }
//        
//        gui = new Interface(this);
//        //set the text for the next class name
//        Class c = classes.get(classNum);
//        gui.setClassName(c.getCourseCode());
//        //show it
//        gui.setVisible(true);
//    }
    }
    
    
//    public void switchLocation(name, direction){
//        method to switch the locations
//    }
//    
}
