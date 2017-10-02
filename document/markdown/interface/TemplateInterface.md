# Template API

## ??

## ????

| Method | Description |
|:--|:--|
| GET /api/template/:username | get param description |
| POST /api/template/:id | post param description |
| PUT /api/template/:id | put param description |
| DELETE /api/template/:id | delete param description |

### Where:

* :username ????
* :id ???ID

## ??

### GET /api/template/:username

| Parameters | Descripion | Required | SampleValue |
|:--|:--|:--|:--|
| id | ???ID | yes | 1 |
| username | ???? | yes | test1 |
| password | ????? | yes | password |
| mail | ??????? | yes | test1@test |

### Sample Request

```
POST /api/template/test1  
{  
  id:1,  
  username:"test1",  
  password:"password",  
  mail:"test1@test"  
}  
```
