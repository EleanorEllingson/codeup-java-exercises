package grades;

import util.Input;

class InputTest {
    public static void main(String[] args) {
        Input scanner1 = new Input();
        System.out.println(scanner1.getInt(1, 10));
        Input scanner2 = new Input();
        System.out.println(scanner2.getInt());
        Input scanner3 = new Input();
        System.out.println(scanner3.yesNo());
        Input scanner4 = new Input();
        System.out.println(scanner4.getDouble(.1, .9));
        Input scanner5 = new Input();
        System.out.println(scanner5.getDouble());

    }
}
