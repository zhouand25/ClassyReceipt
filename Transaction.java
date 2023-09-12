import java.util.Scanner;

public class Transaction {
    public String ID;
    public String firstitem, secitem;
    public double firstprice, secprice;
    public boolean done=false;

    public void hi() {
        System.out.print("Hello");
    }

    public void Customer() {
        hi();
        while(!done) {
            scanItems();
        }
        checkOut();
    }

    public void scanItems() {
        for(int i=0; i<5; ++i) {
            System.out.print("Scan next");
        }
        done=true;
    }

    public void checkOut() {
        System.out.print("Pay: ");
    }
}