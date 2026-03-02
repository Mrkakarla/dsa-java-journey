# 0012. Integer to Roman

## 📝 Problem
Convert an integer to a Roman numeral.

## 💡 Approach
- Use greedy strategy.
- Maintain descending value-symbol pairs.
- Subtract largest possible value repeatedly.
- Append corresponding symbol.

## ⏱ Time Complexity
O(1)  
(Because Roman values list is fixed size)

## 📦 Space Complexity
O(1)

## ⚠ Edge Cases
- Smallest input: 1
- Largest input: 3999
- Subtractive cases (4, 9, 40, 90, etc.)