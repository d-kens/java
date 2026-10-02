### Recursion
- Recursion is when a method solves a problem by calling itself on a smaller version of the same problem, and keeps doing that until it reaches a case simple enough to answer
  directly.
- Every recursive method has two parts:
  1. Base case – the stopping condition. It returns an answer with calling itself again.
  2. Recursive case – the method that calls itself with input that moves close to the base case.

- All recursive calls have the following characteristics
  1. The method is implemented using an if-else or a switch statement that leads to different cases
  2. One or more base cases (the simplest case) are used to stop recursion
  3. Every recursive call reduces the original problem, bringing it increasingly closer to the base case until it becomes that case.

- In general, problem-solving using recursion involves breaking down a problem into subproblems. Each subproblem is similar to the original problem, but it is smaller. You can apply the same approach to each subproblem to solve it recursively.