package com.destiny.motoraksesoris.SharedPreferance;

public class User {
    private String email;
    private String password;
    private String nama;
    public User(){

    }
    public User(String email, String password, String nama){
        this.email=email;
        this.password=password;
        this.nama=nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}