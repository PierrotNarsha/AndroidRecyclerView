package tech.thdev.androidrecyclerview.adapter

import android.content.Context
import android.view.ViewGroup
import tech.thdev.androidrecyclerview.view.git_sample.user_search.adapter.holder.ImageLargeViewHolder
import tech.thdev.androidrecyclerview.adapter.model.ImageAdapterContract
import tech.thdev.androidrecyclerview.data.Image
import tech.thdev.support.widget.adapter.simple.BaseTypedefRecyclerAdapter
import tech.thdev.support.widget.adapter.simple.holder.BaseViewHolder

/**
 * Created by Tae-hwan on 17/10/2016.
 */

class ImageListAdapter(context: Context) :
        BaseTypedefRecyclerAdapter<Image>(context), ImageAdapterContract.Model, ImageAdapterContract.View {

    companion object {
        val VIEW_LARGE_VIEW = 1
        val VIEW_LIST_VIEW = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder<Image> {
//        when (viewType) {
//            VIEW_LARGE_VIEW -> {
//
//            }
//            VIEW_LIST_VIEW -> {
//
//            }
//            else -> {
//
//            }
//        }
        return ImageLargeViewHolder(parent, this)
    }

    override fun reload() {
        notifyDataSetChanged()
    }
}