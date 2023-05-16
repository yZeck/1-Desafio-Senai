<?php
require_once "./conn.php";
$id = filter_input(INPUT_GET, 'id');
$table = filter_input(INPUT_POST,'table');

$query = "DELETE FROM $table WHERE idlucas = :ID";
if ($id) {
    $stmt = $conn->prepare($query);

    $stmt->bindValue(":ID", $id);

    $stmt->execute();
}

header("location:index.php");
?>