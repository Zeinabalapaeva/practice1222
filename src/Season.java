import java.util.Scanner;

public class Season {

String spring;
String summer;
String outom;
String winter;




public  Season(String spring,String summer,String outom,String winter){
    this.spring=spring;
    this.summer = summer;
    this.outom = outom;
    this.winter = winter;
}

    public Season() {

    }

    public  void  method(Season season){
    System.out.println("vvedite datu : ");
    int number = new Scanner(System.in).nextInt();

    switch (number){
        case 12,1,2 :
            System.out.println("winter");
            break;
        case 3,4,5 :
            System.out.println("spring");
            break;
        case 6,7,8 :
            System.out.println("summer");
            break;
        case 9,10,11 :
            System.out.println("outom");
    }
}
    }


