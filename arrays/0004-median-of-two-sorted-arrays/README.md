# 0004. Median of Two Sorted Arrays

## Problem
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

## Approach (Baseline)
1. Merge both arrays into one array
2. Sort the merged array
3. Return the median

## Time Complexity
O((m+n) log(m+n))

## Space Complexity
O(m+n)

## Note
This is a baseline solution. An optimal solution exists with O(log(m+n)) using binary search.