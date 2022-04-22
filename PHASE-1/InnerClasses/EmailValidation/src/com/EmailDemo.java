package com;

import java.util.Scanner;

class EmailDemo { 
    public static void main(String[] args) 
    { 
      String[] strArray = { "sarwar@gmail.com","rehan@gmail.com","xyz@gmail.com","abc@gmail.com" };
        boolean found = false;
        
        String searchStr;
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Search Email");
        searchStr = obj.nextLine();
        
       for (int i = 0; i <strArray.length; i++) {
       if(searchStr.equals(strArray[i])) {
           found = true; 
            break;
            }
        }
       if(found)
          System.out.println(searchStr + " Email Found ");
        else
          System.out.println(searchStr + " Email not found in the array");
 
    }
}
