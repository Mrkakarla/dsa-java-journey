# 0258 Add Digits

Pattern: Math (Digital Root)

## Approach
Repeatedly add digits until a single digit remains.

Optimized using digital root formula:

if num == 0 → return 0  
else → return 1 + (num - 1) % 9

## Time Complexity
O(1)

## Space Complexity
O(1)