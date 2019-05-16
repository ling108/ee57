<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cas入门案例1</title>
</head>
<body>
欢迎进入cas课程内容，<%= request.getRemoteUser() %>
<a href="http://localhost:8087/cas/logout?service=http://baidu.com">退出登录</a>
</body>
</html>