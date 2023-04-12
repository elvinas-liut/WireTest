package com.example.wiretest

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.squareup.moshi.Moshi
import com.squareup.wire.WireJsonAdapterFactory
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var ordered by mutableStateOf<SubscriptionsOrdered?>(null)
    var unordered by mutableStateOf<SubscriptionsUnordered?>(null)

    init {
        val moshi = Moshi.Builder()
            .add(WireJsonAdapterFactory())
            .build()
        viewModelScope.launch {
            ordered = moshi.adapter(SubscriptionsOrdered::class.java).fromJson(
                """
                |{
                |   "active_name": "a",
                |   "active_count": 1,
                |   "new_name": "d",
                |   "new_count": 4,
                |   "cancelled_name": "b",
                |   "cancelled_count": 2,
                |   "expired_name": "c",
                |   "expired_count": 3,
                |   "shop_uri": "uri"
                |}
                """.trimMargin()
            )
            unordered = moshi.adapter(SubscriptionsUnordered::class.java).fromJson(
                """
                |{
                |   "active_name": "a",
                |   "active_count": 1,
                |   "new_name": "d",
                |   "new_count": 4,
                |   "cancelled_name": "b",
                |   "cancelled_count": 2,
                |   "expired_name": "c",
                |   "expired_count": 3,
                |   "shop_uri": "uri"
                |}
                """.trimMargin()
            )
        }
    }
}