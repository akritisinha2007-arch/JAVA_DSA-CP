public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-- > 0){
        int n=sc.nextInt();
        String s=sc.next();
        if(s.contains("...")){
            System.out.println(2);
        }
        else{
            int c=0;
            for(char f:s.toCharArray()){
                if(f=='.'){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
