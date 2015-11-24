/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hhssadventure;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author rayan4858
 */
public class Scene{
    private int direction;
    private Scene[] Scenes;
    //constructor 
    public Scene(Scanner input){
        FileReader file = null;
        try {
            file = new FileReader("images/pics.txt");
        } catch (Exception e) {
            //prints out error message
            e.printStackTrace();
            //stops the program
            System.exit(0);
    } 
    
    public void getScene(){
        FileReader file = null;
        try {
            file = new FileReader("images/pics.txt");
        } catch (Exception e) {
            //prints out error message
            e.printStackTrace();
            //stops the program
            System.exit(0);
        }
        
        //getting the scene
        Scanner scene = new Scanner(file);
        for (int i = 0; i < 4; i++) {
            scenes[i] = scene.next();
        }
        
        
        
    }
    
    
    
    public boolean frontBlocked( ){

    }
    
    
    
    public boolean nextLocation( ){
        //
    }
    
    
    
    public int getDirection(){
        //give the direction youre currently in
        //get the first letter in the file somehow
        return this.direction;
    }
    
    public void nextDirection(){
        //the fifth part of the line in the picture
    }
    
}
