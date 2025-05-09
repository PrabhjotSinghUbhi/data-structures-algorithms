#include <iostream>
using namespace std;

class LinkedList
{
private:
    class Node
    {
    public:
        int val;
        Node *next;

        Node(int val) : val(val), next(nullptr) {}
        Node(int val, Node *next) : val(val), next(next) {}
    };

    Node *head;
    Node *tail;
    int size;

public:
    LinkedList() : head(nullptr), tail(nullptr), size(0) {};

    void insertAtFirst(int val)
    {
        Node *node = new Node(val);

        node->next = head;
        head = node;

        if (tail == NULL)
        {
            tail = head;
        }

        size++;
    }

    void display()
    {
        Node *temp = head;

        cout << "Head -> ";
        while (temp != nullptr)
        {
            cout << temp->val << " -> ";
            temp = temp->next;
        }
        cout << " Tail ";
    }

    void insertAtLast(int val)
    {

        if (head == nullptr)
        {
            insertAtFirst(val);
        }
        else
        {
            Node *node = new Node(val);

            tail->next = node;
            tail = node;
            size++;
        }
    }

    void insertAt(int pos, int val)
    {
        if (pos == 0)
        {
            insertAtFirst(val);
        }
        else if (pos == size)
        {
            insertAtLast(val);
        }
        else
        {
            Node *node = new Node(val);
            Node *temp = head;

            for (int i = 0; i < pos - 1; i++)
            {
                temp = temp->next;
            }

            node->next = temp->next;
            temp->next = node;

            size++;
        }
    }

    int deleteAtFirst()
    {
        if (head == nullptr)
        {
            throw runtime_error("list is empty");
        }

        int value = head->val;
        Node *temp = head;
        head = head->next;

        delete temp;
        size--;
        return value;
    }

    Node *getNode(int index)
    {

        Node *temp = head;

        for (int i = 0; i < index; i++)
        {
            temp = temp->next;
        }

        return temp;
    }

    int deleteAtLast()
    {
        if (size <= 1)
        {
            deleteAtFirst();
        }
        else
        {
            Node *prev = getNode(size - 1);
            tail = prev;
            tail->next = nullptr;

            size--;
        }
    }

    void deleteAt(int index)
    {

        if (index == 0)
        {
            deleteAtFirst();
        }
        else if (index = size - 1)
        {
            deleteAtLast();
        }
        else
        {
            Node *node = getNode(index - 1);
            node->next = node->next->next;
            Node *toDelete = node->next;

            delete toDelete;
            size--;
        }
    }

    ~LinkedList()
    {
        while (head != nullptr)
        {
            deleteAtFirst();
        }
    }
};

int main()
{
    LinkedList ll;
    ll.insertAtFirst(9);
    ll.insertAtFirst(8);
    ll.insertAtFirst(7);
    ll.insertAtFirst(6);
    ll.insertAtFirst(5);
    ll.insertAt(3, 878);

    ll.insertAtLast(69);

    ll.deleteAtFirst();
    ll.deleteAtFirst();

    ll.display();
    return 0;
}