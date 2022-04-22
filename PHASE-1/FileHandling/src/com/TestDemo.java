package com;

import java.io.FileReader;

public class TestDemo {

	public static void main(String[] args) throws Exception{
	    FileReader fr=new FileReader("D:\\java_tutorial\\FileHandling\\a.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }   
	}


