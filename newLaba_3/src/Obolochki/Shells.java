package Obolochki;
//        Создайте объекты класса Double, используя методы valueOf().
//        2. Преобразовать значение типа String к типу double. Используем
//        метод Double.parseDouble().
//        3. Преобразовать объект класса Double ко всем примитивным типам.
//        4. Вывести значение объекта Double на консоль.
//        5. Преобразовать литерал типа double к строке: String d =
//        Double.toString(3.14);

public class Shells {

    public static void test(Object value) {
        if (value instanceof String) {
            System.out.println("This String");
        }
        else if (value instanceof Double) {
            System.out.println("This Double");
        }
    }

    public static void main(String[] args)
    {
        double a = 46.23;
        double b = 55.55;
        Double x = Double.valueOf(a);
        Double y = Double.valueOf(b);
        System.out.println("valueOf(a) = " + x);
        System.out.println("ValueOf(b) = " + y);

        String text = "12.34";
        double value = Double.parseDouble(text);
        test(text);
        test(value);

        int intVal = x.intValue();
        System.out.println(intVal);
        short shortVal = x.shortValue();
        System.out.println(shortVal);
        float floatVal = x.floatValue();
        System.out.println(floatVal);
        byte byteVal = x.byteValue();
        System.out.println(byteVal);
        long longVal = x.longValue();
        System.out.println(longVal);

        System.out.println("DoubleObj x = " + x);
        System.out.println("DoubleObj y = " + y);

        double total = 3.14;
        String totalTwo = Double.toString(total);
        System.out.println("String is " + totalTwo);
    }
}