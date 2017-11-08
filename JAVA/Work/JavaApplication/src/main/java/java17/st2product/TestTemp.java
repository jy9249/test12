package java17.st2product;

import java.util.Scanner;

public class TestTemp {
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        Product[] prods = new Product[10];
        
        prods[0] = new Book();
        prods[1] = new CompactDisc();
        prods[2] = new ConversationBook();
        
        for (int i = 0; i <= prods.length - 1; i = i + 1) {
            System.out.println(prods[i].toString());
            // i==0 ---> Book.toString()
            // i==1 ---> CompactDisk.toString()
            // i==2 ---> ConversationBook();
            
        }
        
        for (; true;) {
            System.out.println("상품추가(1)상품조회(2)상품종료(3)");
            int menu = keyboard.nextInt();
            if (menu == 1) {// 상품 입력
                상품입력(prods);
            } else if (menu == 2) {// 상품 출력
                상품출력(prods);
            } else if (menu == 3) {// 상품종료
                break;// 무한루프탈출
            } else
                System.out.println("잘못된 입력");
        }
        
    }
    
    // 상품 종류 입력 받아 배열에 저장하는 코드를 추가.
    private static void 상품입력(Product[] prods) {
        System.out.println("책<1> , 음악CD<2>, 회화책<3>");
        int menu = keyboard.nextInt();
        if (menu == 1) {// 상품 입력
           
        } else if (menu == 2) {// 상품 출력
           
        } else if (menu == 3) {// 상품종료
          
        }
           
       
    }
    
    private static void 상품출력(Product[] prods) {
        for (int i = 0; i <= prods.length - 1; i = i + 1) {
            System.out.println(prods[i].toString());
    }
    }
}

