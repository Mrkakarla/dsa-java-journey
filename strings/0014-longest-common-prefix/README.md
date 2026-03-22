# 0014 Longest Common Prefix

Pattern: String

## Approach
Take first string as prefix.

Compare with each string:
- If mismatch → reduce prefix
- Continue until all match

## Time Complexity
O(n * m)

## Space Complexity
O(1)