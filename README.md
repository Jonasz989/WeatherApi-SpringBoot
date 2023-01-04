# volvo
RESTful API - Volvo task

Backend:
Develop Sprint Boot based app that will expose RESTful API along with Swagger/Open API docs for Weather Forecast App for Poland.
For Weather data you should utilize https://www.weatherapi.com/ service (free subscription) to take forecast for next week (temp, humidity, wind, pressure etc).
Your API should present result for 5 biggest cities in Poland.

My approach to exposing
1. First we need to get a data from weatherapi
2. Then with given JSON as a String we can return it to our page

My approach to the task with only few pools:
1. First we need to get a data from weatherapi
2. Then we need to convert JSON to Java Class
3. After converting we need to prepare the data we want to show for user
4. Send it to our page

To convert JSON to Java Class I used: https://www.jsonschema2pojo.org/ and https://github.com/FasterXML/jackson


Restrictions in free weatherapi
- Forecast: "3 day city and town weather. Daily and Hourly." - Because of that I am not able to make forecast for the next week, but only for 3 days 


