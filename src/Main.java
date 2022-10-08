

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int a = 0;
        int b = 0;
        String sign = null;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the expression:");
        if (console.hasNextInt()){
        a = console.nextInt();
        sign = console.next();
        b = console.nextInt();
            if (a>0 && a<= 10 && b>0 && b<= 10  ) {
                if (sign.equals("+")) {
                    System.out.println(a + b);
                }
                if (sign.equals("-")) {
                    System.out.println(a - b);
                }
                if (sign.equals("*")) {
                    System.out.println(a * b);
                }
                if (sign.equals("/")) {
                    System.out.println(a / b);
                }
            }
            else System.out.println("Invalid expression entered");
        }

        else {
            String c = console.nextLine();
            String [] split = c.split(" ");
            int s=0;
            int numberOne = roman(split);
            int numberTwo = roman1(split);
            if (split[1].equals("+")) {
                  s = numberOne + numberTwo;
            }
            if (split[1].equals("-")) {
                s = numberOne - numberTwo;
            }
            if (split[1].equals("*")) {
                s = numberOne * numberTwo;
            }
            if (split[1].equals("/")) {
                s = numberOne / numberTwo;
            }
            String[] arab = {"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                    "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
                    "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                    "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV",
                    "XCVI", "XCVII", "XCVIII", "XCIX", "С"};
            String Answer = arab [s];
            System.out.println(Answer);


        }

    }

    static int roman (String [] split) {
        if (split[0].equals("I")) {
            return 1;
        } else if (split[0].equals("II")) {
            return 2;
        } else if (split[0].equals("III")) {
            return 3;
        } else if (split[0].equals("IV")) {
            return 4;
        } else if (split[0].equals("V")) {
            return 5;
        } else if (split[0].equals("VI")) {
            return 6;
        } else if (split[0].equals("VII")) {
            return 7;
        } else if (split[0].equals("VIII")) {
            return 8;
        } else if (split[0].equals("IX")) {
            return 9;
        } else if (split[0].equals("X")) {
            return 10;
        }

        return 0;
    }
    static int roman1 (String [] split) {
        if (split[2].equals("I")) {
            return 1;
        } else if (split[2].equals("II")) {
            return 2;
        } else if (split[2].equals("III")) {
            return 3;
        } else if (split[2].equals("IV")) {
            return 4;
        } else if (split[2].equals("V")) {
            return 5;
        } else if (split[2].equals("VI")) {
            return 6;
        } else if (split[2].equals("VII")) {
            return 7;
        } else if (split[2].equals("VIII")) {
            return 8;
        } else if (split[2].equals("IX")) {
            return 9;
        } else if (split[2].equals("X")) {
            return 10;
        }
        return 0;
    }

    }
