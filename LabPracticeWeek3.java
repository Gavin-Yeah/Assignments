//Tiffany's notes: Wk 4, task 1-4, including my comments. Be familiar with the generic methods
		//Focus on the ArrayList and their functions; before jumping to use some functions in Collections!

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class LabPracticeWeek3 {

	public static void main(String[] args) {
		
		
				
				ArrayList<String> myList = new ArrayList<String>();
				
				 Scanner input = new Scanner(System.in);
				    	 
				// Prompt the user to enter a series of string ending with 'end'
				System.out.print("Enter strings separated by spaces and ends with 'end': ");
				
				//the old way of accepting user input (as a string): String mystring=input.next();
				   
			    //prompt the user to enter the string
			    System.out.println("Enter strings separated by spaces ");
		  	    
			    myList.add(input.next());
			    
		  	    while (!(myList.contains("end"))) {
			    		    	
		  	    	myList.add(input.next());
			    }
				 
		  	    myList.remove("end");  //for assignment task 1
				
			   ArrayList<String> newList = removeDuplicates(myList);
			   	    
			   System.out.println("Print the new list (removing duplicates):");
			    System.out.print(newList);
			    
			    System.out.println();
			    System.out.println();
			    
			   /* You'd better use a method to implement it
			    //for completing task 2, the codes are inside the main method; you should practice making it with a generic method
			    System.out.println("Display the linked list backward:");
			    	for (int i=newList.size()-1; i>=0; i--) {
					
					System.out.print(newList.get(i)+" ");
			    
			    	}
			    	
			   */ 	
			    	
			    //task 2: print the list backward using a generic method
			    printStringBackgward(newList);
			     
			      	   
				   		    
				    System.out.println();
				    System.out.println();
			    	
			    	//task 3
				    //prompt the user to enter the string to search
				    System.out.println("Enter the string to search ");
		      	      
				    String keyString=input.next();
		      	      
		      	      int myIndex= searchString(newList, keyString);
		      	      
		      	    if (!(myIndex==-1))
		      	    	 
		      	     System.out.print("The index of the string is: "+ myIndex);
		      	      
		      	    else System.out.print("The string is not in the list.");
		      	    
		      	    
		      	//for assignment task 1, including the method sortArray
		      	    //note: the list (removing duplicates and 'end' ) is in newList
			      	  System.out.println();
					    System.out.println();
					    System.out.print("The sorted string is:");
					    System.out.println(sortArary(newList));

			  }//end main method
			
			
			
			//again watch out for the method call 
			public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
			{
				//create a temporary list to handle the operation
				ArrayList<T> result = new ArrayList<T>();
				
				for (T eachElement: list) {
					
					   if (!result.contains(eachElement)) 
				        result.add(eachElement);
				}
						
				return 	result;	

		}
			//for task 2. 
				 public static <T> void printStringBackgward(ArrayList<T> list) {
					 
					 
					 System.out.println("Display the linked list backward:");
				    	for (int i=list.size()-1; i>=0; i--) {
						
						System.out.print(list.get(i)+" ");
				    
				    	}
					 
				 }//end method 
			
			//you need to make the key a generic data type
			 public static <T> int searchString ( ArrayList<T> list, T element) {
				  //In order to make the method reusable, do not accept user input from inside this method;
				   int index; 
				    
				    for (T eachelemnt: list) {
				    	if (list.contains(element))
				    		return list.indexOf(element);
				      }
				           
				   	   
				    return -1;
				 
				}	//end method
			    	
			 
			//you need to make the key a generic data type
			 public static <T> ArrayList<T> sortArary ( ArrayList<T> list) {
				  //In order to make the method reusable, do not accept user input from inside this method;
				   				    
				   Collections.sort((ArrayList<Integer>) list);
					return list;	
				      
				      				 
				}	//end method
			
			 
			}// end class


