package problem1;
import java.util.*;

import java.io.*;
class Textfile{
	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\saivi\\eclipse-workspace\\first1\\Assignment\\src\\abc.txt");
		System.out.println( f1.getName());
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
	}
}