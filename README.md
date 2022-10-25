# java-fundamentals

A location to store methods that I wrote to better understand the fundamentals of the Java language.

## Basics

Introduction to types and basic methods in Java.

### Pluralize

Takes in two arguments. Argument one is a `String` and argument two is an `int`. The output is a `String`. This method adds and s to the end of a word for all integers besides 1.

### flipNHeads

Takes in one argument. Argument is an `int`. The output is a `String`. In addition, the method prints a `String` for the result of every coin flip. This method completes a bernoulli trial until a success of n in a row. The `flipNHeads` uses the `Math.random()` built in Java method.

### clock

There is no argument or output for this method. `clock` prints the current time in the format of `HH:mm:ss`, which is a `String`. In addition, the average frequency of `while` loop completions is printed each second. This method uses the `LocalDateTime` method to determine the current time.

## basicLibrary

### roll

Takes in a number and produces an array with integers representing the faces of a die. Input: `int`; output: `int[]` with a length of the input.

### containsDuplicate

Checks if an `int[]` has duplicate entries. The output is a `boolean` -> `true` or `false`.

### avgOfArray

Calculates the numerical average of an array of the form `int[]`. The output is a `double`.

### minAvgOfMatrix

Calculates the minimum average from an `int[][]`, which is an array of `int[]`. This function uses `avgOfArray` to calculate the averages. There is no size restriction on either the matrix or the elements of the matrix.
