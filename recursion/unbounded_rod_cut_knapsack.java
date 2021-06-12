class HelloWorld {
    public static void main(String[] args) {
        int size[] = {1,2,3,4};
        int values[]  = {1,4,7,4};
        int rod_length = 8;
        System.out.println("max value:"+knapsack(rod_length,size,values,values.length-1));
    }
    
    public static int knapsack(int rod_length, int size[] , int values[], int i)
    {
        if( i == -1 || rod_length == 0)
            return 0;
        if(size[i]>rod_length)
        {
            return knapsack(rod_length, size, values , i-1);
        }
        else
        {
            return Math.max(values[i]+knapsack(rod_length-size[i], size, values , i)
                                ,knapsack(rod_length, size, values , i-1));
        }
    }
}
