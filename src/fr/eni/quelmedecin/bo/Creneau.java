package fr.eni.quelmedecin.bo;

import java.time.LocalTime;

public class Creneau {
    private LocalTime time;
    private int minutes;
    MedecinGeneraliste med;
    Patient pt;

    public Creneau(LocalTime time, int minutes, MedecinGeneraliste med) {
        this.time = time;
        this.minutes = minutes;
        this.med = med;
        med.ajouterCreneau(this);
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public MedecinGeneraliste getMed() {

        return med;
    }

    public void setMed(MedecinGeneraliste med) {
        this.med = med;
    }

    public void afficher(){
        System.out.println(this.getTime() + " - " + this.getTime().plusMinutes(this.getMinutes()) + "(" + this.getMinutes() + " minutes)");
        //System.out.println(this.getMinutes());
        System.out.println(this.getMed().toString());
    }

    @Override
    public String toString() {
        return this.getTime() + " - " + this.getTime().plusMinutes(this.getMinutes()) + "(" + this.getMinutes() + " minutes)";
    }
}
