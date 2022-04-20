<html>
<head>

<style><%@include file="/WEB-INF/style/style.css"%></style>



</head>

<body>


	<div class="wrapper">
		<h2>Sign in</h2>
		<form action="/manufacturer-login/home/login" method="post">
			
			
			username:
			<div>
				<input type="text" name="username" value="">
			</div>
			
			password:
			<div>
				<input type="password" name="password" value="">
			</div>
			
			
			<div>
				<input type="submit" name="login" value="Log in">
			</div>
		</form>
	</div>


</body>
</html>
