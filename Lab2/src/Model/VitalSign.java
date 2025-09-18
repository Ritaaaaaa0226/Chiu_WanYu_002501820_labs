/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author wanyuchiu
 */
public class VitalSign {
    //attribute
    String data;
    float temperature;
    double bloodpressure;
    int pulse;
    boolean isConcious;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public double getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(double bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public boolean isIsConcious() {//change get funtion to isfunction
        return isConcious;
    }

    public void setIsConcious(boolean isConcious) {
        this.isConcious = isConcious;
    }
    
    @Override
    public String toString(){ //Turn Object to String, Computer will view as Hash code but will disaplay in String type
         return getData();
    }
   
}
