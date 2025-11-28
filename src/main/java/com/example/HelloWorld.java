package com.example;

/**
 * A simple Hello World application.
 */
public class HelloWorld {

    /**
     * Returns a greeting message.
     *
     * @return the greeting message
     */
    public String getGreeting() {
        return "Hello, World!";
    }

    /**
     * Main entry point of the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        HelloWorld app = new HelloWorld();
        System.out.println(app.getGreeting());
    }
}
