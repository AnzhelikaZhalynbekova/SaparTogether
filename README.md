
# Sapar Together

Sapar Together App: A platform that connects solo travelers, helping them find travel companions, chat, plan shared experiences, and enjoy safe, social journeys.



## API Reference

#### Register

```http
  POST /auth/register
```
```json
{
    "username":"test1",
    "email":"test1@example.com",
    "password":"test1123"
}
```

#### Login

```http
  POST /auth/login
```
```json
{
    "username":"test1",
    "password":"test1123"
}
//returns jwt token
```
#### Profile
```http
PUT /user/profile
```
```json
{
  "age": 24,
  "gender": "female",
  "photo": "https://example.com/photo.jpg"
}
```
#### Get all trips
```http
GET /trip/trips
```
#### Create Trip
```http
POST /trip/create
```
```json
{
    "name": "Mountain Escape",
    "location": "Bishkek",
    "start_date": "2025-06-01",
    "end_date": "2025-06-07",
    "budget": 500,
    "peoplenum": 5,
    "description": "Trip to explore the beautiful Kyrgyz mountains.",
    "link": "https://chat.group/mountains"
}
```
#### Update trip
```http
PUT /trip/update
```
```json
{
    "trip_id": 6,
    "name": "Updated Mountain Escape",
    "location": "Bishkek",
    "start_date": "2025-06-01",
    "end_date": "2025-06-07",
    "budget": 600,
    "peoplenum": 5,
    "description": "Updated trip to explore the beautiful Kyrgyz mountains.",
    "link": "https://chat.group/mountains"
        
}
```
#### Delete trip
```http
DELETE /trip/delete/{id}
//int id
```
#### Location
```http
GET /trip/trips/{location}
//String location
```


## Future improvements

- Reccomandation, Matching profiles
- Verification , Security implementation
- Fronted Development (KYRGYZ interface)

