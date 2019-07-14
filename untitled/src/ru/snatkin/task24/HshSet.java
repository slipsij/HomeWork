package ru.snatkin.task24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HshSet {
    public static void main(String[] args)
    {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("foo");
        stringSet.add("buzz");
        stringSet.add("bar");
        stringSet.add("fork");
        stringSet.add("bort");
        stringSet.add("spoon");
        stringSet.add("!");
        stringSet.add("dude");

        removeEvenLenght(stringSet);
        System.out.println(stringSet);
    }

    /**
     * Возвращает множество, в котором удалены все элементы четной длины из исходного множества
     * @param stringSet Список
     */
    private static void removeEvenLenght(Set<String> stringSet)
    {
        Iterator it = stringSet.iterator();
        while (it.hasNext())
        {
            String element = (String) it.next();
            if (element.length() % 2 != 0)
            {
                it.remove();
            }
        }
    }
}
