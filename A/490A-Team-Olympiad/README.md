# Codeforces 490A - Team Olympiad

## Problem
Given n students with skills 1 (programming), 2 (mathematics), or 3 (sports), form the maximum number of teams. Each team must contain one student from each skill category.

## Approach
1. Store the 1-based indices of students in three separate lists.
2. Find the minimum size among the three lists.
3. Print the maximum number of teams.
4. For each team, print one index from each list.

## Complexity
- Time: O(n)
- Space: O(n)