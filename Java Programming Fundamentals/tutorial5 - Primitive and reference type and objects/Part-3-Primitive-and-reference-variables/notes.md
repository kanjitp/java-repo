# Primitive and reference variables

Variables in Java are classified into 
1. primitive variables
   > actual value is stored
2. refrence variables
   > holds a reference to information

```java
public class Name {
    private String name;
    
    public Name(String name) {
        this.name = name;
    }
}
```
```java
Name luke = new Name("Luke");
System.out.println(luke);
```
> Name@4aa298b7

// Each variable has its own memory location
```java
int first = 10;
int second = first;
int third = second;
System.out.println(first + " " + second + " " + third);
second = 5;
System.out.println(first + " " + second + " " + third);
```
> 10 10 10
> 10 5 10

