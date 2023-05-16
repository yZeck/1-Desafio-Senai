<?php

$host = "localhost";
$user = "root";
$password = '';
$db = "datasslucas";

try {
    $conn = new PDO("mysql:host=" . $host ."; dbname=" . $db, $user,$password);
    //echo "foi!";
} catch (Excepition $th) {
    echo "erro tipo $th";
}

?>