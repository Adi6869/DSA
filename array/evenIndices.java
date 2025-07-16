//Print elements at even indices in an array.
class evenIndices {
    public static void main(String[] args) {
        int a[]= {10,20,30,40,50};
        
        System.out.println("Element at even indices:");
        
        for(int i=0;i<a.length;i+=2){
            System.out.println("even indices:"+a[i]);
        }
    }
}

