public class TurkishRug {

    // How to create an emoji: 
    // https://stackoverflow.com/questions/53194987/how-do-i-insert-an-emoji-in-a-java-string

    // Emoji unicode reference:
    // https://apps.timwhitlock.info/emoji/tables/unicode

    // Creates a solid 2D String array.
    public static String[][] solid() {
        String appleEmoji = new String(Character.toChars(0x1F34F));
        String[][] solidRug = new String[11][11];
        for (int i = 0; i < solidRug.length; i++){
            for (int j = 0; j < solidRug[i].length; j++){
                solidRug[i][j] = appleEmoji;
            }
        }
        return solidRug;
    }
    
    // Creates a horizontal striped 2D String array. 
    public static String[][] horizontal() {
        String appleEmoji = new String(Character.toChars(0x1F34F));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] horizontalRug = new String[11][11];
        for (int i = 0; i < horizontalRug.length; i++){
            for (int j = 0; j < horizontalRug[i].length; j++){
                if (i % 2 == 0) {
                    horizontalRug[i][j] = appleEmoji;
                } else {
                    horizontalRug[i][j] = swirlEmoji;
                }
            }
        }
        return horizontalRug;
    }

    // Creates a vertical striped 2D String array.
    public static String[][] vertical() {
        String appleEmoji = new String(Character.toChars(0x1F34F));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] verticalRug = new String[11][11];
        for (int i = 0; i < verticalRug.length; i++){
            for (int j = 0; j < verticalRug[i].length; j++){
                if (j % 2 == 0) {
                    verticalRug[i][j] = appleEmoji;
                } else {
                    verticalRug[i][j] = swirlEmoji;
                }
            }
        }
        return verticalRug;
    }

    // Creates a diagonally striped 2D String array.
    public static String[][] diagonal() {
        String appleEmoji = new String(Character.toChars(0x1F34F));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] diagonalRug = new String[11][11];
        for (int i = 0; i < diagonalRug.length; i++) {
            for (int j = 0; j < diagonalRug[i].length; j++) {
                diagonalRug[i][j] = swirlEmoji;
                if (i % 2 == 0 && j % 2 == 0) {
                    diagonalRug[i][j] = appleEmoji;
                }
                if (i % 2 != 0 && j % 2 != 0) {
                    diagonalRug[i][j] = appleEmoji;
                }
            }
        }
        return diagonalRug;
    }

    // Creates a plaid 2D String array.
    public static String[][] plaid() {
        String appleEmoji = new String(Character.toChars(0x1F34F));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] plaidRug = new String[11][11];
        for (int i = 0; i < plaidRug.length; i++) {
            for (int j = 0; j < plaidRug[i].length; j++) {
                plaidRug[i][j] = swirlEmoji;
                if (i % 2 == 0 && j % 2 == 0) {
                    plaidRug[i][j] = appleEmoji;
                }
            }
        }
        return plaidRug;
    }

    // BONUS: Creates an argyle 2D String array.
    public static String[][] argyle() {
        String appleEmoji = new String(Character.toChars(0x1F34F));
        String swirlEmoji = new String(Character.toChars(0x1F365));
        String[][] argyleRug = new String[11][11];
        for (int i = 0; i < argyleRug.length; i++) {
            for (int j = 0; j < argyleRug[i].length; j++) {
                if (i == j) {
                    argyleRug[i][j] = appleEmoji;
                } else if (i + j == 10) {
                    argyleRug[i][j] = appleEmoji;
                } else if (i + j == 5) {
                    argyleRug[i][j] = appleEmoji;
                } else if (j - i == 5) {
                    argyleRug[i][j] = appleEmoji;
                } else if (i - j == 5) {
                    argyleRug[i][j] = appleEmoji;
                } else if (i + j == 15) {
                    argyleRug[i][j] = appleEmoji;
                } else {
                    argyleRug[i][j] = swirlEmoji;
                }
            }
        }
        return argyleRug;
    }
}