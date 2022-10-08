package org.csystem.app.commandprompt;

import org.csystem.util.string.StringUtil;

import java.util.Scanner;

public class CommandPrompt {
    private static String [] ms_commands = {"length", "reverse", "upper", "lower", "changep", "quit"};
    private String m_prompt;

    private static void lengthCallback(String [] commandInfo)
    {
        if (commandInfo.length < 2) {
            System.out.println("Invalid arguments");
            return;
        }

        System.out.println(commandInfo[1].length());
    }

    private static void reverseCallback(String [] commandInfo)
    {
        if (commandInfo.length < 2) {
            System.out.println("Invalid arguments");
            return;
        }

        System.out.println(StringUtil.reverse(commandInfo[1]));
    }

    private static void upperCallback(String [] commandInfo)
    {
        if (commandInfo.length < 2) {
            System.out.println("Invalid arguments");
            return;
        }

        System.out.println(commandInfo[1].toUpperCase());
    }

    private static void lowerCallback(String [] commandInfo)
    {
        if (commandInfo.length < 2) {
            System.out.println("Invalid arguments");
            return;
        }

        System.out.println(commandInfo[1].toLowerCase());
    }

    private void changePromptCallback(String [] commandInfo)
    {
        if (commandInfo.length < 2) {
            System.out.println("Invalid arguments");
            return;
        }

        m_prompt = commandInfo[1];
    }

    private static void quitCallback(String [] commandInfo)
    {
        System.out.println("C and System Programmers Association");
        System.exit(0);
    }

    private static String findCommandByPrefix(String prefix)
    {
        for (String command : ms_commands)
            if (command.startsWith(prefix))
                return command;

        return "";
    }

    private void doCommand(String [] commandInfo)
    {
        switch (commandInfo[0]) {
            case "length" -> lengthCallback(commandInfo);
            case "reverse" -> reverseCallback(commandInfo);
            case "upper" -> upperCallback(commandInfo);
            case "lower" -> lowerCallback(commandInfo);
            case "changep" -> changePromptCallback(commandInfo);
            default -> quitCallback(commandInfo);
        }
    }

    private void parseCommand(String cmd)
    {
        String [] commandInfo = cmd.split("[ \t]+");

        if (commandInfo[0].length() >= 3) {
            String actualCommand = findCommandByPrefix(commandInfo[0]);

            if (!actualCommand.isEmpty()) {
                commandInfo[0] = actualCommand;
                doCommand(commandInfo);
            }
            else
                System.out.println("Invalid command");
        }
        else
            System.out.println("Invalid command length");
    }

    public CommandPrompt(String p)
    {
        m_prompt = p;
    }

    public void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print(m_prompt + ">");
            parseCommand(kb.nextLine().strip());
        }
    }
}
