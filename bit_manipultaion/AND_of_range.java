class HelloWorld {
    public static void main(String[] args) {
        int m = 15;
        int n = 19;
        int count = 0;
        int a,b;
        while(m!=n)
        {
            m = m>>1;
            n = n>>1;
            count++;
            System.out.println(m);
            System.out.println(n);
            System.out.println("count: "+count);
            System.out.println();
        }
         int t = Integer.valueOf(bit(m))*((int)Math.pow(10,count));
        System.out.println(t); 
    }
    public static String bit(int x)
    {
        System.out.println("in bit: "+x);
        int n = 0;
        int a;
        String b="";
        while(x>0)
        {
            a = x%2;
            b = a+b;
            x = x/2;
        }
        if(b.compareTo("")==0)
            return "0";
        return b;
    }
}
