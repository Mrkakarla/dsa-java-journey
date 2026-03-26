# 0905 Sort Array By Parity

Pattern: Two Pointers (Bidirectional)

## Approach
Use two pointers:

- left → start
- right → end

If left is odd and right is even → swap

Move pointers:
- if left is even → left++
- if right is odd → right--

## Time Complexity
O(n)

## Space Complexity
O(1)