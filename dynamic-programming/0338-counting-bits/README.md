# 0338 Counting Bits

Pattern: DP + Bit Manipulation

## Approach
For each number i:

ans[i] = ans[i >> 1] + (i & 1)

- i >> 1 → removes last bit
- (i & 1) → adds 1 if last bit is set

## Time Complexity
O(n)

## Space Complexity
O(n)