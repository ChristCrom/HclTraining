<jsp:useBean id = "a" class="com.hcl.webapp.UserData"></jsp:useBean>
<jsp:setProperty property="*" name = "a"/>

Record:<br>
<jsp:getProperty property="name" name="a"/><br>
<jsp:getProperty property="password" name="a"/><br>
<jsp:getProperty property="email" name="a"/><br>