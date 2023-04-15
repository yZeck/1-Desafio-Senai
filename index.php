<?php 

 echo 'String || Caracter';
 echo '<br>';
 echo 	'conseguiu';
 echo '<br>';
  $jogador = 1;
 echo '<br>';
  echo 'Tipo int';
  echo  '-->' . $jogador;
  

  $jogador = true;
  echo '<br>';
  echo 'Tipo boolean';
  echo  '-->' . $jogador;

  $jogador = true;
  echo '<br>';
  echo 'Tipo boolean';
  echo  '-->' . $jogador;
  
 $jogador = 1.1;
  echo '<br>';
  echo 'Tipo float';
  echo  '-->' . $jogador;
  
  echo '<br>';
  echo 'Array Matriz';
   $jogador = ["chuteira", "caneleira", "meia","óculos"];
    echo '<br>';
   print_r($jogador);
    echo '<br>';
   echo  $jogador[3];

  echo '<br>';
  echo ' Array Associativo';

  $jogador = [
   'nome'=> 'Zé Carlso',
    'Camisa' =>10,
    'gols' => 9
  ];   
   
  echo '<br>';
   print_r($jogador);
   
  echo '<br>';
     
  echo '<br>';
   
  echo 'Inclusao de array---> utiliza-se $jogador[]';
  $jogador = ["google",'10',9];
  $jogador[] = "História";
   print_r ($jogador);
  
    echo '<br>';
     
  echo '<br>';
 
  echo'array multidimensional';
  $jogador = [
  ['google','X','Y'],
  ['key','bg','rer']
  ];
  
 print_r($jogador);
    
   echo '<br>';
     
  echo '<br>';
   $jogador = [
 	[1,2,3,4],
	[5,6,7,8],
	[9,10,11,12]

   ]; 
    		  
   for($i = 0;$i < count($jogador); $i++){
    echo 'Matriz externa '. ($i + 1) . "<br>";
//matriz interna
    for($j = 0; $j< count($jogador[$i]); $j++){
   echo $jogador[$i][$j]."<br>";
}
}
   
    echo '<br>';
     
  echo '<br>';
  echo 'Correndo o array com o for each, Pode ser desse jeito!';
$jodador = [
'Ze Carlos',
10,
9
];

foreach($jogador as $dados){
echo $dados . "<br>";
}
 

echo '<br>';
  echo 'Correndo o array com o for each, e desse jeito!';
$jodador = [
'nome'=>'Ze Carlos',
 'camisa'=>10,
  'gols'=>9
];

foreach($jogador as $dados => $value){
echo "$dados<br> => $value<br>";

}


 echo '<br>';
     
  echo '<br>';





?>