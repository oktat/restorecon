/*
 * Sallai András, 2024-02-13
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki mikor.
 */
import java.util.Scanner;

public class MainConsole {
    /*
     * Az sc obejektum lehetne a MainConsole tagváltozója.
     * De be is zárhatnánk try() szerkezettel.
     * Esetleg a konstruktro végén le lehetne zárni.
     * Ez még majd gondolkodunk.
     */
    /* Most jön a az ANA kódocska */
    //Az eancode tárolása
    String ec = "";

/* Most jön a nevecske */
// A bekért név tárolása:
String nl = "";

    /* Most jön a mennyiségecske */
    //Mennyiség:
    String qs = "";
    public MainConsole() {
        /* fejrész rajzolása */
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%22s%20s\n", "Raktár", "║");
        System.out.println("╚═════════════════════════════════════════╝");        
        
        /* Bekérés következik */
        Scanner febir = new Scanner(System.in);        

System.out.println("──────────────────────────────────────────");
System.out.print("EAN kód: ");
ec = febir.nextLine();

System.out.println("──────────────────────────────────────────");
 System.out.print("Név: ");
 nl = febir.nextLine();

System.out.println("──────────────────────────────────────────");
 System.out.print("Mennyiség: ");
  qs = febir.nextLine();
    }
}
