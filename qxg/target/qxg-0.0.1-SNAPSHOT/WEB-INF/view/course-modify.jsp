<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改课程</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/course/updateSave" method="post">
 课程编号：<input type="text" readonly="readonly" id="id" name="id" value="${course.id}"/><br/> 
  课程名称：<input class="input-text" type="text" id="cname" name="cname" value="${course.cname}" /><br/><br/>
  代课老师：<input class="input-text" type="text" id="teacher" name="teacher" value="${course.teacher}"/><br/><br/>
  课程说明：<textarea id="description" class="input-text"  name="description" rows="5" cols="25">${course.description}</textarea><br/>
<input class="add-submit" type="submit" value="提交" />
</form>

</body>
</html>