# 0088 Merge Sorted Array

Pattern: Two Pointers (Reverse)

## Approach
Start merging from the end to avoid overwriting.

- i → end of nums1 valid part
- j → end of nums2
- k → end of nums1 total size

Fill from back.

## Time Complexity
O(m + n)

## Space Complexity
O(1)