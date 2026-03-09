# 0013. Roman to Integer

## Problem
Convert a Roman numeral to an integer.

## Approach
1. Map each Roman character to its value.
2. Traverse the string from left to right.
3. If current value < next value → subtract it.
4. Otherwise → add it.

Example:
IV → 5 - 1 = 4

## Time Complexity
O(n)

## Space Complexity
O(1)

## Pattern
HashMap + Greedy