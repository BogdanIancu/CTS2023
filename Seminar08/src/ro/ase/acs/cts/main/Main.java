package ro.ase.acs.cts.main;

import ro.ase.acs.cts.composite.EmailAddress;
import ro.ase.acs.cts.composite.EmailGroup;
import ro.ase.acs.cts.composite.EmailReceiver;
import ro.ase.acs.cts.flyweight.CustomCharacterFactory;
import ro.ase.acs.cts.flyweight.Position;
import ro.ase.acs.cts.flyweight.TextCharacter;
import ro.ase.acs.cts.proxy.AuthenticationProxy;
import ro.ase.acs.cts.proxy.AuthenticationService;
import ro.ase.acs.cts.proxy.WebsiteAuthentication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuthenticationService authenticationService =
                new AuthenticationProxy(new WebsiteAuthentication());
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("user: ");
            String username = scanner.nextLine();
            System.out.print("password: ");
            String password = scanner.nextLine();
            System.out.println(
                    authenticationService.login(username, password));
        }

        EmailReceiver email1 = new EmailAddress("ion.popescu@ase.ro");
        EmailReceiver email2 = new EmailAddress("maria.ionescu@ase.ro");
        EmailReceiver group1 = new EmailGroup("gr1@ase.ro");
        group1.addReceiver(email1);
        group1.addReceiver(email2);
        group1.receive("buna");
        EmailReceiver group2 = new EmailGroup("seriaA@ase.ro");
        EmailReceiver email3 = new EmailAddress("secretar.csie@ase.ro");
        group2.addReceiver(group1);
        group2.addReceiver(email3);
        group2.receive("legitimatiile sunt gata !");

        CustomCharacterFactory factory = new CustomCharacterFactory();
        TextCharacter textCharacter1 = factory.getTextCharacter('a');
        textCharacter1.display(new Position(1, 5));
        TextCharacter textCharacter2 = factory.getTextCharacter('b');
        textCharacter2.display(new Position(3, 4));
        TextCharacter textCharacter3 = factory.getTextCharacter('a');
        textCharacter3.display(new Position(2, 4));
        System.out.println(textCharacter1 == textCharacter3);
    }
}