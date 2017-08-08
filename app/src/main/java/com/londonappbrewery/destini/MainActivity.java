package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTopButton;
    Button mDownButton;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mDownButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveOn(true);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveOn(false);
            }
        });

        mStoryIndex = 1;

    }

    public void moveOn(boolean topOrBottom) {

        if (mStoryIndex == 1) {

            if (topOrBottom) {

                mStoryIndex = 3;
                mStoryTextView.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mDownButton.setText(R.string.T3_Ans2);

            } else {

                mStoryIndex = 2;
                mStoryTextView.setText(R.string.T2_Story);
                mTopButton.setText(R.string.T2_Ans1);
                mDownButton.setText(R.string.T2_Ans2);
            }

        } else if (mStoryIndex == 2) {

            if (topOrBottom) {

                mStoryIndex = 3;
                mStoryTextView.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mDownButton.setText(R.string.T3_Ans2);

            } else {

                mStoryTextView.setText(R.string.T4_End);
                mTopButton.setVisibility(View.GONE);
                mDownButton.setVisibility(View.GONE);

            }


        } else {

            if (topOrBottom) {

                mStoryTextView.setText(R.string.T6_End);
                mTopButton.setVisibility(View.GONE);
                mDownButton.setVisibility(View.GONE);

            } else {

                mStoryTextView.setText(R.string.T5_End);
                mTopButton.setVisibility(View.GONE);
                mDownButton.setVisibility(View.GONE);
            }

        }
    }
}
