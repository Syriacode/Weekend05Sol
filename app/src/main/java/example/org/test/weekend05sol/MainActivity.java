package example.org.test.weekend05sol;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAlertDialog;
    Button btnOpenDialog;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenDialog = findViewById(R.id.btnOpenDialog);
        btnAlertDialog = findViewById(R.id.btnAlertDialog);
    }

    public void onClick(View view) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setMessage("Do you want to close this App?").setCancelable(false)
        .setPositiveButton("Yes", new onClickListner() );
    }

    private class onClickListner implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            finish();
        }
    }
}
