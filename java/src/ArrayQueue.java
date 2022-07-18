
public class ArrayQueue {

    private Integer[] numbers;
    private Integer fPointer = 0;
    private Integer bPointer;

    public ArrayQueue(int length) {
        numbers = new Integer[length];
        bPointer = length - 1;
    }

    public void enqueue(Integer value) {
        var newArray = new Integer[++bPointer];
        for (var x = 0; x < numbers.length; x++) {
            newArray[x] = numbers[x];
        }
        
        newArray[newArray.length - 1] = value;
        numbers = newArray;
    }

    public Integer dequeue() {
        return numbers[fPointer++];
    }

    public boolean isEmpty() {
        return numbers.length == 0;
    }

    public boolean isFull() {
        return fPointer == numbers.length;
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
