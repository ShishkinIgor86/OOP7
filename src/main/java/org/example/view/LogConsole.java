package org.example.view;

public class LogConsole implements Logging {

    /**
     * Вывод сообщения
     *
     * @param message сообщение для вывода
     */
    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}