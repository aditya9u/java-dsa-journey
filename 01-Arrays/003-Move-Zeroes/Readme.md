# First Approach - Brute Force

in this approach when I found 0 I am moving all elements behind that 
to the front.

so it is, not optimised approach.

Time Complexity --> O(n^2)
Space Complexity --> O(1) // as not using extra space

# Second Approach - two pointer approach

in second approach I am taking one pointer move only if found non-zero elements
so, when found non zero element other pointer will swap with intial pointer
and for zero it skips at the end will fill empty locations with 0

Time Complexity --> O(n)
Space Complexity --> O(1)