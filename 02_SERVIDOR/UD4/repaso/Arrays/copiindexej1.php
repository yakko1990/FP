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
        echo "<pre>";
        print_r($array_pruebas[2]["item"]);
        echo "</pre>";
    foreach ($array_pruebas as $key => $value) {
    // echo ($key . "<br>");
            $resultadoArray =  ($value["instock"][0]);
        foreach ($resultadoArray as $key => $value) {
                //echo ($key . "<br>");
        }
    }
    //echo( $array_pruebas[4]["instock"][0]["warehouse"] )
    */
    foreach ($array_pruebas as $key => $value) {
        /*
        echo "**************valor instock*****************";
        echo "<br>";
        echo ($key);
*/
        $instock = $value["instock"];
       /* echo "<pre>";
        print_r($value["instock"]);
        echo "</pre>";
        echo "**************valor array instock*****************";
        echo "<br>";*/
        foreach ($instock as $key => $valueStock) {
            echo ($key);
            echo "<pre>";
            print_r($valueStock["warehouse"]);
            echo "</pre>";
            echo "<hr>";

/*
            foreach ($valueStock as $key => $valuearray) {
                echo ($key);
                
                
                echo "<pre>";
                print_r($valuearray["warehouse"]);
                echo "</pre>";
                echo "";
            }

 
        echo "**************valores*****************";
            echo "<br>";
            foreach ($valueStock as $key => $valuePosicional) {
                echo ($key);
            echo "<pre>";
           // print_r($valuePosicional);
            echo "</pre>";

           
            echo "**************valores del array *****************";
            echo "<br>";
                foreach ($valuePosicional as $key => $valueFi) {

                        echo ($key);
                        echo "<pre>";
                        print_r($valueFi);
                        echo "</pre>";
                   }

            }*/
        }
        
        
    }
    foreach ($array_pruebas as $key => $value) {
        echo "<pre>";
        print_r($value["status"]);
        echo "</pre>";
        //var_dump($value["status"]);
    }
    echo ( $array_pruebas[0]["size"]["h"]);
    echo "****************************************************************************";
        echo "<pre>";
        print_r($array_pruebas);
        echo "</pre>";


    ?>





</body>

</html>