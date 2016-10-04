package iii.org.tw.myfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private F1Fragment f1;
    private F2Fragment f2;
    private boolean isF1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = new F1Fragment(); f2 = new F2Fragment();

        fmgr = getFragmentManager();
        //開始做交易
        tran = fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();

        isF1 = true;
    }
    public void go(View v){
        isF1 = !isF1;
        //開始做交易
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, isF1?f1:f2);
        //會顯示疊層的效果
        //tran.addToBackStack(null);
        tran.commit();
    }
    F1Fragment getF1(){
        return f1;
    }
    F2Fragment getF2(){
        return f2;
    }
    public void b1(View v){

    }
    public void b2(View v){

    }
}
