<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <link rel="stylesheet" href="<c:url value="/css/normalize.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>"/>
    <script src="<c:url value='/webjars/jquery/3.1.1/jquery.min.js'/>"></script>
    <script src="<c:url value='/js/vue.js'/>"></script>
    <script>var contextPath = "<c:url value="/"/>";</script>
    <script src="<c:url value="/js/vue-component-loader.js"/>"></script>
    <sitemesh:write property='head'/>
</head>
<body>
<div id="main">
    <sitemesh:write property='body'/>
</div>
<script>
    var contextPath = "<c:url value="/"/>";
    var app         = new Vue({
        el:   "#main",
        data: {}
    });
</script>
</body>
</html>
