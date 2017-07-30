package lect5;

public class first_last_usingSI {

	public static void main(String[] args) {
		int[] arr={5,3,7,6,0,7,3};
		int index=firstindex(arr,0);
		int c=count7(arr,0);
    	System.out.println(index);

	}
	public static int count7(int[] a,int si)
	{
		if(si==a.length)
		{
			return 0;
		}
		if(a[si]==6)
		{
			return 1+count7(a,si+1);
		}
		else
		{
			return count7(a,si+1);
		}
	}
    public static int firstindex(int[] a , int si)
    {
    	if(si==a.length)
    	{
    		return -1;
    	}
    	if(a[si]==7)
    	{
    		return si;
    	}
    	else{    	
    	 return firstindex(a,si+1);
    	}
    }
    
    public static int last(int[] a,int item,int si)
	{
		if(si==a.length)
		{
			return -1;
		}
		int index=last(a,item,si+1);
		if(index==-1)
		{
			if(a[si]==item)
			{
				return si;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return index;
		}
		
	}
	public static int[] all(int[] a,int item,int si)
	{
		if(si==a.length)
		{
			return new int[0];
		}
		int[] index=all(a,item,si+1);
		if(a[si]==item)
		{
			int[] big=new int[index.length+1];
			for(int i=0;i<index.length;i++)
			{
				big[i]=index[i];
			}
			for(int i=0;i<big.length-index.length;i++)
			{
				big[i+index.length]=si;
			}
			return big;
		}
		else
			return index;
		
	}

}
