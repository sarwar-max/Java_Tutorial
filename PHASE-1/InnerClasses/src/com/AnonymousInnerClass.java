package com;

abstract class AnonymousInner {
	   public abstract void display();
	}


	public class AnonymousInnerClass {

	public static void main(String[] args) {
	AnonymousInner i = new AnonymousInner() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}

