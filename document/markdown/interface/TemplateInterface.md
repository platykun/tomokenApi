# Template API

## 詳細

ここに詳細を書く  
hoge  
[GET /api/template/:username](#POST_apiTemplateId)

## メソッド

[GET /api/template/:username](#POST_apiTemplateId)  
`get param description`  
[POST /api/template/:id](#POST_apiTemplateId)  
> post param description

### 変数

* :username ユーザ名
* :id ユーザID

## リクエストパラメータ

### *POST /api/template/:username*

| Parameters | Descripion | Required | SampleValue |
|:--|:--|:--|:--|
| id | ユーザID<br>DBで登録された時のIDを記載する。<br>ユーザはこの値を知らない。 | yes | 1 |
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

### *POST /api/template/:id* <a name="POST_apiTemplateId">

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
