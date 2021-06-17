class HelloWorld {
    public static void main(String[] args) {
        String a = "ar";
        help(a,"");
    }
    
    public static void help(String a, String res)
    {
        if(a.length()==0)
        {
            System.out.println(res);
            System.out.println();
            return;
        }
        for(int x=0;x<a.length();x++)
        {
            char ch = a.charAt(x);
            String remain = a.substring(0,x) + a.substring(x+1);
            help(remain , res+ch);
        }
    }
}
