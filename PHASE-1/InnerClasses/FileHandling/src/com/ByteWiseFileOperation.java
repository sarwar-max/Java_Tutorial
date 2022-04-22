package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ByteWiseFileOperation {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		//FileOutputStream fos = new FileOutputStream("abc.txt");// override 
		FileOutputStream fos = new FileOutputStream("abc.txt",true);// append the data
		System.out.println("enter the data");
		int ch;
		while((ch=dis.read()) != '@') {
				fos.write(ch);			// automatically convert 
				System.out.print(ch+" "+(char)ch);	// console it will not convert 
		}
		fos.close();
	}

}
