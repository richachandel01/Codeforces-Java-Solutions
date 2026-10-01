# Codeforces 141A - Amusing Joke

## Problem

We are given:
- Guest's name
- Host's name
- A pile of letters

We need to check whether the letters in the pile can be rearranged
to form both names exactly.

There must be:
- No missing letters
- No extra letters

## Approach

1. Count the frequency of every letter in the guest's name.
2. Add the frequency of every letter in the host's name.
3. Subtract the frequency of every letter in the pile.
4. If all frequencies become zero, print `YES`.
5. Otherwise, print `NO`.

## Example

Input:
```text
SANTACLAUS
DEDMOROZ
SANTAMOROZDEDCLAUS