

# volatile 

* Computers have multiple processors have seperate memory or local chache of variables
* threads may see value from local cache
* Reordering may be assumed by compiler,instructions , cpu
* volatile stops reordering 

* volatile keyword make sure visible to next thread only last updated value
* it does not protect from updates only visibility and does not become atomicity
* makes sure only last written value not protected from unpredictable updates
* It is not thread safe and only for visibility


```java
package simple;

package simple;

class Worker implements Runnable {
    private volatile boolean done = false;

    public void requestStop() {
        done = true;
    }

    @Override
    public void run() {
        long loops = 0;
        while (!done) {
            loops++;
        }
        System.out.println("Worker stopped after " + loops + " loops");
    }
}

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        Thread t = new Thread(worker);
        t.start();

        Thread.sleep(1000);
        worker.requestStop();   // main thread writes done = true
        t.join();
        System.out.println("Main finished");
    }
}

```

# final 

* final keyword make sure that reference dont change but value can change if it is mutable
* final keyword on immutable type is thread safe
* final keyword on mutable types  is not thread safe
* fields are final no change in reference after construction
