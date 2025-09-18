/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author wanyuchiu
 */
public class VitalSignHistory {
    ArrayList<VitalSign> history;//ArrayList

    public VitalSignHistory() {
        this.history = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
    public VitalSign addNewVital(){
        //instantiate the Vital Sign
        VitalSign newVital = new VitalSign();
        //put the newly created object to arraylist
        history.add(newVital);
        //return the vital sign
        return newVital;
    }
    
    public void deleteVital(VitalSign vs ){
        history.remove(vs);
    }
    
}
