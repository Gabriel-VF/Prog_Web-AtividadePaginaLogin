<!DOCTYPE html>
<html>
<head>
	<meta charset='utf-8'>
	<meta http-equiv='X-UA-Compatible' content='IE=edge'>
	<title>Login Page</title>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' type='text/css' media='screen' href='main.css'>
	<script src='main.js'></script>
</head>
<style>
	body {
		background-color: beige;
	}
	.header {
		background-color: beige;
		font-weight: bold;
		text-align: center;
		padding: 10px;
	}
	.form_class {
		padding: 16px;
		background-color: rgb(225, 225, 200);
		
	}
	button {
		border: none;
		padding: 5px;
		background-color: #aaaaaa;
		color: white;
		cursor: pointer;
		font-weight: bold;
	}
</style>
<body>
	<h1 class="header">LOGIN FORM</h1>
	<div class="form_class">
		<form action="login", method="post">
		<label for="emailInput"><b>Email</b></label><br>
		<input name="emailInput" required placeholder="Insert email here">
		<br><br>
		<label for="passwordInput"><b>Password</b></label><br>
		<input name="passwordInput" required type="password" placeholder="Insert password here">
		<br>
		<br>
		<button type="submit">Login</button>
		<br>
	</form>
	</div>
</body>
</html>