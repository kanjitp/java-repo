public class Locker<T> {
    /**
     *  public class Locker<T> 
     *  indicates that the Locker class must be given a type parameter in its constructor
     *  after the constructor call is executed, all the variables stored in that object are going to 
     *  be of that type.
     */
    private T element;

    public void setValue(T element) {
        this.element = element;
    }

    public T getValue() {
        return this.element;
    }



    
}
