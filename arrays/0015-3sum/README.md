# 0015. 3Sum

## Problem
Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]] such that:

nums[i] + nums[j] + nums[k] == 0

## Approach
1. Sort the array.
2. Fix one element.
3. Use two pointers (left & right) to find pairs that sum to the target.
4. Skip duplicates to avoid repeated triplets.

## Time Complexity
O(n²)

## Space Complexity
O(1) (excluding output)

## Pattern
Two Pointers