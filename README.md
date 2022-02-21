FIND ALL
```
query findAll {
    findAll() {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```

FIND ONE
```
query findOne {
    findOne(id: 6) {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```

CREATE
```
mutation createUser {
    create(user: {
        firstName: "Test1"
        lastName: "Test2"
        birthDate: "2010-01-02"
    }) {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```
UPDATE
```
mutation updateUser {
    update(user: {
        id: 6
        firstName: "Test123"
        lastName: "Test456"
        birthDate: "2015-01-02"
    }) {
        id
        firstName
        lastName
        salary
        birthDate
    }
}
```

DELETE
```
mutation deleteUser {
    delete(id: 6)
}
```
