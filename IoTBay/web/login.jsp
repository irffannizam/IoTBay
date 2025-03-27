<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - IoTBay</title>
    <!-- can connect css files later on -->
</head>
<body>
    <header>
        <h1>Login</h1>
    </header>
    <main>
        <form action="LoginServlet" method="post">
            <div>
                <label for="email">ID:</label>
                <input type="text" id="email" name="email" required />
            </div>
            <div>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required />
            </div>
            <div>
                <input type="submit" value="Login" />
            </div>
        </form>
    </main>
    <footer>
        <p>&copy; 2025 IoTBay. All rights reserved.</p>
    </footer>
</body>
</html>