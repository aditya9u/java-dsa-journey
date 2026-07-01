## First Approach - Brute Force

I have to find maximum difference and sell price is only after purchasing, 
so first loop will represent buy price and second loop will represent 
sell price, which started after buy price.

if we find maximum difference will get that value which is profit.

Time Complexity -> n-1 + n-2 + n-3 + ....+ 1 => n(n-1)/2 => O(n^2)

Space Complexity -> no extra space is used => O(1)

## Second Optimised - Greedy Approach

I have taken a track of minimum price on every day,

and will subtract form every day price,

at the last day, I will check which is maximum profit

Time Complexity -> O(n)
Space Complexity -> no extra space used ->  O(1)
