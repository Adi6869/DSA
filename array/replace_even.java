//Replace all even numbers with -1.
class replace_even {
    public static void main(String[] args) {
        int a[]= {10,25,30,47,50};
        
        
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                a[i] = -1;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
