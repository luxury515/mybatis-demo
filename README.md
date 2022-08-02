# mybatis-demo
* 생성
```
#POST:
localhost:8080/api/user/create
Content-Type : appliction/json
request body: 
{
    "username":"cai9",
    "email":"cai9@gmail.com"
}
```
* 전체 조회
```
#GET
localhost:8080/api/user/find
```
* 상세조회
```
#GET 
localhost:8080/api/user/find/1

```
* 수정
```
#POST
localhost:8080/api/user/update/18
request body: 
Content-Type : appliction/json

{
    "username":"cai18",
    "email":"cai18@gmail.com"
}
```