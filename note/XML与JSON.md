- XML 和 JSON 是两种经常在网络上使用的数据表示格式。

```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE note SYSTEM "book.dtd">
<book id="1">
    <name>Java核心技术</name>
    <author>Cay S. Horstmann</author>
    <isbn lang="CN">1234567</isbn>
    <tags>
        <tag>Java</tag>
        <tag>Network</tag>
    </tags>
    <pubDate/>
</book>

```

## xml 有几个特点

1. 纯文本 默认使用 UTF-8 编码
2. 可嵌套 适合表示结构化数据

## XML 的结构

1. 首行 必定是 <?xml version="1.0"> 可以加上可选编码

2. 紧跟着 <!DOCTYPE note SYSTEM "book.dtd">
3. 接下来是 XML 的文档内容 一个 XML 文档有且仅有一个根元素,根元素可以包含任意个子元素,元素可以包含任意个子元素,元素可以包含属性。
4. 如果是空元素 可以用 <tag/> 表示

## 使用 DOM 结构

# 使用 JSON

- 常用的用于解析 JSON 的第三方库有:
- Jackson

* 核心代码是创建一个 ObjectMapper 对象。 关闭 DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES 功能使得解析时如果 JavaBean 不存在该属性时解析不会报错。

* 把 JSON 解析为 JavaBean 的过程称为反序列化。
* 如果把 JavaBean 变为 JSON 那就是序列化。

* 要实现 JavaBean 到 JSON 的序列化,只需要一行代码

```
String json = mapper.writeValuesAsString(book)


```
