# 0005. Longest Palindromic Substring

## Problem
Given a string `s`, return the longest palindromic substring in `s`.

## Approach
Use **Expand Around Center** technique.

Each character can be the center of a palindrome.

Check two cases:
1. Odd length palindrome
2. Even length palindrome

Expand outward while characters match.

## Time Complexity
O(n²)

## Space Complexity
O(1)

## Pattern
Expand Around Center
