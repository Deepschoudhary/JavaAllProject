package Thread_States;

public class Thread_States_Notes {
}

// todo == A java thread is always in the one of several states which could be running , sleeping,dead,etc.
// todo == States: 1. New thread 2. Runnable 3. Not Runnable 4. Dead
// todo == New Thread * A thread is in this state when the installation of a thread object creates a new thread but does not start it running .
// todo == * A thread starts life in the ready-to-run-state.
// todo == you can call only the start() or stop() methods when the thread in this state.
// todo == calling any methods besides start() or stop() causes an illegalThreadStateException.(A descendant class of RuntimeException.)






// todo == Runnable when the start() methods is invoked on  a new thread() it gets to the runnable state or running state by calling the run() method.
// todo == a runnable thread may actually be running, or may be awaiting its turn` to run.
// Not Runnable!
// todo == A thread becomes not runnable when one of the following four events occurs..
// todo == when sleep() method is invoked and it sleeps for a specified amount of time.
// todo == when the wait() method is invoked and the thread waits for notification of a free resource of wait for the completion of another thread or waits for the completion of another thread or waits to acquire a lock of an object..
// todo == the thread is blocking on i/O and waits for its completion.
// Dead State
// Todo == A thread enters this state when the run() method has finished executing or when the stop() method is invoked. once in this state, the thread cannot ever run again
