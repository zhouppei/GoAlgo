package com.zhouppei.goalgo.ui

interface SortingConfigListener {
    fun onChangeSpeed(speedInMiliSec: Long)
    fun onChangeItemValuesVisibility(isShow: Boolean)
    fun onChangeItemIndexesVisibility(isShow: Boolean)
    fun onChangeCurrentStateColor(colorString: String)
    fun onChangeUnsortedStateColor(colorString: String)
    fun onChangeSortedStateColor(colorString: String)
    fun onChangePivotColor(colorString: String)
    fun toggleCompleteAnimation()
}