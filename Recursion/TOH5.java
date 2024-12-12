public class TOH5 {
    public static void main(String[] args) {
        int[] diskCounts = {3,5,7};

        for (int i : diskCounts) {
            System.out.println("\n Tower of Hanoi - 5 rods with "+ diskCounts + "disks: ");
            solveTowerOfHanoi5Rods(i);
        }
    }
     
    public static void solveTowerOfHanoi5Rods(int n){
        moveDisk(n,'A','E','B','C','D');
    }

    private static void moveDisk(int n , char source, char destination, char aux1, char aux2, char aux3){
        if (n==1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        if(n==2){
            System.out.println("Move disk 1 from " + source + " to " + aux1);
            System.out.println("Move disk 2 from " + source + " to " + destination);
            System.out.println("Move disk 1 from " + aux1 + " to " + destination);
            return;
        }

        moveDisk(n-3, source,  aux1, destination, aux2, aux3);
        moveDisk(3, source, destination, aux1, aux2, aux3);
       moveDisk(n-3, aux1 ,  destination,  source ,aux2, aux3);
    }

    public static long calculateMinMoves(int n) {
        // This is an approximation based on mathematical research
        // The exact formula for 5-rod Tower of Hanoi is complex
        return (long) (Math.pow(2, n) * 0.5);
    }

    
}
