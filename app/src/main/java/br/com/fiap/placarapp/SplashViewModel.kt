package br.com.fiap.placarapp

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.logging.Handler

class SplashViewModel: ViewModel(){



    var loading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        loading.value = true
    }

    fun load(){
        Handler().postDelayed({
            loading.value = false
        }, 3000)
    }

    private fun startAnim() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.splash)
        ivLogo.startAnimation(anim)
    }

}