public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill=25;
        int total;
        int bonus;
        if ( refill>1000 ) ;
            bonus = refill / 100;
            total = balance + refill;
        if ( refill<=1000 )
            bonus = 0;
            total = balance + refill;
            System.out.println(bonus);
            System.out.println(total);
        }
        }



