/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author david
 */
public class dataipk {
    private String nim;
    private Integer semesterhitung;
    private Double ips;

    public dataipk(String nim, Integer semesterhitung, Double ips) {
        this.nim = nim;
        this.semesterhitung = semesterhitung;
        this.ips = ips;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Integer getSemesterhitung() {
        return semesterhitung;
    }

    public void setSemesterhitung(Integer semesterhitung) {
        this.semesterhitung = semesterhitung;
    }

    public Double getIps() {
        return ips;
    }

    public void setIps(Double ips) {
        this.ips = ips;
    }
}
