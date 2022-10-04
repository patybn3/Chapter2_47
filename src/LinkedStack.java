
public class LinkedStack<T> implements StackInterface<T>
{
    protected LLNode<T> top;   // reference to the top of this stack
    int getItems;

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

    //custom methods start here
    public String toString()
    {
        String getString = "";
        if(isEmpty())
        {
            System.out.println("Empty stack!");
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

    //whatever number is passed will be popped given that number is within the size
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

    //top two numbers will swap places
    public boolean swapStart()
    {
        T firstElement;
        T sndElement;

        if(top == null || top.getLink() == null)
            return false;
//get the top two element
        firstElement = top.getInfo();
        sndElement = top.getLink().getInfo();
//remove both from the stack now
        pop();
        pop();
//push them back on stack but in reverse order so that swap can occur
        push(firstElement);
        push(sndElement);

    return true;
    }

    public T popTop() {
        if (isEmpty())
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        else {
//get the top most element
            T info = top();
//update the top
            top = top.getLink();
//return topmost element
            return info;
        }
    }
}