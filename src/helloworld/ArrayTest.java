/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

/**
 *
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class ArrayTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("BeepBop");
            } else if (i % 3 == 0) {
                System.out.println("Beep");
            } else if (i % 5 == 0) {
                System.out.println("Bop");
            }
        }
    }
}
