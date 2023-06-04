/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

abstract class User {

    private String username;
    private String nim;
    private String password;

    public User() {
    }

    public User(String username, String nim, String password) {
        this.username = username;
        this.nim = nim;
        this.password = password;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Abstract method untuk menampilkan profil pengguna
    public abstract void displayProfile();

    // Abstract method untuk melakukan pembayaran SPP
    public abstract void paySPP(double amount);
}
