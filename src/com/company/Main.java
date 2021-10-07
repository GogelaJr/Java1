// დავალება 1 ილია გოგელია

package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static Integer[] addtolist(Integer ins, Integer [] list, Integer leng){
        int i;
        Integer newlist[] = new Integer[leng + 1];
        for (i = 0; i < leng; i ++)
            newlist[i] = list[i];
        newlist[leng] = ins;
        return newlist;
    }

    public static int usg(int a, int b){
        if(a==0)
            return b;
        return usg(b%a, a);

    }
    public static int umciresi(int a, int b){
        return (a / usg(a, b)) * b;
    }
    public static int udidesi(int[]a, int raodenoba){
        Arrays.sort(a);
        return a[raodenoba-1];
    }
    public static int umci(int[]a, int raodenoba){
        Arrays.sort(a);
        return a[0];
    }

    public static void main(String[] args) {
	// 1
        System.out.printf("1)%nC++%nC#%nJava%nPascal%nPHP%nJavaScript%nActionScript" );

        //2
        int first;
        int second;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n2) Sheiyvanet pirveli ricxvi");
        first = sc.nextInt();
        System.out.println("\n Sheiyvanet meore ricxvi");
        second = sc.nextInt();
        int fs;
        int sf;
        fs = first/second;
        sf = second%first; // ნაშთის მიღება *** % *** ოპერაციით მახსოვს რომ ხდებოდა
        System.out.println("\n"+"2)"+"\n"+fs+" pirvelis gayofa meoreze");
        System.out.println("\n"+sf + " meoris gayofa pirvelze nashti"); // ნაშთს სწორად არ აბრუნებს რატომღაც

        //3
        int pirveli;
        int meore;
        int mesame;
        int jami;
        int namravli;
        System.out.println("\n3) Sheiyvanet pirveli ricxvi");
        pirveli = sc.nextInt();
        System.out.println("\n Sheiyvanet meore ricxvi");
        meore = sc.nextInt();
        System.out.println("\nSheiyvanet mesame ricxvi");
        mesame = sc.nextInt();
        jami = pirveli + meore + mesame;
        namravli =pirveli * meore * mesame;
        System.out.println("\n"+jami+" Sami ricxvis jami\n" +namravli+" Sami ricxvis namravli");

//        4
        System.out.println("\n4) Sheiyvanet otxnishna ricxvi");
        int meotxe = sc.nextInt();
        String meostr = String.valueOf(meotxe);
        for(int i = 0; i < meostr.length(); i++){
            int str = Character.digit(meostr.charAt(i), 10);
            System.out.println(str);
        }

        //5-6
        System.out.println("\n5-6) Sheiyvanet ricxvi romelic sheicavs otxs an met cifrs"); //მეხუთე და მეექვსე გავაერთიანე რადგან ეს კოდი ორივე დავალებას ასრულებს.
        int otxnishna  = sc.nextInt();
        jami = 0;
        int ricxvi = 0;
        while(otxnishna>0){
            ricxvi = otxnishna%10;
            jami = jami + ricxvi;
            otxnishna =  otxnishna / 10;
        }
        System.out.println("\n"+jami+" Aris cifrta jafi sheyvanil ricxvshi" );

        //7
        System.out.println("\n7) Sheiyvanet pirveli ricxvi");
        int meshv1 = sc.nextInt();
        System.out.println("\n Sheiyvaent meore ricxvi");
        int meshv2 = sc.nextInt();
        int usg = usg(meshv1, meshv2);
        int umciresi = umciresi(meshv1, meshv2);
        System.out.println("\nUdidesi saerto gamyofi "+ meshv1 + " da " + meshv2 +"stvis aris: " +usg);
        System.out.println("\n Umciresi saerto jeradi aris: " + umciresi);

        //8
        System.out.println("\n8) 0-dan 50-mde\n");
        int sacy= 0;
        int dasas = 50;
        for(int c=1; c<dasas; c++){
            System.out.println(c);
        }
        //9
        int a[] = {10,21,40,42,22,1,500,86};
        System.out.println("\n9) Masivis elementebia : " + Arrays.toString(a) +"\nMasivshi udidesi ricxvia:"  + udidesi(a, 8) +
        "\nUmciresia :"+ umci(a, 8) );

        //10

        Integer b[]= {1,5,77,55,6,88,982,10};
        System.out.println("\n10)\n");
        Arrays.sort(b);
        for(int rise=0; rise<b.length; rise++){
            System.out.println(b[rise]);

        }
        //11
        Integer leng = 8;
        Integer c[] = {5,25,243,242,356,3,256,854};
        System.out.println("\n11)\nSheiyvanet listshi shesayvani ricxvi: ");
        Integer insert = sc.nextInt();
        c = addtolist(insert, c, leng );
        System.out.println("\nSheviyvanet "+ insert + "\nAxali listia" + Arrays.toString(c)); // აქ რატომ იძახებს ინფუთს ისევ?

        //12
        leng = 8;
        Integer[] desc = {2, 45, 25, 64, 48, 94, 87, 85};
        System.out.println("\n12)\n Sheiyvanet listshi shesayvani ricxvi");
        Integer entry = sc.nextInt();
        desc =  addtolist(entry, desc, leng);
        Arrays.sort(desc, Collections.reverseOrder());
        System.out.println("\nSheviyvanet "+ entry + "\nAxali listia klebadobit" + Arrays.toString(desc));

    }
}
