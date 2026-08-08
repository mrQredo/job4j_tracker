package ru.job4j.tracker;

/**
 * Следующей задачей в нашем проекте будет отображение меню - ru.job4j.tracker. StartUI.
 * Этот объект будет управлять меню. В нем будет цикл, который будет опрашивать пользователя о выбранном пункте меню.
 * Если пользователь выбрал пункт "Выйти", то цикл завершается и программа закрывается.
 */

public class StartUI {
        
    //Метод init инициализирует приложение и запускает выполнение различных пользовательских действий.
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    //Метод showMenu выводит на экран меню доступных пользовательских действий.
    private void showMenu(UserAction[] actions) {
        System.out.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}