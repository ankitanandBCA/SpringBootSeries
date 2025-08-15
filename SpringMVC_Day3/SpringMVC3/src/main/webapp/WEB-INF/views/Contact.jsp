<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact from</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
<style>
  body {
            background: linear-gradient(135deg, #74b9ff, #a29bfe);
            font-family: 'Segoe UI', sans-serif;
        }
        .form-container {
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            max-width: 400px;
            margin: 80px auto;
        }
        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #0984e3;
        }
        .btn-primary {
            background-color: #0984e3;
            border: none;
            transition: all 0.3s ease;
        }
        .btn-primary:hover {
            background-color: #0652DD;
            transform: translateY(-2px);
            box-shadow: 0px 5px 15px rgba(0,0,0,0.2);
        }




</style>

</head>
<body>

<form action="processfrom" method="post">

<div class="form-container">
    <h2>Registration</h2>
    <form>
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter your name">
        </div>

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email</label>
            <input type="email" class="form-control" name="email" id="exampleInputEmail1" placeholder="Enter your email">
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="Enter your password">
        </div>

        <button type="submit" class="btn btn-primary w-100">Submit</button>
    </form>
</div>








<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
</body>
</html>