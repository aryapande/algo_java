class HelloWorld {
    public static void main(String[] args) {
        // minimum no. of insertion and deletions
        String a ="heaps";
        String b = "peaps";
        int m = a.length();
        int n = b.length();
        int lcs = help(a,b,m-1,n-1);
        int max = Math.max(m,n);
        int min = Math.min(m,n);
        System.out.println("No. of Deletions: "+(max-lcs));
        System.out.println("No. of Insertions: "+(min-lcs));
        
    }
    
    public static int help(String a, String b,int m, int n)
    {
        if(m==-1 || n==-1)
        {
            return 0;
        }
        if(a.charAt(m)==b.charAt(n))
        {
            return 1+help(a,b,m-1,n-1);
        }
        else
        {
            return Math.max(help(a,b,m,n-1),help(a,b,m-1,n));
        }
    }
}
