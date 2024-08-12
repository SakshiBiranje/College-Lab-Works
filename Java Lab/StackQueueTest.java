import java.util.Scanner;

// Define the StackInterface
interface Stack 
{
    void push(int value);
    int pop();
    void displayStack();
}

// Define the QueueInterface
interface Queue 
{
    void enqueue(int value);
    int dequeue();
    void displayQueue();
}

// Implement both interfaces in the StackQueue class
class StackQueue implements Stack, Queue
 {
    private static final int MAX_SIZE = 100;
    private int[] stack;
    private int top;
    private int front, rear, size;
    private int[] queue;

    public StackQueue() 
    {
        stack = new int[MAX_SIZE];
        top = -1;
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Stack Methods
    
    public void push(int value) 
    {
        if (top >= MAX_SIZE - 1) 
        {
            System.out.println("Stack overflow");
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " to stack");
        }
    }

    
    public int pop() 
    {
        if (top < 0) 
        {
            System.out.println("Stack underflow !!");
            return -1;
        } else {
            return stack[top--];
        }
    }

    
    public void displayStack() 
    {
        if (top < 0) 
        {
            System.out.println("Stack is empty !!");
        } else
        {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) 
            {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Queue Methods
    
    public void enqueue(int value) 
    {
        if (size == MAX_SIZE) 
        {
            System.out.println("Queue overflow !!");
        } else {
            rear = (rear + 1) % MAX_SIZE;
            queue[rear] = value;
            size++;
            System.out.println("Enqueued " + value + " to queue");
        }
    }

    
    public int dequeue() 
    {
        if (size == 0) 
        {
            System.out.println("Queue underflow !!");
            return -1;
        } else 
        {
            int value = queue[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            return value;
        }
    }

    
    public void displayQueue() 
    {
        if (size == 0) 
        {
            System.out.println("Queue is empty !!");
        } else 
        {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) 
            {
                System.out.print(queue[(front + i) % MAX_SIZE] + " ");
            }
            System.out.println();
        }
    }
}

// Test class with the main method
public class StackQueueTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        StackQueue sq = new StackQueue();
        int choice, value;

        do 
        {
            System.out.println("Choose an operation:");
            System.out.println("1. Stack Operations");
            System.out.println("2. Queue Operations");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    int stackChoice;
                    do 
                    {
                        System.out.println("Stack Operations:");
                        System.out.println("1. Push to Stack");
                        System.out.println("2. Pop from Stack");
                        System.out.println("3. Display Stack");
                        System.out.println("4. Go Back");
                        stackChoice = scanner.nextInt();

                        switch (stackChoice) 
                        {
                            case 1:
                                System.out.print("Enter value to push: ");
                                value = scanner.nextInt();
                                sq.push(value);
                                break;
                            case 2:
                                System.out.println("Popped from stack: " + sq.pop());
                                break;
                            case 3:
                                sq.displayStack();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    } while (stackChoice != 4);
                    break;

                case 2:
                    int queueChoice;
                    do 
                    {
                        System.out.println("Queue Operations:");
                        System.out.println("1. Enqueue to Queue");
                        System.out.println("2. Dequeue from Queue");
                        System.out.println("3. Display Queue");
                        System.out.println("4. Go Back");
                        queueChoice = scanner.nextInt();

                        switch (queueChoice) 
                        {
                            case 1:
                                System.out.print("Enter value to enqueue: ");
                                value = scanner.nextInt();
                                sq.enqueue(value);
                                break;
                            case 2:
                                System.out.println("Dequeued from queue: " + sq.dequeue());
                                break;
                            case 3:
                                sq.displayQueue();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    } while (queueChoice != 4);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);

        scanner.close();
    }
}
