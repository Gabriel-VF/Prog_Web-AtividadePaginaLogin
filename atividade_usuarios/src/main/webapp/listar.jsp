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
	body {
		background-color: rgb(255, 255, 241);
	}
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
	.lista {
		padding: 10px;
		margin: 5px;
		display: grid;
		background-color: rgb(255, 255, 241);
		grid-template-columns: repeat(3, 1fr);
		grid-template-rows: auto auto auto;
		justify-content: space-evenly;
		align-content: center;
		align-items: center;
		text-align: center;
	}
	.rowItem {
		background-color: rgba(245, 245, 220, 1);
		border-style: groove;
		border-color: gray;
		height: 100%;
		width: 100%;
		border-width: 1px;
		/* margin: 3px; */
		padding: 3px;
		text-align: center;
		align-content: center;
		align-items: center;

	}
	
</style>
<body>
	<div>
		<h1 class="mensagemLogin">${mensagemLogin}</h1>
		<p><b>Chosen email: </b>${username}</p>
		<p><b>Chosen password: </b>${password}</p>
	</div>
	<br>
	<h1 style="text-align: center;">List of Users</h1>
	<div class="lista">
		<h3 class="rowItem">ID</h3>
		<h3 class="rowItem">Email</h3>
		<h3 class="rowItem">Password</h3>

		<!-- <p class="rowItem">197365913</p>
		<p class="rowItem">email12321@gmail.com</p>
		<p class="rowItem">qwertyui</p>
		<p class="rowItem">197365913</p>
		<p class="rowItem">email12321@gmail.com</p>
		<p class="rowItem">qwertyui</p>
		<p class="rowItem">197365913</p>
		<p class="rowItem">email12321@gmail.com</p>
		<p class="rowItem">qwertyui</p> -->
		${listaUsuarios}
	</div>
</body>
</html>