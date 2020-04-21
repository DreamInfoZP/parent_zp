<%--
  Created by IntelliJ IDEA.
  User: DREAM
  Date: 2020/04/21
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                alert("hello alert")
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url: "user/testAjax",
                    contentType: "application/json;charset=UTF-8",
                    data: '{"username":"niasa","password":"12121","age":18}',
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        // 服务器响应的json的数据，进行解析
                    }
                });
            });
        });
    </script>
</head>
we

<button id="btn" name="">发送ajax请求</button>
<br>
<a href="testException">testException</a>
<body>

</body>
</html>
