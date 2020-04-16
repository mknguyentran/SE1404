/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
//import static: Kĩ thuật viết giống C, ở dưới gọi hàm static mà không cần tên package
import static util.MyToys.cF;
/**
 *
 * @author Mk
 */
public class MyToysTest {
    //chỗ này dùng để test các hàm đã viết, đảm bảo chất lượng
    //với mỗi hàm cần test, ta cần chuẩn bị sẵn dữ liệu, giá trị kì vọng,
    //chạy thử hàm, xem kết quả xử lí, so sánh xem đúng kì vọng không
    //nếu không thì sai ở dữ liệu mẫu hay sai ở code
    //vd: kiểm tra xem 5! có trả về 120 hay không, khi chạy hàm -> 1 test case
    //vd: login
    //case 1: đúng user/pass -> vào đúng trang
    //case 2: đúng user, sai pass -> báo lỗi
    
    //tình huống hàm cF() chạy đúng, bản chất mỗi case phai là một hàm, nhưng ở đây gộp
    @Test //biến hàm bất kì đi kèm JUnit thành public static void main
    public void testSuccessfulCases(){
        assertEquals(1, cF(0));//hàm so sánh và in ra màu xanh khớp, đỏ nếu không khớp, thay vì luận bằng mắt
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases(){
        cF(-5);
        cF  (-6);
    }
}

//ant chỉ quan tâm code không sai cú pháp, không thiếu thư viện -> file .jar, .war, .ear, .apk
//lỗi logic không check được

//hãy dạy cho ant biết cách kiểm tra code không sai cú pháp, không thiếu thư viện, test ra màu xanh của JUnit mới được file .jar

//ant không thông minh, chỉ biết làm theo những gì được chỉ trong file build.xml và file build-impl.xml
