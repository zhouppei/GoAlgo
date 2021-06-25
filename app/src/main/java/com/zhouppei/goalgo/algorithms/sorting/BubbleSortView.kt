package com.zhouppei.goalgo.algorithms.sorting

import android.content.Context
import android.util.AttributeSet
import com.zhouppei.goalgo.models.ItemState
import kotlinx.coroutines.delay

class BubbleSortView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : SortView(context, attrs, defStyleAttr) {

    override suspend fun sort() {
        for (i in 0 until items.size - 1) {
            for (j in 0 until items.size - i - 1) {
                compare(j, j+1)
                delay(speedInMiliSeconds)
                if (items[j].value > items[j+1].value) {
                    swap(j, j+1)
                    delay(speedInMiliSeconds)
                }
            }
            items[items.size - i - 1].state = ItemState.SORTED
            if (items.size - i - 2 >= 0) items[items.size - i - 2].state = ItemState.UNSORTED
            update()
            delay(speedInMiliSeconds)
        }
        complete()
    }
}