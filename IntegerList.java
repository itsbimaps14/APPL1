import java.util.Scanner;

public class IntegerList{
	int[] list; //values in the list

	//-------------------------------------------------------
	//create a list of the given size
	//-------------------------------------------------------
	public IntegerList(int size){
		list = new int[size];
	}

	//-------------------------------------------------------
	//fill array with integers between 1 and 100, inclusive
	//-------------------------------------------------------
	public void randomize(){
		for (int i=0; i<list.length; i++)
			list[i] = (int)(Math.random() * 100) + 1;
	}

	//-------------------------------------------------------
	//print array elements with indices
	//-------------------------------------------------------
	public void print(){
		for (int i=0; i<list.length; i++)
			System.out.println(i + ":\t" + list[i]);
	}

	//-------------------------------------------------------
	//return the index of the first occurrence of target in the list.
	//return -1 if target does not appear in the list
	//-------------------------------------------------------
	public int search(int target){
		int location = -1;
		for (int i=0; i<list.length && location == -1; i++)
			if (list[i] == target)
				location = i;

		return location;
	}

	//-------------------------------------------------------
	//sort the list into ascending order using the selection sort algorithm
	//-------------------------------------------------------
	public void selectionSort(){
		int minIndex;
		for (int i=0; i < list.length-1; i++){
			//find smallest element in list starting at location i
			minIndex = i;
			for (int j = i+1; j < list.length; j++)
				if (list[j] < list[minIndex])
					minIndex = j;

			//swap list[i] with smallest element
			int temp = list[i]; 
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}
}


=============================================

import java.util.Scanner;
public class IntegerListTest{
	static IntegerList list = new IntegerList(10);
	static Scanner scan = new Scanner(System.in);
	
	//-------------------------------------------------------
	// Create a list, then repeatedly print the menu and do what the
	// user asks until they quit
	//-------------------------------------------------------
	public static void main(String[] args){
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0){
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}

	//-------------------------------------------------------
	// Do what the menu item calls for
	//-------------------------------------------------------
	public static void dispatch(int choice){
		int loc;
		switch(choice){
			case 0:
				System.out.println("Bye!");
				break;
			case 1:
				System.out.println("How big should the list be?");
				int size = scan.nextInt();
				list = new IntegerList(size);
				list.randomize();
				break;
			case 2:
				list.selectionSort();
				break;
			case 3:
				System.out.print("Enter the value to look for: ");
				loc = list.search(scan.nextInt());
				if (loc != -1)
					System.out.println("Found at location " + loc);
				else
					System.out.println("Not in list");
				break;
			case 4:
				list.print();
				break;
			default:
				System.out.println("Sorry, invalid choice");
		}
	}

	//-------------------------------------------------------
	// Print the user's choices
	//-------------------------------------------------------
	public static void printMenu(){
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Create a new list (** do this first!! **)");
		System.out.println("2: Sort the list using selection sort");
		System.out.println("3: Find an element in the list using linear search");
		System.out.println("4: Print the list");
		System.out.print("\nEnter your choice: ");
	}
} 