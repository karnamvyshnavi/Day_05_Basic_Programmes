package com.Bridgelabz;


import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int flipTimes=sc.nextInt();
        System.out.println("No of flipTimes is :"+flipTimes);

        Random random=new Random();
        int heads=0,tails=0;
        for(int i=0;i<flipTimes;i++)
        {
            int rand=random.nextInt(2);
            if(rand==0)
            {
                heads=heads+1;
                System.out.println("Heads");
            }
            else
            {
                tails+=1;
                System.out.println("Tails");
            }
        }
        System.out.println("percentage of Heads  is:"+heads);
        System.out.println("percentage of Tails  is:"+tails);
        System.out.println("percentage of heads is :"+((heads*100)/10)+"%");
        System.out.println("percentage of tails is :"+(tails*100)/10+"%");
    }


}
