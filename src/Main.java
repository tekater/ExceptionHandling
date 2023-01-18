import java.util.concurrent.AbstractExecutorService;

public class Main {
    public static void main(String[] args) {
        try { // попытка выполнить код заключенный в теле блока из {}
            //int ExceptionHandling = 10 / 0;
            /*int ExceptionHandling2 = Integer.parseInt("123a");
                                  // Double.parseDouble("123");*/
            System.out.println("Внутри блока try");
            //Integer.parseInt("101abc");
        } catch (ArithmeticException e) { // поймать exception (прерывание, исключение)
            System.out.print("Внутри блока catch");
            System.out.println(e.getCause());
        } finally {
            System.out.println("Внутри блока finally");
        }
        System.out.println("После блока try catch!");
        /*catch (Exception e) {
            System.out.println("Ошибка в вводе числа");
            System.out.println(e.getMessage());
        } */

    }
}
