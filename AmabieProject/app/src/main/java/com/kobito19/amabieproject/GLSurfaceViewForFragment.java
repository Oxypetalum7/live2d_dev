package com.kobito19.amabieproject;

import android.content.Context;
import android.opengl.GLSurfaceView;

//Fragmentに返せるようにしたGLSurfaceView
public class GLSurfaceViewForFragment extends GLSurfaceView {
    public GLSurfaceViewForFragment(Context context){
        super(context);
        /*setEGLContextClientVersion(2);
        setRenderer(new GLRenderer());*/

    }
}
