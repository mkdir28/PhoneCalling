# PhoneCalling 

Generate (randomly) a text file representing data used by a phone company; 
the filecontainsRlines of the following form 26 121 220 representing phone calls of K company’s customers. 
The interpretation of the datais as follows
  1. first number (26 in the example) is the identification number of the caller (inrange[1, K]);
  2. second number (121 in the example) is the identification number of the callee(in range[1, K]); 
cases of ‘self-calling’ should of course be eliminated;
  3. third number (220 in the example) represents duration of the call in seconds. 
Data wille be more interesting if you use not uniform but, e.g., 
Gaussian distribution(Random::nextGaussian), of course shifted and with data outside reasonable rangesremoved.
The program proper reads the data and allows us to get various pieces of information,for example:
  4. list ofNcustomers who talked for the longest time as callers (and this time);
  5. list ofNcustomers who talked for the longest time as callees (and this time);
  6. list ofNcustomers who called the largest number of other customers;
  7. list ofNcustomers who received the calls from the largest number of othercustomers;
  8. list ofNcustomers who made the largest number of calls;
  9. list ofNcustomers who received largest number of calls;
  10. list ofNcustomers who made the smallest number of calls;
  11. list ofNcustomers who received the smallest number of calls;
  12. full information about customer nok: how many calls he/she made and rece-ived, for how many seconds he/she has to pay.
The number of customers (K) can be of the order of 500, number of calls (R) —something like 200 000.
