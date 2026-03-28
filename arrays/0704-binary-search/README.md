# 0704 Binary Search

Pattern: Binary Search

## Approach
Maintain search space [left, right].

- mid = left + (right - left) / 2
- If nums[mid] == target → return index
- If nums[mid] < target → search right half
- Else → search left half

## Time Complexity
O(log n)

## Space Complexity
O(1)