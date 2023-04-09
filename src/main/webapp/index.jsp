<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
    <title>Inicio de sesión</title>
    
    
    
    
    <style type="text/css">
       
        .bg-image-vertical {
        position: relative;
        overflow: hidden;
        background-repeat: no-repeat;
        background-position: right center;
        background-size: auto 100%;
        }

        @media (min-width: 1025px) {
        .h-custom-2 {
        height: 100%;
        }
}
    </style>
    
    
    
    
</head>

    
<body>
    <section class="vh-100">
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-6 text-black">
      
              <div class="px-5 ms-xl-4">
                <i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4" style="color: #709085;"></i>
               
               
              </div>
      
              <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n4">
      
                <form style="width: 23rem;">
                  <span class="h1 fw-bold mb-0"><img src="img/logo-white.svg"></span>

                  <br> <br> <br>
                  <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Iniciar Sesión</h3>
      
                  <div class="form-outline mb-4">
                    <input type="email" id="form2Example18" class="form-control form-control-lg" />
                    <label class="form-label" for="form2Example18">Correo Electronico</label>
                  </div>
      
                  <div class="form-outline mb-4">
                    <input type="password" id="form2Example28" class="form-control form-control-lg" />
                    <label class="form-label" for="form2Example28">Contraseña</label>
                  </div>
      
                  <div class="pt-1 mb-4">
                    <button class="btn btn-primary btn-lg btn-block" type="button">Login</button>
                  </div>
      
                  <p class="small mb-5 pb-lg-2"><a class="text-muted" href="#!">Olvidó la Contraseña?</a></p>
                  <p>Aún no tienes cuenta? <a href="registrar.jsp" class="link-info">Registrate</a></p>
      
                </form>
      
              </div>
      
            </div>
            <div class="col-sm-6 px-0 d-none d-sm-block">
              <img src="img/banner-login.5cf2f1f483c46e7bb369.jpg"
                alt="Login image" class="w-100 vh-100" style="object-fit: cover; object-position: left;">
            </div>
          </div>
        </div>
      </section>

</body>
      </html>
