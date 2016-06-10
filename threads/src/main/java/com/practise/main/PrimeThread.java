package com.practise.main;

/**
 * Created by Ashwani on 5/22/2016.
 */
public class PrimeThread extends  Thread {
    long minPrime;

    PrimeThread(long minPrime)
    {
        this.minPrime = minPrime;
    }

    @Override
    public void run()
    {
        long nextPrimeNum=minPrime+1;
        long divisor=1;
        while(true)
        {
            if(divisor<nextPrimeNum) {
                divisor = divisor + 1;
                nextPrimeNum++;
                if (nextPrimeNum % divisor == 0) {
                    continue;
                }
                else
                {
                    System.out.println("Next prime number is " + nextPrimeNum);
                    break;
                }

            }

                divisor = 1;
                nextPrimeNum++;

        }
    }
}
