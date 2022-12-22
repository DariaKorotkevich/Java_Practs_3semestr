package prac7.task05_06;

//           Разработайте интерфейс для работы со строками, который содержит
//        а) функции подсчета символов в строке
//        б) функция возвращает строку, которая образовывает строку, состоящую из символов исходной строки s, которые
//        размещены на нечетных позициях: 1, 3, 5, ...
//        в) функцию инвертирования строки
//        Реализуйте интерфейс в классе ProcessStrings и протестируйте
//        работу класса

public class Test {
    public static void main(String[] args) {
        StringProcess str = new StringProcess("word");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.reverse());
        System.out.println(str.change());
    }
}