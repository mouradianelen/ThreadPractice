package StoppingThread;

import java.util.concurrent.atomic.AtomicBoolean;

public class CustomThread extends Thread{
    boolean stop = false;

    public void run()
    {
        System.out.println("Thread is running");
        int i = 0;
        while(i < 10)
        {
            System.out.println("i: " +i);
            if(i == 5)
                if(stop == true) // Come out of run() method.
                    return;
            i = i + 1;
        }
    }


}
