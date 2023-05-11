package sg.edu.rp.c346.id22009186.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;

    ToggleButton svcTogBtn;

    ToggleButton gstTogBtn;
    RadioGroup rgPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextPaxNo);
        svcTogBtn = findViewById(R.id.svcChargeEnabled);
        gstTogBtn = findViewById(R.id.gstEnabled);
        etInput = findViewById(R.id.editTextDiscount);
        rgPayment = findViewById(R.id.radioGroupPayment);
        btnDisplay = findViewById(R.id.splitButton);
        btnDisplay = findViewById(R.id.resetButton);
    }
    svcTogBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Code for the action
            boolean isChecked = svcTogBtn.isChecked();
            if (isChecked) {
                etInput.setEnabled(true);
            } else {
                etInput.setEnabled(false);
            }
        }
}