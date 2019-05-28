<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
<tr>
<th>
ID
</th>
<th>
NAME
</th>
<th>
EMAIL
</th>
<th>
Action
</th>
</tr>
<c:forEach var="data" items="${datalist}">
<tr>
<td>${data.id}</td>
<td>${data.name}</td>
<td>${data.email}</td>
<td><a href="registrationDelate.aspx?id=${data.id}">delaete</a>
<a href="registrationUpdate.aspx?id=${data.id}">update</a></td>
</tr>
</c:forEach>
</table>