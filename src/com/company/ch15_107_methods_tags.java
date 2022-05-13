package com.company;

/**
 * this is a good class
 */
public class ch15_107_methods_tags {
    /**
     *
     * @param args These are the arguments supplied to the command line
     */



    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * hello this is a method and this is the m,ost beautiful method in the class
     * @param i this is the number to add
     * @param j this the number to add
     * @return sum of the integers
     * @throws Exception if i=0
     * @deprecated this method is depricated please use '+' operator
     */
    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
