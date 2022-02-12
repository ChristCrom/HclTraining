<%@page import="com.hcl.website.*"%>
<jsp:useBean id="a" class="com.hcl.website.UserData"></jsp:useBean>
<jsp:setProperty property="*" name="a" />


<%
DBInsert insert = new DBInsert();
insert.DBInser(a.name, a.password, a.email);
%>
You have registered!
