package projekt;

import projekt.Bulisz.BuliszMunka;
import projekt.Fallen.Gyakorlas;
import projekt.Gyuri.Munka;
import projekt.Dezso.TestDezso;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        //Mindenki a munkáját egy külön mappában kezdje el amit a saját nevével lát el,
        //hogy átlátható legyen a dolog és ne legyen keveredés.


        //mindig mielőtt pusholod a munkádat először kössed be ide a mainbe a futtatását a programodnak
        //és lásd el olyan elnevezéssel ami egyértelművé teszi hogy kihez tartozik az aktuális belépőpont
            //pl: Munka gyuri=new Munka();      //Gyuri belépőpontja


        //Azért Maven projekt mert itt nemcsak hogy a gittel fogunk kommunikálni hanem kicsit használjuk a dependencyket és
        //gyakoroljuk a tesztelést is. Tehát mindíg mikor megírsz egy függvényt akkor írj meg hozzá egy tesztelést is: Junit


        Munka gyuri=new Munka();
        TestDezso dezso= new TestDezso();
        Gyakorlas fallen = new Gyakorlas();
        BuliszMunka bulisz=new BuliszMunka();

        //System.out.println(factorial((byte) 6));
        //setÉsComparator(bulisz);
        //writeObject(bulisz);

        System.out.println(gyuri.palindróma("rétipipitér"));


        System.out.println(BuliszMunka.palindroma("Görög"));
    }

    private static void writeObject(BuliszMunka bulisz) {
        try(ObjectOutputStream objout= new ObjectOutputStream(new FileOutputStream("oubjekt.txt"))){
            objout.writeObject(bulisz);
            objout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setÉsComparator(BuliszMunka bulisz) {
        BuliszMunka b2=new BuliszMunka();
        BuliszMunka b3=new BuliszMunka();

        Set<BuliszMunka> s=new LinkedHashSet<>();
        s.add(bulisz);
        s.add(b2);
        s.add(b3);

        System.out.println(s);
    }

    public static byte factorial(byte be){
        byte result=be;
        if(be==1) return 1;
        result*=factorial((byte) (be-1));
        return result;
    }

}