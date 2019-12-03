package string;

import java.util.ArrayList;

// Example demonstrate autoboxing and unboxing in java
//Wrapper class example
public class unboxingautoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1); //autoboxing - primitive to object
		intList.add(2); //autoboxing
		     
		ThreadLocal<Integer> intLocal = new ThreadLocal<Integer>();
		intLocal.set(4); //autoboxing

		int number = intList.get(0); // unboxing
		int local = intLocal.get(); // unboxing in Java

		//Read more: https://javarevisited.blogspot.com/2012/07/auto-boxing-and-unboxing-in-java-be.html#ixzz66xLTd2K7
		
		char ch = 'a'; 
		  
        // Autoboxing- primitive to Character object conversion 
        Character a = ch; 
  
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
  
        // Autoboxing because ArrayList stores only objects 
        arrayList.add(25); 
  
        // printing the values from object 
        System.out.println(arrayList.get(0)); 
        System.out.println(a);
        System.out.println(a.getClass());
        System.out.println(a.getClass().getName());
        
        Character ch1 = 'a'; 
        
        // unboxing - Character object to primitive conversion 
        char a1 = ch1; 
  
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(); 
        arrayList1.add(24); 
  
        // unboxing because get method returns an Integer object 
        int num = arrayList1.get(0); 
  
        // printing the values from primitive data types 
        System.out.println(num); 

        //Comparing Objects with equality Operator
        
        Integer one = new Integer(1);
        Integer anotherOne = new Integer(1);
             
        if(one == anotherOne){
          System.out.println("both one are equal");
                 
        }else{
           System.out.println("Both one are not equal");
        }
        if(one.equals(anotherOne)){
            System.out.println("both one are equal");
                   
          }else{
             System.out.println("Both one are not equal");
          }
        
        //---------------Example------------2 
        int i1 = 1;
        int i2 = 1;
        System.out.println("i1==i2 : " + (i1 == i2)); // true

        // Example 2: equality operator mixing object and primitive
        Integer num1 = 1; // autoboxing
        int num2 = 1;
        System.out.println("num1 == num2 : " + (num1 == num2)); // true

        // Example 3: special case - arises due to autoboxing in Java
        Integer obj1 = 1; // autoboxing will call Integer.valueOf()
        Integer obj2 = 1; // same call to Integer.valueOf() will return same
                            // cached Object

        System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // true

        // Example 4: equality operator - pure object comparison
        Integer one1 = new Integer(1); // no autoboxing
        Integer anotherOne1 = new Integer(1);
        System.out.println("one1 == anotherOne1 : " + (one1 == anotherOne1)); // false


//javarevisited.blogspot.com/2012/07/auto-boxing-and-unboxing-in-java-be.html#ixzz672GhKbqf
        
        

        
	}

}
