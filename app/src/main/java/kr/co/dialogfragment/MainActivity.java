package kr.co.dialogfragment;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dialogClicked(View view) {
        MyDialogFragment dialogFragment = MyDialogFragment.newInstance("title");
        dialogFragment.show(getSupportFragmentManager(), MyDialogFragment.TAG);
    }
}
