# Tasks

**To-do tasks:**

* [ ] Determine formfield datatypes for form section G *[Lance]*
* [ ] Initial documentation in Google Docs *[Ryl, Zeamon]*

* [ ] Countercheck / verify datatypes *[Ryl]*
* [ ] Create the GitHub repository for CoBart *[Loui]*
* [ ] Compute memory size for all formfield datatypes *[Loui, Lance]*


  Count all string, int, float, and bool variables from the 125 formfields

- Set maximum string length (how many characters): 500 chars per string
- Count how many bytes per variable
  500 bytes per String (66 String)*
  2 bytes per bool (43 bool)*
  4 bytes per int (13 int)*
  4 bytes per float (5 float)*
- Total bytes of all variables: 33160 bytes of all 125 variables*
  33000 bytes (String)
  86 bytes (bool)
  54 bytes (int)
  20 bytes (float)
- 260 MB is supposed memory usage
  f) Determine optimal memory usage
