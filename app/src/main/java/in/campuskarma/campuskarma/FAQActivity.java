package in.campuskarma.campuskarma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class FAQActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        textView = (TextView) findViewById (R.id.faq);
        if (textView != null) {
            textView.setText(Html.fromHtml(getString(R.string.faq_content)));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }
}
