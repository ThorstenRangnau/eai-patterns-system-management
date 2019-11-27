# Message Bus API

### Registry

`GET /registration` retrieves a list of all registered Applications

`POST /registration {registeredApplicationDTO}` creates a new item object and returns created item object

Example:
```
curl --header "Content-Type: application/json" \
 --request POST \
 --data '{"applicationName": "TestApplication", "url": "localhost:8080"}' \
 http://localhost:9090/registration
```

Return value:
```
{
    "id":0,
    "applicationName":"TestApplication",
    "url":"localhost:8080"
}

```