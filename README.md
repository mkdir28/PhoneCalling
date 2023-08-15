# PhoneCalling 

This program generate (randomly) a text file representing data used by a phone company. 
The file contains R lines of the following form like : "26 121 220" representing phone calls of K company’s customers. 
The interpretation of the data is as follows:
  1. first number e.g "26" is the identification number of the caller (in range [1, K]);
  2. second number e.g "121" is the identification number of the callee(in range [1, K]);
  3. of cases of "self-calling" can be eliminated;
  4. third number e.g "220" represents duration of the call in seconds. 

The program proper reads the data and allows us to get various pieces of information,for example:
  1. list ofNcustomers who talked for the longest time as callers (and this time);
  2. list ofNcustomers who talked for the longest time as callees (and this time);
  3. list ofNcustomers who called the largest number of other customers;
  4. list ofNcustomers who received the calls from the largest number of othercustomers;
  5. list ofNcustomers who made the largest number of calls;
  6. list ofNcustomers who received largest number of calls;
  7. list ofNcustomers who made the smallest number of calls;
  8. list ofNcustomers who received the smallest number of calls;
  9. full information about customer nok: how many calls he/she made and rece-ived, for how many seconds he/she has to pay.
  
The number of customers (K) can be of the order of 500, number of calls (R) —something like 200 000.
