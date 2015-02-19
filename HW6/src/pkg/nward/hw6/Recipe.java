package pkg.nward.hw6;

import java.util.ArrayList;

public class Recipe extends Item implements ManageItems {

	private String instructions;
	
	private ArrayList<Item> ingredients = new ArrayList<Item>();
	
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	@Override
	public void addItem(Item i) {
		// TODO Auto-generated method stub
		ingredients.add(i);
	}
	@Override
	public Item returnItem(String name) {
		// TODO Auto-generated method stub
		for(Item i : ingredients){
			if(i.toString() == name){
				return i;
			}
		}
		return null;
	}
	@Override
	public void removeItem(Item i) {
		// TODO Auto-generated method stub
		ingredients.remove(i);
	}
	@Override
	public void editItem(Item i) {
		// TODO Auto-generated method stub
		for(Item i2 : ingredients){
			if(i2.toString() == i.toString()){
				i2 = i;
			}
		}
	}
	
	
	
}
