package fr.lesformulix.utils;

public class Parameters {

    /*
     * Cette propriété active ou désactive la méthode PRLN, ce qui active ou non les messages dans la console.
     */
    public static Boolean deploy = true;

    /*
     * Paramètres de la BDD
    /*
	private static String admin = "mcdoritz";
	private static String adminpw = "corvette$72";*/
    private static final String name = "lesFormulixV1";
    public static String url = "jdbc:mysql://awseb-e-vygctkpbbb-stack-awsebrdsdatabase-bzacb5oys3rj.che884y0q5jz.eu-west-3.rds.amazonaws.com:3306/"+ name +"?useUnicode=yes&characterEncoding=UTF-8";

    public static String admin = !deploy ? "root" : "mcdoritz";
    public static String adminpw = !deploy ? "" : "Corvette$72#19";

    /*
     * Couleurs de console :
     */
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    public static final String BACKGROUND_BLACK = "\u001B[40m";
    public static final String BACKGROUND_RED = "\u001B[41m";
    public static final String BACKGROUND_GREEN = "\u001B[42m";
    public static final String BACKGROUND_YELLOW = "\u001B[43m";
    public static final String BACKGROUND_BLUE = "\u001B[44m";
    public static final String BACKGROUND_PURPLE = "\u001B[45m";
    public static final String BACKGROUND_CYAN = "\u001B[46m";
    public static final String BACKGROUND_WHITE = "\u001B[47m";

    public static final String BACKGROUND_DARK_BLACK = "\u001B[100m";
    public static final String BACKGROUND_DARK_RED = "\u001B[101m";
    public static final String BACKGROUND_DARK_GREEN = "\u001B[102m";
    public static final String BACKGROUND_DARK_YELLOW = "\u001B[103m";
    public static final String BACKGROUND_DARK_BLUE = "\u001B[104m";
    public static final String BACKGROUND_DARK_PURPLE = "\u001B[105m";
    public static final String BACKGROUND_DARK_CYAN = "\u001B[106m";
    public static final String BACKGROUND_DARK_WHITE = "\u001B[107m";

    public static final String DARK_RED = "\u001B[0;31m";
    public static final String DARK_GREEN = "\u001B[0;32m";
    public static final String DARK_YELLOW = "\u001B[0;33m";
    public static final String DARK_BLUE = "\u001B[0;34m";
    public static final String DARK_PURPLE = "\u001B[0;35m";
    public static final String DARK_CYAN = "\u001B[0;36m";
    public static final String DARK_WHITE = "\u001B[0;37m";

    /* Mise en forme des objets DAO */
    public static String formattingDAO(String daoObject){
        return YELLOW + daoObject + RESET;
    }

}
