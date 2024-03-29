public class LinkedStack<T> implements StackInterface<T>
{
    protected LLNode<T> top;   // reference to the top of this stack

    public LinkedStack()
    {
        top = null;
    }

    public void push(T element)
    // Places element at the top of this stack.
    {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.setLink(top);
        top = newNode;
    }

    public void pop()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    {
        if (isEmpty())
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        else
            top = top.getLink();
    }

    public T top()
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element of this stack.
    {
        if (isEmpty())
            throw new StackUnderflowException("Top attempted on an empty stack.");
        else
            return top.getInfo();
    }

    public boolean isEmpty()
    // Returns true if this stack is empty, otherwise returns false.
    {
        return (top == null);
    }

    public boolean isFull()
    // Returns false - a linked stack is never full
    {
        return false;
    }

    //prints stack by turning it into a string
    public String toString()
    {
        String getString = "";
        //exception
        if(isEmpty())
        {
            System.out.println("Error. Stack is Empty.");
        }

        LLNode item = top;

        while(item != null)
        {
            getString = (String) item.getInfo();
            System.out.print(getString + " ");
            item = item.getLink();
        }
        System.out.println();
        return getString;
    }

    public int size()
    {
        LLNode item = top;
        int size = 0;

        do
        {
            size++;
            item = item.getLink();
        }
        while(item != null);

        return size;
    }

    public void popSome(int count)
    {
        LLNode item = top;
        for(int i = count; i > 0; i--)
        {
            if(item != null)
                pop();

            item = item.getLink();
        }
    }

    public boolean swapStart()
    {
        T firstElement;
        T sndElement;

        if(top == null || top.getLink() == null)
            return false;
        firstElement = top.getInfo();
        sndElement = top.getLink().getInfo();
        pop();
        pop();
        push(firstElement);
        push(sndElement);

    return true;
    }

    public T popTop() {
        if (isEmpty())
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        else {
            T item = top();
            top = top.getLink();
            return item;
        }
    }
}