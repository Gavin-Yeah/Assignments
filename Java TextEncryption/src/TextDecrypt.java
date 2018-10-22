import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TextDecrypt {

	public static final byte XOR_KEY =TextEncrypt.XOR_KEY;

	public static void main(String[] args) throws Exception {

		

		File cyphertext = new File("src/toyou.txt");

		File plaintext = new File("src/mesage.txt");

		

	xorDe(cyphertext, plaintext);  //use the reverse method to decrypt the text

	}
	public static void xorDe(File src, File dest) throws Exception {

		FileInputStream fis = new FileInputStream(src);     

		FileOutputStream fos = new FileOutputStream(dest);   

		byte[] bs = new byte[1024];

		int len ;

		while ((len = fis.read(bs)) != -1) {

			for (int i = 0; i < len; i++) {
			
				bs[i] ^= (XOR_KEY+i);
             
			}

			fos.write(bs, 0, len);

		}
	
		fos.close();

		fis.close();

	}
}
	