/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanResoursePart;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Employee {

   private String nume;
   private String prenume;
   private String dataNasteri;
   private Specialitate specialitate;

    public Employee(String nume, String prenume, String dataNasteri, Specialitate specialitate) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasteri = dataNasteri;
        this.specialitate = specialitate;

    }

    public Employee() {
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getDataNasteri() {
        return dataNasteri;
    }

    public Specialitate getSpecialitate() {
        return specialitate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setDataNasteri(String dataNasteri) {
        this.dataNasteri = dataNasteri;
    }

    public void setSpecialitate(Specialitate specialitate) {
        this.specialitate = specialitate;
    }
    
    @Override
    public String toString() {

        return this.nume + " " + this.prenume + " " + this.dataNasteri + " " + this.specialitate + " ";
    }

}
