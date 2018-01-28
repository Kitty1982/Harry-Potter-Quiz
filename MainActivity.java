package com.example.android.harrypotterquiz_final;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isHintEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize quiz
        initializeQuiz(null);
    }

    /**
     * Sets quiz to initial state
     *
     * @param view: passed in view from activity
     */

    public void initializeQuiz(View view) {

        // q1
        TextView question1No = findViewById(R.id.question1_no);
        question1No.setText(R.string.number_01);
        TextView question1Text = findViewById(R.id.question1_text);
        question1Text.setText(R.string.question_01);

        RadioButton question1Option1 = findViewById(R.id.question1_option1);
        question1Option1.setText(R.string.q01_option1);
        question1Option1.setChecked(false);

        RadioButton question01Option2 = findViewById(R.id.question1_option2);
        question01Option2.setText(R.string.q01_option2);
        question01Option2.setChecked(false);

        RadioButton question01Option3 = findViewById(R.id.question1_option3);
        question01Option3.setText(R.string.q01_option3);
        question01Option3.setChecked(false);

        TextView question01Hint = findViewById(R.id.question1_option_hint);
        question01Hint.setText(R.string.hint_Q01);
        question01Hint.setVisibility(View.INVISIBLE);

        // q2
        TextView question2No = findViewById(R.id.question2_no);
        question2No.setText(R.string.number_02);
        TextView question2Text = findViewById(R.id.question2_text);
        question2Text.setText(R.string.question_02);

        RadioButton question02Option1 = findViewById(R.id.question2_option1);
        question02Option1.setText(R.string.q02_option1);
        question02Option1.setChecked(false);

        RadioButton question02Option2 = findViewById(R.id.question2_option2);
        question02Option2.setText(R.string.q02_option2);
        question02Option2.setChecked(false);

        RadioButton question02Option3 = findViewById(R.id.question2_option3);
        question02Option3.setText(R.string.q02_option3);
        question02Option3.setChecked(false);

        TextView question02Hint = findViewById(R.id.question2_option_hint);
        question02Hint.setText(R.string.hint_Q02);
        question02Hint.setVisibility(View.INVISIBLE);

        // q3
        TextView question3No = findViewById(R.id.question3_no);
        question3No.setText(R.string.number_03);
        TextView question3Text = findViewById(R.id.question3_text);
        question3Text.setText(R.string.question_03);

        RadioButton question03Option1 = findViewById(R.id.question3_option1);
        question03Option1.setText(R.string.q03_option1);
        question03Option1.setChecked(false);

        RadioButton question03Option2 = findViewById(R.id.question3_option2);
        question03Option2.setText(R.string.q03_option2);
        question03Option2.setChecked(false);

        RadioButton question03Option3 = findViewById(R.id.question3_option3);
        question03Option3.setText(R.string.q03_option3);
        question03Option3.setChecked(false);

        TextView question03Hint = findViewById(R.id.question3_option_hint);
        question03Hint.setText(R.string.hint_Q03);
        question03Hint.setVisibility(View.INVISIBLE);

        // q4
        TextView question4No = findViewById(R.id.question4_no);
        question4No.setText(R.string.number_04);
        TextView question4Text = findViewById(R.id.question4_text);
        question4Text.setText(R.string.question_04);

        RadioButton question04Option1 = findViewById(R.id.question4_option1);
        question04Option1.setText(R.string.q04_option1);
        question04Option1.setChecked(false);

        RadioButton question04Option2 = findViewById(R.id.question4_option2);
        question04Option2.setText(R.string.q04_option2);
        question04Option2.setChecked(false);

        RadioButton question04Option3 = findViewById(R.id.question4_option3);
        question04Option3.setText(R.string.q04_option3);
        question04Option3.setChecked(false);

        TextView question04Hint = findViewById(R.id.question4_option_hint);
        question04Hint.setText(R.string.hint_Q04);
        question04Hint.setVisibility(View.INVISIBLE);

        // q5
        TextView question5No = findViewById(R.id.question5_no);
        question5No.setText(R.string.number_05);
        TextView question5Text = findViewById(R.id.question5_text);
        question5Text.setText(R.string.question_05);

        RadioButton question05Option1 = findViewById(R.id.question5_option1);
        question05Option1.setText(R.string.q05_option1);
        question05Option1.setChecked(false);

        RadioButton question05Option2 = findViewById(R.id.question5_option2);
        question05Option2.setText(R.string.q05_option2);
        question05Option2.setChecked(false);

        RadioButton question05Option3 = findViewById(R.id.question5_option3);
        question05Option3.setText(R.string.q05_option3);
        question05Option3.setChecked(false);

        TextView question05Hint = findViewById(R.id.question5_option_hint);
        question05Hint.setText(R.string.hint_Q05);
        question05Hint.setVisibility(View.INVISIBLE);

        // q6
        TextView question6No = findViewById(R.id.question6_no);
        question6No.setText(R.string.number_06);
        TextView question6Text = findViewById(R.id.question6_text);
        question6Text.setText(R.string.question_06);

        RadioButton question06Option1 = findViewById(R.id.question6_option1);
        question06Option1.setText(R.string.q06_option1);
        question06Option1.setChecked(false);

        RadioButton question06Option2 = findViewById(R.id.question6_option2);
        question06Option2.setText(R.string.q06_option2);
        question06Option2.setChecked(false);

        RadioButton question06Option3 = findViewById(R.id.question6_option3);
        question06Option3.setText(R.string.q06_option3);
        question06Option3.setChecked(false);

        TextView question06Hint = findViewById(R.id.question6_option_hint);
        question06Hint.setText(R.string.hint_Q06);
        question06Hint.setVisibility(View.INVISIBLE);

        // q7
        TextView question7No = findViewById(R.id.question7_no);
        question7No.setText(R.string.number_07);
        TextView question7Text = findViewById(R.id.question7_text);
        question7Text.setText(R.string.question_07);

        RadioButton question07Option1 = findViewById(R.id.question7_option1);
        question07Option1.setText(R.string.q07_option1);
        question07Option1.setChecked(false);

        RadioButton question07Option2 = findViewById(R.id.question7_option2);
        question07Option2.setText(R.string.q07_option2);
        question07Option2.setChecked(false);

        RadioButton question07Option3 = findViewById(R.id.question7_option3);
        question07Option3.setText(R.string.q07_option3);
        question07Option3.setChecked(false);

        TextView question07Hint = findViewById(R.id.question7_option_hint);
        question07Hint.setText(R.string.hint_Q07);
        question07Hint.setVisibility(View.INVISIBLE);

        // q8
        TextView question8No = findViewById(R.id.question8_no);
        question8No.setText(R.string.number_08);
        TextView question8Text = findViewById(R.id.question8_text);
        question8Text.setText(R.string.question_08);

        RadioButton question08Option1 = findViewById(R.id.question8_option1);
        question08Option1.setText(R.string.q08_option1);
        question08Option1.setChecked(false);

        RadioButton question08Option2 = findViewById(R.id.question8_option2);
        question08Option2.setText(R.string.q08_option2);
        question08Option2.setChecked(false);

        RadioButton question08Option3 = findViewById(R.id.question8_option3);
        question08Option3.setText(R.string.q08_option3);
        question08Option3.setChecked(false);

        TextView question08Hint = findViewById(R.id.question8_option_hint);
        question08Hint.setText(R.string.hint_Q08);
        question08Hint.setVisibility(View.INVISIBLE);

        // q9
        TextView question9No = findViewById(R.id.question9_no);
        question9No.setText(R.string.number_09);
        TextView question9Text = findViewById(R.id.question9_text);
        question9Text.setText(R.string.question_09);

        RadioButton question09Option1 = findViewById(R.id.question9_option1);
        question09Option1.setText(R.string.q09_option1);
        question09Option1.setChecked(false);

        RadioButton question09Option2 = findViewById(R.id.question9_option2);
        question09Option2.setText(R.string.q09_option2);
        question09Option2.setChecked(false);

        RadioButton question09Option3 = findViewById(R.id.question9_option3);
        question09Option3.setText(R.string.q09_option3);
        question09Option3.setChecked(false);

        TextView question09Hint = findViewById(R.id.question9_option_hint);
        question09Hint.setText(R.string.hint_Q09);
        question09Hint.setVisibility(View.INVISIBLE);

        // q10
        TextView question10No = findViewById(R.id.question10_no);
        question10No.setText(R.string.number_10);
        TextView question10Text = findViewById(R.id.question10_text);
        question10Text.setText(R.string.question_10);

        RadioButton question10Option1 = findViewById(R.id.question10_option1);
        question10Option1.setText(R.string.q10_option1);
        question10Option1.setChecked(false);

        RadioButton question10Option2 = findViewById(R.id.question10_option2);
        question10Option2.setText(R.string.q10_option2);
        question10Option2.setChecked(false);

        RadioButton question10Option3 = findViewById(R.id.question10_option3);
        question10Option3.setText(R.string.q10_option3);
        question10Option3.setChecked(false);

        TextView question10Hint = findViewById(R.id.question10_option_hint);
        question10Hint.setText(R.string.hint_Q10);
        question10Hint.setVisibility(View.INVISIBLE);

        // update total questions answered textview
        TextView totalAnswered = findViewById(R.id.total_answered);
        totalAnswered.setText(R.string.number_result);


        // set text of submit button
        Button btnSubmit = findViewById(R.id.button_submit);
        btnSubmit.setText(R.string.button_submit);
        btnSubmit.getBackground().setColorFilter(ContextCompat.getColor(this, R.color.button_background), PorterDuff.Mode.MULTIPLY);
        btnSubmit.setTextColor(getResources().getColor(R.color.button_text));

        // reset hint
        isHintEnabled = false;
    }

    /**
     * Shows/hides hint after hint button clicked. If answer wrong only.
     *
     * @param view: passed in from activity view
     */
    public void showHint(View view) {

        // right answers are:
        // q1o3
        // q2o2
        // q3o1
        // q4o2
        // q5o1
        // q6o1
        // q7o2
        // q8o1
        // q9o3
        // q10o3
        // so, read answers

        RadioButton q1o3 = findViewById(R.id.question1_option3);
        Boolean q1o3Value = q1o3.isChecked();

        RadioButton q2o2 = findViewById(R.id.question2_option2);
        Boolean q2o2Value = q2o2.isChecked();

        RadioButton q3o1 = findViewById(R.id.question3_option1);
        Boolean q3o1Value = q3o1.isChecked();

        RadioButton q4o2 = findViewById(R.id.question4_option2);
        Boolean q4o2Value = q4o2.isChecked();

        RadioButton q5o1 = findViewById(R.id.question5_option1);
        Boolean q5o1Value = q5o1.isChecked();

        RadioButton q6o1 = findViewById(R.id.question6_option1);
        Boolean q6o1Value = q6o1.isChecked();

        RadioButton q7o2 = findViewById(R.id.question7_option2);
        Boolean q7o2Value = q7o2.isChecked();

        RadioButton q8o1 = findViewById(R.id.question8_option1);
        Boolean q8o1Value = q8o1.isChecked();

        RadioButton q9o3 = findViewById(R.id.question9_option3);
        Boolean q9o3Value = q9o3.isChecked();

        RadioButton q10o3 = findViewById(R.id.question10_option3);
        Boolean q10o3Value = q10o3.isChecked();

        TextView question01Hint = findViewById(R.id.question1_option_hint);
        TextView question02Hint = findViewById(R.id.question2_option_hint);
        TextView question03Hint = findViewById(R.id.question3_option_hint);
        TextView question04Hint = findViewById(R.id.question4_option_hint);
        TextView question05Hint = findViewById(R.id.question5_option_hint);
        TextView question06Hint = findViewById(R.id.question6_option_hint);
        TextView question07Hint = findViewById(R.id.question7_option_hint);
        TextView question08Hint = findViewById(R.id.question8_option_hint);
        TextView question09Hint = findViewById(R.id.question9_option_hint);
        TextView question10Hint = findViewById(R.id.question10_option_hint);

        // show hint if required

        if (!isHintEnabled) {

            if (!q1o3Value) {
                question01Hint.setVisibility(View.VISIBLE);
            }

            if (!q2o2Value) {
                question02Hint.setVisibility(View.VISIBLE);
            }

            if (!q3o1Value) {
                question03Hint.setVisibility(View.VISIBLE);
            }

            if (!q4o2Value) {
                question04Hint.setVisibility(View.VISIBLE);
            }

            if (!q5o1Value) {
                question05Hint.setVisibility(View.VISIBLE);
            }

            if (!q6o1Value) {
                question06Hint.setVisibility(View.VISIBLE);
            }

            if (!q7o2Value) {
                question07Hint.setVisibility(View.VISIBLE);
            }

            if (!q8o1Value) {
                question08Hint.setVisibility(View.VISIBLE);
            }

            if (!q9o3Value) {
                question09Hint.setVisibility(View.VISIBLE);
            }

            if (!q10o3Value) {
                question10Hint.setVisibility(View.VISIBLE);
            }

        } else {
            question01Hint.setVisibility(View.INVISIBLE);
            question02Hint.setVisibility(View.INVISIBLE);
            question03Hint.setVisibility(View.INVISIBLE);
            question04Hint.setVisibility(View.INVISIBLE);
            question05Hint.setVisibility(View.INVISIBLE);
            question06Hint.setVisibility(View.INVISIBLE);
            question07Hint.setVisibility(View.INVISIBLE);
            question08Hint.setVisibility(View.INVISIBLE);
            question09Hint.setVisibility(View.INVISIBLE);
            question10Hint.setVisibility(View.INVISIBLE);
        }

        isHintEnabled = !isHintEnabled;
    }

    /**
     * Submit and calculate results, show result
     *
     * @param view: passed in from activity view
     */

    public void submitResults(View view) {
        // right answers are:
        // q1o3
        // q2o2
        // q3o1
        // q4o2
        // q5o1
        // q6o1
        // q7o2
        // q8o1
        // q9o3
        // q10o3
        // so, read answers

        int pointsTotal = 0;

        RadioButton q1o3 = findViewById(R.id.question1_option3);
        Boolean q1o3Value = q1o3.isChecked();

        RadioButton q2o2 = findViewById(R.id.question2_option2);
        Boolean q2o2Value = q2o2.isChecked();

        RadioButton q3o1 = findViewById(R.id.question3_option1);
        Boolean q3o1Value = q3o1.isChecked();

        RadioButton q4o2 = findViewById(R.id.question4_option2);
        Boolean q4o2Value = q4o2.isChecked();

        RadioButton q5o1 = findViewById(R.id.question5_option1);
        Boolean q5o1Value = q5o1.isChecked();

        RadioButton q6o1 = findViewById(R.id.question6_option1);
        Boolean q6o1Value = q6o1.isChecked();

        RadioButton q7o2 = findViewById(R.id.question7_option2);
        Boolean q7o2Value = q7o2.isChecked();

        RadioButton q8o1 = findViewById(R.id.question8_option1);
        Boolean q8o1Value = q8o1.isChecked();

        RadioButton q9o3 = findViewById(R.id.question9_option3);
        Boolean q9o3Value = q9o3.isChecked();

        RadioButton q10o3 = findViewById(R.id.question10_option3);
        Boolean q10o3Value = q10o3.isChecked();

        // calculate points

        if (q1o3Value) {
            pointsTotal++;
        }

        if (q2o2Value) {
            pointsTotal++;
        }

        if (q3o1Value) {
            pointsTotal++;
        }

        if (q4o2Value) {
            pointsTotal++;
        }

        if (q5o1Value) {
            pointsTotal++;
        }

        if (q6o1Value) {
            pointsTotal++;
        }

        if (q7o2Value) {
            pointsTotal++;
        }

        if (q8o1Value) {
            pointsTotal++;
        }

        if (q9o3Value) {
            pointsTotal++;
        }

        if (q10o3Value) {
            pointsTotal++;
        }

        // update total questions answered textview
        TextView totalAnswered = findViewById(R.id.total_answered);
        totalAnswered.setText("" + pointsTotal + "/10");

        // show toast

        Context context = getApplicationContext();

        if (pointsTotal<10) {
            Toast toast = Toast.makeText(context, "Du hast " + pointsTotal + " von 10 Antworten richtig.",Toast.LENGTH_SHORT);
            toast.show();
        }

        if (pointsTotal==10) {
            Toast toast = Toast.makeText(context, R.string.toast_winner, Toast.LENGTH_SHORT);
            toast.show();

        }
    }
}
