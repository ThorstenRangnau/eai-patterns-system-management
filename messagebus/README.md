# Message Bus API

### Registry

`GET /registration` retrieves a list of all registered Applications

`POST /registration {registeredApplicationDTO}` register an application and returns the id

Example:
```
curl --header "Content-Type: application/json" \
 --request POST \
 --data '{"applicationName": "ReceiverApplication", "url": "localhost:8080"}' \
 http://localhost:9090/registration
```

Return value {RegisteredApplication}:
```
{
    "id":0,
    "applicationName":"ReceiverApplication",
    "url":"localhost:8080"
}

```

### Message

`POST /messages {ContentMessage}` register an application and returns the id

Example:
```
curl --header "Content-Type: application/json" \
 --request POST \
 --data '{"header": {"originator": "SenderApplication", "receiver": "ReceiverApplication"}, "body": {"content": "This is a message"}}' \
 http://localhost:9090/messages
```

Example command:
```
curl --header "Content-Type: application/json" \
 --request POST \
 --data '{"command": "MessageHistory"}' \
 http://localhost:6060/command
```