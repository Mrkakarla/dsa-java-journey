# 0020 Valid Parentheses

## Pattern
Stack

## Approach
Use a stack to track brackets.

Push expected closing brackets when opening brackets appear.
When a closing bracket appears, check the stack.

If mismatch occurs → invalid.

## Time Complexity
O(n)

## Space Complexity
O(n)