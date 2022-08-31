<%--
  Created by IntelliJ IDEA.
  User: Klara
  Date: 25.08.2022
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>main</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Shippori+Antique+B1&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
    <style>
        body {
            width: 1200px;
            margin: 0 auto;
            background-repeat: no-repeat;
            background-image: url(https://scontent.ffru1-2.fna.fbcdn.net/v/t1.6435-9/56899564_452496195487828_7794086738418204672_n.png?_nc_cat=107&ccb=1-5&_nc_sid=e3f864&_nc_ohc=Onw7Ojrez4AAX9DDBIg&_nc_ht=scontent.ffru1-2.fna&oh=00_AT_BGGRI8PWqD7bLVp4bs695Ef_0rs4F-erFe9Y5fUIvAw&oe=623F86F2);
            background-size: cover;
            background-position: center;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 600px;
            text-align: center;
        }

        .wrapper {
            display: flex;
            flex-direction: column;
            justify-content: center;
            width: 500px;
            height: 200px;
            align-items: center;
        }

        h1 {
            color: #288BC8;
            font-size: 3rem;
            font-family: 'Shippori Antique B1', sans-serif;
        }

        button {
            color: black;
            text-decoration: none;
            width: 130px;
            height: 40px;
            text-align: center;
            border-radius: 10px;
            font-size: 20px;
            background-color: #268DCC;
            transition: 1s;
            outline: none;
            border: none;
        }

        button:hover {
            border-radius: 15px;
            box-shadow: 0 0 7px black;
        }
    </style>
</head>
<body>
<div class="wrapper">
    <h1 class="animate__animated animate__backInDown">
        Welcome to Klara's project!
    </h1>
    <br/>
    <a href="/companies/allCompanies">
        <button>
            click here
        </button>
    </a>
</div>
</body>
</html>