## Recursion
- Recursion is when a method solves a problem by calling itself on a smaller version of the same problem and keeps doing that until it reaches a case simple enough to answer
  directly.
- Every recursive method has two parts:
  1. Base case – the stopping condition. It returns an answer with calling itself again.
  2. Recursive case – the method that calls itself with input that moves close to the base case.

- All recursive calls have the following characteristics
  1. The method is implemented using an if-else or a switch statement that leads to different cases
  2. One or more base cases (the simplest case) are used to stop recursion
  3. Every recursive call reduces the original problem, bringing it increasingly closer to the base case until it becomes that case.

- In general, problem-solving using recursion involves breaking down a problem into subproblems. Each subproblem is similar to the original problem, but it is smaller. You can apply the same approach to each subproblem to solve it recursively.
- Recursive programs can run out of memory causing StackOverflowError.

### Tip: Performance Concern
- If you are concerned about your program's performance, avoid using recursion because it takes more time and consumes more memory than iteration.
- In general, recursion can be used to solve inherent recursive problems like Tower of Hanoi, Recursive Directories, and Sierpinski triangles.

### Tail Recursion

- **Tail recursion** is recursion where the recursive call is the very last thing the function does. Nothing happens after it returns.
- **Normal recursion:** the function makes the recursive call first, then uses the returned value to finish its own calculation. Each call has to wait for the next one to come back.
- **Tail recursion:** the function does its calculation first, then passes the partial result into the next call. The last line looks like `return recursiveFunction(params)`.
- **Why it matters:** in tail recursion, once the next call starts, the current call has nothing left to do, so its stack frame is no longer needed.
- **Tail Call Optimization (TCO):** because no work remains after the recursive call, the compiler or runtime can reuse the current stack frame instead of creating a new one. The recursion then uses constant stack space, like a loop, and can't cause a stack overflow.

**Example (factorial):**

```java
// Normal recursion: the multiplication happens AFTER the call returns
int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

// Tail recursion: the result is carried forward in an accumulator
int factorial(int n, int acc) {
    if (n <= 1) return acc;
    return factorial(n - 1, n * acc);
}
// call with factorial(5, 1)
```

> **Note:** not every language performs TCO. Scala, Kotlin (with `tailrec`) and most functional languages do, but Java and Python do not. In Java, a tail-recursive function still adds a stack frame per call, so deep recursion should be rewritten as a loop.