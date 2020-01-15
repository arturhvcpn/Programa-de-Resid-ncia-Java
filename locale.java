package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
/*
        Locale locale = Locale.getDefault();

        for(Locale loc: Locale.getAvailableLocales()){
            System.out.println(loc);
            System.out.println(loc.getLanguage());
            System.out.println(loc.getCountry());
            System.out.println(loc.getDisplayName());
            System.out.println("#######################");
        }*/
        Locale en = new Locale("en","GB");
        System.out.println(en.getDisplayCountry());

        NumberFormat nf =  NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        System.out.println(nf.format(101100d));

        NumberFormat nf2 =  NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
        System.out.println(nf2.format(101100d));
    }
}
