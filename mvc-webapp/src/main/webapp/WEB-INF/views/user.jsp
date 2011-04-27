<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

	<div id="user">
		<h2>User list</h2>
        <li><a href="<c:url value="/user/add"/>">add</a></li>
        <c:forEach var="user" items="${userList}">
            <div>
                User with name: ${user.name}
            </div>
        </c:forEach>
	</div>
