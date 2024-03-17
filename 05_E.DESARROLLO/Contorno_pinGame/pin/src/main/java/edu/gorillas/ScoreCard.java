package edu.gorillas;

public class ScoreCard {

    private String scoreCard = "";

    public ScoreCard() {
    };

    public String getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
    }

    public int calculateScore() {

        int result = 0;

        // Convertir la cadena a un array de caracteres
        char[] caracteres = scoreCard.toCharArray();

        // Crear un array de números
        int[] numeros = new int[caracteres.length];

        // Recorrer el array de caracteres y convertir cada carácter a un número
        for (int i = 0; i < caracteres.length; i++) {
            numeros[i] = Integer.parseInt(String.valueOf(caracteres[i]));

            result += numeros[i];
        }
        return result;
    }
    
    public int calculatePerfect() {
        int result = 0;

        return result;
    }

}