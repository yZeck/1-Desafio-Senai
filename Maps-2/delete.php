<?php
require_once "./conn.php";
$pg =  filter_input(INPUT_POST,'pg');
$id = filter_input(INPUT_GET, 'id');
$table = filter_input(INPUT_POST,'table');
$header = "Location:$pg";
$query = "DELETE FROM $table WHERE idlucas = :ID";
if ($id) {
    $stmt = $conn->prepare($query);

    $stmt->bindValue(":ID", $id);

    $stmt->execute();
}

//header("location:index.php");

header($header);
?>