
public class PraiseMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(praise());
	}
	
	
	
public static String praise(){
		String[]praise={"nice","handsome","clever","cool","adorable","impressive","charming","confident","fantastic","glorious","intelligent",
				"amazing","tall","wealthy","rich","strong","kind","warm-hearted","friendly","outstanding","positive","brilliant","attractive","smart"};
        String[] verb={"play basketball","play chess","play the violin","play the piano","dance","have a beautiful voice"};
        int praise1=(int)(Math.random()*praise.length);
        int praise2=(int)(Math.random()*praise.length);
	while(praise1==praise2){
        praise2=(int)(Math.random()*praise.length);
	}
    int verb1=(int)(Math.random()*verb.length);
    String sentence1="You are so "+praise[praise1]+" and "+praise[praise2]+". ";
    String sentence2="You can "+verb[verb1]+" well.";
    String sentence=sentence1.concat(sentence2);
    return sentence;
	}
}
