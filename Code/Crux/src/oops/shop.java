package oops;

import java.util.Scanner;

public class shop {
	public static void main(String[] args) {
		Portal c = new Portal("Abc", 10);
		Scanner s = new Scanner(System.in);
		String ans = "y";
	//	s.useDelimiter("\n");
		int choice;
		String name;
		int size;
		category c1;
		items item1;

		while(ans.equals("y")){
			System.out.println("1. Add category ");
			System.out.println("2. Add item ");
			System.out.println("3. shop ");
			choice = s.nextInt();

			switch(choice){
			case 1 :
				System.out.println("Enter category name :");
				name = s.next();
				System.out.println("Enter category size :");
				size = s.nextInt();
				c1 = new category(name, size);
				if(c.addcategory(c1)){
					System.out.println("category added successfully");
				}
				else{
					System.out.println("Can't add category ");
				}
				break;

			case 2 :
				System.out.println("Enter item name :");
				name = s.next();
				System.out.println("Enter category :");
				String categoryName = s.next();
				if(c.additemsTocategory(name, categoryName)){
					System.out.println("item successfully added");
				}
				else{
					System.out.println("Can't add item");
				}
				break;
				
			case 3 :
				System.out.println("Enter category name:");
				categoryName = s.next();
				System.out.println("Enter item name:");
				name = s.next();
				
				break;
			}
			System.out.println("Want to continue : y/n ?");
			ans = s.next();
		}
	}
}
