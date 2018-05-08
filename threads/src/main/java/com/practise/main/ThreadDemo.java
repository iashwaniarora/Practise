package com.practise.main;

/**
 * Created by Ashwani on 5/22/2016.
 */
public class ThreadDemo {

    public static void main(String[] args) {
        PrimeThread primeThread = new PrimeThread(143);
        primeThread.start();

        PrimeThreadRunnable primeThreadRunnable = new PrimeThreadRunnable();
        new Thread(primeThreadRunnable).start();
        }

}
