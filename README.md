# ObjectManagement
객체 생성 갯수를 제어하는 예제

```java
int INSTANCE_LIMIT_COUNT = 20; // MAX Instance Count
int Count = 0; //instance Number
HashMap<Integer, MultiObjectManagement> POOL = new HashMap<>(); //인스턴스 pool
```

Thread 를 50개 생성 후 List에 추가후 동시에 실행시켜 생성되는 `MultiObjectManagement` 객체 수를 확인한다.





