package projekt;


import projekt.contributors.Gyuri.Ponty;

public class Masodiknap {

    public static void main(String[] args) {

        Ponty gyuri=new Ponty();

        System.out.println(Ponty.nbYear(1500000, 0.25, 1000, 2_000_000));


        int[] array={1,2,3,4,};
        int[] array2=new int[array.length];

        System.arraycopy(array,1,array2,1,2);

        for (int i : array2) {
            System.out.print(" " + i);
        }

        System.out.println();

        int a= 11;
        int b= a >> 3;
        System.out.println(b);


        String st = "fapapucs";
        System.out.println(st.hashCode());
        String st2 = "fapapucs";
        System.out.println(st);
        st="asd";
        System.out.println(st2);
    }

}