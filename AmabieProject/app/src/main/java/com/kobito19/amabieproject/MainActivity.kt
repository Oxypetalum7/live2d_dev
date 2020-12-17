package com.kobito19.amabieproject


import android.app.Activity
import android.content.Intent
import android.opengl.GLSurfaceView
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickSetting(view: View) {
        val intent = Intent(this, SettingActivity::class.java)
        startActivity(intent)
    }
}

class AnimationFragment : Fragment() {
    private lateinit var _glSurfaceView: GLSurfaceViewForFragment
    private lateinit var _glRenderer: GLRenderer
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?

    ): View? {
        JniBridgeJava.SetActivityInstance(this.activity)
        JniBridgeJava.SetContext(this.context)
        _glSurfaceView = GLSurfaceViewForFragment(this.context)
        _glSurfaceView.setEGLContextClientVersion(2)
        _glRenderer = GLRenderer()
        _glSurfaceView.setRenderer(_glRenderer)
        _glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY)
        return _glSurfaceView;
    }




}