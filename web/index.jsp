<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>???</title>
    <style>
        body {
            margin: 0 auto;
        }

        .form {
            width: 250px;
            height: auto;
            background-color: cornflowerblue;
        }

        .btn {
            border: 1px solid black;
            background-color: #fc3;
            padding: 10px;
        }
    </style>
</head>
<body>
<div class="form">
    <form action="/question" method="POST">
        <div class="personal-data">
            <h1>Personal data:</h1>
            <div>First Name:
                <div class="str"><input type="text" name="first-name"></div>
            </div>
            <div>Last Name:
                <div class="str"><input type="text" name="last-name"></div>
            </div>
            <div>Age:
                <div class="str"><input type="number" name="age"></div>
            </div>
        </div>
        <hr>
        <div class="questions">
            <h1>Answer the questions:</h1>

            <div class="question">Do you speak english?
                <input type="radio" name="question1" value="yes">Yes
                <input type="radio" name="question1" value="no">No
            </div>
            <div class="question">Man or Woman?
                <input type="radio" name="question2" value="man">Man
                <input type="radio" name="question2" value="women">Women
            </div>
        </div>
        <input type="submit"/>
    </form>
</div>
</body>
</html>