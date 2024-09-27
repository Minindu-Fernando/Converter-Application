/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author Minindu Fernando
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        L0:
        do {
            System.out.println("                                          --   ------             --");
            System.out.println("                                         |  \\ /      \\           |  \\");
            System.out.println("                                          \\$$|  $$$$$$\\  ______  | $$  _______");
            System.out.println("                                         |  \\| $$   \\$$ |      \\ | $$ /       \\");
            System.out.println("                                         | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
            System.out.println("                                         | $$| $$   __  /      $$| $$| $$");
            System.out.println("                                         | $$| $$/  \\|  $$$$$$$| $$| $$");
            System.out.println("                                         | $$ \\$$    $$ \\      $$| $$ \\$$      \\");
            System.out.println("                                          \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$$");
            System.out.println("   _   _                       _                        _____                                             _");
            System.out.println("  | \\ | |                     | |                      / ____|                                           | |");
            System.out.println("  |  \\| |  _   _   _ __ ___   | |__     ___     _ __  | |          ___    _ __    __   __   ___    ___   | |__     ___     _ __");
            System.out.println("  | .'| | | | | | '_ \\ _ \\   | '_ \\  / _ \\  | '__| | |         / _ \\ | '_ \\  \\ \\ /  / _ \\ | '_ \\  | '_ \\ / _ \\ | '_ \\");
            System.out.println("  | |\\  | | |_| | | | | | | | | |_) | | (_) |  | |    | |_____   | (_) | | | | |  \\ V /  | (_) | | |    | |_     | __/   | |");
            System.out.println("  |_| \\_| \\__,_|_| |_| |_| |_|_.__/  \\___/ |_|      \\_____|  \\___/ |_| |_|   \\_/    \\___/ |_|    \\__|   \\___| |_|");
            System.out.println("");
            System.out.println("==============================================================================================================================");
            System.out.println("");

            System.out.println("\t[1] Decimal Converter");
            System.out.println("\t[2] Binary Converter");
            System.out.println("\t[3] Octal Converter");
            System.out.println("\t[4] Hexadecimal Converter");
            System.out.println("\t[5] Roman Number converter");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter option -> ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    String doagain1;
                    L1:
                    do {
                        System.out.println("+----------------------------------------------------------------------------+");
                        System.out.println("|                             Decimal Converter                              |");
                        System.out.println("+----------------------------------------------------------------------------+");

                        System.out.print("Enter an decimal number ->");
                        int decimal = input.nextInt();

                        if (decimal < 0) {
                            System.out.println("Invalid Input");
                            System.out.println("Do you want to input number again (Y/N) ->");
                            doagain1 = input.next().toUpperCase();
                            if ("Y".equals(doagain1)) {
                                continue;
                            } else {
                                continue L0;
                            }
                        }

                        if (decimal == 0) {
                            System.out.println("Binary Number: 0");
                            System.out.println("Octal Number: 0");
                            System.out.println("Hexadecimal Number: 0");
                            System.out.println("Do you want to go to Home Page (Y/N) ->");
                            String answer = input.next().toUpperCase();
                            if ("Y".equals(answer)) {
                                continue L0;
                            } else {
                                System.exit(0);
                            }

                        }
                        String binary = "";
                        int tempDecimal = decimal;
                        while (tempDecimal > 0) {
                            binary = (tempDecimal % 2) + binary;
                            tempDecimal = tempDecimal / 2;
                        }

                        String octal = "";
                        tempDecimal = decimal;
                        while (tempDecimal > 0) {
                            octal = (tempDecimal % 8) + octal;
                            tempDecimal = tempDecimal / 8;
                        }

                        String hexadecimal = "";
                        tempDecimal = decimal;
//                        char[] hexChars = "0123456789ABCDEF".toCharArray();
                        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                        while (tempDecimal > 0) {
                            hexadecimal = hexChars[tempDecimal % 16] + hexadecimal;
                            tempDecimal = tempDecimal / 16;
                        }

                        System.out.println("Binary Number: " + binary);
                        System.out.println("Octal Number: " + octal);
                        System.out.println("Hexadecimal Number: " + hexadecimal);

                        System.out.println("Do you want to go to Home Page (Y/N) ->");
                        String answer = input.next().toUpperCase();
                        if ("Y".equals(answer)) {
                            continue L0;
                        } else {
                            System.exit(0);
                        }

                    } while (true);

                case 2:
                    String doagain2;
                    L1:
                    do {
                        System.out.println("+----------------------------------------------------------------------------+");
                        System.out.println("|                             Binary Converter                               |");
                        System.out.println("+----------------------------------------------------------------------------+");

                        System.out.print("Enter a binary number ->");
                        String binary = input.next();
                        boolean isValid = true;

                        for (int i = 0; i < binary.length(); i++) {
                            char bit = binary.charAt(i);
                            if (bit != '0' && bit != '1') {
                                isValid = false;
                                break;
                            }
                        }

                        if (!isValid) {
                            System.out.println("Invalid Input");
                            System.out.println("Do you want to input number again (Y/N) ->");
                            doagain2 = input.next().toUpperCase();
                            if ("Y".equals(doagain2)) {
                                continue;
                            } else {
                                continue L0;
                            }
                        }

                        int decimalValue = 0;
                        for (int i = 0; i < binary.length(); i++) {
                            char bit = binary.charAt(binary.length() - 1 - i);
                            decimalValue += (bit - '0') * Math.pow(2, i);
                            System.out.println(decimalValue);
                        }
                        if (decimalValue == 0) {
                            System.out.println("Binary Number: 0");
                            System.out.println("Octal Number: 0");
                            System.out.println("Hexadecimal Number: 0");
                            System.out.println("Do you want to go to Home Page (Y/N) ->");
                            String answer = input.next().toUpperCase();
                            if ("Y".equals(answer)) {
                                continue L0;
                            } else {
                                System.exit(0);
                            }
                        }

                        String octal = "";
                        int tempDecimal = decimalValue;
                        while (tempDecimal > 0) {
                            octal = (tempDecimal % 8) + octal;
                            tempDecimal = tempDecimal / 8;
                        }

                        String hexadecimal = "";
                        tempDecimal = decimalValue;
//                        char[] hexChars = "0123456789ABCDEF".toCharArray();
                        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                        while (tempDecimal > 0) {
                            hexadecimal = hexChars[tempDecimal % 16] + hexadecimal;
                            tempDecimal = tempDecimal / 16;
                        }

                        System.out.println("Decimal Number: " + decimalValue);
                        System.out.println("Octal Number: " + octal);
                        System.out.println("Hexadecimal Number: " + hexadecimal);

                        System.out.println("Do you want to go to Home Page (Y/N) ->");
                        String answer = input.next().toUpperCase();
                        if ("Y".equals(answer)) {
                            continue L0;
                        } else {
                            System.exit(0);
                        }

                    } while (true);
                case 3:
                    String doagain3;
                    L1:
                    do {
                        System.out.println("+----------------------------------------------------------------------------+");
                        System.out.println("|                               Octal Converter                              |");
                        System.out.println("+----------------------------------------------------------------------------+");

                        System.out.print("Enter an octal number: ");
                        String octal = input.next();
                        boolean isValid = true;

                        for (int i = 0; i < octal.length(); i++) {
                            char digit = octal.charAt(i);
                            if (digit < '0' || digit > '7') {
                                isValid = false;
                                break;
                            }
                        }

                        if (!isValid) {
                            System.out.println("Invalid Input");
                            System.out.print("Do you want to input number again (Y/N) -> ");
                            doagain3 = input.next().toUpperCase();
                            if ("Y".equals(doagain3)) {
                                continue;
                            } else {
                                continue L0;
                            }

                        } else {
                            int decimalValue = 0;
                            for (int i = 0; i < octal.length(); i++) {
                                char digit = octal.charAt(octal.length() - 1 - i);
                                decimalValue += (digit - '0') * Math.pow(8, i);
                                System.out.println(decimalValue);
                            }

                            if (decimalValue == 0) {
                                System.out.println("Binary Number: 0");
                                System.out.println("Octal Number: 0");
                                System.out.println("Hexadecimal Number: 0");
                                System.out.println("Do you want to go to Home Page (Y/N) ->");
                                String answer = input.next().toUpperCase();
                                if ("Y".equals(answer)) {
                                    continue L0;
                                } else {
                                    System.exit(0);
                                }
                            }

                            String binary = "";
                            int tempDecimal = decimalValue;
                            while (tempDecimal > 0) {
                                binary = (tempDecimal % 2) + binary;
                                tempDecimal = tempDecimal / 2;
                            }

                            String hexadecimal = "";
                            tempDecimal = decimalValue;
//                            char[] hexChars = "0123456789ABCDEF".toCharArray();
                            char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                            while (tempDecimal > 0) {
                                hexadecimal = hexChars[tempDecimal % 16] + hexadecimal;
                                tempDecimal = tempDecimal / 16;
                            }

                            System.out.println("Decimal Number: " + decimalValue);
                            System.out.println("Binary Number: " + binary);
                            System.out.println("Hexadecimal Number: " + hexadecimal);

                            System.out.println("Do you want to go to Home Page (Y/N) ->");
                            String answer = input.next().toUpperCase();
                            if ("Y".equals(answer)) {
                                continue L0;
                            } else {
                                System.exit(0);
                            }
                        }

                    } while (true);
                case 4:
                    String doagain4;
                    L1:
                    do {
                        System.out.println("+----------------------------------------------------------------------------+");
                        System.out.println("|                             Hexadecimal Converter                          |");
                        System.out.println("+----------------------------------------------------------------------------+");

                        System.out.print("Enter a hexadecimal number: ");
                        String hexadecimal = input.next().toUpperCase();

                        boolean isValid = true;
                        for (int i = 0; i < hexadecimal.length(); i++) {
                            char c = hexadecimal.charAt(i);
                            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                                isValid = false;
                                break;
                            }
                        }

                        if (!isValid) {
                            System.out.println("Invalid Input");
                            System.out.println("Do you want to input number again (Y/N) ->");
                            doagain4 = input.next().toUpperCase();
                            if ("Y".equals(doagain4)) {
                                continue;
                            } else {
                                continue L0;
                            }
                        }

                        int decimalValue = 0;
                        for (int i = 0; i < hexadecimal.length(); i++) {
                            char digit = hexadecimal.charAt(hexadecimal.length() - 1 - i);
                            int decimalDigit = (digit >= '0' && digit <= '9') ? (digit - '0') : (digit - 'A' + 10);
                            decimalValue += decimalDigit * Math.pow(16, i);
                        }

                        if (decimalValue == 0) {
                            System.out.println("Binary Number: 0");
                            System.out.println("Octal Number: 0");
                            System.out.println("Hexadecimal Number: 0");
                            System.out.println("Do you want to go to Home Page (Y/N) ->");
                            String answer = input.next().toUpperCase();
                            if ("Y".equals(answer)) {
                                continue L0;
                            } else {
                                System.exit(0);
                            }
                        }

                        String binary = "";
                        int tempDecimal = decimalValue;
                        while (tempDecimal > 0) {
                            binary = (tempDecimal % 2) + binary;
                            tempDecimal = tempDecimal / 2;
                        }

                        String octal = "";
                        tempDecimal = decimalValue;
                        while (tempDecimal > 0) {
                            octal = (tempDecimal % 8) + octal;
                            tempDecimal = tempDecimal / 8;
                        }

                        System.out.println("Decimal Number: " + decimalValue);
                        System.out.println("Binary Number: " + binary);
                        System.out.println("Octal Number: " + octal);

                        System.out.println("Do you want to go to Home Page (Y/N) ->");
                        String answer = input.next().toUpperCase();
                        if ("Y".equals(answer)) {
                            continue L0;
                        } else {
                            System.exit(0);
                        }

                    } while (true);
                case 5:
                    System.out.println("+----------------------------------------------------------------------------+");
                    System.out.println("|                             Roman Number Converter                         |");
                    System.out.println("+----------------------------------------------------------------------------+");

                    System.out.println("[1] Decimal Number to Roman Number Converter");
                    System.out.println("[2] Roman Number to Decimal Number Converter");
                    System.out.println("Enter an Option ->");
                    int option1 = input.nextInt();
                    switch (option1) {
                        case 1:
                            String doagain5;
                            L1:
                            do {
                                System.out.println("+----------------------------------------------------------------------------+");
                                System.out.println("|                  Decimal Number to Roman Number Converter                  |");
                                System.out.println("+----------------------------------------------------------------------------+");

                                System.out.print("Enter a decimal number: ");
                                int decimalNumber = input.nextInt();

                                if (decimalNumber <= 0) {
                                    System.out.println("Invalid Input");
                                    System.out.println("Do you want to input number again (Y/N) ->");
                                    doagain5 = input.next().toUpperCase();
                                    if ("Y".equals(doagain5)) {
                                        continue;
                                    } else {
                                        continue L0;
                                    }
                                }

                                String romanNumeral = "";

                                int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                                String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

                                for (int i = 0; i < decimalValues.length; i++) {
                                    while (decimalNumber >= decimalValues[i]) {
                                        decimalNumber -= decimalValues[i];
                                        romanNumeral += romanSymbols[i];
                                    }
                                }

                                System.out.println("Roman numeral representation: " + romanNumeral);
                                System.out.println("Do you want to go to Home Page (Y/N) ->");
                                String answer = input.next().toUpperCase();
                                if ("Y".equals(answer)) {
                                    continue L0;
                                } else {
                                    System.exit(0);
                                }

                            } while (true);
                        case 2:
                            String doagain6;
                            L1:
                            do {
                                System.out.println("+----------------------------------------------------------------------------+");
                                System.out.println("|                  Roman Number to Decimal Number Converter                  |");
                                System.out.println("+----------------------------------------------------------------------------+");

                                System.out.print("Enter a Roman numeral: ");
                                String romanInput = input.next().toUpperCase();

                                boolean validInput = true;
                                for (int i = 0; i < romanInput.length(); i++) {
                                    char ch = romanInput.charAt(i);
                                    if (ch != 'I' && ch != 'V' && ch != 'X' && ch != 'L' && ch != 'C' && ch != 'D' && ch != 'M') {
                                        validInput = false;
                                        break;
                                    }
                                }

                                if (!validInput) {
                                    System.out.println("Invalid Input");
                                    System.out.println("Do you want to input number again (Y/N) ->");
                                    doagain6 = input.next().toUpperCase();
                                    if ("Y".equals(doagain6)) {
                                        continue;
                                    } else {
                                        continue L0;
                                    }
                                }

                                int decimalValue = 0;
                                for (int i = 0; i < romanInput.length(); i++) {
                                    int currentValue = 0;

                                    switch (romanInput.charAt(i)) {
                                        case 'I':
                                            currentValue = 1;
                                            break;
                                        case 'V':
                                            currentValue = 5;
                                            break;
                                        case 'X':
                                            currentValue = 10;
                                            break;
                                        case 'L':
                                            currentValue = 50;
                                            break;
                                        case 'C':
                                            currentValue = 100;
                                            break;
                                        case 'D':
                                            currentValue = 500;
                                            break;
                                        case 'M':
                                            currentValue = 1000;
                                            break;
                                    }

                                    if (i + 1 < romanInput.length()) {
                                        int nextValue = 0;
                                        switch (romanInput.charAt(i + 1)) {
                                            case 'I':
                                                nextValue = 1;
                                                break;
                                            case 'V':
                                                nextValue = 5;
                                                break;
                                            case 'X':
                                                nextValue = 10;
                                                break;
                                            case 'L':
                                                nextValue = 50;
                                                break;
                                            case 'C':
                                                nextValue = 100;
                                                break;
                                            case 'D':
                                                nextValue = 500;
                                                break;
                                            case 'M':
                                                nextValue = 1000;
                                                break;
                                        }
                                        if (currentValue < nextValue) {
                                            decimalValue -= currentValue;
                                        } else {
                                            decimalValue += currentValue;
                                        }
                                    } else {
                                        decimalValue += currentValue;
                                    }
                                }

                                System.out.println("Decimal representation: " + decimalValue);
                                System.out.println("Do you want to go to Home Page (Y/N) ->");
                                String answer = input.next().toUpperCase();
                                if ("Y".equals(answer)) {
                                    continue L0;
                                } else {
                                    System.exit(0);
                                }

                            } while (true);

                    }

            }

        } while (true);

    }

}
