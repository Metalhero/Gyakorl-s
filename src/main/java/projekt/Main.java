package projekt;

import projekt.Fallen.Gyakorlas;
import projekt.Gyuri.Munka;
import projekt.Dezso.TestDezso;

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
        gyuri.testfgv();
        TestDezso dezso= new TestDezso();
        Gyakorlas fallen = new Gyakorlas();





    }


}
