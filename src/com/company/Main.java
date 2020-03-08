package com.company;

import com.searchtrees.AVLTree;
import com.searchtrees.BinarySearchTree;
import com.searchtrees.RedBlackBST;
import com.searchtrees.SplayTree;

import java.util.Random;

/**
 * @author Maxi Agrippa
 */

/************************************************************************
 * ConsoleUI
 * Organized Functional Parts:
 * Insert
 * Search
 * Delete
 ************************************************************************/

public class Main
{
    /**
     * Integer Generator
     */
    public static IntegerGenerator IG = new IntegerGenerator();

    /**
     * Binary Search Tree
     */
    public static BinarySearchTree BST = new BinarySearchTree();

    /**
     * AVL Tree
     */
    public static AVLTree AVLTInteger = new AVLTree();

    /**
     * Red Black Binary Search Tree
     */
    public static RedBlackBST<Integer, Integer> RBBST = new RedBlackBST<Integer, Integer>();

    /**
     * Splay Tree
     */
    public static SplayTree ST = new SplayTree();

    /**
     * Insert Times
     */
    public static int numberOfInsert = 100000;

    public static void main (String[] args)
    {
        IG.GetRandomIntegers(numberOfInsert);
        ConsoleUI();
    }

    /**
     * Console User Interface
     */
    public static void ConsoleUI ()
    {
        //App Controller
        boolean AppOn = true;
        while (AppOn)
        {
            //Insert(in order)
            InsertInorder();
            //Search
            Search();
            //Delete(in order)
            DeleteInorder();
            //Insert(Random)
            RandomInsert();
            //Search
            Search();
            //Delete(Random)
            RandomDelete();

            AppOn = false;
        }
    }

    /***************************************************************************
     * Insert
     ***************************************************************************/

    /**
     * Organize Insert functions
     */
    public static void InsertInorder ()
    {
        InsertBinarySearchTree();
        InsertAVLTree();
        InsertSplayTree();
        InsertRBBST();
    }

    /**
     * Binary Search Tree Insertion
     */
    public static void InsertBinarySearchTree ()
    {
        BST.makeEmpty();
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            BST.insert(i);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(in order) in Binary Search Tree is: " + time);
    }

    /**
     * AVL Tree Insertion
     */
    public static void InsertAVLTree ()
    {
        AVLTInteger.makeEmpty();
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            AVLTInteger.insert(i);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(in order) in AVL Tree is: " + time);
    }

    /**
     * Splay Tree Insertion
     */
    public static void InsertSplayTree ()
    {
        ST.makeEmpty();
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            ST.insert(i);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(in order) in Splay Tree is: " + time);
    }

    /**
     * Red Black Tree Insertion
     */
    public static void InsertRBBST ()
    {
        if (!RBBST.isEmpty())
        {
            for (int i = 0; i < numberOfInsert; i++)
            {
                RBBST.delete(i);
            }
        }
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            RBBST.put(i, i);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(in order) in Red Black Tree is: " + time);
    }

    /***************************************************************************
     * Search
     ***************************************************************************/

    /**
     * Organize Search functions
     */
    public static void Search ()
    {
        SearchBinarySearchTree();
        SearchAVLTree();
        SearchSplayTree();
        SearchRBBST();
    }

