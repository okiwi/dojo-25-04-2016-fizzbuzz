package org.okiwi.codingdojo.fizzbuzzduprintemps;

/**
 * Created by sam on 4/25/16.
 */
public class JeuDeFizzBuzz {
    public String dire(Integer nombre) {
        if (isFizzBuzzBang(nombre)) return "fizzbuzzbang";

        if (isFizzBang(nombre)) return "fizzbang";

        if (isFizzBuzz(nombre)) return "fizzbuzz";

        if (isFizz(nombre)) return "fizz";

        if (isBuzz(nombre)) return "buzz";

        if (isBang(nombre)) return "bang";
        return nombre.toString();
    }

    private boolean isFizzBuzzBang(int nombre) {
        if (isFizzBuzz(nombre) && isBang(nombre)) {
            return true;
        }
        return false;
    }

    private boolean isFizzBang(int nombre) {
        if (isFizz(nombre) && isBang(nombre)) {
            return true;
        }
        return false;
    }

    private boolean isFizzBuzz(int nombre) {
        if(isFizz(nombre) && isBuzz(nombre)) {
            return true;
        }
        return false;
    }

    private boolean isBang(int nombre) {
        if (nombre % 7 == 0) {
            return true;
        }
        return false;
    }

    private boolean isBuzz(int nombre) {
        if (nombre % 5 == 0) {
            return true;
        }
        return false;
    }

    private boolean isFizz(int nombre) {
        if (nombre % 3 == 0) {
            return true;
        }
        return false;
    }
}
