package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здраствуйте наш покупатель\nПриветствую вас в нашем магазине Шкидос");

        System.out.println("Вам доступен следующий список действий:\n" +
                "'Купить' что-то. Например, 'Купить вантуз 20 3'.\n" +
                "'Продать' что-то. Например, 'Продать вантуз 25 2'.\n" +
                "'Список продуктов'. Тут ничего особенного, просто выводится список продуктов в магазине, их цена и кол-во в наличии.\n" +
                "'Баланс'. Тут тоже ничего такого, просто показываетс баланс магазина.\n" +
                "'Изменить цену'. Например, 'Изменить цену вантуз 20'.\n" +
                "'Помощь' - выводится список команд.\n" +
                "'Помощь ...'. Например, 'Помощь купить' - подробное описание команды. {Нету}\n" +
                "'Закончить' - завершает работу магазина. Без сохранения данных в файле может безвозвратно удалить прогресс.\n" +
                "'Сохранить' - сохраняет прогресс магазина в файле. {Нету}\n" +
                "'Загрузить' - загружает прогресс последней игры. {Нету}");

        System.out.print("Выберите действие:");
        String start = scanner.nextLine();
        String[] started = start.split(" ");
        boolean qwerty = true;

        if (!started[0].equalsIgnoreCase("Закончить") || !started[0].equalsIgnoreCase("Завершить")){
            qwerty = true;
        }   qwerty = false;

        while (qwerty){
            if (started[0].equalsIgnoreCase("Закончить") || started[0].equalsIgnoreCase("Завершить"){
                qwerty = false;
            }

            if else  (started[0].equalsIgnoreCase("Купить")) {

            }
        }


    }
}