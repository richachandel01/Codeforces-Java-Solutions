# 71A - Way Too Long Words

## Problem

Sometimes words like `localization` or `internationalization` are too long to write repeatedly.

A word is considered too long if its length is greater than 10.

For every long word, replace it with:

- First character
- Number of characters between the first and last character
- Last character

For example:

- `localization` → `l10n`
- `internationalization` → `i18n`
- `word` → `word`

## Approach

1. Read the number of words.
2. For each word, calculate its length.
3. If the length is greater than 10:
   - Keep the first character.
   - Calculate `length - 2`.
   - Keep the last character.
4. Otherwise, print the word as it is.

## Example

### Input

```text
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis