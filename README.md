# Alfresco FizzBuzz

## The problem
This is a simple variation on the well known http://codingdojo.org/kata/FizzBuzz/ kata exercise.

Please **write the code using TDD** (so test first), be as simple as possible and self explanatory.

Please, **do NOT read `Part 2`** before having completed the code for `Part 1`.

Feel free to change whatever you want of the existing boilerplate code, it's there just to save you set up time.

Execute the tests with your IDE or from the CLI with the provided Maven Wrapper by running: 

    ./mvnw test

## Part 1

Write code that produces the following output for each number in a contiguous range of integers:

1.	the number itself
2.	`fizz` for numbers that are multiples of 3
3.	`buzz` for numbers that are multiples of 5
4.	`fizzbuzz` for numbers that are multiples of 15

Being careful to avoid trailing spaces.

E.g. running the program with a range from `1-20` should produce the following result:

    1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz


## Part 2

Please enhance your existing FizzBuzz solution to perform the following:

If the number contains a three you must output the text `alfresco`, any other rule is skipped.

E.g. running the program with a range from `1-20` should produce the following result:

    1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz
