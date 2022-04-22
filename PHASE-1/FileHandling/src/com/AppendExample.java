package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AppendExample {
	public static void main(String[] args) throws Exception{
	FileInputStream fis = new FileInputStream("a.txt");
	BufferedInputStream bis =new BufferedInputStream(fis);
	FileOutputStream fos = new FileOutputStream("abc.txt");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	int ch;
	while((ch= bis.read()) != -1) {				// -1 is EOF 
			bos.write(ch);
	}
	
	bos.flush();// send data from buffer memory to file. 
	fis.close();
	fos.close();
	System.out.println("File copied");
	}

}
