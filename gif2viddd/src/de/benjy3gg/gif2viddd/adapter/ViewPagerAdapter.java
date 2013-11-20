
package de.benjy3gg.gif2viddd.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import de.benjy3gg.gif2viddd.SampleFragment_;

public class ViewPagerAdapter
    extends FragmentPagerAdapter
{


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return 3;
    }

    public Fragment getItem(int position) {
        Fragment fragment = new SampleFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("label", "LABEL " + position);
        fragment.setArguments(bundle);
        return fragment;
    }

}
