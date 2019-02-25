<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ValidarLogin" method="post">
            <table>
                <h1>Hello World!</h1>
                <tr>
                    <td><label>Login: </label></td><td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td><label>Senha: </label></td><td><input type="password" name="pass"></td>
                </tr>
                <tr><td><input type="submit" value='Logar' /></td></tr>
            </table>
        </form>
        <button onclick="location.href='registrar.jsp'  ">registrar</button>
    </body>
</html>
