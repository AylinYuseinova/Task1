<?php

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test_db";


$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
    die("Грешка при свързване: " . $conn->connect_error);
}


if ($_SERVER["REQUEST_METHOD"] == "POST") {
  
    $name = $conn->real_escape_string($_POST['name']);
    $email = $conn->real_escape_string($_POST['email']);

    
    $sql = "INSERT INTO users (name, email) VALUES ('$name', '$email')";

    if ($conn->query($sql) === TRUE) {
        echo "Данните бяха успешно записани!";
    } else {
        echo "Грешка: " . $sql . "<br>" . $conn->error;
    }
} else {
    echo "Грешка: Невалиден метод на заявка!";
}

$conn->close();
?>


$conn->close();
?>

