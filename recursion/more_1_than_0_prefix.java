class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        String a = "";
        int ones=0;
        int zeros = 0;
        help(a,ones , zeros, n);
    }
    
    public static void help(String a, int ones, int zeros, int n)
    {
        if(n==0)
        {
            System.out.println(a);
            System.out.println();
            return;
        }
        if(zeros<ones)
        {
            help(a+"0", ones, zeros+1, n-1);
        }
        help(a+"1", ones+1, zeros , n-1);
    }
}
