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


        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Выберите действие:");
            String input = scanner.nextLine();
            String[] splitInput = input.split(" ");

            if (splitInput[0].equalsIgnoreCase("Закончить") || splitInput[0].equalsIgnoreCase("Завершить")) {
                isRunning = false;
            } else if (splitInput[0].equalsIgnoreCase("Купить")) {
                if (splitInput.length >= 2) {
                    Shop bought = new Shop();
                    if (splitInput.length == 4) {
                        if (bought.buyProduct(splitInput[1], Integer.parseInt(splitInput[2]), Integer.parseInt(splitInput[3]))) {
                            bought.buyProduct(splitInput[1], Integer.parseInt(splitInput[2]), Integer.parseInt(splitInput[3]));
                        } else {
                            System.out.println("Недостаточно средств на балансе (" + new Shop().getBalance() + ").");
                        }
                    } else if (splitInput.length == 3) {
                        if (bought.buyProduct(splitInput[1], Integer.parseInt(splitInput[2]), 1)) {
                            bought.buyProduct(splitInput[1], Integer.parseInt(splitInput[2]), 1);
                        } else {
                            System.out.println("Недостаточно средств на балансе (" + new Shop().getBalance() + ").");
                        }
                    } else if (splitInput.length == 2) {
                        if (bought.buyProduct(splitInput[1], 0, 1)) {
                            bought.buyProduct(splitInput[1], 0, 1);
                        } else {
                            System.out.println("Недостаточно средств на балансе (" + new Shop().getBalance() + ").");
                        }
                    }

                } else {
                    System.out.println("Покупка не удалась");
                }
            }
        }


    }
}