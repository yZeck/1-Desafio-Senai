<?php
$sorteio = rand(0,5);

echo "$sorteio <br>";

switch($sorteio){

    case 0:

        echo "Perdeu a vez!";
        break;
    case 1:
        echo "Avance uma casa!";
        break;
    case 2:
        echo "Avance duas casas!";
        break;
    case 3:
        echo "Avance duas casas e tente novamente!";
        break;
    case 4:
        echo "Avance duas casas e tente novamente!";
        break;
    case 5:
        echo "Ganhou!!";
        break;

        default:
        echo "Volte 5 casas!";
        break;
}


?>