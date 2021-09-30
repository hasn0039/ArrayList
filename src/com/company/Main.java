package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	String[] names = {"Harry","Ron","Hermione"};
        ArrayList<String> people = new ArrayList<>(List.of(names));

        people.add("Draco");
        System.out.println(people);

        people.add("Neville");
        System.out.println(people);

        people.remove("Draco");//her remover jeg et objekt
        System.out.println(people);

        people.add("Luna");//jeg tilføje et objekt til arraylist
        // dette objekt bliver hæftet bagerst på arraylist
        System.out.println(people);

        List youthree = people.subList(0,3); //sublist kan hente en bid fra arraylist
        //som f.eks 0 til 3 det vil sige at jeg får "Harry, Ron, Hermione" udskrevet
        System.out.println(youthree);

        people.add(1,"Cho");//her tilføjer jeg et objekt til en bestemt plads i
        // mit arraylist så "cho" bliver indsat på 1 plads og resten bliver rykket
        System.out.println(people);

        people.set(2,"Ginny"); // set bruges til at udskifte et objekt fra mit arraylist
        System.out.println(people);

        people.addAll(List.of(new String[]{"Fred", "George"}));//her tilføjer jeg en string til mit array eller
        // et nyt array til mit
        System.out.println(people);

        people.size();//size bruge jeg til at finde størrelsen på mit arraylist
        System.out.println(people.size());

        people.get(7);//ved hjælp af get kan jeg hente et objekt fra arraylist
        System.out.println(people.get(7));

        people.remove(0);//denne fjerne et objekt fra arraylist ved at
        // skrive objektets position
        System.out.println(people);

        people.contains("Ginny"); //boolean'ish
        System.out.println(people.contains("Ginny"));

        //people.clear(); "clear Tømmer mit arraylist så jeg står tilbage
        // med "[]" hvilket er et tomt arraylist
        //System.out.println(people);

        people.lastIndexOf("Neville");
        System.out.println(people.lastIndexOf("Neville"));

        people.get(3);
        System.out.println(people.get(3));






    }
}
