package com.itbox.grzl.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

import com.zhaoliewang.grzl.R;
import com.itbox.grzl.activity.ExamStartActivity;

/**
 * 测评页面
 * 
 * @author byz
 * 
 */
public class ExamFragment extends BaseFragment {

	@InjectView(R.id.text_medium)
	protected TextView mTitleTv;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_exam, null);

		ButterKnife.inject(this, view);

		initView();

		return view;
	}

	private void initView() {
		mTitleTv.setText("在线测评");
	}

	@OnClick(R.id.bt_start_exam)
	public void onClick(View v) {
		// 开始测评
		startActivity(new Intent(getActivity(), ExamStartActivity.class));
	}
}
