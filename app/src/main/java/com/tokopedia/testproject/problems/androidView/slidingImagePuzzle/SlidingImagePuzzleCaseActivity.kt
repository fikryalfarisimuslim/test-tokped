
package com.tokopedia.testproject.problems.androidView.slidingImagePuzzle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tokopedia.testproject.R
import com.tokopedia.testproject.fromHtml
import com.tokopedia.testproject.loadFile
import kotlinx.android.synthetic.main.activity_problem_simulation.*

class SlidingImagePuzzleCaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // for example only. You may change this to any image url.
        val imageUrl = "https://ecs7.tokopedia.net/img/cache/700/product-1/2017/8/31/5839014/5839014_3655b848-2d44-4999-8cf5-d136b7fe7c23_500_500.png";

        setContentView(R.layout.activity_problem_simulation)
        webView.loadFile("sliding_image.html")
        btn_simulate.setOnClickListener {
            startActivity(SlidingImageGameActivity.getIntent(this, imageUrl))
        }
    }

}
