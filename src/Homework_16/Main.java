package Homework_16;

public class Main {
    public static void main(String[] args) {
        iPhones iPhone = new iPhones();
        Androids android = new Androids();

        iPhone.internet();
        iPhone.sms();
        iPhone.call();

        android.internet();
        android.sms();
        android.call();


    }

}



/*.

Створіть екземпляри кожного виду у мейн-класі

Інтерфейс також можно просто створити, і він може бути пустим без методів, для того щоб просто можно було
*  імлементувати його у класі, і потім звести до якогось одного типу
*
*
* */