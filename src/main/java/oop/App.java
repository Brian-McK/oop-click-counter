package oop;

/**
 * 'Click' Counter
 *  Starter code for demonstrating a simple class.
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("\n*** Counter App ***");

        Counter myCounter = new Counter(10);
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.click();
        myCounter.reset();
        myCounter.display();
        myCounter.click();
        myCounter.click();
        myCounter.undo();
        myCounter.display();
        myCounter.undo();
        myCounter.display();
        myCounter.undo();
        myCounter.display();
        myCounter.click();
        myCounter.display();
        myCounter.undo();
        myCounter.display();

        System.out.println("---------------------------");

        Counter anotherCounter = new Counter();
        anotherCounter.click();
        anotherCounter.undo();
        anotherCounter.undo();
        anotherCounter.click();
        anotherCounter.display();
    }

}
