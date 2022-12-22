package Laba_4;
/*1. Создать интерфейс Nameable, с методом getName(), возвращающим
        имя объекта, реализующего интерфейс. Проверить работу для
        различных объектов (например, можно создать классы, описывающие
        разные сущности, которые могут иметь имя: планеты, машины,
        животные и т. д.).*/
public class Laba_4{
    public static void main(String[] args){
        Planet planet = new Planet("Mars");
        Nameable dolls = new Dolls("Kate");
        Nameable animals = new Animals("Lion");

        dolls.getName();
        animals.getName();
        planet.getName();

    }
}
