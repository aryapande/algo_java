class HelloWorld {
    public static void main(String[] args) {
        String s = "a1B2";
        help(s,"",s.length()-1);
    }
    
    public static void help(String s, String ans, int n)
    {
        if(n<=-1)
        {
            System.out.println(ans);
            System.out.println(); 
            return;
        }
        
        if(s.charAt(n)>='a' && s.charAt(n)<='z')
        {
            help(s,s.charAt(n)+ans,n-1);
            help(s,(char)(s.charAt(n)-32)+ans,n-1);
        }
        else if(s.charAt(n)>='A' && s.charAt(n)<='Z')
        {
            help(s,s.charAt(n)+ans,n-1);
            help(s,(char)(s.charAt(n)+32)+ans,n-1);
        }
        else
        {
            help(s,s.charAt(n)+ans,n-1);
        }
    }
}
