FIND ALL
```
query FindAll($criteria: UserCriteria!) {
    findAll(criteria: $criteria) {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```
```
{
  "criteria": {
    "lastName": "o",
    "page": 0,
    "size": 4
    "sortedBy": "firstName",
    "sortDirection": "DESC"
    ]
  }
}
```

FIND ONE
```
query FindOne($id: Int!) {
    findOne(id: $id) {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```
```
{
  "id": 5
}
```

CREATE
- using complex object
```
mutation CreateUser($input: UserInput!) {
  create(input: $input) {
    id
    firstName
    lastName
    salary
    birthDate
  }
}
```
```
"input": {
  "firstName": "David",
  "lastName": "Test",
  "birthDate": "2015-01-02"
}
```
- using args
```
mutation CreateUser($firstName: String!, $lastName: String!, $birthDate: Date!) {
    create(firstName: $firstName, lastName: $lastName, birthDate: $birthDate) {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```
```
{
  "firstName": "David2",
  "lastName": "Test2",
  "birthDate": "2015-01-02"
}
```
UPDATE
- using complex object
```
mutation UpdateUser($id: Int!, $input: UserInput!) {
  update(id: $id, input: $input) {
    id
    firstName
    lastName
    salary
    birthDate
  }
}
```
```
{
  "id": 5,
   "input": {
  	"firstName": "David2",
  	"lastName": "Test2",
  	"birthDate": "2016-01-02"
  }
}
```
- using args
```
mutation UpdateUser($id: Int!, $firstName: String!, $lastName: String!, $birthDate: Date!) {
    update(id: $id, firstName: $firstName, lastName: $lastName, birthDate: $birthDate) {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```
```
{
  "id": 5,
  "firstName": "David2",
  "lastName": "Test2",
  "birthDate": "2016-01-02"
}
```

DELETE
```
mutation DeleteUser($id: Int!) {
    delete(id: $id)
}
```
```
{
  "id": 5
}
```
