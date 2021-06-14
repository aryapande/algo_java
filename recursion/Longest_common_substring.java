class HelloWorld {
    public static void main(String[] args) {
        String a = "abcegh";
        String b = "abehg";
        int m = a.length();
        int n = b.length();
        
        System.out.println(help(a,b,m-1,n-1,0));
    }
    
    public static int help(String a, String b, int m , int n, int count)
    {
        
        if(m==-1 || n == -1)
            return count;
        
        if(a.charAt(m) == b.charAt(n))
        {
            return help(a,b,m-1,n-1,count+1);
        }
        else
        {
            int c = help(a,b,m,n-1,0);
            int d = help(a,b,m-1,n,0);
            return Math.max(count,Math.max(c,d));
        }
        
    }
}
