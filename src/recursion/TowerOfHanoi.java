void main() {

    System.out.println("Enter the number of disks: ");
    Scanner input = new Scanner(System.in);
    int numberOfDisks = input.nextInt();

    System.out.println("The moves are: ");
    moveDisks(numberOfDisks, 'A', 'B', 'C');

}

static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
    if (n == 1) {
        System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
    } else {
        moveDisks(n - 1, fromTower, auxTower, toTower);
        System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        moveDisks(n - 1, auxTower, toTower, fromTower);
    }
}