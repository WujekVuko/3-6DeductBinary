package com.company;

public class Binary {
    private int number;
    private int sign = 0;
    private int i = 0;
    private int[] tableZM = new int[32];

    public Binary(int a) {
        number = a;

    }


    public void modulus() { // sprawdzenie i zmiana znaku na dodatni
        if (number < 0) {
            sign = 1;
            number *= -1;

        }
    }




    public int[] changeToBinary() { //zamiana liczby na binarną
        this.modulus();
        while (number > 0) {
            tableZM[i] = number % 2;
            number /= 2;
            i++;
        }

        tableZM[31] = sign;
        return tableZM;
    }

    public int getI() {return i;}
    public int getNumber(){
        this.modulus();
        return number;}
}
