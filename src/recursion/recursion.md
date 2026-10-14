## Recursion
- Recursion is when a method solves a problem by calling itself on a smaller version of the same problem and keeps doing that until it reaches a case simple enough to answer
  directly.
- Every recursive method has two parts:
  1. **Base case** – the stopping condition. It returns an answer without calling itself again.
  2. **Recursive case** – the method calls itself with input that moves closer to the base case.

**Example (sum of 1 to n):**

```java
int sum(int n) {
    if (n == 0) return 0;        // base case: nothing left to add
    return n + sum(n - 1);       // recursive case: n gets smaller each call
}
// sum(3) -> 3 + sum(2) -> 3 + 2 + sum(1) -> 3 + 2 + 1 + sum(0) -> 6
```

- All recursive calls have the following characteristics
  1. The method is implemented using an if-else or a switch statement that leads to different cases
  2. One or more base cases (the simplest case) are used to stop recursion
  3. Every recursive call reduces the original problem, bringing it increasingly closer to the base case until it becomes that case.

**Example (Fibonacci – two base cases):**

```java
long fib(int n) {
    if (n == 0) return 0;                // base case 1
    else if (n == 1) return 1;           // base case 2
    else return fib(n - 1) + fib(n - 2); // recursive case: two smaller problems
}
```

- In general, problem-solving using recursion involves breaking down a problem into subproblems. Each subproblem is similar to the original problem, but it is smaller. You can apply the same approach to each subproblem to solve it recursively.

**Example (palindrome):** a string is a palindrome if its first and last characters match **and** the string in between is also a palindrome.

```java
boolean isPalindrome(String s) {
    if (s.length() <= 1) return true;                            // base case
    if (s.charAt(0) != s.charAt(s.length() - 1)) return false;   // base case
    return isPalindrome(s.substring(1, s.length() - 1));         // smaller subproblem
}
// isPalindrome("level") -> isPalindrome("eve") -> isPalindrome("v") -> true
```

- Recursive programs can run out of memory causing `StackOverflowError`. Every call adds a frame to the call stack, and if the base case is missing or never reached, the stack fills up.

```java
int badSum(int n) {
    return n + badSum(n - 1);   // no base case -> StackOverflowError
}
```

### What is a Stack Frame?

- **Stack frame:** the memory a method call gets to store its parameters, local variables and where to return to.
- **Call stack:** a pile of frames. Each call pushes a frame on top; each return pops it off.
- In recursion, every call waits for the next one to return, so its frame stays on the stack. Each frame keeps its own copy of `n`.

```
sum(3) call stack at its deepest:

| sum(0)  n=0 |  ← top, returns first
| sum(1)  n=1 |
| sum(2)  n=2 |
| sum(3)  n=3 |
| main        |
```

> **Note:** the stack has a fixed size. Too many frames at once (deep recursion or a missing base case) → `StackOverflowError`. A loop uses just one frame.

### Tip: Performance Concern
- If you are concerned about your program's performance, avoid using recursion because it takes more time and consumes more memory than iteration.
- In general, recursion can be used to solve inherent recursive problems like Tower of Hanoi, Recursive Directories, and Sierpinski triangles.

**Example (wasted work):** `fib(5)` calls `fib(3)` twice and `fib(2)` three times. The number of calls roughly doubles with each increase in `n`, so `fib(50)` is already very slow.

```
                fib(5)
              /        \
          fib(4)        fib(3)
         /     \        /    \
     fib(3)  fib(2)  fib(2)  fib(1)
     ...
```

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

### Recursion vs Iteration

- **Iteration** repeats a block of code using a loop (`for`, `while`) until a condition becomes false.
- **Recursion** repeats work by having a method call itself until it reaches a base case.
- **Anything recursive can be written iteratively** and vice versa. The choice is about clarity and performance.
- **How they stop:** iteration stops when the loop condition is false; recursion stops when it hits the base case.
- **Memory:** a loop reuses the same variables, so it uses constant memory. Recursion adds a new stack frame for every call, so memory grows with the depth of the recursion.
- **Speed:** each method call has overhead (creating the frame, passing arguments, returning), so iteration is usually faster.
- **Failure mode:** a bad loop condition gives an infinite loop; a bad base case gives a `StackOverflowError`.
- **Readability:** recursion is often shorter and clearer for problems that are naturally recursive (trees, directories, Tower of Hanoi, divide and conquer). Iteration is clearer for simple, step-by-step repetition (counting, summing a list).

**Example (factorial):**

```java
// Recursive: the method calls itself
int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

// Iterative: a loop does the repeating
int factorial(int n) {
    int result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}
```

| | Recursion | Iteration |
|---|---|---|
| Repeats using | Method calls itself | Loop (`for`, `while`) |
| Stops when | Base case is reached | Loop condition is false |
| Memory | Grows with each call (stack frames) | Constant |
| Speed | Slower (call overhead) | Faster |
| If it goes wrong | `StackOverflowError` | Infinite loop |
| Best for | Naturally recursive problems (trees, directories, Hanoi) | Simple repetition (counting, summing) |

> **Rule of thumb:** start with whichever version is easier to read. Switch to iteration if the input can be large enough to make the recursion deep, or if performance matters.
