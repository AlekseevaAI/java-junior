package com.acme.edu.exception;


public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            doMediate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void doMediate() {
        doBusinessLogic();
    }

    private static void doBusinessLogic() { //re-throw: encapsulation errors
        try {
            doDataAccess(null);
        } catch (IllegalArgumentException e) {
            throw new MoneyTransferException("Can't transfer money", e); //Business Operation error
        }
    }

    private static void doDataAccess(Integer param) {
        if (param == null) {
            throw new IllegalArgumentException("No nulls allowed!!!!");
        }

        System.out.println("end.");
    }
}

