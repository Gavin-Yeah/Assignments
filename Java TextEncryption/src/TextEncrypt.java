import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextEncrypt {

	public static final byte XOR_KEY =0x10; // create a pseudorandom number as the XOR parameter

	public static void main(String[] args) throws Exception {

		File plaintext = new File("src/mesage.txt");    //the original text

		File cyphertext = new File("src/toyou.txt");      //the cyphertext 


		xorEn(plaintext, cyphertext);  // encrypt the plaintext and save the cyphertext into toyou.text


	}

	public static void xorEn(File src, File dest) throws Exception {

		FileInputStream fis = new FileInputStream(src);     

		FileOutputStream fos = new FileOutputStream(dest);   

		byte[] bs = new byte[1024]; //decide the length of plaintext

		int len ;

		while ((len = fis.read(bs)) != -1) {

			for (int i = 0; i < len; i++) {

				bs[i] ^= (XOR_KEY+i);   
		//To complicate the algorithm so that decoders
	    //cannot know the secret according to the same character
               
			}

			fos.write(bs, 0, len);

		}
	
		fos.close();

		fis.close();

	}
}