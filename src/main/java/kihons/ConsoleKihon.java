package kihons;

import framework.bases.ConsoleKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.io.Console;
import java.util.Scanner;

public class ConsoleKihon extends ConsoleKihonBase {
    @Override
    protected void writeFooBarToTheConsole() {
        System.out.print("FooBar");
    }

    @Override
    protected void writeLineFooBarToTheConsole() {
        System.out.println("FooBar");
    }

    @Override
    protected String readLineFromConsoleAndReturnValue() {
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
