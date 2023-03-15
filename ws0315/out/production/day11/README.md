# 은행 어플리케이션 프로젝트
- - -
참여자 : 변다윗, 장은정, 문대호, 이여진

## 엔티티
- - -
+ Transition
```bash
    private String date;
    private String accNo;
    private int balance;
    private String type;
    private String desc;
    private String bank;
```

+ User
```bash
    private String id;
    private String pwd;
    private String name;
    private String email;
    private String contact;
```
+ Account 
```bash
    private String accNo;
    private double balance;
    private String accHolder;
```

## 기능
- - -
+ 계좌 개설
+ 유저 간 이체
+ DB 연동(Oracle)
+ 알림(Notification)

## UML
- - -
Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## 실행결과
- - -
[MIT](https://choosealicense.com/licenses/mit/)