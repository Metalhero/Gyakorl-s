package projekt.contributors.Gyuri;

public class Ponty {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int totalPop=p0;
        int year=0;
        while (totalPop<=p){
            totalPop=totalPop+(int)(totalPop*percent*0.01)+aug;
            year++;
        }
        return year;
    }

    public void válaszokPonty(){

        boolean b=true; //false
        byte by=100;
        short sh=1;
        int i=Integer.MAX_VALUE;
        long l=2_305_324l;
        float fl=0.4323f;
        double d=0.235212412;
        char ch='a';
        //+1

        System.out.println("select * from table;"); //read
        System.out.println("insert into table (table1, table2) values (value1, value2);");
        System.out.println("update table set column1=valueNew, column2=valueNew where id IN (1,5);"); //update
        System.out.println("delete from table where id=2"); //delete

        System.out.println("create table namae" +
                            "(id int auto_increment unique," +
                            "name varchar(255)," +
                            "");





    }
}