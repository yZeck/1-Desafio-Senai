<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<section>
    <h6>Inserir Dados n data base:</h6>
        <form action="insertSalario.php" method="post">
        
              <input type="hydden" name="table" value="graphiclucas"  readonly>
              
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
</body>
</html>