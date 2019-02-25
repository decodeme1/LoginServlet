<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="CadastrarUsuario" method="post">
            <table >
                <h1>Cadastrar!</h1>
                <tr>
                    <td><label>Login: </label></td><td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td><label>Senha: </label></td><td><input type="password" name="pass"></td>
                </tr>
                <tr>
                    <td><label>Confirmar Senha: </label></td><td><input type="password" name="confirm"></td>
                </tr>
                <tr><td><button>enviar</button></td></tr><td></td>
            </table>
        </form>
        <button onclick="location.href='index.jsp'  ">voltar</button>
    </body>
</html>
