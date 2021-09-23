package Thi.Bai2;


public class Main {
    public static void main(String[] args)
    {
        int N = 100;

        MultipleThreadCustomize mt = new MultipleThreadCustomize(N);

        Thread thread1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run()
            {
            	mt.printOddNumber();
            }
        });

        thread1.start();
        thread2.start();
    }
}

