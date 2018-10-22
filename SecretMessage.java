
import java.util.Scanner;

public class SecretMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your message: ");
	String message=input.nextLine();
	message=message.trim();
	message=message.toLowerCase();
message=message.replaceAll(" ", "1");
message=message.replaceAll("[abc]", "2");
message=message.replaceAll("[def]", "3");
message=message.replaceAll("[ghi]", "4");
message=message.replaceAll("[jkl]", "5");
message=message.replaceAll("[mno]", "6");
message=message.replaceAll("[pqrs]", "7");
message=message.replaceAll("[tuv]", "8");
message=message.replaceAll("[wxyz]", "9");
int length;
if(message.length()==0){
	length=0;
}
else{
	 length=1;
}

for(int i=0;i<message.length()-1;i++){
	char current=message.charAt(i);

char next=message.charAt(i+1);

	if(next=='1'&&current!='1'){
		
						length++;
						
					}
				
			}

System.out.println("The secret message is: "+message);

System.out.println("There are "+String.format("%1d",length)+" words");


	
	
	
	System.out.println();
	}

}
