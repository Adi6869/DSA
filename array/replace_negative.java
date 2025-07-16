//Replace all negative numbers with 0 in an array.
class replace_negative {
    public static void main(String[] args) {
        int a[]= {-10,-20,30,40,50};
        
        
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                a[i] = 0;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
