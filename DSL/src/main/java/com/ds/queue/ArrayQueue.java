package com.ds.queue;

public class ArrayQueue {
	 
	private int front,rear,size;
	private int capacity;
	int[] array;
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.front = 0;
		this.rear = capacity - 1;
		this.array = new int[this.capacity];
	}
	
	public boolean isFull(ArrayQueue queue) {
		return this.size == this.capacity;
	}
	
	public boolean isEmpty(ArrayQueue queue) {
		return this.size == 0;
	}
	
	public void enqueue(int item) {
		if(isFull(this)) {
			return;
		}
		this.rear = (this.rear + 1) % this.capacity;
		this.array[rear] = item;
		this.size = this.size + 1;
	}
	
	public int dequeue() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
	int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
 
        return this.array[this.front];
    }
 
    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
 
        return this.array[this.rear];
    }
}
