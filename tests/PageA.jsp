<%@ taglib prefix="mine" uri="KathyClassicTags" %>
<!DOCTYPE html>
<html>
<body>
	<table border="1">
		<mine:iterateMovies>
			<tr><td>${movie}</td></tr>
		</mine:iterateMovies>
	</table>
</body>
</html>