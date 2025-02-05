package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здраствуйте наш покупатель\nПриветствую вас в нашем магазине Шкидос");

        System.out.println("Вам доступен следующий список действий:\n" +
                "'Купить' что-то. Передаётся в виде 'Купить предмет цена кол-во'.\n" +
                "'Продать' что-то. Передаётся в виде 'Продать предмет цена кол-во'.\n" +
                "'Список продуктов'. Тут ничего особенного, просто выводится список продуктов в магазине, их цена и кол-во в наличии.\n" +
                "'Баланс'. Тут тоже ничего такого, просто показываетс баланс магазина.\n" +
                "'Изменить' цену. Передаётся в виде 'Изменить предмет цена'.\n" +
                "'Помощь' - выводится список команд.\n" +
                "'Помощь ...'. Например, 'Помощь купить' - подробное описание команды. {Нету}\n" +
                "'Закончить' - завершает работу магазина. Без сохранения данных в файле может безвозвратно удалить прогресс.\n" +
                "'Сохранить' - сохраняет прогресс магазина в файле. {Нету}\n" +
                "'Загрузить' - загружает прогресс последней игры. {Нету}");

        System.out.print("Выберите действие:");
        String start = scanner.nextLine();
        String[] started = start.split(" ");
        boolean qwerty = true;

        if (started[0].equalsIgnoreCase("Закончить") || started[0].equalsIgnoreCase("Завершить")) {
            qwerty = false;
        }

        while (qwerty) {
            if (started[0].equalsIgnoreCase("Закончить") || started[0].equalsIgnoreCase("Завершить")) {
                qwerty = false;
            }
            else if (started[0].equalsIgnoreCase("Купить")) {
                if (started.length >= 2) {
                    Shop bought = new Shop();
                    if (started.length == 4) {
                        bought.buyProduct(started[1], Integer.parseInt(started[2]), Integer.parseInt(started[3]));
                    }
                    else if (started.length==3) {
                        bought.buyProduct(started[1], Integer.parseInt(started[2]), 1);
                    }
                    else if (started.length==2){
                        bought.buyProduct(started[1], 0, 1);
                    }
                }
                else {
                    System.out.println("Покупка не удалась");
                }
            }
        }


    }
}