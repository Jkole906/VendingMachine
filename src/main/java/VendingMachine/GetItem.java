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

	public void getItem(String slotId) {
		String selectedItem = getInventory.get(slotId).getName()
		
	}
	
	
	

}
