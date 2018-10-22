
//Ye Jiada(Garden) 0952777 Inclass assignment2
public class desk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 desk1 desk1= new desk1();
 desk1 desk2= new desk1();
   desk1.l(4);
   desk1.len(130);
   desk1.h(88);
   desk1.wid(40);
   desk2.l(6);
   desk2.len(160);
   desk2.h(90);
   desk2.wid(60);
   desk1.getvolume();
   desk2.getvolume();
   System.out.println("the first desk's area is"+ desk1.getarea()+ "cm2");
   System.out.println("the first desk's volume is"+ desk1.volume+"cm3");	
   System.out.println("the second desk's area is"+ desk2.getarea()+"cm2");
   System.out.println("the second desk's volume is"+ desk2.volume+"cm3");		
	}
}
class desk1{
	int leg=1;
	int height=1;
	int width=1;
	int length=1;
	int volume;
	int l(int nleg){ //leg NO.
		return leg= nleg;
	}
    int h(int nheight){ // height
	return	height=nheight;
	}
    int wid(int nwidth){ //width
    	return width= nwidth;
    }
    int  len(int nlength){ //length
	 return length=nlength;
	 }

	 public void getvolume(){  //Volume
		 volume=height*width*length;
	 }
	 int getarea(){  //area
		 return height*width+height*length+width*length;
		 }
	 
	 }
