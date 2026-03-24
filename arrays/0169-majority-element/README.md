# 0169 Majority Element

Pattern: Boyer-Moore Voting Algorithm

## Approach
Maintain a candidate and a count.

- If count becomes 0 → choose new candidate
- Increase count if same
- Decrease count if different

Majority element always remains.

## Time Complexity
O(n)

## Space Complexity
O(1)