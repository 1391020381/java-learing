# 依赖关系

- Maven 定义了几种依赖关系, 分别是 compile test runtime provided

1. compile 编译时需要用到的 jar 包
2. test
3. runtime 编译时需要用到 但运行时由 JDK 或某个服务器提供
4. provided 编译时需要用到 但运行时由 JDK 或某个服务器提供

# 搜索第三方包

- https://search.maven.org/
- 复制 dependency

# 命令行编译

- 进入到 pom.xml 所在目录 mvn clean package -> 如果一些顺利,即可
