# Codeforces 116A - Tram

## Problem

A tram has n stops. At every stop, some passengers exit and some passengers enter.

Find the minimum capacity required so that the number of passengers inside
the tram never exceeds the capacity.

Passengers exit before new passengers enter.

## Approach

1. Initialize current passengers and maximum capacity to zero.
2. For each stop:
   - Subtract the exiting passengers.
   - Add the entering passengers.
   - Update the maximum capacity.
3. Print the maximum number of passengers present at any stop.

Formula:

currentPassengers = currentPassengers - a + b

## Example

### Input
4
0 3
2 5
4 2
4 0

### Output
6

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)