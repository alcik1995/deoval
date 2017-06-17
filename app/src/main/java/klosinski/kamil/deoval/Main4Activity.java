package klosinski.kamil.deoval;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;


public class Main4Activity extends AppCompatActivity {

    private static final String TAG = "Main4Activity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

            Log.d(TAG, "onCreate: Staring.");
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
            //Set up the ViewPager with the sections adapter
            mViewPager = (ViewPager) findViewById(R.id.container);
            setupViewPager(mViewPager);

            TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
            tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Currenttt Job");
        adapter.addFragment(new Tab2Fragment(), "Vehicle History");
        adapter.addFragment(new Tab3Fragment(), "Vehicle Details");
        viewPager.setAdapter(adapter);
    }
}
