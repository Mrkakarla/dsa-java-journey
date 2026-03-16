# 0066 Plus One

Pattern: Array / Carry Simulation

Approach:
Start from the last digit and simulate addition.

If digit < 9 → increment and return.
If digit = 9 → set to 0 and carry forward.

If all digits become 0 → create new array with leading 1.

Time Complexity: O(n)
Space Complexity: O(1) (except when new array created)
