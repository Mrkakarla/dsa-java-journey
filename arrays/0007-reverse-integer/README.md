# 0007. Reverse Integer

## Problem
Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range, return `0`.

## Approach
1. Extract last digit using `% 10`
2. Remove last digit using `/ 10`
3. Build reversed number using `rev * 10 + digit`
4. Check overflow before updating

## Time Complexity
O(log₁₀(n))

## Space Complexity
O(1)