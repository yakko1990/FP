<?php
namespace traits;  

class Logger{
    public function log(string $msg)
    { 
        echo '<pre style="color:red">';
        echo date('Y-m-d h:i:s') . ':' .                      
                         $msg . '<br/>';                      
        echo '</pre>';
    }
}
