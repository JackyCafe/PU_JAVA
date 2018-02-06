package code_0206;

import java.util.Arrays;
import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        int limit = 10 ;
        int [] temp = new int [limit*limit*limit];
        int [] ugly_number = new int [limit*limit*limit];
        int h = 0;
        for (int i = 1 ;i<limit;i*=2)
        {
            for (int j = 1 ;j<limit;j*=3)
            {
                for(int k = 1;k <limit ;k*=5)
                {
                    temp[h++] = i*j*k;

                }
            }
        }

        h = 0;
        Arrays.sort(temp);
        for (int a:temp) {
            if (a != 0)
                ugly_number[h++] = a;
        }

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int y = 0; y<x;y++)
            System.out.print(ugly_number[y]+"\t");

    }
}
