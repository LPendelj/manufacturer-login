<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >

<style >

html {
  background-color: #56baed;
}

body {
  font-family: "Poppins", sans-serif;
  height: 100vh;
}



h2 {
  text-align: center;
  font-size: 32px;
  font-weight: 600;
  text-transform: uppercase;
  display:inline-block;
  margin: 40px 8px 10px 8px; 
  
}

.wrapper {
  display: flex;
  align-items: center;
  flex-direction: column; 
  justify-content: center;
  width: 100%;
  min-height: 100%;
  padding: 20px;
}


</style>


</head>

<body>
<h2>Sign in</h2>

	<div class="wrapper">
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
