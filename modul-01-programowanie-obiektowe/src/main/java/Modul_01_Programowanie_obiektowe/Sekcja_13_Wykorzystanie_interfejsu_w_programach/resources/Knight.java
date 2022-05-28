package Modul_01_Programowanie_obiektowe.Sekcja_13_Wykorzystanie_interfejsu_w_programach.resources;

public class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void howItEnds() {
        this.quest.process();
    }
}
