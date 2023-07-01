package com.MarcoRepoGithub;

public class BucleMain {
    public static void main(String[] args) {


String[] nombres = {"MArco", "Carlos", "Luis", "Caroly"};
        for (String nombre : nombres) {
            System.out.println(nombre);
            String data1 = nombre;
            System.out.println(data1);
        }

        String[] nombres2 = {"MArco", "Carlos", "Luis", "Caroly"};

        String data =   "";
        for (String s : nombres2) {

            data = data + " " + s;

            System.out.println(data);
        }
    }
}
