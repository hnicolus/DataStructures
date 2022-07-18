
public class App {
    public static void main(String[] args) throws Exception {
        var queue = new PriorityQueue();
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(6);
        queue.enqueue(2);

        System.out.println(queue.toString());
    }
}
