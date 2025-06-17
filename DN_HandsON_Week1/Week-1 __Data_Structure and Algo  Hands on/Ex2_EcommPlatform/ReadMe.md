1>  Big O notation is a mathematical representation used to describe the time or space complexity of an algorithm in terms of input size n.
    Describes the asymptotic behavior (order of growth of time or space in terms of input size) of a function, not its exact value.
    It provides an upper limit on the time taken by an algorithm in terms of the size of the input. We mainly consider the worst case scenario of the algorithm to find its time complexity in terms of Big O

4>Time compplexity :
    1> Linear Search:
        Best Case: In the best case, the key might be present at the first index. So the best case complexity is O(1)
        Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is O(N) where N is the size of the list.
        Average Case: O(N)
    2>Binary Search:
        It works by splitting the array into parts : suppose N size array splitted in N/2 -> n/4 -> n/8 --->1 single element
         1 comparison = 1
        2 comparisons = 2
        3 comparisons = 4
        x comparisons = 2x-1 where x belongs to the range [1, logN] because maximum comparisons = maximum time N can be halved = maximum comparisons to reach 1st element = logN.
        So, total comparisons
        = 1*(elements requiring 1 comparisons) + 2*(elements requiring 2 comparisons) + . . . + logN*(elements requiring logN comparisons)
            = 1*1 + 2*2 + 3*4 + . . . + logN * (2logN-1)
                = 2logN * (logN - 1) + 1
                        = N * (logN - 1) + 1