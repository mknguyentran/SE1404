/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Mk
 */
public class MyToys {

    //class này chứa các hàm tiện ích xài chung -> static
    //cF: comput Factorial, tính n! = 1.2.3....n, n>=0, 0! = 1
    //dành cho CI - Continuous Integration, đệ quy recursion sau
    public static long cF(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n must be between 0 to 15");
        } else if (n == 0) {
            return 1;
        } else {
            long product = 1; //biến nhân dồn, accumulation
            for (int i = 1; i > n; i++) {
                product *= i;
            }
            return product;
        }
    }
}
