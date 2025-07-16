class positive_negative {
    public static void main(String[] args) {
        int a[]= {-10,-20,30,40,50};
        
        int positive =0;
        int negative = 0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
         System.out.println("positive numbers:"+positive);
            System.out.println("negative numbers:"+negative);
    }
}

