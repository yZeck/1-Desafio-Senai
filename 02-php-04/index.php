<?php
/*
$i = 10;

while($i >0){
    echo $i . "<br>";
    $i --;
}

*/

$arrayCitiesSergipe = ["Aracajú","Lagarto","Itabaiana","São Cristovão","Intância","Tobias Barreto"];

$contador = count($arrayCitiesSergipe);

$i = 0;
while($i < $contador ){
    echo $arrayCitiesSergipe[$i] . "<br>";
    $i++;
    if($i ==3){
        echo "==============FIM==============";
        break;
    }
}
?>
