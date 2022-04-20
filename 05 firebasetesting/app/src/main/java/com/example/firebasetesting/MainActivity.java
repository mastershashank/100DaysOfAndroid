package com.example.firebasetesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    //Variables
    TextInputLayout fullName, branch, collegeRoll, regNo, eMail, nativePlace, contactNumber;
    Button btn01;
    /* FirebaseDatabase rootNode;
     DatabaseReference reference;
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hooks to all xml elements in activity_main
        fullName = findViewById(R.id.f_name);
        branch = findViewById(R.id.branch_name);
        collegeRoll = findViewById(R.id.roll_no);
        regNo = findViewById(R.id.registration_no);
        eMail = findViewById(R.id.e_mail);
        nativePlace = findViewById(R.id.native_place);
        contactNumber = findViewById(R.id.contact_number);
        btn01 = findViewById(R.id.sbmt);


        // Save data in firebase
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("users");

                //Get All the values
                String name = fullName.getEditText().getText().toString();
                String branches = branch.getEditText().getText().toString();
                String collegeRollNo = collegeRoll.getEditText().getText().toString();
                String regNos = regNo.getEditText().getText().toString();
                String mail = eMail.getEditText().getText().toString();
                String place = nativePlace.getEditText().getText().toString();
                String contactNo = contactNumber.getEditText().getText().toString();


                UserHelperClass helperClass = new UserHelperClass(name, branches, collegeRollNo, regNos, mail, place,contactNo);

                myRef.child(contactNo).setValue(helperClass);
                // myRef.child("users").child("users").setValue(contactNo);
            }
        });
        // Register button method end




    } // onCreate Method end here
}