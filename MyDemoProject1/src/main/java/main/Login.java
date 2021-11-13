/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Anar
 */
public class Login {
    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String userName = sc.nextLine();
        System.out.println("enter password");
        String password = sc.nextLine();
        
        if(!(userName.equalsIgnoreCase("Anar")&& password.equalsIgnoreCase("1988"))){
            System.out.println("username or password is not valid");
            sc = new Scanner(System.in);
            System.out.println("enter username");
            userName = sc.nextLine();
            System.out.println("enter password");
            password = sc.nextLine();
        }
        if(!(userName.equalsIgnoreCase("Anar")&& password.equalsIgnoreCase("1988"))){
            System.out.println("username or password is not valid");
            sc = new Scanner(System.in);
            System.out.println("enter username");
            userName = sc.nextLine();
            System.out.println("enter password");
            password = sc.nextLine();
        }
        if(!(userName.equalsIgnoreCase("Anar")&& password.equalsIgnoreCase("1988"))){
            System.out.println("you are banned !");
            System.exit(0);
        }
    }
}
