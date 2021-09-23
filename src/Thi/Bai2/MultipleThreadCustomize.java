package Thi.Bai2;

public class MultipleThreadCustomize {
	int counter = 0;

    static int N;
	public MultipleThreadCustomize() {
	}

	public MultipleThreadCustomize(int N) {
		this.N = N;
	}
    public void printOddNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("--" + counter);
                counter += 1;
                notify();
            }
        }
    }
    
    public void printEvenNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(counter);

                counter++;

                notify();
            }
        }
    }
}
