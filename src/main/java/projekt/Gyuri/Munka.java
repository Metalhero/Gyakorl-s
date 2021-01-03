package projekt.Gyuri;

public class Munka implements Runnable {


    public String testfgv(){
        System.out.println("test");
        return "test";
    }

    public void answers(){
        System.out.println("1.: Az OOP mint \"Objektum Orientált Programozás\" 4 fő elemből áll:\n " +
                "\tEnkapszuláció: Ami az objektumok egységbezárását fejezi ki, amit csak lehet azt egy helyen kell kezelnünk.\n" +
                "\tAbsztraktivitás: \n" +
                "\tÖröklődés: Az objektumok egymás alá fölé rendeltségéből fakadóan egymástól örökölnek tulajdonságokat amivel a programrészek ujrafelhasználhatóak");
        System.out.println("Exceptionnek két fajtáját különböztetjük meg: Checked exceptions, és az unchecked exceptions(másnéven errors)\n" +
                "\terrorokkal nemtudunk mit kezdeni(elfogy a memória), az exceptionokkal viszont igen, illetve a checked exception fordításidőben jelentkezik(errors legtöbbször a felhasználó oldaláról generálódik)");
        System.out.println("1.lépés: Létrehozok FileOutputStreamet (fontos hogy itt minden karakter számként szerepel)\n" +
                "\t2.lépés: A kiírandó objektum implementálja a\"Serializeable\" interfacet\n" +
                "\t3.lépés: Megadott path-al kiírom a FoS segítségével\n" +
                "\tserializálás: Egy objektumot felruház azzal a tulajdonsággal hogy kiírhassuk\n" +
                "\tde-serializálás: A serializálás inverz változata amikor egy már kiírt objektumot visszakódolunk programkóddá");
        System.out.println("1. Amikor interfaceval hozzuk létre, az adott osztoályban implementáljuk a runnablet és példányosításkor: Thread th = new Thread(objektum)" +
                "\t2. Amikor kiterjesztjük tehát class extends Thread és a meghívás oldalán pedig a run metódusát meghívjuk");
        System.out.println("Rekurzív függvény amikor egy függvény meghívja saját magát");
        System.out.println("List a Collections frameworks része ami dinamikusan tárol adatokat. A Linked list a láncolt lista pedig tárolja az előtte és utána lévő elemeket is");
        System.out.println("Set legfőbb tulajdonsága hogy egy értéket csak egyszer vehet fel, Tehát nem tartalmazhat duplikációt");
    }


    @Override
    public void run() {
        answers();
    }
}
