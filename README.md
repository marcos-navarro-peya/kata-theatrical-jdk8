Theatrical Players Refactoring Kata
====================================

The first chapter of ['Refactoring' by Martin Fowler, 2nd Edition](https://www.thoughtworks.com/books/refactoring2) contains a worked example of this exercise, in javascript. That chapter is available to download for free. This repo contains the starting point for this exercise in java, with tests, so you can try it out for yourself.

The starting point
------------------
Image a company of theatrical players who go out to various events performing
plays. Typically, a customer will request a few plays and the company charges
them based on the size of the audience and the kind of play they perform. There
are currently two kinds of plays that the company performs: tragedies and
comedies. As well as providing a bill for the performance, the company gives its
customers “volume credits” which they can use for discounts on future performances—think of it as a customer loyalty mechanism.


What you need to change
-----------------------
Refactoring is usually driven by a need to make changes. In the book, Fowler adds code to print the statement as HTML in addition to the existing plain text version. He also mentions that the theatrical players want to add new kinds of plays to their repertoire, for example history and pastoral.

Automated tests
---------------
In his book Fowler mentions that the first step in refactoring is always the same - to ensure you have a solid set of tests for that section of code. However, Fowler did not include the test code for this example in his book. I have used an [Approval testing](https://medium.com/97-things/approval-testing-33946cde4aa8) approach and added some tests. I find Approval testing to be a powerful technique for rapidly getting existing code under test and to support refactoring. You should review these tests and make sure you understand what they cover and what kinds of refactoring mistakes they would expect to find.

Acknowledgements
----------------
Thankyou to Martin Fowler for kindly giving permission to use his code.
