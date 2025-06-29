public class Interfaces {
    public static void main(String[] args) {

    }
}

interface ChessPlayer { // 100% abstruction
    void moves(); // final, public and static

}

class Queen implements ChessPlayer {
    // Recreate with implementation
    public void moves() {
        System.out.println("up, down, right, left, cross");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, right, left");
    }
}

class Bishop implements ChessPlayer {
    public void moves() {
        System.out.println("diagonal");
    }
}
