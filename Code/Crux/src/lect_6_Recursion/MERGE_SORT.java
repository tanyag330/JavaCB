package lect_6_Recursion;

public class MERGE_SORT {

	public static void main(String[] args) {
		int[] a=merge_two_arrays.takeinput();
		int[] m=mergesort(a,0,a.length-1);
		System.out.println("Sorted array : ");
		merge_two_arrays.display(m);

	}
	public static int[] mergesort(int[] a,int l,int h)
	{
		if(l==h)
		{
			return new int[] {a[l]};
		}
		int mid=(l+h)/2;
		int[] fhalf=mergesort(a,l,mid);
		int[] shalf=mergesort(a,mid+1,h);
		int[] sortedarray=merge_two_arrays.merge(fhalf, shalf);
		return sortedarray;
	}

}
