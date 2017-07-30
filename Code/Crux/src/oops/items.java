package oops;

public class items {
	private String itemname;
	private int numitems;
	private int price;
	private static int quantity;
	category c;
	
	items(String itemname, category c){
		this.itemname=itemname;
		quantity++;
		this.c=c;
	}	
	
	public void setcatgory(category c){
	this.c=c;
	}
	public String getitemname(){
		return itemname;

	}
	public  void setquantity(int num){
		quantity = num;
	}
	public int getquantity(){
		return quantity;
	}
	public int getnumitems(){
		return numitems;
	}
	public int getprice(){
		return price;
	}
}
	