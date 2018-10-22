
import java.util.Scanner;

public class PraiseMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
System.out.println("Praise Jiada quickly!");
String sentence=input.nextLine();
while(!sentence.startsWith("Jiada")){
	System.out.println("Say something about Jiada quickly");
	sentence=input.nextLine();               }

checkSentence(sentence);
	}

	public static void checkSentence(String sentence){
		String[]praise={"nice","handsome","clever","cool","adorable","impressive","charming","confident","fantastic","glorious","intelligent",
				"amazing","tall","wealthy","rich","strong","kind","warm-hearted","friendly","outstanding","positive","brilliant","attractive","smart"};
		String[]curse={"terrible","horrible","fat","stupid","foolish","ugly","weak","mean","selfish","shabby","shaky","ruthless","low","silly",
				"shit","cheap","fuck","ignorant","boring","rotten","asshole","disappointed"};
		String[] token=sentence.split(" ");
		int good=0;
		int bad=0;
		for(int i=0;i<praise.length;i++){
			for(int x=0;x<token.length;x++){			
				if (praise[i].equalsIgnoreCase(token[x])){
				good++;
				}
				}
		}
		for(int i=0;i<curse.length;i++){
			for(int x=0;x<token.length;x++){	
			if (curse[i].equalsIgnoreCase(token[x])){
				bad++;
			}
		}
		}
		if(good>bad){
			System.out.println("Good words are more than terrible words");
			}
		else{ System.out.println("Damn it!");
			
			}
			
	}
}