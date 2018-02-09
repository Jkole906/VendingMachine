package VendingMachine;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import Items.ItemsClass;

public class VendingMachine
{
	private BigDecimal balance;
	private Map<String, Stack<ItemsClass>> inventory;
	private List<ItemsClass> itemBin;
	
	
	public VendingMachine(Map<String, Stack<ItemsClass>> inventory) {
		this.inventory = inventory;
	}

	
	public void feedMoney(BigDecimal inputMoney) {
		balance = balance.add(inputMoney);
	}
	public Stack<ItemsClass> dispence(String slotId) {
		return inventory.get(slotId);
	}

	public BigDecimal getBalance()
	{
		return balance;
	}


	public void setBalance(BigDecimal balance)
	{
		this.balance = balance;
	}


	public List<ItemsClass> getItemBin()
	{
		return itemBin;
	}


	public void setItemBin(List<ItemsClass> itemBin)
	{
		this.itemBin = itemBin;
	}


	public Map<String, Stack<ItemsClass>> getInventory()
	{
		return inventory;
	}
	
	
	
	
	
	
	
	//Methods
//	deposite
//	VendingMachine(Map<String, Stack<Item>>)
//	dispence(String slotId);
//	finish();//Consume all items, give back balance
	
	//Stack.size for quantity of items
}
