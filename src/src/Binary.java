class Binary {
    private int number;
    private int sign = 0;
    private int i = 0;
    private int[] tableZM = new int[32];

    Binary(int a) {
        number = a;

    }


    private void modulus() { // sprawdzenie i zmiana znaku na dodatni
        if (number < 0) {
            sign = 1;
            number *= -1;

        }
    }




    int[] changeToBinary() { //zamiana liczby na binarną
        this.modulus();
        while (number > 0) {
            tableZM[i] = number % 2;
            number /= 2;
            i++;
        }

        tableZM[31] = sign;
        return tableZM;
    }

    int getI() {return i;}
    int getNumber(){
        this.modulus();
        return number;}
}
