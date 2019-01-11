/**
 * a program that will generate exceptions of type NegativeArraySizeException,
 * IndexOutOfBoundsException, NullPointerException. Record the catching of
 * each exception by displaying the message stored in the exception object.
 */
package com.stackroute.PE3;

public class TypesOfExceptions {
    public int number;
    /*
    Checking Exceptions
     */
    public static void main(String[] args) {
        //Checking for NegativeArraySizeException
        try{
            int array[] = new int[-1];
        }catch (NegativeArraySizeException e){
            System.out.println(e);
        }
        //Checking for IndexOutOfBoundException
        try{
            int array[] = new int[10];
            System.out.println(array[10]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        //Checking for NullPointerException
        try{
            TypesOfExceptions object= new TypesOfExceptions();
            object = null;
            object.number=10;
        }catch (NullPointerException e){
            System.out.println(e);
        }

    }
}