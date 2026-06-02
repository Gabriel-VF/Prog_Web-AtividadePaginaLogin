<!DOCTYPE html>
<html>
<head>
	<meta charset='utf-8'>
	<meta http-equiv='X-UA-Compatible' content='IE=edge'>
	<title>Login Successful & User List</title>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' type='text/css' media='screen' href='main.css'>
	<script src='main.js'></script>
</head>
<style>
	.listaUsuarios {
		padding: 10px;
		background-color: mintcream;
		font-family: monospace;
	}
	.mensagemLogin {
		padding: 10px;
		text-align: center;
		color: white;
		background-color: black;
	}
</style>
<body>
	<div>
		<h1 class="mensagemLogin">${mensagemLogin}</h1>
		<p><b>Chosen email: </b>${username}</p>
		<p><b>Chosen password: </b>${password}</p>
	</div>
	<br>
	<h1>List of Users</h1>
	<h3>|  Id  |  Email  |  Password  |</h3>
	${listaUsuarios}
</body>
</html>