package com.example.book4u;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class BottomTabActivity extends AppCompatActivity {
    MeowBottomNavigation meowBottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_tab);

        meowBottomNavigation = (MeowBottomNavigation) findViewById(R.id.bottomTab);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_bbookmark));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_add));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_dw));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_profile));

        meowBottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment;
                fragment = null;

                switch (item.getId()){
                    case 1:
                        fragment = new HomeFragment();
                        break;

                    case 2:
                        fragment = new BookmarkFragment();
                    break;

                    case 3:
                        fragment = new UploadFragment();
                    break;

                    case 4:
                        fragment = new DownloadFragment();
                    break;

                    case 5:
                        fragment = new ProfileFragment();
                    break;
                }
                loadFragment(fragment);
            }
        });

        meowBottomNavigation.show(3,true);

        meowBottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
//                Toast.makeText(getApplicationContext(), "you clicked "+ item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        meowBottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
//                Toast.makeText(getApplicationContext(), "you reclicked "+ item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
    }
}