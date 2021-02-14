package com.quiz.users

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quiz.users.ui.UserListFragment
import com.quiz.users.utils.replace

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            replace(R.id.container, UserListFragment.newInstance())
        }
    }
}