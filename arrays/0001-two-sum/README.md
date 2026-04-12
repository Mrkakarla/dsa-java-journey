# 0001 Two Sum

Pattern: HashMap

## Approach
For each element:
- Compute complement = target - num
- If complement exists in map → return indices
- Else store num → index

## Time Complexity
O(n)

## Space Complexity
O(n)