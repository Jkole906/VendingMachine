package VendingMachine;

import java.util.Map;
import java.util.Stack;

import Items.ItemsClass;

public class GetItem extends VendingMachine
{
	public GetItem(Map<String, Stack<ItemsClass>> inventory)
	{
		super(inventory);
		// TODO Auto-generated constructor stub
	}

	public void getItem(String slotId, VendingMachine machine) {
		ItemsClass selectedItem = machine.getInventory().get(slotId).pop();
		String itemName = selectedItem.getName();
		
	}
	
	
	

}
