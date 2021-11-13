/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author Anar
 */
public class GetRandom {
    
    public static int getWinnerNumber(){
        int a = getRandomNumber(1, 5);
        return a;
    }
    
    public static int getRandomNumber(int low, int high){
        Random r = new Random();
        int result = r.nextInt(high - low)+low;
        return result;
    }
}
