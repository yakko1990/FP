public class Main {
    public static void main(String[] args) {
        String[] peliculas = new String[]{"sol", "solo en casa","La jungla de cristal"," Diamantes de sangre","Regreso al futuro","La guerra de "};
        String title =play(peliculas,4);
        System.out.println(" ");
        stop(title);

        int[][]matrix ={{1,2,3},{4,5,6},{7,8,9}};

    }

    public static String play( String[] array, int indice){
        if((indice < array.length)&& indice>0) {
            indice--;
            String title = array[indice];
            System.out.println(title);
            return title;
        }else System.out.println("ese indice esta fuera de catálogo");
        return "";

    }
    public static void stop(String titulo){
        System.out.println("stop" + titulo);
    }

}