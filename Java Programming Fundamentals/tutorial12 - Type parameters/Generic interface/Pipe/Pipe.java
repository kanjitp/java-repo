import java.util.LinkedList;
import java.util.Queue;

public class Pipe<T> {

    private Queue<T> pipe;
 
    public Pipe() {
        this.pipe = new LinkedList<>(); 
    }

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe() {
        return this.pipe.poll();
    }

    public boolean isInPipe() {
        return !this.pipe.isEmpty();
    }


    
}
