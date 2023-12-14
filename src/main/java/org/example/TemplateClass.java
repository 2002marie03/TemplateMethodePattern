package org.example;

public abstract class  TemplateClass {

    public double TemplateMethode(){
        double result = operation1(); double a=0;
        for (int i=0;i<result;i++){
           a+=operation2();

        }
        return a;
    }

    protected abstract double operation2();
    protected abstract double operation1() ;

}
