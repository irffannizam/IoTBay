<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration - IoTBay</title>
    </head>
    <body>
        <h1>Registration Form</h1>
        
        <form action="welcome.jsp" method="POST">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required><br><br>

            <label for="gender">Gender:</label>
            <input type="radio" id="male" name="fav_language" value="Male">
            <label for="male">Male</label>
            <input type="radio" id="female" name="fav_language" value="Female">
            <label for="female">Female</label>
            <input type="radio" id="other" name="fav_language" value="Other">
            <label for="other">Other</label><br><br>

            <label for="birthday">Date of Birth:</label>
            <input type="date" id="birthday" name="birthday"><br><br>
            
            <label for="phone">Enter your phone number:</label>
            <input type="tel" id="phone" name="phone" placeholder="0123-456-789" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}"><br><br><br>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="example@domain.com" required><br><br>
            
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br><br>
     
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>
            
             <input type="checkbox" id="tos" name="tos" required> I accept the Terms of Service</label><br><br>

            <button type="submit">Register</button>
        </form>
    </body>
</html>
