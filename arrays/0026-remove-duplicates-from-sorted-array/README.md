# 0026. Remove Duplicates from Sorted Array

## 📝 Problem
Given a sorted array `nums`, remove duplicates in-place such that each element appears only once and return the new length.

## 💡 Approach
- Use two pointers.
- `i` tracks unique elements.
- `j` scans the array.
- When a new unique element is found, move `i` forward and update.

## ⏱ Time Complexity
O(n)

## 📦 Space Complexity
O(1)

## ⚠ Edge Cases
- Empty array
- All elements same
- No duplicates