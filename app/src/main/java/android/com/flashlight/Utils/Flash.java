package android.com.flashlight_todo.Utils;

import android.hardware.Camera;

public class Flash {
    private static final Flash ourInstance = new Flash();
    private Camera mCamera;

    public static Flash getInstance() {
        return ourInstance;
    }
    private Flash() {
        mCamera = Camera.open();
    }

    private void setCamera(String mode) {
        Camera.Parameters parameters = mCamera.getParameters();
        parameters.setFlashMode(mode);
        mCamera.setParameters(parameters);
        mCamera.startPreview();
    }
    private void sleep(long delay){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void turnFlashOn() {
        setCamera(Camera.Parameters.FLASH_MODE_TORCH);
    }
    public void turnFlashOFF() {
        setCamera(Camera.Parameters.FLASH_MODE_OFF);
    }
    public void blinkFlash(long delay, long numFlashes) {
        for (int i = 0; i < numFlashes; ++i) {
            if (i % 2 == 0) {
                turnFlashOn();
            } else {
                turnFlashOFF();
            }
            sleep(delay);
        }
    }
}
