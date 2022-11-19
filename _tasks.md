# Tasks

**To-do tasks:**

* [ ] Determine formfield datatypes for form section G *[Lance]*



* [ ] Initial documentation in Google Docs *[Ryl, Zeamon]*



* [ ] Countercheck / verify datatypes *[Ryl]*



* [ ] Create the GitHub repository for CoBart *[Loui]*



* [ ] Compute memory size for all formfield datatypes *[Loui, Lance]*

  Since the limit of hardware is in priority, particularly in the aspect of memory usage, it is just to compute the predicted memory usage of our program.
  We can begin to compute the memory usage of the supposed variables in our program by counting all string, integer, float, and boolean variables from the
  125 formfields.
  
  From counting, we can derive the following quantities:
  
  - 66 `String` variables
  - 43 `boolean` variables
  - 13 `int` variables
  - 5 `float` variables
  
  From the above variables, each type has a determined maximum limit of storage in memory. However, out of the four, only the `String` type has a larger practical
  limit, which means that strings may go as long as one wishes without being exhausted of memory early on. For this reason, we introduce to limiting our string
  variables up to only 500 characters. And because 1 character is equal to 1 byte of memory, therefore, we can only take up to 500 bytes per `String` variable.
  
  - 500 bytes* per `String`
  - 2 bytes per `boolean`
  - 4 bytes per `int`
  - 4 bytes per `float`

  The 500-character string limit may still change depending on the evolution of our program. For now, above are the memory usages. If we multiply each with how
  many variables are expected, then we get the followning:
  
  - 33,000 bytes for all 66 `String`
  - 86 bytes for all 43 `boolean`
  - 54 bytes for all 13 `int`
  - 20 bytes for all 5 `float`

- 260 MB is supposed memory usage
  f) Determine optimal memory usage
