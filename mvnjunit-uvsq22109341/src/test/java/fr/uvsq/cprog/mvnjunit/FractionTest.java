package fr.uvsq.cprog.mvnjunit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {
    private static final Fraction ZERO = new Fraction(0, 1);
    private static final Fraction UN = new Fraction(1, 1);

    @Test
    public void testpremierConstructeur() {
        Fraction f = new Fraction(1, 2);
        assertEquals("wrong numerateur", 1, f.getNumerateur());

        System.out.println(f.getDenominateur());
        assertEquals("wrong denominateur", 2, f.getDenominateur());
    }

    @Test
    public void testdenominateurnullConstructeur() {
        Fraction f = new Fraction(3, 0);
        assertEquals("wrong numerateur", 3, f.getNumerateur());
        assertEquals("wrong denominateur", 1, f.getDenominateur());
    }

    @Test
    public void testdeuxiemeConstructeur() {
        Fraction f = new Fraction(5);
        assertEquals("wrong numerateur", 5, f.getNumerateur());
        assertEquals("wrong denominateur", 1, f.getDenominateur());
    }

    @Test
    public void testtroisiemeConstructeur() {
        Fraction f = new Fraction();
        assertEquals("wrong numerateur", 0, f.getNumerateur());
        assertEquals("wrong denominateur", 1, f.getDenominateur());
    }

    @Test
    public void ZeroEquals0() {
        Assert.assertEquals(ZERO.toDouble(),0,2);
    }

    @Test
    public void UNEquals1() {
        Assert.assertEquals(UN.toDouble(),1,2);
    }

    @Test public void testegalite() {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(6,8);
        assertTrue(f1.equals(f2)); // tester si :  3/4 + 4/5 = 31 /20
    }

    @Test public void testcomparaison() {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(6,8);
        assertTrue(f1.equals(f2)); // tester si :  3/4 + 4/5 = 31 /20
    }

    @Test public void testAddition() {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(4,5);
        Fraction somme = new Fraction(31,20);
        assertTrue(somme.equals(f1.add(f2))); // tester si :  3/4 + 4/5 = 31 /20
    }

    @Test public void testcomparaisonsuperieure() {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(4,5);
        assertEquals(f2.compareTo(f1),1);//verifier si f2>f1
    }
    @Test public void testcomparaisoninferieur() {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(4,5);
        assertEquals(f1.compareTo(f2),-1);//verifier si f2<f1
    }
    @Test public void testcomparaisonegale() {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(9,12);
        assertEquals(f2.compareTo(f1),0);//verifier si f1=f2
    }


}