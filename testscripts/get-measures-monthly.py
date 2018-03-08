import requests
import json
import pprint
url = 'http://localhost:8880/rawmetermonthly/din1_stand'
headers = {'Content-type': 'application/json'}
response = requests.get(url, headers=headers)
print(response.json())
print(response.url)




