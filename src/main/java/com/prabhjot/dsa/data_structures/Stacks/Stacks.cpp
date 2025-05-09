#include <iostream>
using namespace std;

#define MAX 5

class Stack
{
public:
    int arr[MAX];
    int top;

    Stack() : top(-1) {}

    void push(int val)
    {
        arr[top] = val;
        top++;
    }

    void pop()
    {
        top--;
    }

    bool isEmpty()
    {
        return (top == 0);
    }

    bool isFull()
    {
        return top == 4;
    }

    void top()
    {
        cout << arr[top];
    }
};

int main()
{
    Stack st;
    st.push(5);
    st.pop();
    return 0;
}