package fr.lesformulix.config;

/*
Cette classe contient les variables à régler pour le comportement global de l'application
 */
public class StaticVariables {

    /*
    Active : DebugUtil.prln,
     */
    public static Boolean debug = true;

    /*
    L'adresse distante du dépôt des ressources de l'app
     */
    public static String cdn = "fmx-cdn.floriandorizon.fr";

    /*
    Les trois types de messages à utiliser par thymeleaf
     */
    public static String errorMsg(){return "errorMsg";}
    public static String successMsg(){return "successMsg";}
    public static String infoMsg(){return "infoMsg";}
}
