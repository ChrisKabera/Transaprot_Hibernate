/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsans.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author GRACE
 */
@Entity(name="Nybggbus")
public class Trans {
    @Id
    private String PlateNo;
    private String NofSeats;
    private String OFname;
    private String OLname;
    private String NoDays;
    

    public String getPlateNo() {
        return PlateNo;
    }

    public void setPlateNo(String PlateNo) {
        this.PlateNo = PlateNo;
    }

    public String getNofSeats() {
        return NofSeats;
    }

    public void setNofSeats(String NofSeats) {
        this.NofSeats = NofSeats;
    }

    public String getOFname() {
        return OFname;
    }

    public void setOFname(String OFname) {
        this.OFname = OFname;
    }

    public String getOLname() {
        return OLname;
    }

    public void setOLname(String OLname) {
        this.OLname = OLname;
    }

    public String getNoDays() {
        return NoDays;
    }

    public void setNoDays(String NoDays) {
        this.NoDays = NoDays;
    }

   

    
}
