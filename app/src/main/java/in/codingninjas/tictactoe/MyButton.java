package in.codingninjas.tictactoe;

import android.content.Context;
import android.widget.Button;

/**
 * Created by manishakhattar on 26/01/17.
 */

public class MyButton extends Button {

    private int player;

    public MyButton(Context context) {
        super(context);
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
