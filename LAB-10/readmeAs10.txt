Thread Example
This code demonstrates the use of threads in Java.

How it works
The ThreadExample class implements the Runnable interface, which contains the run() method. The run() method contains the code that will be executed in the thread.

In the main() method, a new thread is created using the Thread class and passing an instance of ThreadExample as an argument to its constructor. The setPriority() method sets the thread's priority to the highest value. The start() method is called to start the execution of the thread.

The join() method is called to wait for the thread to complete its execution. The getName(), getPriority(), getState(), and isAlive() methods of the thread are then used to display information about the thread.

Output
The output of this program will be:

Thread is running...
Thread completed
Thread name: Thread-0
Thread priority: 10
Thread state: TERMINATED
Thread is alive: false
Conclusion
Threads can be used to execute multiple tasks simultaneously in a single program. By using threads, we can increase the performance of our program and make it more responsive.