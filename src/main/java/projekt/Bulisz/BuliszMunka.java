package projekt.Bulisz;

import java.io.Serializable;
import java.util.Locale;

public class BuliszMunka implements Serializable, Runnable, Comparable {
    public void answers(){
        System.out.println("válasz1:A program az objektum adatain dolgozik. Az objektum zárt (encapsulation), az objektum működése annak belügye. \n" +
                "Az OOP másik fő jellemzője a polimorfizmus. Az objektum megszólításához képest különböző képpen válaszol. \n" +
                "");
        System.out.println("válasz2: checked Exception, unchecked exception....?");
        System.out.println("válasz3: txt file-ba, pl BufferedWrite \n" +
                "Bináris formátumba, pl Serialization és bináris Write");
        System.out.println("válasz4: Thread ibterface használata/n" +
                "és Többszállú kezeléssel (elfelejtettem a nevét)");
        System.out.println("válasz5: futása során meghívja saját magát");
        System.out.println("válasz6: A csak egy Interface, példányt nem lehet létrehozni belőle.\n" +
                "példányai lehetnek ArrayList és LinkedList .. .");
        System.out.println("válasz7: Minden eleme csak egyszer létezhet, Iterálható, fajtája a HashSet, TreeSet(sorbarendezett)");
    }

    @Override
    public void run() {
        answers();
    }

    @Override
    public int compareTo(Object o) {
        return this.hashCode()-o.hashCode();
    }

    @Override
    public String toString() {
        return String.valueOf(this.hashCode());
    }

    public static boolean palindroma (String text){
        String result="";
        for (int i = text.length()-1; i >= 0; i--) {
            result+=text.charAt(i);
        }
        if(result.toLowerCase().equals(text.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }

    public static String kod(String text){
        String result="";
        for (int i = 0; i < text.length(); i++) {
            if(text.equalsIgnoreCase(" ")) result+=(char)36;
            else result+=(char)((int)text.toLowerCase().charAt(i)-5);
            System.out.println(result);
        }
        return result;
    }

}
