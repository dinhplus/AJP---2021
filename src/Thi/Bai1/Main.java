package Thi.Bai1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> studentHashMap = new HashMap<String, String>();
		String name = "";
		String phone = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Begin");
		 for (int i = 0; i < 10; i++) {
             System.out.println("Enter student name: ");
             name = input.nextLine();
             System.out.println("Enter " + name + " phone: ");
             phone = input.nextLine();
             studentHashMap.put(name, phone);
             
         }
		 input.close();
		 System.out.println("List student : " + studentHashMap);
		 
		 
		 
	}
	
}