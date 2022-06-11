import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner consol=new Scanner(System.in);
        String text=consol.nextLine();
        Stroka stroka =new Stroka(text); //создаем класс и отправляем в него строку
        String levo= stroka.levo;//вытаскиваем знак из класса Stroka
        String pravo=stroka.pravo;
        char znak=stroka.znak;
        Convert convert=new Convert(levo,pravo);
        int num1=convert.num1;
        int num2=convert.num2;
        Calculete calculete=new Calculete(znak, num1, num2);

        if (!Character.isDigit(stroka.levo.charAt(0))&&!Character.isDigit(stroka.pravo.charAt(0))&& calculete.result>0){
            System.out.println(convert.convertToRom(calculete.result));}
        else if (!Character.isDigit(stroka.levo.charAt(0))&&!Character.isDigit(stroka.pravo.charAt(0))&& calculete.result<=0){
            System.out.println("Ошибка");}
        else if (Character.isDigit(stroka.levo.charAt(0))&&Character.isDigit(stroka.pravo.charAt(0))&&convert.num1>0&&convert.num1<11&&convert.num2>0&&convert.num2<11 ){
            System.out.println(calculete.result);
        }


    }
}
