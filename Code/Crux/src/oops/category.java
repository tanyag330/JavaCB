package oops;

public class category {
	private String Categoryname;
	private int quantity;
	private items[] item;
	private int maxitem;
	public static int numcategory;

	public category(String Categoryname, int maxitem){
		this.Categoryname=Categoryname;
		this.maxitem=maxitem;
		item= new items [maxitem];
		numcategory++;

	}
	public void itemdetails(){
		for (int i=0 ; i<quantity; i++){
			System.out.println(item[i].getitemname()+ " "+ item[i].getprice());
		}
	}
public String getcategoryName() {
		
		return Categoryname;
	}
	public boolean additem(items item){
		if (quantity==maxitem)
			return false;

		else
		{
			this.item[quantity]=item;
			quantity++;
			return true;
		}
	}
}
