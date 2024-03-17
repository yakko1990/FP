<?php


    function mostrarlista(){

        $archivo = $_FILES["archivo"]; 
        $keys =array_keys($archivo);
        $count = sizeof($archivo[$keys[0]]);
    
        for ($i=0; $i <$count ; $i++) { 
            $num = $i+1;
            echo "<p>fichero $num</p>";
            
            echo "<ol>";    
            foreach ($keys as $key ) {
                $value = $archivo [$key] [$i];
                echo "<li>$key: $value.</li>"; 
            }
            echo"</ol>";
        }

    }

     function subirArchivos(){

        $archivo = $_FILES["archivo"]; 
        
        if (!is_dir("imgUp")){
            mkdir("imgUp", 0777);
        }
        
        foreach ($archivo["error"] as $key => $error) {
            $nombre_temp = $archivo["tmp_name"][$key];
            $nombre = basename($archivo["name"][$key]);
            $error = $archivo["error"][$key];
            $tamaño = $archivo["size"][$key];

            if ($error == UPLOAD_ERR_OK){          

            move_uploaded_file($nombre_temp, CARPETA_DESTINO . DIRECTORY_SEPARATOR . $nombre);
                echo "<p><h3>El archivo $nombre se ha subido correctamente</h3></p>".
                "<p> El codigo de error: $error </p>".
                "<p>El tamaño del archivo es de : $tamaño</p>";
            }

            else {               
                echo "<p><h3>ELARCHIVO $nombre NO SE HA PODIDO SUBIR</h3></p>".
                "<p>El codigo de error: $error</p>".
                "<p>El tamaño del archivo es de : $tamaño</p>";
            }
        }
    } 

?>