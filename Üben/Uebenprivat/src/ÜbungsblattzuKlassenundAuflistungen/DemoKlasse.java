package ÜbungsblattzuKlassenundAuflistungen;

public class DemoKlasse {
    public static void main(String[] args) {

        Event event1=new Event("rammstein","frohnleiten",40.5);
        Event event2=new Event("linkin park","graz",80);
        Event event3=new Event("david friedl","frohnleiten",5);
        Event event4=new Event("lisa marie","graz",4);

        EventKalender eventKalender=new EventKalender();
        eventKalender.add(event1);
        eventKalender.add(event2);
        eventKalender.add(event3);
        eventKalender.add(event4);
        eventKalender.print();

        System.out.println(eventKalender.getByTitle("rammstein"));
        System.out.println("..........");
        System.out.println(eventKalender.getByOrt("graz"));
        System.out.println("............");
        System.out.println(eventKalender.getByEintrittsPreis(5,70));
        System.out.println("...........");
        System.out.println(eventKalender.getMostExpensiveByOrt("graz"));
        System.out.println("...........");
        System.out.println(eventKalender.getAvgPreisByOrt("graz"));
        System.out.println("WasserstandBeispiel");

        Wasserstand w1 = new Wasserstand(1, "Mur", 3.75, 6.0, 100_000);
        Wasserstand w2 = new Wasserstand(2, "Mur", 6.15, 6.0, 125_000);
        Wasserstand w3 = new Wasserstand(3, "Enns", 2.97, 4.5, 100_000);
        Wasserstand w4 = new Wasserstand(4, "Enns", 4.51, 4.5, 150_000);
        Wasserstand w5 = new Wasserstand(5, "Donau", 7.00, 7.25, 130_000);
        Wasserstand w6 = new Wasserstand(6, "Donau", 5.78, 7.25, 190_000);

        WasserstandManager wmgr=new WasserstandManager();
        wmgr.add(w1);
        wmgr.add(w2);
        wmgr.add(w3);
        wmgr.add(w4);
        wmgr.add(w5);
        wmgr.add(w6);

        System.out.println(wmgr.findById(2));
        System.out.println();
        System.out.println(wmgr.findAllByGewaesser("Donau"));
        System.out.println();
        System.out.println(wmgr.calcMittlererWasserstand("Donau"));
        System.out.println();
        System.out.println(wmgr.findByZeitpunkt(130_000,190_000,"Donau"));
        System.out.println();
        System.out.println(wmgr.findLastWasserstand("Mur"));
        System.out.println();
        System.out.println(wmgr.findForAlarmierung());












        }
}
