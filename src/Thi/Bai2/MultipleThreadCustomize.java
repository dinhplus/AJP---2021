package Thi.Bai2;

public class MultipleThreadCustomize {
	int counter = 0;

    static int N;
    int i = 0;
    int j = 0;
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
	                if(counter == 1) {
	                    System.out.println("--" + counter);
	                    System.out.println("--" + (counter+2));
	                    i = counter + 4;
	                } else {
	                    System.out.println("--" + i);
	                    System.out.println("--" + (i + 2));
	                    i+=4;
	                }
	                counter++;
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
