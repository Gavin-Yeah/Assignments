

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab2JiadaYe0952777 {
	public static void main(String[] args) {
 //Task1  create a string list to hold a series of the following strings and print it out accordingly. This list is referred to as list one.

  List<String>list1= new ArrayList<String>();
  list1.add("this");
  list1.add("is");
  list1.add("lab");
  list1.add("exam");
  list1.add("one");
  list1.add("you");
  list1.add("have");
  list1.add("to");
  list1.add("finish");
  list1.add("it");
  list1.add("within");
  list1.add("45");
  list1.add("minutes");
  list1.add("good");
  list1.add("luck");
System.out.println("The first list contains:\n"+list1);
  //Task 2: create a String array containing the following strings "lab exam one is
  //easier"; covert the array into a String list, referred to as the list two.
String[] stringarray={"lab","exam","one","is","easier"};
List<String> list2=Arrays.asList(stringarray);
System.out.println("The Second List contains:\n"+list2);
   //compare how many times the string 'exam' appear in both lists, print the messages out.
   int fre1=Collections.frequency(list1, "exam");
   int fre2=Collections.frequency(list2, "exam");
   System.out.println("\"exam\"appears"+fre1+" time(s) in List one");
   System.out.println("\"exam\"appears"+fre2+" time(s) in List two");
	String random1=pickOneObject(list1);
	String random2=pickOneObject(list2);
   String compare=compareReturnwithLabel(random1,random2);
   if(compare.equals("Negative")){
	   System.out.println("1st string from list two: "+random1+" < 2nd string from list one:"+random2);
   }
   if(compare.equals("Zero")){
	   System.out.println("1st string from list one: "+random1+" = 2nd string from list two:"+random2);
   }if(compare.equals("Positive")){
	   System.out.println("1st string from list one: "+random1+" > 2nd string from list two:"+random2);
   }
	
	   
   }
	//Task 5: Call the method pickOneObject to pick one string randomly from each list (one from each list).
	public static String pickOneObject(List<String> list1){
		
		String random1= list1.get((int) (Math.random()*list1.size()));
		
	  return random1;
		
		
}
	//Task4:Write the following method to return a string at a specified position, its header should look like:
	public static String pickOneObject( List<String> list, int position){
		return list.get(position);
	}
	
	//Task 6: Implement a generic method called compareReturnwithLabel as follows:
	public static < T extends Comparable< T > > String compareReturnwithLabel( String x, String y ){
		if(x.compareTo(y)>0){
			return "Positive";
		}
		if(x.compareTo(y)<0){
			return "Negative";
		}
			else{
				return "Zero";
			}
		}
	//Task 7: Call the method compareReturnwithLabel to compare the two
	//randomly picked strings (from Task 5) and print the result out.
	
}
