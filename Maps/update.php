<?php
require_once "./conn.php";
$id = filter_input(INPUT_GET, 'id');
$table = filter_input(INPUT_POST,'table');
$query= "SELECT * FROM $table WHERE idlucas = :ID";

$stmt = $conn->prepare($query);
$stmt->bindValue(':ID', $id);
$stmt->execute();

$list= $stmt->fetch(PDO::FETCH_ASSOC);
?>


<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--bootstrap css-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <!--awesome-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <!--css style-->
<!--<link rel="stylesheet" href="./CSS/style.css"> -->
    <!--google fonts-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100&family=Oswald:wght@300;600&family=Poppins:wght@300;500;700&display=swap" rel="stylesheet">
    <title>Atividade Avaliativa</title>
</head>
  
  <body>
    <header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">

  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link active" aria-current="page" href="#">Home</a>
        <a class="nav-link" href="#">Features</a>
        <a class="nav-link" href="#">Pricing</a>
        <a class="nav-link disabled">Disabled</a>
      </div>
    </div>
  </div>
</nav>
    </header>

        <!--start section principal-->
    
        
    <section>
        <form action="updateAction.php" method="post">
        <section>
        <h6>Inserir Dados n data base:</h6>
        <input type="hydden" name="table" value="<?=$table?>"  readonly>
        </section>

        <input type="hydden" name= "id" value="<?= $list['idlucas'];?>"  readonly>
            <div>
                <label for="dado">Digite o dado  a ser representado:</label>
                <input type="text"  name="dado" value="<?= $list['valuelucas'];?>">
            </div>
            <div>
                <label for="ano">Digite o ano:</label>
                <input type="text"  name="ano" value="<?= $list['yearlucas'];?>">
            </div>
            <div>
                <input type="submit" value="atualizar!">
            </div>

        </form>
        
    </section>
 <!--End section principal-->


  


<!--start footer-->
<footer class="container" >
        <div class="footer">
            <p>&copy;</p>
        <p>Todos os direitos reservados</p>
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
