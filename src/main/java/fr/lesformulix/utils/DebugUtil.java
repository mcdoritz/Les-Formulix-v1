package fr.lesformulix.utils;

import java.util.ArrayList;
import static fr.lesformulix.config.StaticVariables.*;

public class DebugUtil {

    public static void prln(String message){
        if(debug){
            System.out.println(message);
        }
    }
    public static void prln(int message){
        if(debug){
            System.out.println(message);
        }
    }
    public static void prln(float message){
        if(debug){
            System.out.println(message);
        }
    }
    public static void prln(double message){
        if(debug){
            System.out.println(message);
        }
    }
    public static void prArStr(ArrayList<String> message){
        if(debug){
            for(String str:message){
                prln("ArrayList<String> : ");
                System.out.print(str + ", ");
            }
        }

    }
    public static void prArInt(ArrayList<Integer> message){
        if(debug){
            for(int str:message){
                prln("ArrayList<Integer> : ");
                System.out.print(str + ", ");
            }
        }
    }

    public static void prArFl(ArrayList<Float> message){
        if(debug){
            for(float str:message){
                prln("ArrayList<Float> : ");
                System.out.print(str + ", ");
            }
        }
    }
    public static void prArDou(ArrayList<Double> message) {
        if(debug){
            for(double str:message){
                prln("ArrayList<Double> : ");
                System.out.print(str + ", ");
            }
        }
    }
    public static void pr(String message){
        if(debug){
            System.out.print(message);
        }
    }
}