    /**
     * Binary Search Tree Search
     */
    public static void SearchBinarySearchTree ()
    {
        //BST should not be empty
        if (BST.isEmpty())
        {
            InsertBinarySearchTree();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            BST.contains(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Search(random) in Binary Search Tree is: " + time);
    }

    /**
     * AVL Tree Search
     */
    public static void SearchAVLTree ()
    {
        //AVLTInteger should not be empty
        if (AVLTInteger.isEmpty())
        {
            InsertAVLTree();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            AVLTInteger.contains(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Search(random) in AVL Tree is: " + time);
    }

    /**
     * Splay Tree Search
     */
    public static void SearchSplayTree ()
    {
        if (ST.isEmpty())
        {
            InsertSplayTree();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            ST.contains(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Search(random) in Splay Tree is: " + time);
    }

    /**
     * Red Black Tree Search
     */
    public static void SearchRBBST ()
    {
        if (RBBST.isEmpty())
        {
            InsertRBBST();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            RBBST.contains(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Search(random) in Red Black Tree is: " + time);
    }

    /***************************************************************************
     * Delete
     ***************************************************************************/

    /**
     * Organize Delete Function
     */
    public static void DeleteInorder ()
    {
        DeleteBinarySearchTree();
        DeleteAVLTree();
        DeleteSplayTree();
        DeleteRBBST();
    }

    /**
     * Binary Search Tree Delete
     */
    public static void DeleteBinarySearchTree ()
    {
        if (BST.isEmpty())
        {
            InsertBinarySearchTree();
        }
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            BST.remove(numberOfInsert - i - 1);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(in order) in Binary Search Tree is: " + time);
    }

    /**
     * AVL Tree Delete
     */
    public static void DeleteAVLTree ()
    {
        if (AVLTInteger.isEmpty())
        {
            InsertAVLTree();
        }
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            AVLTInteger.remove(numberOfInsert - i - 1);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(in order) in AVL Tree is: " + time);
    }

    /**
     * Splay Tree Delete
     */
    public static void DeleteSplayTree ()
    {
        if (ST.isEmpty())
        {
            InsertSplayTree();
        }
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            ST.remove(numberOfInsert - i - 1);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(in order) in Splay Tree is: " + time);
    }

    /**
     * Red Black Tree Delete
     */
    public static void DeleteRBBST ()
    {
        if (RBBST.isEmpty())
        {
            InsertRBBST();
        }
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            startTime = System.nanoTime();
            RBBST.delete(numberOfInsert - i - 1);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(in order) in Red Black Tree is: " + time);
    }

    /***************************************************************************
     * Random Insertion
     ***************************************************************************/

    /**
     * Organize Random Insert functions
     */
    public static void RandomInsert ()
    {
        RandomInsertBinarySearchTree();
        RandomInsertAVLTree();
        RandomInsertSplayTree();
        RandomInsertRBBST();
    }

    /**
     * Binary Search Tree Random Insertion
     */
    public static void RandomInsertBinarySearchTree ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        BST.makeEmpty();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = IG.getRandomIntegers.get(i);
            startTime = System.nanoTime();
            BST.insert(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(random) in Binary Search Tree is: " + time);
    }

    /**
     * AVL Tree Random Insertion
     */
    public static void RandomInsertAVLTree ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        AVLTInteger.makeEmpty();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = IG.getRandomIntegers.get(i);
            startTime = System.nanoTime();
            AVLTInteger.insert(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(random) in AVL Tree is: " + time);
    }

    /**
     * Splay Tree Random Insertion
     */
    public static void RandomInsertSplayTree ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        ST.makeEmpty();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = IG.getRandomIntegers.get(i);
            startTime = System.nanoTime();
            ST.insert(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(random) in Splay Tree is: " + time);
    }

    /**
     * Red Black Tree Random Insertion
     */
    public static void RandomInsertRBBST ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        if (!RBBST.isEmpty())
        {
            for (int i = 0; i < numberOfInsert; i++)
            {
                RBBST.delete(i);
            }
        }
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = IG.getRandomIntegers.get(i);
            startTime = System.nanoTime();
            RBBST.put(data, data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Insert(random) in Red Black Tree is: " + time);
    }

    /***************************************************************************
     * Random Delete
     ***************************************************************************/

    /**
     * Organize Random Delete Function
     */
    public static void RandomDelete ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        RandomDeleteBinarySearchTree();
        RandomDeleteAVLTree();
        RandomDeleteSplayTree();
        RandomDeleteRBBST();
    }

    /**
     * Binary Search Tree Random Delete
     */
    public static void RandomDeleteBinarySearchTree ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        if (BST.isEmpty())
        {
            RandomInsertBinarySearchTree();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            BST.remove(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(random) in Binary Search Tree is: " + time);
    }

    /**
     * AVL Tree Random Delete
     */
    public static void RandomDeleteAVLTree ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        if (AVLTInteger.isEmpty())
        {
            RandomInsertAVLTree();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            AVLTInteger.remove(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(random) in AVL Tree is: " + time);
    }

    /**
     * Splay Tree Random Delete
     */
    public static void RandomDeleteSplayTree ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        if (ST.isEmpty())
        {
            RandomInsertSplayTree();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            ST.remove(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(random) in Splay Tree is: " + time);
    }

    /**
     * Red Black Tree Random Delete
     */
    public static void RandomDeleteRBBST ()
    {
        IG.GetRandomIntegers(numberOfInsert);
        if (RBBST.isEmpty())
        {
            RandomInsertRBBST();
        }
        Random random = new Random();
        int data = 0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;
        for (int i = 0; i < numberOfInsert; i++)
        {
            data = random.nextInt(numberOfInsert);
            startTime = System.nanoTime();
            RBBST.delete(data);
            endTime = System.nanoTime();
            time += (endTime - startTime);
        }
        time /= numberOfInsert;
        System.out.println("Average Time of 100,000 Delete(random) in Red Black Tree is: " + time);
    }
}
