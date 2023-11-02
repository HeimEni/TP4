package fr.eni.quelmedecin.bo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Rdv {
    private Creneau cr;
    private Patient pt;
    private LocalDate date;

    public Rdv(Creneau cr, Patient pt, LocalDate date) {
        this.cr = cr;
        this.pt = pt;
        this.date = date;
    }

    public void afficher(){
        System.out.println("Rendez-vous du " + LocalDate.now().getDayOfWeek() + " " + LocalDate.now().getMonth() + " " + LocalDate.now().getYear() + " " + this.cr.toString());
        System.out.println("Avec de Dr " + this.cr.getMed().toString());
        System.out.println("Pour " + this.cr.getMed());
//        System.out.println(this.date.toString());
    }
}
