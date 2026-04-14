# 0231 Power of Two

Pattern: Bit Manipulation

## Approach
A power of two has only one set bit.

n & (n - 1) removes the lowest set bit.

If result is 0 → only one set bit → power of two.

## Time Complexity
O(1)

## Space Complexity
O(1)