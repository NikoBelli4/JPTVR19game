/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class App {
    public void run() {
        int a = 5;
        System.out.println("дарова");
        System.out.println("какой диапазон?");
        System.out.println("Min: ");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println("Max:");
        int max = scanner.nextInt();
        do {
            if(a == 5);{
                System.out.println("код загадал число, угадывай давай\n от " + min + " до " + max);
                    }
            Random rand = new Random();
            int rNumber = rand.nextInt(max-min+1) + min;
            int myNumber = scanner.nextInt();
            if (rNumber == myNumber) {
                System.out.println("красава");
                break;
            }else{
                if(a <= 1){
                    System.out.println("лох, правильно было " + rNumber);
                    break;
                }else if(a>1){
                    System.out.println("попробуй еще раз");
                }
            }   a--;
        }while(a >0);     
                
    }
}
