package in.campuskarma.campuskarma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.string.cancel;

public class FeedbackActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextEmail;
    EditText editTextMeassage;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        editTextName = (EditText) findViewById (R.id.edtName);
        editTextEmail = (EditText) findViewById (R.id.edtEmail);
        editTextMeassage = (EditText) findViewById (R.id.edtMessage);
        buttonSend= (Button)findViewById (R.id.btnSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(editTextName.getText().toString() != null && !editTextName.getText().toString().equals("")
                    && editTextEmail.getText().toString() != null && !editTextEmail.getText().toString().equals("")
                    && editTextMeassage.getText().toString() != null && !editTextMeassage.getText().toString().equals("")) {

                    Toast.makeText(
                            FeedbackActivity.this,
                            "Your message has been successfully send. ", Toast.LENGTH_SHORT).show();
                    onBackPressed();

                }
                else{

                    Toast.makeText(
                            FeedbackActivity.this,
                            "Please enter all the fields to continue.", Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}
