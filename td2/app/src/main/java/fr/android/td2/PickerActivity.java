package fr.android.td2;

import android.os.Bundle;
import android.widget.NumberPicker;

public class PickerActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picker);

        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
        np.setMinValue(10);
        np.setMaxValue(20);
    }
}
