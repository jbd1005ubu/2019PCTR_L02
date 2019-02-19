import java.awt.*;

public class BoardThread extends Thread {

    private Board board;

    public BoardThread(Board board) {
        this.board = board;
    }

    @Override
    public void run() {
        while(true) {
            board.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
