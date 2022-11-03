package co.learning.Model;

import co.learning.Business.ContactService;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Key in data seperatedby space");
        String next = sc.nextLine();
       String[]  split =next.split(" ");
       Contact contact =  Contact.builder().firstName(split[0])
         .lastName(split[1])
         .phoneNumber(split[2])
                 .build();
        ContactService service = new ContactService();
        service.addContact(contact);


//        System.out.println("Key in data seperatedby space");
//        String next1 = sc.nextLine();
//        String[]  split1 =next1.split("  ");
//        Contact contact1 =  Contact.builder().firstName(split1[0])
//                .lastName(split1[1])
//                .phoneNumber(split1[2])
//                .build();
//        ContactService service1 = new ContactService();
//        service.addContact(contact1);
//        service.printAll();
    }

}
