# teratail-sdk-java
プログラミング質問サイト [Teratail](https://teratail.com/)のAPIをコールするsdk

# usage

## クライアントインスタンス作成

```java
Teratail client = new Teratail("**********");　//アクセストークン
```

## 質問一覧を取得

```java
QuestionListEntity result = client.question().findAll();
System.out.println(result);
// ページネーションを使用する場合はこちら
Pagenation pagenation = new Pagenation();
pagenation.setPage(10);
pagenation.setLimit(1);
QuestionListEntity result = client.question().findAll(pagenation);
System.out.println(result);
```

## タグ一覧を取得

```java
TagListEntity result = client.tag().findAll();
System.out.println(result);
// ページネーションを使用する場合はこちら
Pagenation pagenation = new Pagenation();
pagenation.setPage(10);
pagenation.setLimit(1);
TagListEntity result = client.tag().findAll(pagenation);
System.out.println(result);
```

## ユーザー一覧を取得

```java
UserListEntity result = client.user().findAll();
System.out.println(result);
// ページネーションを使用する場合はこちら
Pagenation pagenation = new Pagenation();
pagenation.setPage(10);
pagenation.setLimit(1);
UserListEntity result = client.user().findAll(pagenation);
System.out.println(result);
```

# 利用に関して
当ソースコード自体ははMITライセンスです。自由に使用・改造してください。
利用の際には、[Teratail 利用規約](https://teratail.com/legal) に従って下さい。

# official document
[Teratail API Document](http://docs.teratailv1.apiary.io/#introduction)
