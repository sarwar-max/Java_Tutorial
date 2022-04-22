package com;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

	public class Lockedme {
		
		static String DIRECTORY;
	    File folder_name;

	    public Lockedme() {
	        DIRECTORY = System.getProperty("user.dir");
	        folder_name = new File(DIRECTORY+"/files");
	        if (!folder_name.exists())
	            folder_name.mkdirs();
	        System.out.println("Directory : "+ folder_name.getAbsolutePath());
	    }

	    private static final String WELCOME =
	            "\n######### sarwar ###############"+
	              "\nDeveloped By : Sarwar ";
	    private static final String mainmenu1=
	            "\nMAIN MENU - choose follwing option to experience : \n"+
	                    "\n1:List files in directory"+
	                    "\n2:Add,Search or Delete"+
	                    "\n3:Exit Program";
	    void Menu1() {
	    	System.out.println(mainmenu1);
	        try{
	            Scanner sc = new Scanner(System.in);
	            int choose = sc.nextInt();
	            switch (choose){
	                case 1 : {
	                    sortingFiles();
	                    Menu1();
	                }
	                case 2 : {
	                    Menu2();
	                }
	                case 3 : {
	                    System.out.println("Thank You For Using LockedMe");
	                    System.exit(0);
	                }
	                default: Menu1();
	            }
	        }
	        catch (Exception e){
	            System.out.println("Please Enter Option 1, 2 or 3");
	            Menu1();
	        }
	    }
	    private static final String mainmenu2 =
	            "   \nSelect any of the following Option: \n"+
	                    " 4 -> Add a file\n"+
	                    " 5 -> Search a file\n"+
	                    " 6 -> Delete a file\n"+
	                    " 7 -> Go Back menu1";

	    void Menu2() {
	        System.out.println(mainmenu2);
	        try{
	            Scanner sc = new Scanner(System.in);
	            char[] input = sc.nextLine().toLowerCase().trim().toCharArray();
	            int i = input[0];

	            switch (i){
	                case '4' : {
	                    System.out.print("For Adding a file...Please Enter a File Name : ");
	                    String filename = sc.next().toLowerCase();
	                    addFile(filename);
	                    break;
	                }
	                case '5' : {
	                    System.out.print("For Searching a file...Please Enter a File Name : ");
	                    String filename = sc.next();
	                    searchFile(filename);
	                    break;
	                }

	                case '6' : {
	                    System.out.print("For Deleting a file...Please Enter a File Name : ");
	                    String filename = sc.next();
	                    deleteFile(filename);
	                    break;
	                }
	                   case '7' : {
	                    System.out.println("return to main menu");
	                    Menu1();
	                    break;
	                }
	                default : System.out.println("Please enter Otion 4, 5, 6 or 7");
	            }
	            Menu2();
	        }
	        catch (Exception e){
	            System.out.println("Please enter Option 4, 5, 6 or 7");
	            Menu2();
	        }
	    }

	    void sortingFiles() {
	        if (folder_name.list().length==0)
	            System.out.println(" folder is empty");
	        else {
	            String[] list = folder_name.list();
	            System.out.println(" files in "+ folder_name +" are :");
	            Arrays.sort(list);
	            for (String str:list) {
	                System.out.println(str);
	            }
	        }
	    }

	    void addFile(String filename) throws IOException {
	        File filepath = new File(folder_name +"/"+filename);
	        String[] list = folder_name.list();
	        for (String file: list) {
	            if (filename.equalsIgnoreCase(file)) {
	                System.out.println("File " + filename + " is already exists at " + folder_name);
	                return;
	            }
	        }
	        filepath.createNewFile();
	        System.out.println("File "+filename+"is added to "+ folder_name+" Successfully");
	    }

	    void deleteFile(String filename) {
	        File filepath = new File(folder_name +"/"+filename);
	        String[] list = folder_name.list();
	        for (String file: list) {
	            if (filename.equals(file) && filepath.delete()) {
	                System.out.println("File " + filename + " deleted from " + folder_name);
	                return;
	            }
	        }
	        System.out.println("Delete Operation failed. FILE NOT FOUND");
	    }

	    void searchFile(String filename) {
	        String[] list = folder_name.list();
	        for (String file: list) {
	            if (filename.equals(file)) {
	                System.out.println("FOUND : File " + filename + " Exists at " + folder_name);
	                return;
	            }
	        }
	        System.out.println("File NOT found");
	    }

	    public static void main(String[] args) {
	        System.out.println(WELCOME);
	       Lockedme menu = new Lockedme();
	        menu.Menu1();
	    }
	}
