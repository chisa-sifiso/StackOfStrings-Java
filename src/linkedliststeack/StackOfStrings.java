/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststeack;

import java.util.Arrays;

/**
 *
 * @author POL_1_G1B-69
 */
public class StackOfStrings {
    String[] iteam=null;
    int iCount=0;

    public StackOfStrings(int capacity) {
        iteam= new String[capacity];
    }
    
    public void push(String item){
        if (iCount >= iteam.length) {
            System.out.println("Stack is full! Cannot push " + item);
            return;
        }
        iteam[iCount++]=item;
    }
    public String pop(){
        if (iCount == 0) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
       String wordTemp= iteam[iCount];
        iteam[--iCount]=null;//take note that the number is 
       return wordTemp;
    }

      @Override
    public String toString() {
        return "StackOfStrings{" +
                "items=" + Arrays.toString(Arrays.copyOf(iteam, iCount)) +
                ", count=" + iCount +
                '}';
    }
    
}
