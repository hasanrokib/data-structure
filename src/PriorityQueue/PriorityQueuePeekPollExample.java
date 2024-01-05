package PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueuePeekPollExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding integers to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);

        // Peeking at the head element without removing it
        System.out.println("Peeked element: " + priorityQueue.peek());

        // Polling (removing) the head element
        int polledElement = priorityQueue.poll();
        System.out.println("Polled element: " + polledElement);

        // Peeking again after polling
        System.out.println("Peeked element after polling: " + priorityQueue.peek());

        // Polling the remaining elements
        while (!priorityQueue.isEmpty()) {
            System.out.println("Polled element: " + priorityQueue.poll());
        }
    }
}

