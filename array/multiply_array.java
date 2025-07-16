
public class multiply_array
{
	public static void main(String[] args) {
	    int a[] = {20, 10, 50, 9, 13, 24, 1};
	    
	    int product = 1;
	    
	    for(int i=0; i<a.length;i++){
	        product *= a[i];
	    }
	    System.out.println("product of all elements of array:" + product);
	    }
}