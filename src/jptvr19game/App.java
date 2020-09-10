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
        System.out.println("дарова");
        System.out.println("код загадал число, угадывай давай");
        Random rand = new Random();
        int rNumber = rand.nextInt(200);
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        if (rNumber == myNumber) {
            System.out.println("красава");
        }else{
            System.out.println("лох, правильно было " + rNumber);
        }
                
                
    }
}