package com.example.wiretest

import com.squareup.moshi.Moshi
import com.squareup.wire.WireJsonAdapterFactory
import org.assertj.core.api.Assertions
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    /*
    message SubscriptionsOrdered {
        int32  active_count = 2;
        string active_name = 1;
        int32  cancelled_count = 6;
        string cancelled_name = 5;
        int32  expired_count = 8;
        string expired_name = 7;
        int32  new_count = 4;
        string new_name = 3;
        string shop_uri = 9;
    }
     */
    @Test
    fun importJsonOrdered() {
        val obj = moshi.adapter(SubscriptionsOrdered::class.java).fromJson(
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
        Assertions.assertThat(obj).isEqualTo(SubscriptionsOrdered(
            active_count = 1,
            active_name = "a",
            cancelled_count = 2,
            cancelled_name = "b",
            expired_count = 3,
            expired_name = "c",
            new_count = 4,
            new_name = "d",
            shop_uri = "uri"
        ))
    }

    /*
    message SubscriptionsUnordered {
        string active_name = 1;
        int32  active_count = 2;
        string new_name = 3;
        int32  new_count = 4;
        string cancelled_name = 5;
        int32  cancelled_count = 6;
        string expired_name = 7;
        int32  expired_count = 8;
        string shop_uri = 9;
    }
     */
    @Test
    fun importJsonUnordered() {
        val obj = moshi.adapter(SubscriptionsUnordered::class.java).fromJson(
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
        Assertions.assertThat(obj).isEqualTo(SubscriptionsUnordered(
            active_name = "a",
            active_count = 1,
            new_name = "d",
            new_count = 4,
            cancelled_name = "b",
            cancelled_count = 2,
            expired_name = "c",
            expired_count = 3,
            shop_uri = "uri"
        ))
    }

    companion object {
        private val moshi = Moshi.Builder()
            .add(WireJsonAdapterFactory())
            .build()
    }
}