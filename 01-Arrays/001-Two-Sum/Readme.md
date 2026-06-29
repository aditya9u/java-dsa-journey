# Two Sum

## Difficulty

Easy

## Pattern

- Array
- HashMap

---

## Problem Summary

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

Assumptions:

- Exactly one valid answer exists.
- The same element cannot be used twice.

---

## Example

Input

```text
nums = [2,7,11,15]
target = 9
```

Output

```text
[0,1]
```

Explanation

```
nums[0] + nums[1] = 9
```

---

# Approach 1 - Brute Force

## Idea

Compare every possible pair of elements until the target sum is found.

## Algorithm

1. Iterate through the array.
2. For each element, compare it with every remaining element.
3. If the sum equals the target, return their indices.

## Time Complexity

O(n²)

## Space Complexity

O(1)

### Pros

- Very simple.
- No extra memory.

### Cons

- Inefficient for large inputs.

---

# Approach 2 - HashMap

## Idea

Store previously visited numbers in a HashMap.

For each number:

- Compute the complement.
- Check if the complement already exists.
- If found, return both indices.
- Otherwise, store the current number.

## Time Complexity

O(n)

## Space Complexity

O(n)

### Pros

- Single traversal.
- Much faster.

### Cons

- Uses additional memory.

---

# Comparison

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| HashMap | O(n) | O(n) |

---

# Key Learning

- Trade-off between time and space.
- HashMap enables fast lookups.
- Solving the brute-force solution first helps identify optimization opportunities.

---

# Common Interview Follow-up Questions

- Why must we check the HashMap before inserting the current element?
- Can this problem be solved without extra space?
- What changes if the array is sorted?
- How would you solve Two Sum II?

---

# Similar Problems

- Contains Duplicate
- Two Sum II
- Three Sum
- Four Sum