<!DOCTYPE html>
<html>
<head>
	<meta charset='utf-8'>
	<meta http-equiv='X-UA-Compatible' content='IE=edge'>
	<title>Login Error</title>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' type='text/css' media='screen' href='main.css'>
	<script src='main.js'></script>
</head>
<style>
	.mensagemErro {
		padding: 10px;
		background-color: salmon;
		color: white;
		font-family: Arial, Helvetica, sans-serif;
	}
	.mensagemLogin {
		padding: 10px;
		text-align: center;
		color: white;
		background-color: black;
	}
</style>
<body>
	<h1 class="mensagemLogin">${mensagemLogin}</h1>
	${mensagemErro}
</body>
</html>