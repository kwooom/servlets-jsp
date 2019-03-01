<%@ page import="java.util.*" %>
<%@ page import="foo.*" %>

<!DOCTYPE html>
<html>
<body>
	<!-- <% foo.Person p = (foo.Person) request.getAttribute("person"); %> -->
	<!-- Person is : <%= p.getName() %> -->
	<!-- <%= ((foo.Person) request.getAttribute("person")).getName() %> -->
	<jsp:useBean id="person" class="foo.Person" scope="request" />
	Person created by servlet : <jsp:getProperty name="person" property="name" />
	<p>Music is : ${musicList}</p>

</body>
</html>