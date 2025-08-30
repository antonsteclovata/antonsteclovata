import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] nums = new Integer[4];
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));

        p("Введите первое число: ");
        nums [0] = scan.nextInt();
        list.add(nums[0]);

        p("Введите второе число: ");
        nums [1] = scan.nextInt();
        list.add(nums[1]);

        p("Нужно третье число?\nнапишите y или n: ");
        char ch1 = scan.next(".").charAt(0);
        if(ch1 == 'y') {
            p("Введите третье число: ");
            nums[2] = scan.nextInt();
            list.add(nums[2]);
        } else {
            list.remove(2);
//            nums = list.toArray(new Integer[]{});
        }


        p("Нужно четвертое число?\nнапишите y или n: ");
        char ch2 = scan.next(".").charAt(0);
        if(ch2 == 'y') {
            p("Введите четвертое число: ");
            nums[3] = scan.nextInt();
            list.add(nums[3]);
        } else {
            if (ch1 == 'y') {
                list.remove(3);
//            nums = list.toArray(new Integer[]{});2
            } else {
                list.remove(2);
//            nums = list.toArray(new Integer[]{});2
            }
        }

        p("Вам нужно выбрать арифметическое действие из списка:\n1. Сложение = '+'\n2. Вычитание = '-'\n1. Умножение = '*'\n1. Деление = '/'\nВведиие действие: ");
        char action = scan.next(".").charAt(0);

        int res;

        ArrayList<Integer> newarraylist = new ArrayList<>();

        System.out.println(list);

        for (Integer num : list) {
            if (num != null) {
                newarraylist.add(num);
            }
        }

        operation(newarraylist, action);

//        switch (action) {
//            case '+':
//                res = nums[0] + nums[1] + nums[2] + nums[3];
//                p("Ваш результат: " + res);
//                break;
//
//            case '-':
//                res = nums[0] - nums[1] - nums[2] - nums[3];
//                p("Ваш результат: " + res);
//                break;
//
//            case '*':
//                if (nums[2] == 0)
//                    nums[2]++;
//                if(nums[3] == 0)
//                    nums[3]++;
//                res = nums[0] * nums[1] * nums[2] * nums[3];
//                    p("Ваш результат: " + res);
//                break;
//
//            case '/':
//                if (nums[1] == 0)
//                    p("На ноль делить нельзя");
//                if (nums[2] == 0)
//                    nums[2]++;
//                if(nums[3] == 0)
//                    nums[3]++;
//                float res1;
//                res1 = ((float) nums[0] / nums[1] / nums[2] / nums[3]);
//                p("Ваш результат: " + res1);
//                break;
//
//            default:
//                p("Вы ввели что-то неправильно");
//        }
    }
    static void p(String txt) {
        System.out.println(txt);
    }

    static void operation(ArrayList<Integer> list, char op) {
        float res = list.get(0);
        switch (op) {
            case '+':
                for (int i = 1; i < list.size(); i++) {
                    res = res + list.get(i);
                }
                p("Ваш результат: " + res);
                break;

            case '-':
                for (int i = 1; i < list.size(); i++) {
                    res = res - list.get(i);
                }
                p("Ваш результат: " + res);
                break;

            case '*':
                for (int i = 1; i < list.size(); i++) {
                    res = res * list.get(i);
                }
                p("Ваш результат: " + res);
                break;

            case '/':
                for (int i = 1; i < list.size(); i++) {
                    res = res / (float) list.get(i);
                }
                p("Ваш результат: " + res);
                break;

            default:
                p("Вы ввели что-то неправильно");
        }
    }

}