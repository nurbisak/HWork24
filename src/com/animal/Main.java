package com.animal;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        /**
         Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
         Метод натыйжаны жаңы set катары кайтарышы керек.
         Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
         Мисалы: [1, 2, 3} жана {0, 1, 2]
         Жооп: [0, 3]
         методу болушу керек
         */
        Set<Integer>set =new HashSet<>();
       set.add(0);
       set.add(1);
       set.add(2);
       set.add(35);
       set.add(7);
       Set<Integer>set1=new HashSet<>();
       set1.add(1);
       set1.add(2);
       set1.add(3);
       set1.add(4);
       set1.add(35);
        System.out.println(symmetricDifference(set,set1));
    }   public static Set<Integer> symmetricDifference (Set<Integer> set, Set<Integer> set1){
         Set<Integer>set2=new HashSet<>(set);
         set2.removeAll(set1);
         set1.removeAll(set);
         set2.addAll(set1);


        return set2;

    }

}