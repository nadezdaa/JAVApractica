package test;

import static test.Menu.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shoppingList {

	private static List<String> list = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
				"Welcome! This is a shopping list application. Please make your choice by entering the corresponding Menu number:");
		int input;
		printMenu();
		do {
			input = scanner.nextInt();
			scanner.nextLine();

			if (input == PRINT.getNumber()) {
				printList();
			}
			if (input == ADD.getNumber()) {
				addToList();
			}
			if (input == DELETE.getNumber()) {
				deleteList();
			}
			if (input == SAVE.getNumber()) {
				saveList();
			}
			if (input == LOAD.getNumber()) {
				loadList();
			}
			if (input > 7) {
				System.out.println("wrong choice, here are available choices: ");
				printMenu();
			}
		} while (EXIT.getNumber() != input);
		System.out.println("Good buy!");
	}


	private static void printList() {
		System.out.println(list);
		System.out.println("Please enter you next choice number:");
	}


	private static void addToList() {
		System.out.println("Enter item: ");
		String item = scanner.nextLine();
		list.add(item);
		System.out.println(item + " added, enter your next choice number:");
	}

	private static void printMenu() {
		System.out.println(ADD.getNumber() + " - add an item");
		System.out.println(PRINT.getNumber() + " - list items");
		System.out.println(DELETE.getNumber() + " - delete an item");
		System.out.println(SAVE.getNumber() + " - save list to file");
		System.out.println(LOAD.getNumber() + " - load list from file");
		System.out.println(EXIT.getNumber() + " - exit");
	}

	private static void saveList() {
		try (PrintWriter write = new PrintWriter(Files.newBufferedWriter(Paths.get("shoppingList.txt")))) {
			for (String s : list) {
				write.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("List saved in file. Please enter you next choice number:");
	}

	public static void loadList() {
		try {
			list = Files.readAllLines(Paths.get("shoppingList.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("List loaded from file. Please enter you next choice number:");
	}

	public static void deleteList() {
		System.out.println("Enter item name for deleting: ");
		String item = scanner.nextLine();
		list.remove(item);
		System.out.println("Deleted item: " + item + "Please enter you next choice number:");
	}
}
