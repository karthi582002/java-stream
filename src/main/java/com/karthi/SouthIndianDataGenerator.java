package com.karthi;

import java.util.*;

public class SouthIndianDataGenerator {

    static String[] maleFirstNames = {
            "Arjun","Karthik","Vignesh","Suresh","Ramesh","Prakash","Manoj","Vijay",
            "Ajith","Naveen","Dinesh","Harish","Gokul","Saravanan","Praveen","Madhan",
            "Santhosh","Raghu","Kiran","Chandran","Bharath","Lokesh","Siddharth","Varun"
    };

    static String[] femaleFirstNames = {
            "Anitha","Priya","Divya","Keerthi","Swathi","Lakshmi","Meena","Pooja",
            "Deepika","Nithya","Gayathri","Revathi","Kavya","Shalini","Aishwarya",
            "Sneha","Bhavya","Ananya","Janani","Harini","Shruthi","Ramya","Sowmya"
    };

    static String[] lastNames = {
            "Iyer","Nair","Reddy","Naidu","Pillai","Menon","Gowda","Shetty",
            "Raman","Krishnan","Subramanian","Murthy","Rao","Bhat","Acharya",
            "Hegde","Ranganathan","Balakrishnan","Srinivasan","Chandrasekar",
            "Venkatesh","Narayanan","Rajagopal","Arumugam"
    };

    static String[] emailDomains = {
            "@gmail.com","@yahoo.com","@outlook.com","@hotmail.com"
    };

    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 1; i <= 1000; i++) {

            boolean isMale = rand.nextBoolean();

            String firstName = isMale
                    ? maleFirstNames[rand.nextInt(maleFirstNames.length)]
                    : femaleFirstNames[rand.nextInt(femaleFirstNames.length)];

            String lastName = lastNames[rand.nextInt(lastNames.length)];


            int pattern = rand.nextInt(4);
            String email = "";

            switch (pattern) {
                case 0:
                    email = firstName.toLowerCase() + i + emailDomains[rand.nextInt(emailDomains.length)];
                    break;
                case 1:
                    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + emailDomains[rand.nextInt(emailDomains.length)];
                    break;
                case 2:
                    email = lastName.toLowerCase() + i + emailDomains[rand.nextInt(emailDomains.length)];
                    break;
                case 3:
                    email = firstName.toLowerCase().charAt(0) + lastName.toLowerCase() + i + emailDomains[rand.nextInt(emailDomains.length)];
                    break;
            }

            int age = 18 + rand.nextInt(43); // 18–60

            System.out.println("{");
            System.out.println("  \"id\": " + i + ",");
            System.out.println("  \"firstName\": \"" + firstName + "\",");
            System.out.println("  \"lastName\": \"" + lastName + "\",");
            System.out.println("  \"email\": \"" + email + "\",");
            System.out.println("  \"gender\": \"" + (isMale ? "Male" : "Female") + "\",");
            System.out.println("  \"age\": " + age);
            System.out.println("},");
        }
    }
}
