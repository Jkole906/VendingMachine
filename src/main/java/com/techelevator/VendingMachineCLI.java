package com.techelevator;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

import com.techelevator.view.Menu;

import VendingMachine.InventoryReader;
import VendingMachine.VendingMachine;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS,
													   MAIN_MENU_OPTION_PURCHASE };
	private static final String SECOND_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String SECOND_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String SECOND_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
	private String[] SECOND_MENU_OPTIONS = { SECOND_MENU_OPTION_FEED_MONEY, 
														SECOND_MENU_OPTION_SELECT_PRODUCT,
														SECOND_MENU_OPTION_FINISH_TRANSACTION,};	
	



	
	private Menu menu;
	
	public VendingMachineCLI(Menu menu) throws FileNotFoundException {
		this.menu = menu;
	}
	
	public void run() throws FileNotFoundException {
		InventoryReader inventoryReader = new InventoryReader();
		VendingMachine vendOMatic = new VendingMachine(inventoryReader.generateInventory());
		while(true) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if(choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				System.out.println(inventoryReader.generateInventory());
			} else if(choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				Scanner userInput = new Scanner(System.in);
				String secondChoice = (String)menu.getChoiceFromOptions(SECOND_MENU_OPTIONS);
				if(secondChoice.equals(SECOND_MENU_OPTION_FEED_MONEY)) {
					BigDecimal inputMoney = menu.getAmountFromUserInput();
					vendOMatic.feedMoney(inputMoney);
					if(secondChoice.equals(SECOND_MENU_OPTION_SELECT_PRODUCT)) {
						System.out.println("Enter item key.");
						Scanner locationKey = new Scanner(System.in);
						String keyInput = locationKey.nextLine();
						vendOMatic.getItem(keyInput);

					}
					
					
				}
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}

}
