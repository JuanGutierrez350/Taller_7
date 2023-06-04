<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta name="author" content="Juan Valencia">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="description" content="">

    <!--keywords-->
    <meta name="keywords" content="registro de usuario, fomulario de registro, crear cuenta, registro en linea">

    <!--minium responsive viewport -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!--title-->
    <title>Registro de usuario</title>

    <!--favicon-->
    <link rel="icon" type="image/x-icon" href="img/buildings-fill.svg">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
          crossorigin="anonymous">




    <!-- custom css -->

    <link rel="stylesheet" href="./css/register.css">
</head>
<body class="text-center">
<!-- login form -->
<main class="form-signin w-100 m-auto">
    <form action="" method="post">
        <img class="mb-4" src="img/buildings-fill.svg" alt="REGISTER" width="100">
        <h4 class="text-secondary">REGISTER</h4>
        <h1 class="h5 mb-3 fw-normal">Ingreso</h1>

        <div class="form-floating">
            <input type="text" class="form-control" id="floatingInput"
                   placeholder="ingrese su nombre" required autofocus
                   pattern="[A-Za-z0-9]{8, 12}">
            <label for="floatingInput">Nombre</label>
        </div>

        <div class="form-floating">
            <input type="text" class="form-control" id="floatingLastName"
                   placeholder="ingrese su apellido" required
                   pattern="[A-Za-z0-9]{8, 40}">
            <label for="floatingLastName">Apellido</label>
        </div>

        <div class="form-floating">
            <input type="email" class="form-control" id="floatingEmail"
                   placeholder="ingrese su correo" required>
            <label for="floatingEmail">Correo</label>
        </div>

        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword"
                   placeholder="ingrese su contraseña" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{20,}" required>
        <label for="floatingPassword">Contraseña</label>
        </div>

        <button class="w-100 btn btn-lg btn-danger" type="submit">Registrarse</button>
        <div id="register">
            <a href="./login.jsp">¿Ya tienes cuenta?</a>
        </div>
        <p class="mt-3 mb-3 text-muted">Todos los Derechos Reservados JUAN
            <%=displayDate()%>
        </p>

    </form>
</main>
</main>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>

<%!
    public String displayDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
        Date date = Calendar.getInstance().getTime();
        return dateFormat.format(date);
    }
%>
</body>
</html>