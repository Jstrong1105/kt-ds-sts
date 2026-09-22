<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

    // alert("hello");

    const path = "${pageContext.request.contextPath}";

    onload = async function () {

        const divDom = document.querySelector("#test");

        const fetchResult = await fetch(path + "/test?year=2006");

        const result = await fetchResult.json();
        
        console.log(result);
        console.dir(result);

        divDom.innerText = result.age;
    };

</script>

</head>
<body>
${hello }

    <div id="test">
        
    </div>
</body>
</html>