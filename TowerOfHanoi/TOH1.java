import java.io.*;

public class TOH1 {


    static void towerOfHanoi(int n , char fromRod, char toRod, char auxRod1, char auxRod2, char auxRod3){
        if(n==0) return; 
        if(n==1) System.out.println("Move disk 1 from rod " + fromRod + "to Rod "+ toRod );

        //Move(n-2) disks from 'fromRod' to 'auxRod1' using other rods
        towerOfHanoi(n-2, fromRod,  auxRod1, auxRod2,auxRod3 ,toRod);

        //Move the (n-1)th disk to toRo
        System.out.println("Move disk " + (n-1) + " from rod "+ fromRod + "to rod "+ auxRod2);
        
        //Move the nth disk to 'toRod'
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        
        //Move the (n-1)th disk from 'auxRod2' to 'toRod'
        System.out.println("Move disk " + (n - 1) + " from rod " + auxRod2 + " to rod " + toRod);
                
        //Move the (n-2) disks from auxRod1 to toRod
        towerOfHanoi(n - 2, auxRod1, toRod, fromRod, auxRod2, auxRod3);
    }

    public static void main(String[] args) {
          int N = 4;
          towerOfHanoi(N, 'A','E', 'B', 'C', 'D');
    }



}
