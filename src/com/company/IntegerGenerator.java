package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Maxi Agrippa
 */
public class IntegerGenerator
{
    /**
     * Store integers from 1 to 100000 in order
     */
    public ArrayList<Integer> integers = new ArrayList<Integer>();

    /**
     * Store integers between 1 and 100000 randomly
     */
    public ArrayList<Integer> randomIntegers = new ArrayList<Integer>();

    /**
     * Store integers from 100000 to 1 in order
     */
    public ArrayList<Integer> reversedIntegers = new ArrayList<Integer>();

    /**
     * the number of integers to get
     */
    public int numberOfIntegers = 0;

    /**
     * specific number of random integers
     */
    public ArrayList<Integer> getRandomIntegers = new ArrayList<Integer>();

    public IntegerGenerator ()
    {
        Generate100KIntegers();
        Generate100KRandomIntegers();
        GenerateReversedIntegers();
    }

    public ArrayList<Integer> GetRandomIntegers (int numberOfIntegers)
    {
        if (isValideNumber(numberOfIntegers))
        {
            setNumberOfIntegers(numberOfIntegers);
            getRandomIntegers.clear();
            for (int i = 0; i < numberOfIntegers; i++)
            {
                getRandomIntegers.add(i);
            }
            Collections.shuffle(getRandomIntegers);
            return getRandomIntegers;
        }
        return null;
    }


    public ArrayList<Integer> Generate100KIntegers ()
    {
        integers.clear();
        for (int i = 0; i < 100000; i++)
        {
            integers.add(i + 1);
        }
        return integers;
    }

    public ArrayList<Integer> Generate100KRandomIntegers ()
    {
        randomIntegers.clear();
        for (int i = 0; i < 100000; i++)
        {
            randomIntegers.add(i + 1);
        }
        Collections.shuffle(randomIntegers);
        return randomIntegers;
    }

    public ArrayList<Integer> GenerateReversedIntegers ()
    {
        reversedIntegers.clear();
        for (int i = 0; i < 100000; i++)
        {
            reversedIntegers.add(100000 - i);
        }
        return reversedIntegers;
    }

    public int getNumberOfIntegers ()
    {
        return numberOfIntegers;
    }

    public void setNumberOfIntegers (int numberOfIntegers)
    {
        if (isValideNumber(numberOfIntegers))
        {
            this.numberOfIntegers = numberOfIntegers;
        }
    }

    public boolean isValideNumber (int numberOfIntegers)
    {
        if (numberOfIntegers > 0)
        {
            return true;
        }
        return false;
    }
}
