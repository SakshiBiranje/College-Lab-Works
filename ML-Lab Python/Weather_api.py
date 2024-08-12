import json
import requests 
#api to fetch temperature of city
city_name = input("Enter city name : ")
api_key='a7e1e4e71e8450ab10eda91b1df2114c'
#to build url api
api_url =f'https://api.openweathermap.org/data/2.5/weather?q={city_name}&appid={api_key}&units=metric'
get_server_information=requests.get(api_url)
print(get_server_information.json())