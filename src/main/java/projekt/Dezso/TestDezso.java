package projekt.Dezso;

import java.sql.SQLOutput;

public class TestDezso {
    public void answers() {
        // 1. feladat
        System.out.println("Az OOP az \"Objektum Orientált Programozásnak\" a mozaikszava. Különböző osztályokat hozunk létre, melyek függvényeket, metódusokat és változókat tartalmaznak. Ezeket az osztályokat szoktuk példányosítani, és ezután ezeket már objektumoknak nevezzük. ");
        //2. feladat
        System.out.println("Az \"Exceptions\" 2 fő ága az \"checked exception\" és az \"uncheked exception\". A checked exception fordítás idejű kivételek, az uncheked exceptions pedig fordítás idejűek. Checked exception pl mikor egy osztály nem található, unchecked pl mikor a tömböt alul vagy túl címezzük.");
        //3. feladat
        System.out.println("ObjectWriter-rel. Serializáció = Objektumok átalakítása, azaz kimentése file-ba. Deserializáció = File beolvasás");
        //4. feladat
        System.out.println("Szálak létrehozása a Thread osztály példányosításával vagy pedig a runnable-t implementáljuk egy osztályba");
        //5. feladat
        System.out.println("rekurzív = függvényen belül hívjuk önmagát");
        //6. feladat
        System.out.println("List =lassabban lehet változtatni,implementálja a listát    , LinkedList=gyorsabban lehet változtatni, implementálja a queue-t");
        //7. feladat
        System.out.println("1 elem csak egyszer szerepelhet");
    }

    public boolean palindrome (String szoveg){
        String forditott ="";
        for (int i = szoveg.length() - 1; i <szoveg.length() && i>=0 ; i--) {
            forditott +=szoveg.charAt(i);

        }
        if ((szoveg.compareTo(forditott)) == 0){
            return true;
        }else
            return false;


    }


}
