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
public class Menu {
    public static void getMenu(){
        System.out.println("What do you want to do ?"
                + "\n 1. Register competitors"
                + "\n 2. Start competition"
                + "\n 3. Log out"
                + "\n 4. Exit");
        
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        if(menu == 1){
            sc = new Scanner(System.in);
            System.out.println("How meny competitors will attend ?");
            int count = sc.nextInt();
            Config.comps = new Competitors[count];
            for (int i = 0; i < count; i++) {
                String name = MenuUtil.requireText("enter name");
                String surname = MenuUtil.requireText("enter surname");
                Competitors c = new Competitors(name, surname);
                Config.comps[i] = c;
            }
            System.out.println("Competitors registered successfully");
            for (int i = 0; i < Config.comps.length; i++) {
                Competitors c = Config.comps[i];
                System.out.println(i+1+""+c.getFullInfo());
            }
            
        } else if(menu == 2){
            System.out.println("What number of competitor do you think is winner ?");
            sc = new Scanner(System.in);
            int chosen = sc.nextInt();
            int winner = GetRandom.getWinnerNumber();
            if(chosen == winner){
                System.out.println("CONGRATULATIONS !!!");
            } else{
                System.out.println("YOU FAILED !");
            }
        } else if(menu == 3){
            Login.login();
        } else if(menu == 4){
            System.out.println("You left the game");
            System.exit(0);
        }
    }
}
