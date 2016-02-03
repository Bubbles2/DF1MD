package com.example.donnchafinlaypj.df1md;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDrawerFragment extends Fragment
{
	private ActionBarDrawerToggle mdrawerToggle;
	private DrawerLayout mDrawerLayout;

	public MyDrawerFragment()
	{
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_my_drawer, container, false);
	}

	public void setup(DrawerLayout drawerFragment, Toolbar toolbar)
	{
		mDrawerLayout = drawerFragment;
		mdrawerToggle = new ActionBarDrawerToggle(getActivity(), mDrawerLayout, R.string.drawer_open, R.string.drawer_closed)
		{
			@Override
			public void onDrawerOpened(View drawerView)
			{
				super.onDrawerOpened(drawerView);
			}

			@Override
			public void onDrawerClosed(View drawerView)
			{
				super.onDrawerClosed(drawerView);
			}
		};
		mDrawerLayout.setDrawerListener(mdrawerToggle);
	}
}
