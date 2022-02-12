<%@page import="com.hcl.website.*" %>
<jsp:useBean id = "a" class="com.hcl.website.UserData"></jsp:useBean>
<jsp:setProperty property="password" name = "a"/>
<jsp:setProperty property="email" name = "a"/>
<jsp:include page="/Verify" flush="true" >
   <jsp:param name="email" value= "<%=a.email%>"/>
   <jsp:param name="password" value= "<%=a.password%>" />
</jsp:include>
