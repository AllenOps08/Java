public class TowerOfHanoi {
   
     
public static void towerOfHanoi3Rods(int n , char source, char destination , char auxiliary){
    if (n==1) {
        System.out.println("Move disk 1 from "  + source +  " to " + destination);
        return; 
    }

    // Move n-1 disks from source to auxiliary rod
    towerOfHanoi3Rods(n-1, source,  auxiliary , destination);
  
    // Move the nth disk from source to destination
    System.out.println("Move disk " + n + " from "  + source + "to " + destination);
    
    // Move n-1 disks from auxiliary to destination rod
    towerOfHanoi3Rods(n-1,  auxiliary ,destination, source);
}





 public static void main(String[] args) {
    System.out.println("Tower of Hanoi -- 3 Rods : ");
    towerOfHanoi3Rods(3, 'A', 'B', 'C');
 }

}
