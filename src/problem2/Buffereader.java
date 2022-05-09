package problem2;
import java.util.*;

import java.io.*;

public class Buffereader {

	public static void main(String[] args) {
		BufferedReader fi=new BufferedReader(new InputStreamReader(System.in));
		Scanner v=new Scanner(System.in);
		int x=v.nextInt();
		while(x>0) {
			try {
				char g=Character.toUpperCase((char)fi.read());
				System.out.println(g);
				x--;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
