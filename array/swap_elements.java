//Swap 1st and last elements in an array.
public class swap_elements
{
	public static void main(String[] args) {
	    int a[] = {10,20,30,40,50};
	    
	    System.out.println("Original array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;
	    
	    System.out.println("\nArray after swapping:");
	    for(int i=0; i<a.length; i++){
	        System.out.print(a[i]+" ");
	    }
	    
	    }
}

