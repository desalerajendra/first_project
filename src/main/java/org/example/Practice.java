package org.example;

public class Practice {
    public static void main(String []args)
    {
        int n = 7;
        for(int i = 0;i<=7 ; i++)
        {
            for(int k = i ; k < n ; k++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i;j++)
            {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
}
