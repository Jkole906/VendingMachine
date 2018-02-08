package com.techelevator;

import java.io.FileNotFoundException;

import com.techelevator.view.Menu;

import VendingMachine.InventoryReader;
import VendingMachine.VendingMachine;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS,
													   MAIN_MENU_OPTION_PURCHASE };
	
	private Menu menu;
	
	public VendingMachineCLI(Menu menu) throws FileNotFoundException {
		this.menu = menu;
	}
	
	public void run() throws FileNotFoundException {
		while(true) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			InventoryReader inventoryReader = new InventoryReader();
			VendingMachine vendOMatic = new VendingMachine(inventoryReader.generateInventory());

			
			if(choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				System.out.println(inventoryReader.generateInventory());
			} else if(choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				System.out.println("boopitybooooop");			
				}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}

}
