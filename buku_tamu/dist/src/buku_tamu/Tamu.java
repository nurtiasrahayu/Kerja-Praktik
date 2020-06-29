package buku_tamu;

public class Tamu {

    public String tgl;
    public String nama;
    public String email;
    public String telp;
    public String alam;
    public String pek;
    public String ins;
    public String kep;
        
    public Tamu(String tgl, String nama, String email, String telp, String alam, String pek, String ins, String kep){
        this.tgl=tgl;
        this.nama=nama;
        this.email=email;
        this.telp= telp;
        this.alam=alam;
        this.pek=pek;
        this.ins=ins;
        this.kep=kep;
    }
    
    public String getTgl(){
        return tgl;
    }
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
    public String getTelp(){
        return telp;
    }
    public String getAlam(){
        return alam;
    }
    public String getPek(){
        return pek;
    }
    public String getIns(){
        return ins;
    }
    public String getKep(){
        return kep;
    }
}
