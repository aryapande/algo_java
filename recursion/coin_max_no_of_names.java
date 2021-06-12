class HelloWorld {
    public static void main(String[] args) {
        int coin[] = {1,2,3};
        
        int goal = 4;
        System.out.println("max ways:"+change(goal,coin,coin.length-1));
    }
    
    public static int change(int goal, int coin[] , int i)
    {
        if(goal == 0)
            return 1;
        if(goal<0 || i == -1)
            return 0; 
        if(coin[i]>goal)
        {
            return change(goal, coin, i-1);
        }
        else
        {
            return change(goal-coin[i],coin,i) + change(goal,coin,i-1);
        }
    }
}
