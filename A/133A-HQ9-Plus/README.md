# Codeforces 133A - HQ9+

## Problem

HQ9+ is a programming language with four instructions:

- `H` prints "Hello, World!"
- `Q` prints the source code
- `9` prints the "99 Bottles of Beer" lyrics
- `+` only increments the accumulator and produces no output

We need to determine whether the given program produces any output.

## Approach

Check every character in the program.

If the program contains at least one of:

- `H`
- `Q`
- `9`

then it produces output, so print `YES`.

Otherwise, print `NO`.

## Example

### Input
Hi!

### Output
YES

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)