/*
 * Copyright (C) 2024 pedroSG94.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pedro.encoder.video;

import android.media.MediaCodecInfo;

/**
 * Created by pedro on 21/01/17.
 */

public enum FormatVideoEncoder {

    YUV420FLEXIBLE, YUV420PLANAR, YUV420SEMIPLANAR, YUV420PACKEDPLANAR, YUV420PACKEDSEMIPLANAR,
    YUV422FLEXIBLE, YUV422PLANAR, YUV422SEMIPLANAR, YUV422PACKEDPLANAR, YUV422PACKEDSEMIPLANAR,
    YUV444FLEXIBLE, YUV444INTERLEAVED, SURFACE,
    //take first valid color for encoder (YUV420PLANAR, YUV420SEMIPLANAR or YUV420PACKEDPLANAR)
    YUV420Dynamical;

    public int getFormatCodec() {
        if (this == YUV420FLEXIBLE) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Flexible;
        } else if (this == YUV420PLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Planar;
        } else if (this == YUV420SEMIPLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420SemiPlanar;
        } else if (this == YUV420PACKEDPLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420PackedPlanar;
        } else if (this == YUV420PACKEDSEMIPLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420PackedSemiPlanar;
        } else if (this == YUV422FLEXIBLE) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422Flexible;
        } else if (this == YUV422PLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422Planar;
        } else if (this == YUV422SEMIPLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422SemiPlanar;
        } else if (this == YUV422PACKEDPLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422PackedPlanar;
        } else if (this == YUV422PACKEDSEMIPLANAR) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422PackedSemiPlanar;
        } else if (this == YUV444FLEXIBLE) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV444Flexible;
        } else if (this == YUV444INTERLEAVED) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV444Interleaved;
        } else if (this == SURFACE) {
            return MediaCodecInfo.CodecCapabilities.COLOR_FormatSurface;
        } else {
            return -1;
        }
    }
}
