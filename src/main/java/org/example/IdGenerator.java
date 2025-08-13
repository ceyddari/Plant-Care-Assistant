package org.example;

public final class IdGenerator {

    private static long next = 1_000;
    private IdGenerator(){}

    public static synchronized String nextId(String prefix){

        return prefix + "-" + (next++);

    }
}
