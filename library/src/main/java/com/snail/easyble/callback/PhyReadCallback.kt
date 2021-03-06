package com.snail.easyble.callback

import com.snail.easyble.core.Device
import com.snail.easyble.core.MethodInfo
import com.snail.easyble.core.ValueTypePair

/**
 *
 *
 * date: 2019/1/26 14:59
 * author: zengfansheng
 */
interface PhyReadCallback : RequestFailedCallback {
    companion object {
        internal fun getMethodInfo(device: Device, tag: String, txPhy: Int, rxPhy: Int): MethodInfo {
            return MethodInfo("onPhyRead", arrayOf(ValueTypePair(device, Device::class.java), ValueTypePair(tag, String::class.java),
                    ValueTypePair(txPhy, Int::class.java), ValueTypePair(rxPhy, Int::class.java)))
        }
    }
    
    fun onPhyRead(device: Device, tag: String, txPhy: Int, rxPhy: Int)
}