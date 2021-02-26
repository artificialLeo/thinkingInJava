package com.company.holdingYourObjects;

import java.util.PriorityQueue;

class Dummy {}

public class PriorityQueueSubtlety {
    public static void main(String[] args) {
        PriorityQueue<Dummy> priorityQueue =
                new PriorityQueue<Dummy>();
        System.out.println("Adding 1st instance...");
        priorityQueue.offer(new Dummy());
        System.out.println("Adding 2nd instance...");
        priorityQueue.offer(new Dummy());
    }
}
