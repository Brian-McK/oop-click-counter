package oop;

// Counter is a simulation of a "click-counter" device that
// is used to count people passing through an entrance etc.
// Each click will add one to the counter's count

public class Counter {
    private int count;  // current count , initially 0
    private final int limit;

    // Constructor
    public Counter(int limit) {
        this.limit = limit; // 'this.' distinguishes field from parameter
        System.out.println("Counter constructor called, limit set to " + this.limit);
    }

    public Counter() {   // no-argument (default) constructor
        this.count = 0;
        this.limit = 10;
    }

    public int getCount() {
        return this.count;
    }

    /**
     * click() increments the value of this counter by 1.
     */
    public void click() {
        if (this.count < this.limit) {
            this.count = this.count + 1;
        } else {
            System.out.println("Limit Reached");
        }
        System.out.println("Counter clicked! count = " + this.count);
    }

    public void reset()
    {
        this.count = 0;
    }

    public void undo()
    {
        if(this.count != 0)
        {
            this.count -= 1;
        }
    }

    public void display() {
        System.out.println("Display count, count = " + this.count );
    }
}
