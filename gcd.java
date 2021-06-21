// a is bigger and b is smaller number, also called hcf of a number
public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
