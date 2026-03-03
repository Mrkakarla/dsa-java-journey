# 0003. Longest Substring Without Repeating Characters

## 📝 Problem
Given a string `s`, find the length of the longest substring without repeating characters.

## 💡 Approach
- Use sliding window technique.
- Maintain a HashSet to track characters in current window.
- Expand right pointer.
- If duplicate found, shrink window from left.
- Track maximum length.

## ⏱ Time Complexity
O(n)  
Each character processed at most twice.

## 📦 Space Complexity
O(min(n, charset))

## ⚠ Edge Cases
- Empty string
- All characters same
- All unique characters