package Convert_T;

/**
 * @brief Структура записи класса Келвин
 */

public class Kelvin implements Convertable{
    //! темепература в градусах
    double degrees;
    /**
     * @brief Конструктор класса
     * @param degrees переводымых градусы
     */
    public Kelvin (double degrees){

        this.degrees = degrees;
    }
    @Override
    /**
     * @brief Метод класса для перевода температур в фаренгейт
     * @param параметров нет
     * @return температура в фаренгейтах
     */
    public double convertToFahrenheit() {

        return this.convertToCelsius() / 5 * 9 + 32;
    }

    @Override
    /**
     * @brief Метод класса для перевода температур в кельвин
     * @param параметров нет
     * @return температура в кельвинах
     */
    public double convertToKelvin() {

        return degrees;
    }

    @Override
    /**
     * @brief Метод класса для перевода температур в цельсиях
     * @param параметров нет
     * @return температура в цельсиях
     */
    public double convertToCelsius() {

        return degrees - 273;
    }
}