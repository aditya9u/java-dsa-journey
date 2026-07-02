## First Approach
brute force calculating count of each element by traversing loop
multiple times
time complexity -> O(n^2)
sapce complexity -> O(1)

## Second Approach
using hashmap will add count of each element in map
and then find out the maximum count element
time complexity -> O(n)
space complexity -> O(n)

## third Approach
using voting algorithm, in this we are trying to calculate
majority element which is occuring more than n/2 times
this approach will works only when we need majority elements

time complexity -> O(n)
space complexity -> O(1)