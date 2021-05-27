
# NoteSpring

A simple REST API Built wth **Spring Boot** that saves and fetches data from **MySQl** Database

## Dependencies
1. Spring Boot
2. Hibernate
3. MySQL

## Indices

* [API Documentation](#API Documentation)

  * [Add a new Note](#1-add-a-new-note)
  * [Get a Note By Id](#2-get-a-note-by-id)
  * [Get all Notes](#3-get-all-notes)
  * [New Request](#4-new-request)
  * [Update a Note](#5-update-a-note)


--------


## API Documentation



### 1. Add a new Note



***Endpoint:***

```bash
Method: POST
Type: RAW
URL: http://localhost:8080/note
```



***Body:***

```js        
{
    "text" : "note 4"
}
```



***More example Requests/Responses:***


##### I. Example Request: Add a new Note



***Body:***

```js        
{
    "text" : "note 4"
}
```



##### I. Example Response: Add a new Note
```js
{
    "id": 4,
    "text": "note 4"
}
```


***Status Code:*** 200

<br>



### 2. Get a Note By Id



***Endpoint:***

```bash
Method: GET
Type: 
URL: http://localhost:8080/note/2
```



***More example Requests/Responses:***


##### I. Example Request: Get a Note By Id



##### I. Example Response: Get a Note By Id
```js
{
    "id": 2,
    "text": "new text for a note"
}
```


***Status Code:*** 200

<br>



### 3. Get all Notes



***Endpoint:***

```bash
Method: GET
Type: 
URL: http://localhost:8080/notes
```



***More example Requests/Responses:***


##### I. Example Request: Get all Notes



##### I. Example Response: Get all Notes
```js
[
    {
        "id": 2,
        "text": "note 2"
    }
]
```


***Status Code:*** 200

<br>



### 4. New Request



***Endpoint:***

```bash
Method: DELETE
Type: 
URL: http://localhost:8080/note/4
```



***More example Requests/Responses:***


##### I. Example Request: New Request



##### I. Example Response: New Request
```js
Note Deleted : 4
```


***Status Code:*** 200

<br>



### 5. Update a Note



***Endpoint:***

```bash
Method: PUT
Type: RAW
URL: http://localhost:8080/note
```



***Body:***

```js        
{
    "id" : 2,
    "text" : "new text for a note"
}
```



***More example Requests/Responses:***


##### I. Example Request: Update a Note



***Body:***

```js        
{
    "id" : 2,
    "text" : "new text for a note"
}
```



##### I. Example Response: Update a Note
```js
{
    "id": 2,
    "text": "new text for a note"
}
```


***Status Code:*** 200

<br>



---
