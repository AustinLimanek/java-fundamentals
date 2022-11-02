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

### weatherSummary

Finds the min and max an `int[][]` and returns an `int[]` containing those values. The function also prints out the temperatures that were not included in the input matrix that are between the min and max temperature.

### tally

Finds the candidate with the greatest number of votes. Input `List<String>`, while the output is an `int`. The keys must be the appropriate case for the function to work appropriately. In addition, spelling is important.

## inheritance: Class 06 Lab refactored for lab 07

### Abstract class Business

Three base fields of `String` name, `Integer` expense, and `ArrayList<Review>` reviews. There are two constructor functions that allow different initialization. The first is with both name and expense (Restaurant and Shop)the other is just with name (Theater). 

- addReview: Adds a Review instance to the reviews arraylist field.
- getRating: calculates the rating of the location based on reviews. If not reviews then the default value is 3.0.
- setRating: updates the rating.
- getExpense: finds the relative cost of the establishment.
- getName: returns the `String` value of the establishments name.

### Restaurant class extends Business

- toString: returns a `String` of information about the restaurant such as name, rating, and expense.

### Shop class extends Business

- toString: returns a `String` of information about the shop such as description, name, rating, and expense.
- getDescription: returns a `String` with the description of the shop.

### Theater class extends Business

One additional field of `ArrayList<String>` movies that holds the current movies at a movie instance.

- toString: Prints information about the theater such as the name and the number of movies currently playing.
- addMovie: Takes in a string and adds it to the movies `ArrayList`
- removeMovie: Input a string and removes the string from `ArrayList` movies, if it exists.
- getMovies: returns the `ArrayList` movies

### Review class

A class that has three fields: `String` body, `int` rating, `String` author, and `String` movie. There are two separate constructors in this class. One with the first three fields (Restaurant and Shops) and another with all four fields (Theater).

- toString: returns a `String` of information about the content of the written review existing in the body field, the rating, and the author of the review. If on the second constructor the `String` also includes the name of the movie.
