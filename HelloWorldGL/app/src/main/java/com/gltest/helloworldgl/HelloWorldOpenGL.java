package com.gltest.helloworldgl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.gltest.helloworldgl.Mesh.SimplePlane;

public class HelloWorldOpenGL extends AppCompatActivity {

//    private BitmapRenderer renderer = null;
//    private DodecahedronRenderer renderer = null;
    private SolarSystemRenderer renderer = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); // (NEW)

        GLSurfaceView view = new GLSurfaceView(this);
//        view.setRenderer(new OpenGLRenderer());
//        view.setRenderer(new ColorOpenGLRenderer());
//        view.setRenderer(new ShapeGLRenderer());
//        renderer = new BitmapRenderer();
//        renderer = new DodecahedronRenderer();
        renderer = new SolarSystemRenderer();

        view.setRenderer(renderer);
        setContentView(view);

        LoadBitmap2Plane();

    }

    private void LoadBitmap2Plane() {
//        SimplePlane plane = new SimplePlane(1, 1);
//        // Move and rotate the plane.
////        plane.z = 1.7f;
////        plane.rx = -65;
//        // Load the texture.
////        Bitmap bp = BitmapFactory.decodeFile("/storage/emulated/0/MyDocs/LiveTest/nio.png");
//        Bitmap bp = BitmapFactory.decodeFile("/storage/emulated/0/MyDocs/LiveTest/nio.jpg");
//        plane.loadBitmap(bp);
//        // Add the plane to the renderer.
//        renderer.addMesh(plane);
    }
}
