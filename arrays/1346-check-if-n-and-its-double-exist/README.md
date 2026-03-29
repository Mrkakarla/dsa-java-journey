# 1346 Check If N and Its Double Exist

Pattern: Hashing

## Approach
Use a HashSet:

For each number:
- Check if double exists → 2 * num
- Check if half exists → num / 2 (if even)

If found → return true

## Time Complexity
O(n)

## Space Complexity
O(n)