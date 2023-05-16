
<?php

require_once "./conn.php";
$table = "4graphiclucas";
$query =  "SELECT * FROM $table";
$stmt = $conn->prepare($query);

$stmt->execute();

$list= $stmt->fetchAll(PDO::FETCH_ASSOC);
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
    <!--bootstrap css-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
      <!--css style-->
 <link rel="stylesheet" href="./CSS/style.css"> 
    <!--awesome-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    
    <!--google fonts-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100&family=Oswald:wght@300;600&family=Poppins:wght@300;500;700&display=swap" rel="stylesheet">
    <title>Document</title>
</head>
  
  <body>
    <header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">

  <div class="container-fluid">
    <a class="navbar-brand" href="#"></a>
    <img src="./IMAGENS/store.png" alt="" width="50" height="50">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link active" aria-current="page" href="#">Home</a>
        <a class="nav-link" href="#">Sobre nós</a>
        <a class="nav-link" href="#">Contato-nos</a>
        <a class="nav-link disabled">Bem vindo!</a>
      </div>
    </div>
  </div>
</nav>
    </header> 
<section class="container">
    <ul class="nav nav-tabs">
  <li class="nav-item">
    <a class="nav-link" aria-current="page" href="index.php">Gráfico - Salário-Gasolina</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="pgDollar.php">Gráfico - Salário-Dollar</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="pgCarBarato.php">Gráfico - Salário-CarroBarato</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" href="pgCestaBasica.php">Gráfico - Salário-Cesta- Básica</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="pgPIB.php">Gráfico - Salário-PIB</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="pgProcessador.php">Gráfico - Salário-Processador</a>
  </li>
</ul>
</section>
    

    <section class="container">
    <h1>Gráfico Salário/Cesta Básica</h1>
    <div id="curve_chart" style="width: 900px; height: 500px">
    </section>
<!-- start Gráfico-->
  
<section class="container">
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Year', 'Dados'],
          <?php foreach($list as $user):?>
          ['<?=$user['yearlucas'];?>', <?=$user['valuelucas'];?>],
          <?php endforeach; ?>
        ]);
        
        var options = {
          title: 'Salário/Cesta Básica',
          curveType: 'function',
          legend: { position: 'bottom' }
        };
        
        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
      }
    </script>
  </section>

<!-- end Gráfico-->
<!-- start sections de manipulação de dados-->
<section class="container">
  
  <section >
    <h6>Inserir Dados n data base:</h6>
        <form action="insert.php" method="post">
        
        <input type="hidden" name="table" value="<?=$table?>"  readonly>
              
            <div>
                <label for="dado">Digite o dado  a ser representado:</label>
                <input type="text" id="dado" name="dado">
            </div>
            <div>
                <label for="ano">Digite o ano:</label>
                <input type="text" id="ano" name="ano">
            </div>
            <div>
                <button>Salvar dados!</button>
            </div>
              
        </form>
        </div>
    </section>
        
  
      
     <section class="container" id="table">
          <h5>Tabela dos dados armazenados:</h5>

      <table border="1">
<tr>
  <th>ID</th>
  <th>ANO</th>
  <th>DADO</th>
  <th>OPÇÕES
    
  </th>
</tr>
<?php foreach($list as $user):?>
<tr>
  <td><?=$user['idlucas'];?></td>
  <td><?=$user['yearlucas'];?></td>
  <td><?=$user['valuelucas'];?></td>
  <td>
    <form action="update.php?id=<?= $user['idlucas']; ?>" method="post">
  <!--<a href="updateSalario.php?id=<?= $user['idlucas']; ?>">Editar</a>-->
  <input type="hidden" name="table" value="<?=$table?>"  readonly>
  <button > Editar Dados!</button>
  
  </form>
  |
  <form action="delete.php?id=<?= $user['idlucas']; ?>" method="POST">
  <!--<a href="deleteSalario.php?id=<?= $user['idlucas']; ?>">Deletar</a>-->
  <input type="hidden" name="table" value="<?=$table?>"  readonly>
  <button >Deletar Dados</button>
  
  </form>
  </td>
</tr>
<?php endforeach;?>
      </table>
     </section>
</section>


<!-- end sections de manipulação de dados-->

<!--start footer-->
<footer>
        <div class="footer">
            <p>.</p>
        <p>Todos os direitos reservados&copy;</p>
        <ul>
            <li><a href="https://www.instagram.com/"><i class="fa-brands fa-instagram"></i></a></li>
            <li><a href="https://web.whatsapp.com/"><i class="fa-brands fa-whatsapp"></i></a></li>
            <li><a href="https://www.facebook.com/"><i class="fa-brands fa-facebook"></i></a></li>
        </ul>
        </div>
    </footer>
    
<!--end footer-->
<!--start js script-->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<!-- end js script-->  
</body>
</html>
