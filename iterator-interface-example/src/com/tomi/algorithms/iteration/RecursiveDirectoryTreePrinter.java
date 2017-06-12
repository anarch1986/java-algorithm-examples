package com.tomi.algorithms.iteration;

import java.io.File;

/**
 * Created by tomi on 2017.06.12..
 */

public final class RecursiveDirectoryTreePrinter {
    private static final String SPACES = " " ;

    public static void main(String[] args) {
        assert args != null : "arguments can't be NULL";
        if (args.length !=1) {
            System.err.println("Usage: RecursiveDirectoryTreePrinter<directory>");
        }
        print(new File(args[0]),"");
    }

    public static void print(File file, String indent) {
        assert file != null : "file can't be NULL";
        assert indent != null : "indent can't be NULL";
        System.out.print(indent);
        System.out.println(file.getName());
        if (file.isDirectory()) {
            print(file.listFiles(), indent + SPACES);
        }
    }

    public static void print(File[] files, String indent) {
        assert files != null : "list of files can't be null";
        for (int i = 0; i < files.length; ++i) {
            print(files[i], indent);
        }
    }
}
