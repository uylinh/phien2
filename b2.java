/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY HP
 */import java.util.Scanner;
public class b2 {

    
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int gt = 1;
        for (int i = 1; i <= n; i++){
            gt = gt * i;
        }
        System.out.println("Giai thừa của " + n + " là: " + gt);
    }
  
   

}