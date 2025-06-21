1. Recursion is a technique where a function calls itself to solve smaller instances of a problem until it reaches a base case.
It simplifies the problem by - i)It breaks complex problems into simpler sub-problems.
                               ii)Useful in problems with repetitive or nested structure (e.g., computing future value over periods).

4. Analysis of the algo:
Suppose the number of years as N , there fore  the recursive function is called n times :
  T(n)=T(n−1)+O(1) --> O(n)
  So its in the complexity of Big Oh of N .

  Making the algo better : we can use the basuc compound interest formula in a for loop , decresing the modularity but decresing code complexity abd readability ..