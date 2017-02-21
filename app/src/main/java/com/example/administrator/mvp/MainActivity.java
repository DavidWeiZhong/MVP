package com.example.administrator.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.mvp.presenter.UserPresenter;
import com.mvp.view.IUserView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, IUserView {

    private UserPresenter mUserPresenter;

    EditText id, firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.save).setOnClickListener(this);
        findViewById(R.id.load).setOnClickListener(this);

        id = (EditText) findViewById(R.id.et_id);
        firstName = (EditText) findViewById(R.id.et_firstName);
        lastName = (EditText) findViewById(R.id.et_lastName);

        mUserPresenter = new UserPresenter(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.save:
                mUserPresenter.saveUser(getId(), getFirstName(), getLastName());
                break;
            case R.id.load:
                mUserPresenter.loadUser(getId());
                break;
            default:
                break;
        }
    }



    @Override
    public int getId() {

        return new Integer(id.getText().toString());
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName.setText(firstName);
    }

    @Override
    public void setLastNmae(String lastNmae) {
        this.lastName.setText(lastNmae);
    }

    @Override
    public String getFirstName() {
        return firstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastName.getText().toString();
    }
}
