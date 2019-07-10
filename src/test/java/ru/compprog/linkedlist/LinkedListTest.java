package ru.compprog.linkedlist;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class LinkedListTest {
        @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Petr Arsentev";
        String expect = "Echo, echo, echo : Petr Arsentev";
        LinkedList calc = new LinkedList();
        String result = calc.echo(input);
        assertThat(result, is(expect));
    }

}