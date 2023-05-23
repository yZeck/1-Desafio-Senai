<?php
require_once "./conn.php";
$pg = filter_input(INPUT_POST, 'pg');
$id = filter_input(INPUT_POST, 'id');
$dado = filter_input(INPUT_POST, 'dado');
$ano = filter_input(INPUT_POST, 'ano');
$table = filter_input(INPUT_POST,'table');
$query ="UPDATE $table SET valuelucas = :DADO, yearlucas = :ANO WHERE idlucas = :ID";
$header = "Location:$pg";
//echo $id .'-' .$dado .'-'. $ano;
$stmt = $conn->prepare($query);

$stmt->bindValue(':DADO', $dado);
$stmt->bindValue(':ANO', $ano);
$stmt->bindValue(':ID', $id);


$stmt->execute();

header($header);
//header("Location:index.php");
?>