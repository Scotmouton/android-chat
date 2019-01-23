package cn.wildfire.chat.search.viewHolder;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import cn.wildfirechat.chat.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ExpandViewHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.expandTextView)
    TextView expandTextView;

    public ExpandViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    /**
     * @param category
     * @param count    被折叠了的搜索结果数量
     */
    public void onBind(String category, int count) {
        // todo
        expandTextView.setText("点击展开剩余" + count + "项");
    }
}