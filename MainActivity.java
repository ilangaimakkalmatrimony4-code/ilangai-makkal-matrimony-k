package com.ilangaimakkal.matrimony;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int dp(float value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    private TextView text(String value, int size, int color, boolean bold) {
        TextView t = new TextView(this);
        t.setText(value);
        t.setTextSize(size);
        t.setTextColor(color);
        if (bold) t.setTypeface(null, Typeface.BOLD);
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(8), dp(8), dp(8), dp(8));
        return t;
    }

    private Button button(String label) {
        Button b = new Button(this);
        b.setText(label);
        b.setAllCaps(false);
        b.setTextSize(16);
        return b;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scroll = new ScrollView(this);
        scroll.setBackgroundColor(Color.rgb(255, 248, 242));
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setGravity(Gravity.CENTER_HORIZONTAL);
        page.setPadding(dp(20), dp(28), dp(20), dp(28));
        scroll.addView(page);

        TextView logo = text("💍", 48, Color.rgb(130, 20, 50), false);
        page.addView(logo, new LinearLayout.LayoutParams(-1, -2));

        TextView title = text("Ilangai Makkal Matrimony", 26, Color.rgb(130, 20, 50), true);
        page.addView(title, new LinearLayout.LayoutParams(-1, -2));

        TextView tamil = text("தமிழ் பேசும் மக்கள் அனைவருக்குமான திருமண இணையதளம்", 19,
                Color.rgb(90, 45, 45), true);
        page.addView(tamil, new LinearLayout.LayoutParams(-1, -2));

        TextView intro = text("உங்கள் வாழ்க்கைத் துணையைத் தேடும் பயணத்தை இங்கே தொடங்குங்கள்.",
                16, Color.DKGRAY, false);
        intro.setPadding(dp(8), dp(14), dp(8), dp(20));
        page.addView(intro, new LinearLayout.LayoutParams(-1, -2));

        Button register = button("பதிவு செய்யுங்கள்  |  Register");
        page.addView(register, new LinearLayout.LayoutParams(-1, -2));
        register.setOnClickListener(v -> Toast.makeText(this,
                "Registration form will be connected in the next step.", Toast.LENGTH_LONG).show());

        Button search = button("வரன்களைத் தேடுங்கள்  |  Find Matches");
        page.addView(search, new LinearLayout.LayoutParams(-1, -2));
        search.setOnClickListener(v -> Toast.makeText(this,
                "Match search will be connected in the next step.", Toast.LENGTH_LONG).show());

        Button contact = button("தொடர்பு கொள்ள  |  Contact Us");
        page.addView(contact, new LinearLayout.LayoutParams(-1, -2));
        contact.setOnClickListener(v -> Toast.makeText(this,
                "Contact: 9384118035", Toast.LENGTH_LONG).show());

        TextView note = text("A starter app for Ilangai Makkal Matrimony", 13,
                Color.GRAY, false);
        note.setPadding(dp(8), dp(24), dp(8), dp(8));
        page.addView(note, new LinearLayout.LayoutParams(-1, -2));

        setContentView(scroll);
    }
}
