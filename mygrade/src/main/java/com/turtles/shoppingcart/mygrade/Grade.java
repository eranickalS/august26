/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turtles.shoppingcart.mygrade;

/**
 *
 * @author sarah
 */
public class Grade {
  private String name;
private int math  ;
private int eng;
private int sci;

    public Grade(String name, int math, int eng, int sci) {
        this.name = name;
        this.math = math;
        this.eng = eng;
        this.sci = sci;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    @Override
    public String toString() {
        return "Grade{" + "name=" + name + ", math=" + math + ", eng=" + eng + ", sci=" + sci + '}';
    }

    
    public String getGrade() {
        int total = this.math + this.eng + this.sci;
        int avg = total / 3;
        if (avg < 60) {
            return "FAIL";
            
        } else {
            return "PASS";
        }
            
    }

}
