import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    CurrencyExchangeApp currencyExchangeApp = new CurrencyExchangeApp();

    try {
      Scanner scanner = new Scanner(System.in);

      while (true) {
        currencyExchangeApp.displayMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1 : currencyExchangeApp.performExchange(scanner);
          break;
          case 2 : currencyExchangeApp.viewExchangeHistory();
          break;
          case 3 : {
            System.out.println("Выход из программы. До свидания!");
            System.exit(0);
            break;
          }
          default : System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
          break;
        }
      }
    } catch (InputMismatchException e) {
      System.out.println("Ошибка ввода. Введите число.");
    }
  }
}
// Проект разделен на пять классов с целью обеспечить структурированность,
// расширяемость и легкость поддержки кода. Давайте рассмотрим каждый класс и их взаимодействие:
//
//CurrencyEnum: Этот класс представляет перечисление типов валют,
// что делает код более читаемым и поддерживаемым. Он используется для представления различных валют и их описаний.
//
//ExchangeRecord: Этот класс предназначен для хранения информации об отдельном обмене валюты.
// Он обеспечивает удобное представление данных о каждом обмене и позволяет легко отслеживать историю обменов.
//
//ExchangeManager: Этот класс является управляющим элементом для обмена валютой. Он содержит логику выполнения обменов,
// хранит курсы обмена и поддерживает историю обменов. Также, предоставляет методы для просмотра истории и отображения доступных валют.
//
//CurrencyExchangeApp: Этот класс предоставляет консольный интерфейс для взаимодействия с пользователем.
// Он отображает меню, обрабатывает выбор пользователя и вызывает соответствующие методы в ExchangeManager.
//
//Main: Класс Main содержит функцию main, которая является точкой входа в программу.
// Он создает объекты CurrencyExchangeApp и Scanner, а затем в цикле обрабатывает выбор пользователя
// и вызывает соответствующие методы.
//
//Взаимодействие классов происходит следующим образом:
//
//CurrencyEnum предоставляет удобные константы для представления валют в коде.
//ExchangeRecord используется ExchangeManager для хранения информации об обменах в истории.
//ExchangeManager содержит логику обмена валютой, хранит курсы обмена и историю обменов.
//CurrencyExchangeApp предоставляет пользовательский интерфейс для ввода данных и вызывает методы ExchangeManager
// для выполнения обменов и просмотра истории.
//Main является точкой входа, где создаются объекты других классов и запускается основной цикл программы.
//Структура проекта позволяет легко добавлять новые функции, например, расширять список поддерживаемых валют
// или изменять логику обмена, сохраняя при этом четкость и модульность кода.