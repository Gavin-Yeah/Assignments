import java.util.*;

public class binarySearchExample {

	
	public static void main(String[] args) {
	
		//Integer key=0;
		String key="";
		
		//ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		LinkedList<String> myLinkedList = new LinkedList<String>();
		
		/*
		myArrayList.add(1); // 1 is autoboxed to new Integer(1)
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(1);
		myArrayList.add(4);
		myArrayList.add(0, 10);
		myArrayList.add(3, 30);
		*/
		
		myLinkedList.add("Albert"); // 1 is autoboxed to new Integer(1)
		myLinkedList.add("wants to");
		myLinkedList.add("kill");
		myLinkedList.add("Tony");
		myLinkedList.add("Let");
		myLinkedList.add(0, "us");
		myLinkedList.add(3, "help");
		myLinkedList.add("Tony");
		
		
		//System.out.println("A list of intergers in the array list:");
		System.out.println("A list of strings in the list:");
	    //System.out.println(myArrayList);
		System.out.println(myLinkedList);
	    
		System.out.println("\n");
	    //sort the array
	   // Collections.sort(myArrayList);
		Collections.sort(myLinkedList);
	    
	   // System.out.println("The sorted array is: ");
	   // System.out.println(myArrayList);
	    
	    System.out.println("The sorted array is: ");
	    System.out.println(myLinkedList);
	    
	    /*
	  //prompt the user to enter the key
	    Scanner input = new Scanner(System.in);
   	 
		// Prompt the user to enter a series of string ending with 'end'
		//System.out.println("What do you want to search? Enter the Interger: ");
	    
	    System.out.println("What do you want to search? Enter the string: ");
		
		//key= input.nextInt();
	    key=input.next();
	    */
		
		//int index=Collections.binarySearch(myArrayList, key); 
	  /*  
	    int index=Collections.binarySearch(myLinkedList, key); 
	      
		   System.out.println(" the Key " + key + " is available at index: "+ index);
	   */
		   
	  System.out.println("\n");
	    
	    
	    //reverse the list and print out to see what it is
		 //  System.out.println("The reversed list is: ");
		//   Collections.reverse(myLinkedList);
		//   System.out.println(myLinkedList);
		 
		   
		   /*
		   Collections.reverse(myArrayList);
		    System.out.println(myArrayList);
		   */ 

		 /*   
		    //compare the printstringbackward way with the method reverse
		    System.out.println("reverse the string using printstringbackward ");
		    printStringBackgward(myLinkedList);
		    //print the list
		    System.out.println(myLinkedList);
		   
		   /* 
		  //shuffle the list
			   System.out.println("The shuffled list is: ");
			   
			   Collections.shuffle(myLinkedList);
			    System.out.println(myLinkedList);
			   
			    //Collections.shuffle(myArrayList);
			    //System.out.println(myArrayList);
			     * */
	  
	  
	  System.out.println("The reversed sort array is: ");
	    Collections.sort(myLinkedList, Collections.reverseOrder());
	    System.out.println(myLinkedList);
	    
			     
	}

	
	
	public static <T> void printStringBackgward(LinkedList<T> list) {
		 
		 
		 System.out.println("Display the linked list backward:");
	    	for (int i=list.size()-1; i>=0; i--) {
			
			System.out.print(list.get(i)+" ");
	    
	    	}
		 
	 }//end method 
	
	
	
}
