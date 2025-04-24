#include <iostream>
using namespace std;

// A class NODE that will have a parameterized constructor that will initialize val = the given val and next to null
class Node
{
public:
    int val;
    Node *next;

    Node(int value)
    {
        this->val = value;
        this->next = NULL;
    }
};

class List
{
    Node *head;
    Node *tail;

public:
    List()
    {
        head = NULL;
        tail = NULL;
    }

    void push_front(int value)
    {
        Node *newNode = new Node(value);

        // now that we have two cases that this will the first element of the list or their are existing elements in the list
        // so for the first case. -> head will be pointing towards the null
        if (head == NULL)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        else // so if their are already elements in the list.
        {
            newNode->next = head;
            head = newNode;
        }
    }

    void push_back(int value)
    {
        Node *newNode = new Node(value);

        // Check for if the list is empty??
        if (head == NULL)
        {
            head = newNode;
            newNode->next = tail;
            return;
        }

        // suppose if the list is not empty?
        Node *temp = head; // we will take the temp to the last element until temp.next is null.
        while (temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newNode;
    }

    void pop_front()
    {
        if (head == NULL)
        {
            return;
        }

        Node *temp = head; // make a temporary variable
        head = head->next;
        temp->next = NULL;

        delete temp;
    }

    void pop_back()
    {
        if (head == NULL)
        {
            return;
        }
    }

    void display()
    {
        if (head == NULL)
        {
            cout << "List is empty";
            return;
        }
        Node *temp = head;

        cout << "HEAD ";
        while (temp != NULL)
        {
            cout << " -> " << temp->val;
            temp = temp->next;
        }
        cout << " -> TAIL" << endl;
    }
};

int main()
{
    List list;

    list.push_front(34);
    list.push_front(98);
    list.push_front(12);

    list.push_back(69);
    list.push_back(35);
    list.push_back(54);
    list.push_back(12);

    list.push_front(29);

    list.pop_front();
    list.pop_front();
    list.pop_front();
    list.pop_front();
    list.pop_front();
    list.pop_front();

    list.display();

    return 0;
}