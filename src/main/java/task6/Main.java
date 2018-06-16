/*
 * Задание 6.
 * Разработайте класс АтомнаяЛодка, создайте внутренний класс – ДвигательДляАтомнойЛодки.
 * Создайте объект АтомнаяЛодка и “запустите его в плавание”.Разработайте класс АтомнаяЛодка,
 * создайте внутренний класс – ДвигательДляАтомнойЛодки. Создайте объект АтомнаяЛодка и “запустите его в плавание”.
 */
package task6;

public class Main {
    public static void main(String[] args) {
        NuclearSubmarine.EngineOfNuclearSubmarine submarine = new NuclearSubmarine(1010).new EngineOfNuclearSubmarine();
        submarine.go();
        submarine.getAn();
    }
}
