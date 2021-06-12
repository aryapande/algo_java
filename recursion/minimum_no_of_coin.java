class HelloWorld {
    public static void main(String[] args) {
        int coin[] = {1,2,3,6};
        
        int goal = 6;
        System.out.println("min ways:"+change(goal,coin,coin.length-1));
    }
    
    public static int change(int goal, int coin[] , int i)
    {
        if(goal <= 0)
            return 0;
        if(i<0)
        {
            return 643;// any high number
        }
        
        if(coin[i]>goal)
        {
            return change(goal, coin, i-1);
        }
        else
        {
            return Math.min(1+change(goal-coin[i],coin,i),change(goal,coin,i-1));
        }
    }
}
