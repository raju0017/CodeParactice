package basics.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable 
{ 
    public int a; 
    public String b; 
  
    // Default constructor 
    public Demo(int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
} 
  
class Test 
{ 
    public static void main(String[] args) 
    {    
        Demo object = new Demo(1, "geeksforgeeks"); 
        
        //File serFile = new File("G://CodeBase//CoreJava_Logics//src//basic//serialization//Serialized.txt");
        //File deserFile = new File("G://CodeBase//CoreJava_Logics//src//basic//serialization//Deserialization.txt");
        String filename = "Serialized.ser"; 
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file1 = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file1); 
              
            // Method for serialization of object 
            out.writeObject(object); 
              
            out.close(); 
            file1.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
        Demo object1 = null; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file2 = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file2); 
              
            // Method for deserialization of object 
            object1 = (Demo)in.readObject(); 
              
            in.close(); 
            file2.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("a = " + object1.a); 
            System.out.println("b = " + object1.b); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
    } 
} 