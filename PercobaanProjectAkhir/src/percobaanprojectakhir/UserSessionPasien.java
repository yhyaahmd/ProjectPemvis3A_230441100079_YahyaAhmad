/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanprojectakhir;

/**
 *
 * @author ya991
 */
public class UserSessionPasien {
    private static String userName;
    private static String Nomorpasien;
    
    public static void setUserName(String name) {
        userName = name;
    }

    public static String getUserName() {
        return userName;
    }
    public static void setNomorPasien(String nomor) {
        Nomorpasien = nomor;
    }

    public static String getNomorPasien() {
        return Nomorpasien;
    }
    
}
