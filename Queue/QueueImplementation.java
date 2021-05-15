
public class QueueImplementation {
    public static void main(String... args) {
        Queue1 q = new Queue1();
        System.out.println(q.add(11));
        System.out.println(q.add(12));
        System.out.println(q.add(13));
        System.out.println(q.add(14));
        q.remove();
        System.out.println(q.peek());

    }
}

class Queue1 {
    int front, rear;
    int queue[] = new int[1000];

    public Queue1() {
        front = -1;
        rear = -1;
    }

    public String add(int value) {
        if (rear == 999) {

            return "Queue Overflow";
        } else {

            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[rear] = value;
                return "pushed";
            } else if (front == 0 && rear == 0) {
                rear++;
                queue[rear] = value;
                return "pushed";
            } else {
                rear++;
                queue[rear] = value;
                return "pushed";
            }

        }
    }

    public int remove() {
        if (rear == -1 || front == -1) {
            return -1;
        } else {
            front++;

            return queue[front];
        }
    }

    public int peek() {
        if (rear == -1) {
            return -1;
        } else {
            return queue[front];
        }
    }
}
