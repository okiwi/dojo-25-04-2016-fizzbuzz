package org.okiwi.codingdojo.fizzbuzzduprintemps.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.okiwi.codingdojo.fizzbuzzduprintemps.JeuDeFizzBuzz;

public class FizzBuzzTests {

    private JeuDeFizzBuzz jeu;

    @Before
    public void setUp() throws Exception {
        jeu = new JeuDeFizzBuzz();
    }

    @Test
    public void jeu_peut_dire_un() {
        // arrange
        Integer un = 1;

        // act
        String result = jeu.dire(un);

        // assert
        Assert.assertEquals(result, "1");
    }

    @Test
    public void jeu_peut_dire_deux() {
        String result = jeu.dire(2);
        Assert.assertEquals(result, "2");
    }

    @Test
    public void jeu_peut_dire_fizz() {
        String result = jeu.dire(3);
        Assert.assertEquals(result, "fizz");
    }

    @Test
    public void jeu_peut_dire_buzz10() {
        String result = jeu.dire(10);
        Assert.assertEquals(result, "buzz");
    }

    @Test
    public void jeu_peut_dire_buzz5() {
        String result = jeu.dire(5);
        Assert.assertEquals(result, "buzz");
    }

    @Test
    public void jeu_peut_dire_fizzbuzz15() {
        String result = jeu.dire(15);
        Assert.assertEquals(result, "fizzbuzz");
    }

    @Test
    public void jeu_peut_dire_fizzbuzzbang105() {
        String result = jeu.dire(105);
        Assert.assertEquals(result, "fizzbuzzbang");
    }

    @Test
    public void jeu_peut_dire_bang7() {
        String result = jeu.dire(7);
        Assert.assertEquals(result, "bang");
    }

    @Test
    public void jeu_peut_dire_fizzbang21() {
        String result = jeu.dire(21);
        Assert.assertEquals(result, "fizzbang");
    }
}
