package oops;

public class Portal {
	private String name;
	private String webaddress;
	category[] categories;
	private int maxcategories;
	private int numcategories;

	public Portal(String name, int maxcategories){
		this.name = name;
		this.maxcategories = maxcategories;
		categories = new category[maxcategories];
	}
	public boolean addcategory(category b){
		if(numcategories == maxcategories){
			return false;
		}	
		else{
			categories[numcategories] = b;
			numcategories++;
			return true;
		}
	}
	public category  getcategory(String name){
		for(int i = 0; i < numcategories; i++){
			if(categories[i].getcategoryName().equals(name)){
				return categories[i];
			}
		}
		return null;

	}
	public boolean additemsTocategory(String name, String categoryName){
		category c = getcategory(categoryName);
		items item1;
		if(c != null){
			item1 = new items(name ,c);
			boolean status = c.additem(item1);
			return status;
		}
		else{
			return false;
		}
	}
	public void showcategory(){
		for(int i = 0; i < numcategories; i++){
			System.out.println(categories[i].getcategoryName() + " "  );
		}
	}
}
