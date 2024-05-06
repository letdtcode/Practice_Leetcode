#include <iostream>
#include <queue>
using namespace std;

class MyStack
{
public:
    MyStack()
    {
    }

    void push(int x)
    {
    }

    int pop()
    {
    }

    int top()
    {
    }

    bool empty()
    {
    }
};

class Queue
{
private:
    int front;
    int rear;
    int size;
    int *Q;

public:
    Queue()
    {
        this->front = this->rear = 0;
        this->size = 10;
        this->Q = new int[size];
    }
    Queue(int size)
    {
        this->front = this->rear = 0;
        this->size = size;
        this->Q = new int[this->size];
    }
    void enqueue(int x);
    int dequeue();
    int top();
    bool empty();
    void display();
};

void Queue::enqueue(int x)
{
    if ((rear + 1) % size == front)
        printf("Queue is full");
    else
    {
        rear = (rear + 1) % size;
        Q[rear] = x;
    }
}

int Queue::dequeue()
{
    int result = -1;
    if (front == rear)
    {
        printf("Queue is empty");
    }
    else
    {
        front = (front + 1) % size;
        result = Q[front];
    }
    return result;
}

int Queue::top()
{
    int result = -1;
    if (front == rear)
    {
        printf("Queue is empty");
    }
    else
    {
        result = Q[front + 1];
    }
    return result;
}

bool Queue::empty()
{
    if (front == rear)
        return true;
    return false;
}