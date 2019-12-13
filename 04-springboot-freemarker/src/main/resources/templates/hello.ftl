<!DOCTYPE html>
<html>
<head>
	<title>Blog列表</title>
</head>
<body>
	<table border="0" >
		<tr>
			<th>BlogId</th>
			<th>BlogName</th>
			<th>BlogDescs</th>
		</tr>
		<#list blogs as blog>
			<tr>
				<td>${blog.id }</td>
				<td>${blog.name }</td>
				<td>${blog.descs }</td>
			</tr>
		</#list>
	</table>
</body>
</html>