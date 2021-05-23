import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        int weights[] = {1,4,2,17};
        int values[]  = {1,5,2,4};
        int limit = 12;
        System.out.println("max value:"+knapsack(limit,weights,values,values.length-1));
    }
    
    public static int knapsack(int limit, int weights[] , int values[], int i)
    {
        if( i == -1 || limit == 0)
            return 0;
        if(weights[i]>limit)
        {
            return knapsack(limit, weights, values , i-1);
        }
        else
        {
            return Math.max(values[i]+knapsack(limit-weights[i],weights,values,i-1)
                                ,knapsack(limit,weights,values,i-1));
        }
    }
}
