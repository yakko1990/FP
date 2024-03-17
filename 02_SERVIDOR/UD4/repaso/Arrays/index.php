<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <?php

    $array_pruebas = [
        [
            'item' => 'journal',
            'status' => 'A',
            'size' => ['h' => 14, 'w' => 21, 'uom' => 'cm'],
            'instock' => [
                ['warehouse' => 'A', 'qty' => 5],
            ],
        ],
        [
            'item' => 'notebook',
            'status' => 'A',
            'size' => ['h' => 8.5, 'w' => 11, 'uom' => 'in'],
            'instock' => [
                ['warehouse' => 'C', 'qty' => 5],
            ],
        ],
        [
            'item' => 'paper',
            'status' => 'D',
            'size' => ['h' => 8.5, 'w' => 11, 'uom' => 'in'],
            'instock' => [
                ['warehouse' => 'A', 'qty' => 60],
            ],
        ],
        [
            'item' => 'planner',
            'status' => 'D',
            'size' => ['h' => 22.85, 'w' => 30, 'uom' => 'cm'],
            'instock' => [
                ['warehouse' => 'A', 'qty' => 40],
            ],
        ],
        [
            'item' => 'postcard',
            'status' => 'A',
            'size' => ['h' => 10, 'w' => 15.25, 'uom' => 'cm'],
            'instock' => [
                ['warehouse' => 'B', 'qty' => 15],
                ['warehouse' => 'C', 'qty' => 35],
            ],
        ],
    ];

    if ($_SERVER["REQUEST_METHOD"] == "POST") {

       
        echo "<h1>Resultado:</h1>";
        echo "<pre>";
        // print_r($array_pruebas);
        echo "</pre>";
    }

    ?>

    <form action="" method="post">

        <input type="text" name="claveArray">
        <input type="submit">

    </form>

    
    <?php

/*
   foreach ($array_pruebas as $key => $value) {
        echo "<pre>";
        print_r($value["size"]["w"]);
        echo "</pre>";
    
        echo "<pre>";
        print_r($value["size"]["w"]);
        echo "</pre>";
        
   }*/

    for ($i = 0; $i < count($array_pruebas); $i++) {// el indice hace referencia a los valores posicionales cuando lleva el nombre del array
            
            var_dump($array_pruebas[$i]["status"]);
           
    
    }
        
    ?>



</body>

</html>