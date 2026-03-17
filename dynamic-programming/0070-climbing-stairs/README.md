# 0070 Climbing Stairs

Pattern: Dynamic Programming (Fibonacci)

Approach:
Each step can come from 1 step before or 2 steps before.

f(n) = f(n-1) + f(n-2)

Optimized using two variables (space optimization).

Time Complexity: O(n)  
Space Complexity: O(1)