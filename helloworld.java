package test1;

public class QuickSort {
	public static void quickSort(int []a,int left,int right) {
	int i,j,temp,t;
	if(left<right) {	
		i=left;
	    j=right;
	    temp=a[left];
	    while(i<j) {
	    	while(i<j && a[j]>=temp)
	    		j--;
	    	if(i<j) {
	    		a[i]=a[j];
			    i++;
			}
	    	while(i<j && a[i]<temp)
	    		i++;
		    if(i<j) {
			    a[j]=a[i];
			    j--;
		    }
	}
	a[i]=temp;
	quickSort(a,left,i-1);
	quickSort(a,i+1,right);
	}
	}
	public static void main(String args[]) {
		int a[]={4,9,6,5,8,7,10,3,2,1,0,11};
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
