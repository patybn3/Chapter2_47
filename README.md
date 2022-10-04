<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 2 - Exercise 47 - based on 28 </h5>

####variables used:

```java
        LNode item = top;
        int size = 0;
        T firstElement;
        T sndElement;
        T item = top();
    
```
####Program also uses the Scan function from `java.util.*` library to take the user's input.

###Methods added to `LinkedStack.java` as required:

a. `String toString()` creates and returns a string that correctly represents
the current stack. Such a method could prove useful for testing and debugging
the class and for testing and debugging applications that use the class. Assume
each stacked element already provided its own reasonable `toString` method.<br>
```java
    public String toString();     //will loop the array, turn it to a string and print it
```
b. `int size()` returns a count of how many items are currently on the stack. Do
not add any instance variables to the `ArrayBoundedStack` class in order to
implement this method.
```java
    public int size();           //will print the array size
```
c. `void popSome(int count`) removes the top count elements from the
stack; throws `StackUnderflowException` if there are less than count elements
on the stack .
```java
    public void popSome(int count);      //user can select how many elements to pop
```

d. `boolean swapStart()` if there are less than two elements on the stack returns
false; otherwise it reverses the order of the top two elements on the
stack and returns true.
```java
  public boolean swapStart()        //To swap the top 2 elements
```
e. `T poptop( )` — the “classic” pop operation, if the stack is empty it throws
`StackUnderflowException`; otherwise it both removes and returns the top
element of the stack.
```java
  public T poptop();         
```

###Main class: Chapter2_47_PatriciaAntlitz.java

-
```java
public void userSelection();      //this method holds all the calls to the methods in ArrayBoundedStack.java, user inputs and conditional statements
```

<hr>
<h5>Problems:</h5>

Everything was a problem, literally. This was hard. I had to look for sources, examples:
<br>
https://learn.microsoft.com/en-us/dotnet/api/system.collections.generic.linkedlist-1?view=net-6.0 <br>

https://www.javatpoint.com/java-program-to-insert-a-new-node-at-the-beginning-of-the-singly-linked-list <br>

I also worked with a tutor for swapStart() and toString()
<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter2_28_ArrayBounded_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter2_47_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter2_47_PatriciaAntlitz.java => compile
    * java Chapter2_47_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)