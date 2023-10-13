# java-se-training


## Best fit

```java
public class Demo{

    public void addTwoNumbers(int a, int b){
        int result = a + b;
        return result;
    }

    public static void main(String ...args){
        addTwoNumbers(5,10);
    }
}


```

## Functional Programming

```java

/*
? Represents a predicate (boolean-valued function) of one argument.
Predicate ->  boolean test(T t)

? Represents a predicate (boolean-valued function) of two arguments.
? This is the two-arity specialization of Predicate
BiPredicate ->  boolean test(T t, U u)

? Represents a function that accepts one argument and produces a result.
Function -> R apply(T t);

? Represents a function that accepts two arguments and produces a result.
? This is the two-arity specialization of Function.
BiFunction -> R apply(T t, U u);

? Represents an operation that accepts a single input argument and returns no result.
? Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
Consumer -> void accept(T t);

? Represents an operation that accepts two input arguments and returns no result.
? This is the two-arity specialization of Consumer.
? Unlike most other functional interfaces, BiConsumer is expected to operate via side-effects.
BiConsumer -> void accept(T t, U u);

? Represents a supplier of results.
Supplier -> T get();

*/

```

