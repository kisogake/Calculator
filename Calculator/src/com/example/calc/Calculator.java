package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class Calculator extends Activity implements OnClickListener, TextWatcher {

	private static final String TAG = "MyApp";

	EditText etResult;
	TextView methodText, logText;
	Button btnPlus, btnMinus, btnMultiply, btnDivide, btnClear, btnAbs, btnDiv, btnMod, btnStepen, button0, button1,
			button2, button3, button4, button5, button6, button7, button8, button9, btnCalculate;

	int int_num1, int_num2, int_result, clickcount = 0;
	boolean debugA = true;
	double double_num1, double_num2, double_result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "Создание интоерфейса программы");

		setContentView(R.layout.calculator);

		etResult = (EditText) findViewById(R.id.etResult);
		etResult.addTextChangedListener(this);
		logText = (TextView) findViewById(R.id.logText);

		logText.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View v) {
				methodText.setVisibility(View.INVISIBLE);
				logText.setVisibility(View.INVISIBLE);
				return true;
			}
		});

		methodText = (TextView) findViewById(R.id.methodText);
		methodText.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View v) {
				methodText.setVisibility(View.INVISIBLE);
				logText.setVisibility(View.INVISIBLE);
				return true;
			}
		});

		logText.setClickable(true);

		methodText.setClickable(true);

		btnPlus = (Button) findViewById(R.id.btnPlus);
		btnMinus = (Button) findViewById(R.id.btnMinus);
		btnMultiply = (Button) findViewById(R.id.btnMultiply);
		btnDivide = (Button) findViewById(R.id.btnDivide);
		btnClear = (Button) findViewById(R.id.btnClear);
		btnAbs = (Button) findViewById(R.id.btnAbs);
		btnDiv = (Button) findViewById(R.id.btnDiv);
		btnMod = (Button) findViewById(R.id.btnMod);
		btnStepen = (Button) findViewById(R.id.btnStepen);
		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		btnCalculate = (Button) findViewById(R.id.btnCalculate);

		Log.d(TAG, "Привязка слушателей");
		btnPlus.setOnClickListener(this);
		btnMinus.setOnClickListener(this);
		btnMultiply.setOnClickListener(this);
		btnDivide.setOnClickListener(this);
		btnClear.setOnClickListener(this);
		btnAbs.setOnClickListener(this);
		btnDiv.setOnClickListener(this);
		btnMod.setOnClickListener(this);
		btnStepen.setOnClickListener(this);
		button0.setOnClickListener(this);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);
		btnCalculate.setOnClickListener(this);

		Log.d(TAG, "Конец создания интерфейса программы");

	}

	@Override
	public void onClick(View view) {
		Log.d(TAG, "Вход в функцию с операциями");
		methodText.setText("Текущий метод: onClick");

		switch (view.getId()) {

		/*
		 * case R.id.debugLog:
		 * 
		 * if (methodText.getVisibility() == View.VISIBLE && logText.getVisibility() ==
		 * View.VISIBLE) { methodText.setVisibility(View.INVISIBLE);
		 * logText.setVisibility(View.INVISIBLE); }
		 * 
		 * break;
		 */
		/*case R.id.methodText:

			break; */

		/*case R.id.logText:
			logText.setOnLongClickListener(new View.OnLongClickListener() {
				@Override
				public boolean onLongClick(View v) {
					methodText.setVisibility(View.INVISIBLE);
					logText.setVisibility(View.INVISIBLE);
					return true;
				}
			});
			break; */
		case R.id.button0:
			Log.d(TAG, "Нажата клавиша 0");
			logText.setText("Нажата клавиша 0");

			etResult.append(button0.getText());
			break;

		case R.id.button1:
			Log.d(TAG, "Нажата клавиша 1");
			logText.setText("Нажата клавиша 1");

			etResult.append(button1.getText());
			break;
		case R.id.button2:
			Log.d(TAG, "Нажата клавиша 2");
			logText.setText("Нажата клавиша 2");

			etResult.append(button2.getText());
			break;
		case R.id.button3:
			Log.d(TAG, "Нажата клавиша 3");
			logText.setText("Нажата клавиша 3");

			etResult.append(button3.getText());
			break;
		case R.id.button4:
			Log.d(TAG, "Нажата клавиша 4");
			logText.setText("Нажата клавиша 4");

			etResult.append(button4.getText());
			break;
		case R.id.button5:
			Log.d(TAG, "Нажата клавиша 5");
			logText.setText("Нажата клавиша 5");

			etResult.append(button5.getText());
			break;
		case R.id.button6:
			Log.d(TAG, "Нажата клавиша 6");
			logText.setText("Нажата клавиша 6");

			etResult.append(button6.getText());
			break;
		case R.id.button7:
			Log.d(TAG, "Нажата клавиша 7");
			logText.setText("Нажата клавиша 7");

			etResult.append(button7.getText());
			break;
		case R.id.button8:
			Log.d(TAG, "Нажата клавиша 8");
			logText.setText("Нажата клавиша 8");

			etResult.append(button8.getText());
			break;
		case R.id.button9:
			Log.d(TAG, "Нажата клавиша 9");
			logText.setText("Нажата клавиша 9");

			etResult.append(button9.getText());
			break;
		case R.id.btnPlus:
			Log.d(TAG, "Нажата клавиша +");
			logText.setText("Нажата клавиша +");

			etResult.append(btnPlus.getText());
			break;
		case R.id.btnMinus:
			Log.d(TAG, "Нажата клавиша -");
			logText.setText("Нажата клавиша -");

			etResult.append(btnMinus.getText());
			break;
		case R.id.btnMultiply:
			Log.d(TAG, "Нажата клавиша *");
			logText.setText("Нажата клавиша *");

			etResult.append(btnMultiply.getText());
			break;
		case R.id.btnDivide:
			Log.d(TAG, "Нажата клавиша /");
			logText.setText("Нажата клавиша /");

			etResult.append(btnDivide.getText());
			break;
		case R.id.btnClear:
			Log.d(TAG, "Нажата клавиша очистки текста");
			logText.setText("Нажата клавиша очистки текста");

			etResult.setText("");
			break;
		case R.id.btnAbs:
			Log.d(TAG, "Нажата клавиша abs");
			logText.setText("Нажата клавиша abs");
			if (etResult.getText().length() > 0) {
				double_num1 = Double.valueOf(etResult.getText().toString());
				double_num1 = Math.abs(double_num1);
				etResult.setText(String.valueOf(double_num1));
			}
			break;
		case R.id.btnDiv:
			Log.d(TAG, "Нажата клавиша div");
			logText.setText("Нажата клавиша div");
			break;
//			if (etResult.getText().length() > 0) {
//				int_num1 = Integer.valueOf(etNumber1.getText().toString());
//				int_num2 = Integer.valueOf(etNumber2.getText().toString());
//				int_result = int_num1 / int_num2;
//				etResult.setText(String.valueOf(int_result));
//			}
		case R.id.btnMod:
			Log.d(TAG, "Нажата клавиша mod");
			logText.setText("Нажата клавиша mod");
			break;
//			if (etNumber1.getText().length() > 0 && etNumber2.getText().length() > 0) {
//				int_num1 = Integer.valueOf(etNumber1.getText().toString());
//				int_num2 = Integer.valueOf(etNumber2.getText().toString());
//				int_result = int_num1 % int_num2;
//				etResult.setText(String.valueOf(int_result));
//			}
		case R.id.btnStepen:
			Log.d(TAG, "Нажата клавиша ^");
			logText.setText("Нажата клавиша ^");
			etResult.append("^");
			break;

		case R.id.btnCalculate:
			if (debugA = true) {
				methodText.setText("Текущий метод: Вычисление");
			}
			btnCalculate.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					clickcount++;
					if (clickcount % 5 == 0) {
						methodText.setVisibility(View.VISIBLE);
						logText.setVisibility(View.VISIBLE);
						methodText.setText("");
						logText.setText("");
					}

				}
			});
			Log.d(TAG, "Вычисление. . .");
			String result = etResult.getText().toString();

			for (int counter = 0; counter < result.length(); counter++) {
				if (result.charAt(counter) == '+') {
					double_num1 = Double.valueOf(result.substring(0, counter));
					double_num2 = Double.valueOf(result.substring(counter + 1, result.length()));
					etResult.setText(String.valueOf(sum(double_num1, double_num2)));
				} else if (result.charAt(counter) == '-') {
					double_num1 = Double.valueOf(result.substring(0, counter));
					double_num2 = Double.valueOf(result.substring(counter + 1, result.length()));
					Toast.makeText(this, String.valueOf(double_num1), Toast.LENGTH_LONG).show();
					Toast.makeText(this, String.valueOf(double_num2), Toast.LENGTH_LONG).show();
					etResult.setText(String.valueOf(subtract(double_num1, double_num2)));
				} else if (result.charAt(counter) == '*') {
					double_num1 = Double.valueOf(result.substring(0, counter));
					double_num2 = Double.valueOf(result.substring(counter + 1, result.length()));
					etResult.setText(String.valueOf(multiply(double_num1, double_num2)));
				} else if (result.charAt(counter) == '/') {
					double_num1 = Double.valueOf(result.substring(0, counter));
					double_num2 = Double.valueOf(result.substring(counter + 1, result.length()));
					etResult.setText(String.valueOf(divide(double_num1, double_num2)));
				}
			}

			btnCalculate.setOnLongClickListener(new View.OnLongClickListener() {
				@Override
				public boolean onLongClick(View v) {
					methodText.setVisibility(View.INVISIBLE);
					logText.setVisibility(View.INVISIBLE);
					return true;
				}
			});
			Log.d(TAG, "Выполнено");
			break;
		}
	}

	private double sum(double a, double b) {
		double c = a + b;
		return c;
	}

	private double subtract(double a, double b) {
		double c = a - b;
		return c;
	}

	private double multiply(double a, double b) {
		double c = a * b;
		return c;
	}

	private double divide(double a, double b) {
		double c = a / b;
		return c;
	}

	@Override
	public void afterTextChanged(Editable arg0) {
	}

	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {

		if (etResult.getText().length() == 0) {
			if (btnAbs.isEnabled()) {
				btnAbs.setEnabled(false);
				btnCalculate.setEnabled(false);
			}
		} else if (!btnAbs.isEnabled()) {
			btnAbs.setEnabled(true);
			btnCalculate.setEnabled(true);
		}
	}

}