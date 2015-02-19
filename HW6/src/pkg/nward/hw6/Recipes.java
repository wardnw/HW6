package pkg.nward.hw6;

import java.util.ArrayList;

public class Recipes extends Item implements ManageItems {

	private ArrayList<Item> recipeList = new ArrayList<Item>();

	@Override
	public void addItem(Item i) {
		// TODO Auto-generated method stub
		recipeList.add(i);
	}

	@Override
	public Item returnItem(String name) {
		// TODO Auto-generated method stub
		for(Item i : recipeList){
			if(i.toString() == name){
				return i;
			}
		}
		return null;
	}

	@Override
	public void removeItem(Item i) {
		// TODO Auto-generated method stub
		recipeList.remove(i);
	}

	@Override
	public void editItem(Item i) {
		// TODO Auto-generated method stub
		for(Item i2 : recipeList){
			if(i2.toString() == i.toString()){
				i2 = i;
			}
		}
	}
	
	
	
}
