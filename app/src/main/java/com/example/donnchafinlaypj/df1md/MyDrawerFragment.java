package com.example.donnchafinlaypj.df1md;

import android.content.Context;
import android.content.SharedPreferences;
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

	public static final String PREF_FILE_NAME = "testpref";
	public static final String KEY_USER_LEARNED_DRAWER = "user_learned_drawer";

	private ActionBarDrawerToggle mdrawerToggle;
	private DrawerLayout mDrawerLayout;

	private boolean mUserLearnedDrawer;
	private boolean mFromSavedInstanceState;

	public MyDrawerFragment()
	{
		// Required empty public constructor
	}

	public static void saveToPreference(Context context, String preferenceName, String preferenceValue)
	{
		SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString(preferenceName, preferenceValue);
		editor.commit();

	}

	public static String readFromPreference(Context context, String preferenceName, String defaultValue)
	{
		SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
		return sharedPreferences.getString(preferenceName, defaultValue);
	}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		mUserLearnedDrawer = Boolean.getBoolean(readFromPreference(getActivity(), KEY_USER_LEARNED_DRAWER, "false"));
		if (savedInstanceState != null)
		{
			mFromSavedInstanceState = true;
		}

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

	public void sav()
	{


	}
}
