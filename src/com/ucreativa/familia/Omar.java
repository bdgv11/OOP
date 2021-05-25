package com.ucreativa.familia;

public class Omar {

    private int age;
    private String hobby;

    public Omar(String saludo){
        this.age = 58;
        this.hobby = "sudoku";

        System.out.println("Este es el saludo: " + saludo);
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = this.age + 1;
    }
}
