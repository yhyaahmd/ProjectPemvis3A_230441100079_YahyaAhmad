/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanprojectakhir;

/**
 *
 * @author ya991
 */
public class UserSession {
    private static String userName;
    private static String sipPengguna;
    
    // Setter untuk Nama Pengguna
    public static void setUserName(String name) {
        userName = name;
    }

    // Getter untuk Nama Pengguna
    public static String getUserName() {
        return userName;
    }
    
    public static void setSipPengguna(String sip) {
        sipPengguna = sip;
    }

    // Getter untuk Nama Pengguna
    public static String getSipPengguna() {
        return sipPengguna;
    }
}
