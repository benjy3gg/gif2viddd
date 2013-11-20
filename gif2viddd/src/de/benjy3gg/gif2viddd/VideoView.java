
package de.benjy3gg.gif2viddd;

import android.support.v4.view.ViewPager;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import de.benjy3gg.gif2viddd.adapter.ViewPagerAdapter;

@EActivity(R.layout.activity_main)
public class VideoView
    extends SherlockFragmentActivity
{

    @ViewById
    ViewPager pager;

    @AfterViews
    void afterViews() {
        configureViewPager();
    }

    private void configureViewPager() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(viewPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }

}
