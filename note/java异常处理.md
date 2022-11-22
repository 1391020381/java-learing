- 调用方如何获知调用失败的信息

1. 约定返回错误码
2. 语言层面上提供了异常处理机制

- java 内置了一套异常处理机制,总是是偶男异常来表示错误。
- 异常时一种 class,因此它本身带有类型信息。异常可以在任何地方抛出,但只需要在上层捕获,这样就和方法调用分离了。

* Throwable 是异常体系的根,它继承自 Object。
* Throwable 有两个体系 Error Exception

* Error 表示严重的错误,程序对此一般无能为力。

* Exception 则是运行时的错误,它可以被捕获并处理。

# 捕获异常

- 捕获异常使用 try catch 语句 finally

```

 static byte[] toGBK(String s) throws UnsupportedEncodingException {
        // 用指定编码转换String为byte[]:
        return s.getBytes("GBK");
}

```

- 声明可能抛出异常,需要在外层捕获

## 异常的传播

- 当某个异常抛出了异常时,如果当前方法没有捕获异常,异常就会被抛到上层调用方法,直到遇到某个 try catch 被捕获为止。

* 如果一个方法捕获了某个异常后,又在 catch 子句中抛出新的异常,就相当于把抛出的异常类型转换了。
* finally 抛出异常后,原来在 catch 中准备抛出的异常就消失了,因为只能抛出一个异常。没有被抛出的异常称为 被屏蔽 的异常。

* 一个常见的做法是自定义一个 BaseException 作为 根异常。 然后 派生出各种业务类型的异常
* BaseException 需要从一个合适的 Exception 派生 通常建议从 RuntimeException 派生。

```
public class BaseException extends RuntimeException{
    public BaseException(){
        super()
    }
    public BaseException(String message,Throwabel cause){
        super(message,cause);
    }
}


```

## NullPointerException

- NullPointerException 即空指针异常。 如果一个对象为 null 调用其方法或访问其字段就会产生 NullPointerException，这个异常通常是 JVM 抛出的。

* 使用空字符串""而不是默认的 null 可避免很多 NullPointerException，编写业务逻辑时，用空字符串""表示未填写比 null 安全得多。

* 返回空字符串""、空数组而不是 null

# 使用断言

- 断言(Assertion)是一种调试程序的方式。 在 java 中 使用 assert 关键字类实现断言。

* java 断言的特点是 断言失败时会抛出 AssertionError 导致程序结束异常。因此 断言不能用于可恢复的程序错误,只应该用于开发和测试阶段。

# 日志

1. 设置样式
2. 输入级别
3. 重定向到文件
4. 按包名控制日志级别。
