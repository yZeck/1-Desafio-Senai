<?php
require_once "./conn.php";
$table = filter_input(INPUT_POST,'table');
$dado = filter_input(INPUT_POST, 'dado');
$ano = filter_input(INPUT_POST, 'ano');
$query = "INSERT INTO $table (yearlucas, valuelucas) VALUES(:ANO,:DADO)";

//preparar
$stmt = $conn->prepare($query);
//trocar
$stmt->bindValue(':ANO', $ano);
$stmt->bindValue(':DADO', $dado);
//executar
$stmt->execute();


header("Location:index.php");
?>