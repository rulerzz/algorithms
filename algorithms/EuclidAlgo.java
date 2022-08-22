package algorithms;

import java.util.Scanner;

public class EuclidAlgo {

    private int m;
    private int n;

    EuclidAlgo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of M : ");
        m = sc.nextInt();

        System.out.println("Enter the value of N : ");
        n = sc.nextInt();

        System.out.println("Calculating GCD...");
        System.out.println("GCD is " + calculateGCD());
    }
    private int calculateGCD(){
        int r = m % n; // Calculate Remainder

        if(r != 0){    // If r != 0 m->n n->r return to calculateGCD
            m = n;
            n = r;
            r = calculateGCD(); // store result in r
        }

        return n;   // if r == 0 answer is n
    }
    public static void main(String[] args) {
        EuclidAlgo object = new EuclidAlgo();
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
