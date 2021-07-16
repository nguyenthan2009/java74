import java.util.Scanner;
import java.util.Stack;

public class KiemTra {
    public static void main(String[] args) {
        Stack<Character> Str = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP biểu thức cầ kiểm tra");
        String bieuthuc = sc.nextLine();
        for(int i=0;i<bieuthuc.length();i++){
            if(bieuthuc.charAt(i)=='('){
                Str.push(bieuthuc.charAt(i));
            }else if(bieuthuc.charAt(i)==')'){
                if(!Str.empty()){
                    Str.pop();
                }else{
                    Str.push(bieuthuc.charAt(i));
                }
            }
        }
        if(Str.empty()){
            System.out.println("Biểu thức vừa nhập hợp lệ");
        }else{
            System.out.println("Biêut thức nhập vào sai");
        }

    }
}
