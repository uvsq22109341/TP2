package fr.uvsq.cprog.mvnjunit;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.security.smartcardio.SunPCSC;

public class Fraction {


    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(SunPCSC.Factory.class);

        logger.info( "Commencons par introduire la premiere fraction : F1\n nominateur: " );
        Scanner sc = new Scanner(System.in);
        int nominateur1 = Integer.parseInt(sc.nextLine());
        logger.info("Veuillez saisir un entier pour le denominateur non null : ");
        int denominateur1 = Integer.parseInt(sc.nextLine());
        logger.info("Passons maintenant a la deuxieme fraction\n Veuillez saisir un entier pour le nominateur :");
        int nominateur2 = Integer.parseInt(sc.nextLine());
        logger.info("Veuillez saisir un entier pour le denominateur non null : ");
        int denominateur2 = Integer.parseInt(sc.nextLine());
        if(denominateur2 == 0)
        {
            logger.error("Division sur zero !");
        }
        if(denominateur1 == 0)
        {
            logger.error("Division sur zero !");
        }

        Fraction f1 = new Fraction(nominateur1,denominateur1);
        Fraction f2 = new Fraction(nominateur2,denominateur2);
        logger.info("voici les fractions introduites : " + f1.toString() + " et  " + f2.toString());
    }





    private int numerateur;
    private int denominateur;



    public Fraction(int numerateur,int denominateur){
        this.setNumerateur(numerateur);
        if(denominateur == 0) // Impossible
        {
            System.out.println("Division par zero ! operation interdite ! nous remplaceons le denominateur par 1");
            this.setDenominateur(1);
        }else
        {
            this.setDenominateur(denominateur);
        }
    }
    public Fraction(int numerateur){
        this(numerateur,1);
    }
    public Fraction(){
        this(0,1);
    }


    public void setNumerateur(int a){
        numerateur=a;
    }
    public int getNumerateur(){
        return numerateur;
    }

    public void setDenominateur(int a){
            this.denominateur=a;
    }
    public int getDenominateur(){
        return this.denominateur;
    }

    @Override
    public String toString() {
        return String.format(this.numerateur + " / " + this.denominateur );
    }
    public double toDouble() {
        return (double) (numerateur / denominateur);
    }

    public Fraction add(Fraction f) //addition de 2 fractions
    {
        int a,b;
        b = this.denominateur * f.denominateur;
        a = (this.numerateur * f.denominateur) + (f.numerateur * this.denominateur);
        Fraction somme = new Fraction (a,b);
        return somme;
    }

    public boolean equals(Fraction f) {
        return this.numerateur * f.denominateur == f.numerateur * this.denominateur;
    }


    public int compareTo(Fraction fra) {
        long t = (long) this.numerateur * fra.denominateur;
        long f = (long) fra.numerateur * this.denominateur;
        int result = 0;
        if(t>f) {
            result = 1;
        }
        else if(f>t) {
            result = -1;
        }
        return result;
    }


}
