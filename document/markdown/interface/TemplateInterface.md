# Template API

## 詳細

ここに詳細を書く  
hoge

## メソッド

| Method | Description |
|:--|:--|
| GET /api/template/:username | get param description |
| POST /api/template/:id | post param description |
| PUT /api/template/:id | put param description |
| DELETE /api/template/:id | delete param description |

### 変数

* :username ユーザ名
* :id ユーザID

## リクエストパラメータ

### POST /api/template/:username

| Parameters | Descripion | Required | SampleValue |
|:--|:--|:--|:--|
| id | ユーザID | yes | 1 |
| username | ユーザ名 | yes | test1 |
| password | パスワード | yes | password |
| mail | メールアドレス | yes | test1@test |

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

### POST /api/template/:id

| Parameters | Descripion | Required | SampleValue |
|:--|:--|:--|:--|
| id | ユーザID | yes | 1 |
| username | ユーザ名 | yes | test1 |
| password | パスワード | yes | password |
| mail | メールアドレス | yes | test1@test |

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
