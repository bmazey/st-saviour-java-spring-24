public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        String[][] solidRug = new String[11][11];
        for (int i = 0; i < solidRug.length; i++){
            for (int j = 0; j < solidRug[i].length; j++){
                System.out.print(solidRug[i][j]);
            }
        }
        return new String[0][0];
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        // TODO implement horizontal()
        return new String[0][0];
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        // TODO implement vertical()
        return new String[0][0];
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        // TODO implement diagonal()
        return new String[0][0];
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        // TODO implement plaid()
        return new String[0][0];
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        // TODO implement argyle()
        return new String[0][0];
    }
}
