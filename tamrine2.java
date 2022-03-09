
import java.util.ArrayList;
import java.util.Scanner;

public class tamrine2{
    public static class dars{
        public String name_dars;
        public ArrayList<dars> hamniaz= new ArrayList<dars>();
        public ArrayList<dars> pishniaz= new ArrayList<dars>();
        public int vahed;
        public dars(String name_dars,int vahed){
            this.name_dars=name_dars;
            this.vahed=vahed;

        }
        public void Add_pishniaz(dars pishniaz){
            this.pishniaz.add(pishniaz);

        }
        public void Add_hamshniaz(dars hamniaz){
            this.hamniaz.add(hamniaz);

        }


    }
    public static void main(String[] args) {
        dars riazi_1=new dars("riazi1",3);
        dars riazi_2=new dars("riazi2",3);
        dars fizik_2=new dars("fizik2",3);
        dars gosaste=new dars("gosaste",3);
        gosaste.Add_pishniaz(riazi_1);
        gosaste.Add_hamshniaz(riazi_2);
        fizik_2.Add_pishniaz(riazi_1);
        Scanner SC=new Scanner(System.in);
        System.out.println("name dars : ");
        String name;
        ArrayList<dars> darsa_ha=new ArrayList<dars>();
        darsa_ha.add(riazi_1);
        darsa_ha.add(riazi_2);
        darsa_ha.add(fizik_2);
        darsa_ha.add(gosaste);
        name=SC.nextLine();
        for(dars i:darsa_ha){
            if(name.equals(i.name_dars)){
                System.out.println("vahed: "+i.vahed);
                System.out.println("pishniazha: ");
                for(dars k:i.pishniaz){
                    System.out.println(k.name_dars);
                }
                System.out.println("hamniazha: ");
                for(dars k:i.hamniaz){
                    System.out.println(k.name_dars);
                }


            }


        }






    }
}