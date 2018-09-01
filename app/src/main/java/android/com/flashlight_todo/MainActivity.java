package android.com.flashlight_todo;

import android.com.flashlight_todo.Utils.Flash;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Flash mFlash;
    private Button mButtonOn;
    private Button mButtonOff;
    private Button mButtonBlink;
    // TODO[16] : Add button for turning on
    // TODO[17] : Add button for turning off
    // TODO[18] : Add button for blinking
    public void on (View v)
    {
        mFlash.turnFlashOn();
    }
    public void off (View v)
    {
        mFlash.turnFlashOn();
    }
    public void blink (View v)
    {
        mFlash.turnFlashOn();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlash=Flash.getInstance();
        mButtonOn =findViewById(R.id.onButton);



        mButtonOff=findViewById(R.id.offButton);


        mButtonBlink=findViewById(R.id.blinkButton);

        // TODO[19] : Initialize button for turning on using findViewById() and button's id from xml
        // TODO[20] : Use setOnClickListener to map mFlash.turnFlashOn() to this button

        // TODO[21] : Initialize button for turning off using findViewById() and button's id from xml
        // TODO[22] : Use setOnClickListener to map mFlash.turnFlashOff() to this button

        // TODO[23] : Initialize button for turning blinking using findViewById() and button's id from xml
        // TODO[24] : Use setOnClickListener to map mFlash.blink() to this button

    }
}
