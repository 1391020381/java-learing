- Java 为关系数据库定义了一套标准的访问接口:JDBC( JAVA Database Connectivity)

# 安装 MySQL

- UTF-8 编码

* 如果 MySQL 的版本>=5.3 可以把编码设置为 utf8mb4
* utf8mb4 和 utf8 完全兼容 但它支持最新的 Unicode 标准,可以显示 emoji 字符。

* 使用 Java 程序访问数据库时,java 代码并不是直接通过 TCP 连接去访问数据库,而是通过 JDBC 接口来访问,而 JDBC 接口则通过 JDBC 驱动来实现真正对数据库的访问。
