// Code generated by Wire protocol buffer compiler, do not edit.
// Source: SubscriptionsUnordered in data.proto
package com.example.wiretest

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmField
import okio.ByteString

public class SubscriptionsUnordered(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "activeName",
  )
  public val active_name: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "activeCount",
  )
  public val active_count: Int = 0,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "newName",
  )
  public val new_name: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "newCount",
  )
  public val new_count: Int = 0,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "cancelledName",
  )
  public val cancelled_name: String = "",
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "cancelledCount",
  )
  public val cancelled_count: Int = 0,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "expiredName",
  )
  public val expired_name: String = "",
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "expiredCount",
  )
  public val expired_count: Int = 0,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "shopUri",
  )
  public val shop_uri: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SubscriptionsUnordered, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  public override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  public override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SubscriptionsUnordered) return false
    if (unknownFields != other.unknownFields) return false
    if (active_name != other.active_name) return false
    if (active_count != other.active_count) return false
    if (new_name != other.new_name) return false
    if (new_count != other.new_count) return false
    if (cancelled_name != other.cancelled_name) return false
    if (cancelled_count != other.cancelled_count) return false
    if (expired_name != other.expired_name) return false
    if (expired_count != other.expired_count) return false
    if (shop_uri != other.shop_uri) return false
    return true
  }

  public override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + active_name.hashCode()
      result = result * 37 + active_count.hashCode()
      result = result * 37 + new_name.hashCode()
      result = result * 37 + new_count.hashCode()
      result = result * 37 + cancelled_name.hashCode()
      result = result * 37 + cancelled_count.hashCode()
      result = result * 37 + expired_name.hashCode()
      result = result * 37 + expired_count.hashCode()
      result = result * 37 + shop_uri.hashCode()
      super.hashCode = result
    }
    return result
  }

  public override fun toString(): String {
    val result = mutableListOf<String>()
    result += """active_name=${sanitize(active_name)}"""
    result += """active_count=$active_count"""
    result += """new_name=${sanitize(new_name)}"""
    result += """new_count=$new_count"""
    result += """cancelled_name=${sanitize(cancelled_name)}"""
    result += """cancelled_count=$cancelled_count"""
    result += """expired_name=${sanitize(expired_name)}"""
    result += """expired_count=$expired_count"""
    result += """shop_uri=${sanitize(shop_uri)}"""
    return result.joinToString(prefix = "SubscriptionsUnordered{", separator = ", ", postfix = "}")
  }

  public fun copy(
    active_name: String = this.active_name,
    active_count: Int = this.active_count,
    new_name: String = this.new_name,
    new_count: Int = this.new_count,
    cancelled_name: String = this.cancelled_name,
    cancelled_count: Int = this.cancelled_count,
    expired_name: String = this.expired_name,
    expired_count: Int = this.expired_count,
    shop_uri: String = this.shop_uri,
    unknownFields: ByteString = this.unknownFields,
  ): SubscriptionsUnordered = SubscriptionsUnordered(active_name, active_count, new_name, new_count, cancelled_name,
      cancelled_count, expired_name, expired_count, shop_uri, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SubscriptionsUnordered> = object : ProtoAdapter<SubscriptionsUnordered>(
      FieldEncoding.LENGTH_DELIMITED, 
      SubscriptionsUnordered::class,
      "type.googleapis.com/SubscriptionsUnordered",
      PROTO_3, 
      null, 
      "data.proto"
    ) {
      public override fun encodedSize(`value`: SubscriptionsUnordered): Int {
        var size = value.unknownFields.size
        if (value.active_name != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.active_name)
        if (value.active_count != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(2,
            value.active_count)
        if (value.new_name != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.new_name)
        if (value.new_count != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(4, value.new_count)
        if (value.cancelled_name != "") size += ProtoAdapter.STRING.encodedSizeWithTag(5,
            value.cancelled_name)
        if (value.cancelled_count != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(6,
            value.cancelled_count)
        if (value.expired_name != "") size += ProtoAdapter.STRING.encodedSizeWithTag(7,
            value.expired_name)
        if (value.expired_count != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(8,
            value.expired_count)
        if (value.shop_uri != "") size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.shop_uri)
        return size
      }

      public override fun encode(writer: ProtoWriter, `value`: SubscriptionsUnordered): Unit {
        if (value.active_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.active_name)
        if (value.active_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.active_count)
        if (value.new_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.new_name)
        if (value.new_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.new_count)
        if (value.cancelled_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 5,
            value.cancelled_name)
        if (value.cancelled_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 6,
            value.cancelled_count)
        if (value.expired_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 7,
            value.expired_name)
        if (value.expired_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 8,
            value.expired_count)
        if (value.shop_uri != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.shop_uri)
        writer.writeBytes(value.unknownFields)
      }

      public override fun encode(writer: ReverseProtoWriter, `value`: SubscriptionsUnordered): Unit {
        writer.writeBytes(value.unknownFields)
        if (value.shop_uri != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.shop_uri)
        if (value.expired_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 8,
            value.expired_count)
        if (value.expired_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 7,
            value.expired_name)
        if (value.cancelled_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 6,
            value.cancelled_count)
        if (value.cancelled_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 5,
            value.cancelled_name)
        if (value.new_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.new_count)
        if (value.new_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.new_name)
        if (value.active_count != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.active_count)
        if (value.active_name != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.active_name)
      }

      public override fun decode(reader: ProtoReader): SubscriptionsUnordered {
        var active_name: String = ""
        var active_count: Int = 0
        var new_name: String = ""
        var new_count: Int = 0
        var cancelled_name: String = ""
        var cancelled_count: Int = 0
        var expired_name: String = ""
        var expired_count: Int = 0
        var shop_uri: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> active_name = ProtoAdapter.STRING.decode(reader)
            2 -> active_count = ProtoAdapter.INT32.decode(reader)
            3 -> new_name = ProtoAdapter.STRING.decode(reader)
            4 -> new_count = ProtoAdapter.INT32.decode(reader)
            5 -> cancelled_name = ProtoAdapter.STRING.decode(reader)
            6 -> cancelled_count = ProtoAdapter.INT32.decode(reader)
            7 -> expired_name = ProtoAdapter.STRING.decode(reader)
            8 -> expired_count = ProtoAdapter.INT32.decode(reader)
            9 -> shop_uri = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SubscriptionsUnordered(
          active_name = active_name,
          active_count = active_count,
          new_name = new_name,
          new_count = new_count,
          cancelled_name = cancelled_name,
          cancelled_count = cancelled_count,
          expired_name = expired_name,
          expired_count = expired_count,
          shop_uri = shop_uri,
          unknownFields = unknownFields
        )
      }

      public override fun redact(`value`: SubscriptionsUnordered): SubscriptionsUnordered = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
