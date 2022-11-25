# Servlet 入门

- JavaEE 提供了 Servlet API 我们使用 Servlet API 编写自己的 Servlet 来处理 HTTP 请求,Web 服务器实现 ServletAPI 接口,实现地层功能

* @WebServlet 注解表示这是一个 Servlet 并映射到地址
* 一个 Servlet 总是继承自 HttpServlet 然后覆写 doGet()或者 doPost()方法。
* HttpServletRequest 和 HttpServletResponse 两个对象,分别代表 HTTP 请求和响应。

* Servlet API 是一个 jar 包 需要通过 Maven 来引入
* pom.xml 打包类型不是 jar 而是 war。表示 JavaWeb

* 运行 Maven 命令 mvn clean package 在 target 目录下得到一个 hello.war 文件,这个文件就是我们编译打包后的 Web 应用程序。

## 如何运行 war 文件

- 普通的 java 程序是通过启动 JVM,然后执行 main()方法开始运行的。
- 但是 Web 应用程序有所不同,我们无法直接运行 war 文件,必须先启动 Web 服务器,再由 Web 服务器加载我们编写的 HelloServlet 这样就可以让 HelloServlet 处理浏览器发送的请求。

1. 下载 Tomcat 服务器
2. 把 hello.war 复制到 Tomcat 的 webapps 目录下
3. 切换到 bin 目录
4. 执行 startup.sh 或 startup.bat 启动 Tomcat 服务器。
