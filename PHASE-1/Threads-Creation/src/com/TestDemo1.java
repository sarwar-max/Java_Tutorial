package com;

public class TestDemo1 extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		TestDemo1 mt = new  TestDemo1();
  		mt.run();
 	}
}

