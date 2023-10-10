/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;
public class datapengguna {
      
    private String nim;   
    private Integer semester;
    private String matakuliah1;
    private String sks1;
    private String bobot1;
//    private String ips;
    private LocalDateTime created_at;

    public datapengguna(String nim, Integer semester, String matakuliah1, String sks1, String bobot1,LocalDateTime created_at) {
        this.nim = nim;
        this.semester = semester;
        this.matakuliah1 = matakuliah1;
        this.sks1 = sks1;
        this.bobot1 = bobot1;
//        this.ips = ips;
        this.created_at = created_at;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    
    public String getMatakuliah1() {
        return matakuliah1;
    }

    public void setMatakuliah1(String matakuliah1) {
        this.matakuliah1 = matakuliah1;
    }

    public String getSks1() {
        return sks1;
    }

    public void setSks1(String sks1) {
        this.sks1 = sks1;
    }

    public String getBobot1() {
        return bobot1;
    }

    public void setBobot1(String bobot1) {
        this.bobot1 = bobot1;
    }

//    public String getIps(){
//        return ips;
//    }
//    
//    public void setIps(String ips){
//        this.ips = ips;
//    }
    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

}


