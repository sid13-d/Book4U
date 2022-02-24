package com.example.book4u;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.animation.content.Content;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    SliderAdapter (Context context){
        this.context = context;
    }

    public int[] lottieGIF = {
            R.raw.onboarding1,
            R.raw.onboarding2,
            R.raw.onboarding3
    };

    public String[] title = {
            "Read pdfs anytime anywhere with ease",
            "Variety of pdfs on single touch",
            "Reach out a huge community and grow together"
    };

    public String[] description = {
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
    };


    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.onboarding_screen, container, false);

        LottieAnimationView slideanimationView = (LottieAnimationView) view.findViewById(R.id.animView);
        TextView slideTile = (TextView) view.findViewById(R.id.onboardingTitle);
        TextView slideDescription = (TextView) view.findViewById(R.id.titleDescription);

        slideanimationView.setAnimation(lottieGIF[position]);
        slideTile.setText(title[position]);
        slideDescription.setText(description[position]);

        container.addView(view);
        return  view;
    };

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
