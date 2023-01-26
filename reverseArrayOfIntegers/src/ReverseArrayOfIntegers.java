import java.util.EmptyStackException;
import java.util.LinkedList;

public class ReverseArrayOfIntegers<T> {
    private final LinkedList<T> stack;

    public ReverseArrayOfIntegers() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "stack= " + stack;
    }
}
