package com.omrobbie.imageeffects;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView myImageView;

    private Drawable myDrawable;
    private Bitmap myBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();
    }

    private void setupEnv() {
        myImageView = (ImageView) findViewById(R.id.myImageView);

        /*myDrawable = ResourcesCompat.getDrawable(getResources(), R.drawable.firebase, null);
        myBitmap = ((BitmapDrawable) myDrawable).getBitmap();

        Bitmap newPhoto = invertImage(myBitmap);
        myImageView.setImageBitmap(newPhoto);*/

        Drawable[] layers = new Drawable[2];
        layers[0] = getResources().getDrawable(R.drawable.firebase);
        layers[1] = getResources().getDrawable(R.drawable.pattern);

        LayerDrawable layerDrawable = new LayerDrawable(layers);
        myImageView.setImageDrawable(layerDrawable);
    }

    private Bitmap invertImage(Bitmap original) {
        Bitmap finalImage = Bitmap.createBitmap(original.getWidth(), original.getHeight(), original.getConfig());

        int A, R, G, B;
        int pixelColor;
        int heigth = original.getHeight();
        int width = original.getWidth();

        for (int y = 0; y < heigth; y++) {
            for (int x = 0; x < width; x++) {
                pixelColor = original.getPixel(x, y);
                A = Color.alpha(pixelColor);
                R = 255 - Color.red(pixelColor);
                G = 255 - Color.green(pixelColor);
                B = 255 - Color.blue(pixelColor);

                finalImage.setPixel(x, y, Color.argb(A, R, G, B));
            }
        }

        return finalImage;
    }
}
