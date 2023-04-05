<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!--CSS-->
    <link rel="stylesheet" href="./CSS/style.css">
    <!--CSS ONLY-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
     integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <!--Font Google-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
   <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
   <link href="https://fonts.googleapis.com/css2?family=Share+Tech+Mono&display=swap" rel="stylesheet">
   <!--JavaScript-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" 
crossorigin="anonymous"></script>
    
</head>
<body>
    <div id="conteiner">
        <h1>Calculadora</h1>
        <div id="calculator">
            <form action="" method="post">
                <div class="display">
                    <div class="results">
                        Resultado:
                    </div>
                </div>
                <div class="keybord">
                    <div class="row">
                        <div class="col-12">
                            <input type="text" name="n1" class="form-control  mb-3" placeholder="Digite um número" required>
                        </div>
                        <div id="col-12">
                            <select name="" id="form-select mb-3 bg-inf" name="tipo" required>
                                <option selected>Selecione um operadpr</option>
                                 <option value="+">+</option>   
                                 <option value="-">-</option>   
                                 <option value="*">*</option>   
                                 <option value="/">/</option>   
                            </select>
                        </div>
                        <div id="col-12">
                            <input type="text" name="n2" class="form-control mb-3" placeholder="Digite um númeoro" required>

                        </div>
                        <div id="col-12">
                            <button type="submit" class="btn btn-danger" name="acao">=</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>



</body>
</html>