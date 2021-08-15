package com.wits.ksw.airc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int a = Integer.parseInt(new BigInteger("10001110", 2).toString());
        Log.i("MainActivity", "onCreate: a " + a);
        Log.i("MainActivity", "onCreate: 10001111>>7 = " + (a >> 7));
    }
}
