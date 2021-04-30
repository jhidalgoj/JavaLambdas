package com.aprender.java;

public class MainLambdas {
    public static void main(String[] args) {
        OnOneListener onOneListener = new OnOneListener() {
            @Override
            public void onOne(String message) {
                System.out.println("ONE: "+ message);
            }
        };

        //Creado con lambdas el mismo codigo

        OnOneListener onOneListener1 = (String message) ->{
            System.out.println("ONE LAMBDA : "+ message);
        };
        onOneListener.onOne("Sin Lambda  :");
        onOneListener1.onOne("con Lambda :");

    }
}
