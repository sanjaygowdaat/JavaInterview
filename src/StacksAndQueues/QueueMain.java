package StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
     /*   CustomQueue q = new CustomQueue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.display();
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();*/

        CircularQueue q = new CircularQueue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.display();
        q.remove();
        q.remove();
        q.display();
        q.insert(60);
        q.insert(70);
        q.display();
        q.remove();
        q.remove();
        q.display();
    }
}
