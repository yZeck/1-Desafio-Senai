<?php

$studante = "Martin Lutter King";
$arrayValues = [3,4,4];


echo array_sum($arrayValues). "<br>";

echo count($arrayValues) . "<br>";



$average = array_sum($arrayValues) / count($arrayValues);

echo $average . "<br>";

$averageEnd = round($average, 2);

echo $averageEnd . "<br>";


if($average >= 7){
    echo "Aprovado!";
}elseif($average >=4){
    echo "Conselho!";
}else{
    echo"Reprovado!";
}

?>