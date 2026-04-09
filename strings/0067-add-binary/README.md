# 0067 Add Binary

Pattern: String + Carry Simulation

## Approach
Traverse from end:

- Add digits + carry
- Append (sum % 2)
- Update carry = sum / 2

Reverse result at end.

## Time Complexity
O(n)

## Space Complexity
O(n)