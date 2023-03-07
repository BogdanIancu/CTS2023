package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.ValueReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader implements ValueReader {
    @Override
    public List<Integer> readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the 5 numbers: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }
        return list;
    }
}
