# break statement

break statement is used to stop iteration

```java
for(int i=1;i<=5;i++){
    if(i==4){
      break;
    }
}
```
labelled break : break by using labels
```java
outer:for(int i=0;i<10;i++){
       for(int j=0;j<5;j++){
           if(i%3==0) break;
           if(j==2) break;
           if(i==7) break outer;
        }
}
```
continue : to skip iteration

```java
for(int i=0;i<10;i++){
   if(i%2==0) continue;
}
```

