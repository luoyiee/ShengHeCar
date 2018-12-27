package com.il360.shenghecar.adapter;

import java.util.List;

import com.il360.shenghecar.R;
import com.il360.shenghecar.model.recovery.Express;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ExpressAdapter extends BaseAdapter{
	private Context context;
	private LayoutInflater mInflater;
	private List<Express> list;
	
	public ExpressAdapter(List<Express> list, Context context) {
		this.context = context;
		this.list = list;
	}
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView==null){
			mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			holder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.listitem_string, null);
			holder.tvListString = (TextView) convertView.findViewById(R.id.tv_list_string);			
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.tvListString.setText(list.get(position).getExpress());
		return convertView;
	}
	class ViewHolder{
		TextView tvListString;
	}
}
