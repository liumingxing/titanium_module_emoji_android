/*
 * Copyright 2014 Hieu Rocker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mamashai.emoji;

import android.content.Context;
import android.text.Spannable;
import android.util.SparseIntArray;
import org.appcelerator.titanium.util.TiRHelper;

import org.appcelerator.titanium.util.Log;

/**
 * @author Hieu Rocker (rockerhieu@gmail.com)
 */
public final class EmojiconHandler {
    private EmojiconHandler() {
    }

    private static final SparseIntArray sEmojisMap = new SparseIntArray(846);
    private static final SparseIntArray sSoftbanksMap = new SparseIntArray(471);

    static {
        // People
        try{
        sEmojisMap.put(0x1f604, TiRHelper.getResource("drawable.emoji_1f604"));
        sEmojisMap.put(0x1f603, TiRHelper.getResource("drawable.emoji_1f603"));
        sEmojisMap.put(0x1f600, TiRHelper.getResource("drawable.emoji_1f600"));
        sEmojisMap.put(0x1f60a, TiRHelper.getResource("drawable.emoji_1f60a"));
        sEmojisMap.put(0x263a,  TiRHelper.getResource("drawable.emoji_263a"));
        sEmojisMap.put(0x1f609, TiRHelper.getResource("drawable.emoji_1f609"));
        sEmojisMap.put(0x1f60d, TiRHelper.getResource("drawable.emoji_1f60d"));
        sEmojisMap.put(0x1f618, TiRHelper.getResource("drawable.emoji_1f618"));
        sEmojisMap.put(0x1f61a, TiRHelper.getResource("drawable.emoji_1f61a"));
        sEmojisMap.put(0x1f617, TiRHelper.getResource("drawable.emoji_1f617"));
        sEmojisMap.put(0x1f619, TiRHelper.getResource("drawable.emoji_1f619"));
        sEmojisMap.put(0x1f61c, TiRHelper.getResource("drawable.emoji_1f61c"));
        sEmojisMap.put(0x1f61d, TiRHelper.getResource("drawable.emoji_1f61d"));
        sEmojisMap.put(0x1f61b, TiRHelper.getResource("drawable.emoji_1f61b"));
        sEmojisMap.put(0x1f633, TiRHelper.getResource("drawable.emoji_1f633"));
        sEmojisMap.put(0x1f601, TiRHelper.getResource("drawable.emoji_1f601"));
        sEmojisMap.put(0x1f614, TiRHelper.getResource("drawable.emoji_1f614"));
        sEmojisMap.put(0x1f60c, TiRHelper.getResource("drawable.emoji_1f60c"));
        sEmojisMap.put(0x1f612, TiRHelper.getResource("drawable.emoji_1f612"));
        sEmojisMap.put(0x1f61e, TiRHelper.getResource("drawable.emoji_1f61e"));
        sEmojisMap.put(0x1f623, TiRHelper.getResource("drawable.emoji_1f623"));
        sEmojisMap.put(0x1f622, TiRHelper.getResource("drawable.emoji_1f622"));
        sEmojisMap.put(0x1f602, TiRHelper.getResource("drawable.emoji_1f602"));
        sEmojisMap.put(0x1f62d, TiRHelper.getResource("drawable.emoji_1f62d"));
        sEmojisMap.put(0x1f62a, TiRHelper.getResource("drawable.emoji_1f62a"));
        sEmojisMap.put(0x1f625, TiRHelper.getResource("drawable.emoji_1f625"));
        sEmojisMap.put(0x1f630, TiRHelper.getResource("drawable.emoji_1f630"));
        sEmojisMap.put(0x1f605, TiRHelper.getResource("drawable.emoji_1f605"));
        sEmojisMap.put(0x1f613, TiRHelper.getResource("drawable.emoji_1f613"));
        sEmojisMap.put(0x1f629, TiRHelper.getResource("drawable.emoji_1f629"));
        sEmojisMap.put(0x1f62b, TiRHelper.getResource("drawable.emoji_1f62b"));
        sEmojisMap.put(0x1f628, TiRHelper.getResource("drawable.emoji_1f628"));
        sEmojisMap.put(0x1f631, TiRHelper.getResource("drawable.emoji_1f631"));
        sEmojisMap.put(0x1f620, TiRHelper.getResource("drawable.emoji_1f620"));
        sEmojisMap.put(0x1f621, TiRHelper.getResource("drawable.emoji_1f621"));
        sEmojisMap.put(0x1f624, TiRHelper.getResource("drawable.emoji_1f624"));
        sEmojisMap.put(0x1f616, TiRHelper.getResource("drawable.emoji_1f616"));
        sEmojisMap.put(0x1f606, TiRHelper.getResource("drawable.emoji_1f606"));
        sEmojisMap.put(0x1f60b, TiRHelper.getResource("drawable.emoji_1f60b"));
        sEmojisMap.put(0x1f637, TiRHelper.getResource("drawable.emoji_1f637"));
        sEmojisMap.put(0x1f60e, TiRHelper.getResource("drawable.emoji_1f60e"));
        sEmojisMap.put(0x1f634, TiRHelper.getResource("drawable.emoji_1f634"));
        sEmojisMap.put(0x1f635, TiRHelper.getResource("drawable.emoji_1f635"));
        sEmojisMap.put(0x1f632, TiRHelper.getResource("drawable.emoji_1f632"));
        sEmojisMap.put(0x1f61f, TiRHelper.getResource("drawable.emoji_1f61f"));
        sEmojisMap.put(0x1f626, TiRHelper.getResource("drawable.emoji_1f626"));
        sEmojisMap.put(0x1f627, TiRHelper.getResource("drawable.emoji_1f627"));
        sEmojisMap.put(0x1f608, TiRHelper.getResource("drawable.emoji_1f608"));
        sEmojisMap.put(0x1f47f, TiRHelper.getResource("drawable.emoji_1f47f"));
        sEmojisMap.put(0x1f62e, TiRHelper.getResource("drawable.emoji_1f62e"));
        sEmojisMap.put(0x1f62c, TiRHelper.getResource("drawable.emoji_1f62c"));
        sEmojisMap.put(0x1f610, TiRHelper.getResource("drawable.emoji_1f610"));
        sEmojisMap.put(0x1f615, TiRHelper.getResource("drawable.emoji_1f615"));
        sEmojisMap.put(0x1f62f, TiRHelper.getResource("drawable.emoji_1f62f"));
        sEmojisMap.put(0x1f636, TiRHelper.getResource("drawable.emoji_1f636"));
        sEmojisMap.put(0x1f607, TiRHelper.getResource("drawable.emoji_1f607"));
        sEmojisMap.put(0x1f60f, TiRHelper.getResource("drawable.emoji_1f60f"));
        sEmojisMap.put(0x1f611, TiRHelper.getResource("drawable.emoji_1f611"));
        sEmojisMap.put(0x1f472, TiRHelper.getResource("drawable.emoji_1f472"));
        sEmojisMap.put(0x1f473, TiRHelper.getResource("drawable.emoji_1f473"));
        sEmojisMap.put(0x1f46e, TiRHelper.getResource("drawable.emoji_1f46e"));
        sEmojisMap.put(0x1f477, TiRHelper.getResource("drawable.emoji_1f477"));
        sEmojisMap.put(0x1f482, TiRHelper.getResource("drawable.emoji_1f482"));
        sEmojisMap.put(0x1f476, TiRHelper.getResource("drawable.emoji_1f476"));
        sEmojisMap.put(0x1f466, TiRHelper.getResource("drawable.emoji_1f466"));
        sEmojisMap.put(0x1f467, TiRHelper.getResource("drawable.emoji_1f467"));
        sEmojisMap.put(0x1f468, TiRHelper.getResource("drawable.emoji_1f468"));
        sEmojisMap.put(0x1f469, TiRHelper.getResource("drawable.emoji_1f469"));
        sEmojisMap.put(0x1f474, TiRHelper.getResource("drawable.emoji_1f474"));
        sEmojisMap.put(0x1f475, TiRHelper.getResource("drawable.emoji_1f475"));
        sEmojisMap.put(0x1f471, TiRHelper.getResource("drawable.emoji_1f471"));
        sEmojisMap.put(0x1f47c, TiRHelper.getResource("drawable.emoji_1f47c"));
        sEmojisMap.put(0x1f478, TiRHelper.getResource("drawable.emoji_1f478"));
        sEmojisMap.put(0x1f63a, TiRHelper.getResource("drawable.emoji_1f63a"));
        sEmojisMap.put(0x1f638, TiRHelper.getResource("drawable.emoji_1f638"));
        sEmojisMap.put(0x1f63b, TiRHelper.getResource("drawable.emoji_1f63b"));
        sEmojisMap.put(0x1f63d, TiRHelper.getResource("drawable.emoji_1f63d"));
        sEmojisMap.put(0x1f63c, TiRHelper.getResource("drawable.emoji_1f63c"));
        sEmojisMap.put(0x1f640, TiRHelper.getResource("drawable.emoji_1f640"));
        sEmojisMap.put(0x1f63f, TiRHelper.getResource("drawable.emoji_1f63f"));
        sEmojisMap.put(0x1f639, TiRHelper.getResource("drawable.emoji_1f639"));
        sEmojisMap.put(0x1f63e, TiRHelper.getResource("drawable.emoji_1f63e"));
        sEmojisMap.put(0x1f479, TiRHelper.getResource("drawable.emoji_1f479"));
        sEmojisMap.put(0x1f47a, TiRHelper.getResource("drawable.emoji_1f47a"));
        sEmojisMap.put(0x1f648, TiRHelper.getResource("drawable.emoji_1f648"));
        sEmojisMap.put(0x1f649, TiRHelper.getResource("drawable.emoji_1f649"));
        sEmojisMap.put(0x1f64a, TiRHelper.getResource("drawable.emoji_1f64a"));
        sEmojisMap.put(0x1f480, TiRHelper.getResource("drawable.emoji_1f480"));
        sEmojisMap.put(0x1f47d, TiRHelper.getResource("drawable.emoji_1f47d"));
        sEmojisMap.put(0x1f4a9, TiRHelper.getResource("drawable.emoji_1f4a9"));
        sEmojisMap.put(0x1f525, TiRHelper.getResource("drawable.emoji_1f525"));
        sEmojisMap.put(0x2728, TiRHelper.getResource("drawable.emoji_2728"));
        sEmojisMap.put(0x1f31f, TiRHelper.getResource("drawable.emoji_1f31f"));
        sEmojisMap.put(0x1f4ab, TiRHelper.getResource("drawable.emoji_1f4ab"));
        sEmojisMap.put(0x1f4a5, TiRHelper.getResource("drawable.emoji_1f4a5"));
        sEmojisMap.put(0x1f4a2, TiRHelper.getResource("drawable.emoji_1f4a2"));
        sEmojisMap.put(0x1f4a6, TiRHelper.getResource("drawable.emoji_1f4a6"));
        sEmojisMap.put(0x1f4a7, TiRHelper.getResource("drawable.emoji_1f4a7"));
        sEmojisMap.put(0x1f4a4, TiRHelper.getResource("drawable.emoji_1f4a4"));
        sEmojisMap.put(0x1f4a8, TiRHelper.getResource("drawable.emoji_1f4a8"));
        sEmojisMap.put(0x1f442, TiRHelper.getResource("drawable.emoji_1f442"));
        sEmojisMap.put(0x1f440, TiRHelper.getResource("drawable.emoji_1f440"));
        sEmojisMap.put(0x1f443, TiRHelper.getResource("drawable.emoji_1f443"));
        sEmojisMap.put(0x1f445, TiRHelper.getResource("drawable.emoji_1f445"));
        sEmojisMap.put(0x1f444, TiRHelper.getResource("drawable.emoji_1f444"));
        sEmojisMap.put(0x1f44d, TiRHelper.getResource("drawable.emoji_1f44d"));
        sEmojisMap.put(0x1f44e, TiRHelper.getResource("drawable.emoji_1f44e"));
        sEmojisMap.put(0x1f44c, TiRHelper.getResource("drawable.emoji_1f44c"));
        sEmojisMap.put(0x1f44a, TiRHelper.getResource("drawable.emoji_1f44a"));
        sEmojisMap.put(0x270a, TiRHelper.getResource("drawable.emoji_270a"));
        sEmojisMap.put(0x270c, TiRHelper.getResource("drawable.emoji_270c"));
        sEmojisMap.put(0x1f44b, TiRHelper.getResource("drawable.emoji_1f44b"));
        sEmojisMap.put(0x270b, TiRHelper.getResource("drawable.emoji_270b"));
        sEmojisMap.put(0x1f450, TiRHelper.getResource("drawable.emoji_1f450"));
        sEmojisMap.put(0x1f446, TiRHelper.getResource("drawable.emoji_1f446"));
        sEmojisMap.put(0x1f447, TiRHelper.getResource("drawable.emoji_1f447"));
        sEmojisMap.put(0x1f449, TiRHelper.getResource("drawable.emoji_1f449"));
        sEmojisMap.put(0x1f448, TiRHelper.getResource("drawable.emoji_1f448"));
        sEmojisMap.put(0x1f64c, TiRHelper.getResource("drawable.emoji_1f64c"));
        sEmojisMap.put(0x1f64f, TiRHelper.getResource("drawable.emoji_1f64f"));
        sEmojisMap.put(0x261d, TiRHelper.getResource("drawable.emoji_261d"));
        sEmojisMap.put(0x1f44f, TiRHelper.getResource("drawable.emoji_1f44f"));
        sEmojisMap.put(0x1f4aa, TiRHelper.getResource("drawable.emoji_1f4aa"));
        sEmojisMap.put(0x1f6b6, TiRHelper.getResource("drawable.emoji_1f6b6"));
        sEmojisMap.put(0x1f3c3, TiRHelper.getResource("drawable.emoji_1f3c3"));
        sEmojisMap.put(0x1f483, TiRHelper.getResource("drawable.emoji_1f483"));
        sEmojisMap.put(0x1f46b, TiRHelper.getResource("drawable.emoji_1f46b"));
        sEmojisMap.put(0x1f46a, TiRHelper.getResource("drawable.emoji_1f46a"));
        sEmojisMap.put(0x1f46c, TiRHelper.getResource("drawable.emoji_1f46c"));
        sEmojisMap.put(0x1f46d, TiRHelper.getResource("drawable.emoji_1f46d"));
        sEmojisMap.put(0x1f48f, TiRHelper.getResource("drawable.emoji_1f48f"));
        sEmojisMap.put(0x1f491, TiRHelper.getResource("drawable.emoji_1f491"));
        sEmojisMap.put(0x1f46f, TiRHelper.getResource("drawable.emoji_1f46f"));
        sEmojisMap.put(0x1f646, TiRHelper.getResource("drawable.emoji_1f646"));
        sEmojisMap.put(0x1f645, TiRHelper.getResource("drawable.emoji_1f645"));
        sEmojisMap.put(0x1f481, TiRHelper.getResource("drawable.emoji_1f481"));
        sEmojisMap.put(0x1f64b, TiRHelper.getResource("drawable.emoji_1f64b"));
        sEmojisMap.put(0x1f486, TiRHelper.getResource("drawable.emoji_1f486"));
        sEmojisMap.put(0x1f487, TiRHelper.getResource("drawable.emoji_1f487"));
        sEmojisMap.put(0x1f485, TiRHelper.getResource("drawable.emoji_1f485"));
        sEmojisMap.put(0x1f470, TiRHelper.getResource("drawable.emoji_1f470"));
        sEmojisMap.put(0x1f64e, TiRHelper.getResource("drawable.emoji_1f64e"));
        sEmojisMap.put(0x1f64d, TiRHelper.getResource("drawable.emoji_1f64d"));
        sEmojisMap.put(0x1f647, TiRHelper.getResource("drawable.emoji_1f647"));
        sEmojisMap.put(0x1f3a9, TiRHelper.getResource("drawable.emoji_1f3a9"));
        sEmojisMap.put(0x1f451, TiRHelper.getResource("drawable.emoji_1f451"));
        sEmojisMap.put(0x1f452, TiRHelper.getResource("drawable.emoji_1f452"));
        sEmojisMap.put(0x1f45f, TiRHelper.getResource("drawable.emoji_1f45f"));
        sEmojisMap.put(0x1f45e, TiRHelper.getResource("drawable.emoji_1f45e"));
        sEmojisMap.put(0x1f461, TiRHelper.getResource("drawable.emoji_1f461"));
        sEmojisMap.put(0x1f460, TiRHelper.getResource("drawable.emoji_1f460"));
        sEmojisMap.put(0x1f462, TiRHelper.getResource("drawable.emoji_1f462"));
        sEmojisMap.put(0x1f455, TiRHelper.getResource("drawable.emoji_1f455"));
        sEmojisMap.put(0x1f454, TiRHelper.getResource("drawable.emoji_1f454"));
        sEmojisMap.put(0x1f45a, TiRHelper.getResource("drawable.emoji_1f45a"));
        sEmojisMap.put(0x1f457, TiRHelper.getResource("drawable.emoji_1f457"));
        sEmojisMap.put(0x1f3bd, TiRHelper.getResource("drawable.emoji_1f3bd"));
        sEmojisMap.put(0x1f456, TiRHelper.getResource("drawable.emoji_1f456"));
        sEmojisMap.put(0x1f458, TiRHelper.getResource("drawable.emoji_1f458"));
        sEmojisMap.put(0x1f459, TiRHelper.getResource("drawable.emoji_1f459"));
        sEmojisMap.put(0x1f4bc, TiRHelper.getResource("drawable.emoji_1f4bc"));
        sEmojisMap.put(0x1f45c, TiRHelper.getResource("drawable.emoji_1f45c"));
        sEmojisMap.put(0x1f45d, TiRHelper.getResource("drawable.emoji_1f45d"));
        sEmojisMap.put(0x1f45b, TiRHelper.getResource("drawable.emoji_1f45b"));
        sEmojisMap.put(0x1f453, TiRHelper.getResource("drawable.emoji_1f453"));
        sEmojisMap.put(0x1f380, TiRHelper.getResource("drawable.emoji_1f380"));
        sEmojisMap.put(0x1f302, TiRHelper.getResource("drawable.emoji_1f302"));
        sEmojisMap.put(0x1f484, TiRHelper.getResource("drawable.emoji_1f484"));
        sEmojisMap.put(0x1f49b, TiRHelper.getResource("drawable.emoji_1f49b"));
        sEmojisMap.put(0x1f499, TiRHelper.getResource("drawable.emoji_1f499"));
        sEmojisMap.put(0x1f49c, TiRHelper.getResource("drawable.emoji_1f49c"));
        sEmojisMap.put(0x1f49a, TiRHelper.getResource("drawable.emoji_1f49a"));
        sEmojisMap.put(0x2764, TiRHelper.getResource("drawable.emoji_2764"));
        sEmojisMap.put(0x1f494, TiRHelper.getResource("drawable.emoji_1f494"));
        sEmojisMap.put(0x1f497, TiRHelper.getResource("drawable.emoji_1f497"));
        sEmojisMap.put(0x1f493, TiRHelper.getResource("drawable.emoji_1f493"));
        sEmojisMap.put(0x1f495, TiRHelper.getResource("drawable.emoji_1f495"));
        sEmojisMap.put(0x1f496, TiRHelper.getResource("drawable.emoji_1f496"));
        sEmojisMap.put(0x1f49e, TiRHelper.getResource("drawable.emoji_1f49e"));
        sEmojisMap.put(0x1f498, TiRHelper.getResource("drawable.emoji_1f498"));
        sEmojisMap.put(0x1f48c, TiRHelper.getResource("drawable.emoji_1f48c"));
        sEmojisMap.put(0x1f48b, TiRHelper.getResource("drawable.emoji_1f48b"));
        sEmojisMap.put(0x1f48d, TiRHelper.getResource("drawable.emoji_1f48d"));
        sEmojisMap.put(0x1f48e, TiRHelper.getResource("drawable.emoji_1f48e"));
        sEmojisMap.put(0x1f464, TiRHelper.getResource("drawable.emoji_1f464"));
        sEmojisMap.put(0x1f465, TiRHelper.getResource("drawable.emoji_1f465"));
        sEmojisMap.put(0x1f4ac, TiRHelper.getResource("drawable.emoji_1f4ac"));
        sEmojisMap.put(0x1f463, TiRHelper.getResource("drawable.emoji_1f463"));
        sEmojisMap.put(0x1f4ad, TiRHelper.getResource("drawable.emoji_1f4ad"));

        // Nature
        sEmojisMap.put(0x1f436, TiRHelper.getResource("drawable.emoji_1f436"));
        sEmojisMap.put(0x1f43a, TiRHelper.getResource("drawable.emoji_1f43a"));
        sEmojisMap.put(0x1f431, TiRHelper.getResource("drawable.emoji_1f431"));
        sEmojisMap.put(0x1f42d, TiRHelper.getResource("drawable.emoji_1f42d"));
        sEmojisMap.put(0x1f439, TiRHelper.getResource("drawable.emoji_1f439"));
        sEmojisMap.put(0x1f430, TiRHelper.getResource("drawable.emoji_1f430"));
        sEmojisMap.put(0x1f438, TiRHelper.getResource("drawable.emoji_1f438"));
        sEmojisMap.put(0x1f42f, TiRHelper.getResource("drawable.emoji_1f42f"));
        sEmojisMap.put(0x1f428, TiRHelper.getResource("drawable.emoji_1f428"));
        sEmojisMap.put(0x1f43b, TiRHelper.getResource("drawable.emoji_1f43b"));
        sEmojisMap.put(0x1f437, TiRHelper.getResource("drawable.emoji_1f437"));
        sEmojisMap.put(0x1f43d, TiRHelper.getResource("drawable.emoji_1f43d"));
        sEmojisMap.put(0x1f42e, TiRHelper.getResource("drawable.emoji_1f42e"));
        sEmojisMap.put(0x1f417, TiRHelper.getResource("drawable.emoji_1f417"));
        sEmojisMap.put(0x1f435, TiRHelper.getResource("drawable.emoji_1f435"));
        sEmojisMap.put(0x1f412, TiRHelper.getResource("drawable.emoji_1f412"));
        sEmojisMap.put(0x1f434, TiRHelper.getResource("drawable.emoji_1f434"));
        sEmojisMap.put(0x1f411, TiRHelper.getResource("drawable.emoji_1f411"));
        sEmojisMap.put(0x1f418, TiRHelper.getResource("drawable.emoji_1f418"));
        sEmojisMap.put(0x1f43c, TiRHelper.getResource("drawable.emoji_1f43c"));
        sEmojisMap.put(0x1f427, TiRHelper.getResource("drawable.emoji_1f427"));
        sEmojisMap.put(0x1f426, TiRHelper.getResource("drawable.emoji_1f426"));
        sEmojisMap.put(0x1f424, TiRHelper.getResource("drawable.emoji_1f424"));
        sEmojisMap.put(0x1f425, TiRHelper.getResource("drawable.emoji_1f425"));
        sEmojisMap.put(0x1f423, TiRHelper.getResource("drawable.emoji_1f423"));
        sEmojisMap.put(0x1f414, TiRHelper.getResource("drawable.emoji_1f414"));
        sEmojisMap.put(0x1f40d, TiRHelper.getResource("drawable.emoji_1f40d"));
        sEmojisMap.put(0x1f422, TiRHelper.getResource("drawable.emoji_1f422"));
        sEmojisMap.put(0x1f41b, TiRHelper.getResource("drawable.emoji_1f41b"));
        sEmojisMap.put(0x1f41d, TiRHelper.getResource("drawable.emoji_1f41d"));
        sEmojisMap.put(0x1f41c, TiRHelper.getResource("drawable.emoji_1f41c"));
        sEmojisMap.put(0x1f41e, TiRHelper.getResource("drawable.emoji_1f41e"));
        sEmojisMap.put(0x1f40c, TiRHelper.getResource("drawable.emoji_1f40c"));
        sEmojisMap.put(0x1f419, TiRHelper.getResource("drawable.emoji_1f419"));
        sEmojisMap.put(0x1f41a, TiRHelper.getResource("drawable.emoji_1f41a"));
        sEmojisMap.put(0x1f420, TiRHelper.getResource("drawable.emoji_1f420"));
        sEmojisMap.put(0x1f41f, TiRHelper.getResource("drawable.emoji_1f41f"));
        sEmojisMap.put(0x1f42c, TiRHelper.getResource("drawable.emoji_1f42c"));
        sEmojisMap.put(0x1f433, TiRHelper.getResource("drawable.emoji_1f433"));
        sEmojisMap.put(0x1f40b, TiRHelper.getResource("drawable.emoji_1f40b"));
        sEmojisMap.put(0x1f404, TiRHelper.getResource("drawable.emoji_1f404"));
        sEmojisMap.put(0x1f40f, TiRHelper.getResource("drawable.emoji_1f40f"));
        sEmojisMap.put(0x1f400, TiRHelper.getResource("drawable.emoji_1f400"));
        sEmojisMap.put(0x1f403, TiRHelper.getResource("drawable.emoji_1f403"));
        sEmojisMap.put(0x1f405, TiRHelper.getResource("drawable.emoji_1f405"));
        sEmojisMap.put(0x1f407, TiRHelper.getResource("drawable.emoji_1f407"));
        sEmojisMap.put(0x1f409, TiRHelper.getResource("drawable.emoji_1f409"));
        sEmojisMap.put(0x1f40e, TiRHelper.getResource("drawable.emoji_1f40e"));
        sEmojisMap.put(0x1f410, TiRHelper.getResource("drawable.emoji_1f410"));
        sEmojisMap.put(0x1f413, TiRHelper.getResource("drawable.emoji_1f413"));
        sEmojisMap.put(0x1f415, TiRHelper.getResource("drawable.emoji_1f415"));
        sEmojisMap.put(0x1f416, TiRHelper.getResource("drawable.emoji_1f416"));
        sEmojisMap.put(0x1f401, TiRHelper.getResource("drawable.emoji_1f401"));
        sEmojisMap.put(0x1f402, TiRHelper.getResource("drawable.emoji_1f402"));
        sEmojisMap.put(0x1f432, TiRHelper.getResource("drawable.emoji_1f432"));
        sEmojisMap.put(0x1f421, TiRHelper.getResource("drawable.emoji_1f421"));
        sEmojisMap.put(0x1f40a, TiRHelper.getResource("drawable.emoji_1f40a"));
        sEmojisMap.put(0x1f42b, TiRHelper.getResource("drawable.emoji_1f42b"));
        sEmojisMap.put(0x1f42a, TiRHelper.getResource("drawable.emoji_1f42a"));
        sEmojisMap.put(0x1f406, TiRHelper.getResource("drawable.emoji_1f406"));
        sEmojisMap.put(0x1f408, TiRHelper.getResource("drawable.emoji_1f408"));
        sEmojisMap.put(0x1f429, TiRHelper.getResource("drawable.emoji_1f429"));
        sEmojisMap.put(0x1f43e, TiRHelper.getResource("drawable.emoji_1f43e"));
        sEmojisMap.put(0x1f490, TiRHelper.getResource("drawable.emoji_1f490"));
        sEmojisMap.put(0x1f338, TiRHelper.getResource("drawable.emoji_1f338"));
        sEmojisMap.put(0x1f337, TiRHelper.getResource("drawable.emoji_1f337"));
        sEmojisMap.put(0x1f340, TiRHelper.getResource("drawable.emoji_1f340"));
        sEmojisMap.put(0x1f339, TiRHelper.getResource("drawable.emoji_1f339"));
        sEmojisMap.put(0x1f33b, TiRHelper.getResource("drawable.emoji_1f33b"));
        sEmojisMap.put(0x1f33a, TiRHelper.getResource("drawable.emoji_1f33a"));
        sEmojisMap.put(0x1f341, TiRHelper.getResource("drawable.emoji_1f341"));
        sEmojisMap.put(0x1f343, TiRHelper.getResource("drawable.emoji_1f343"));
        sEmojisMap.put(0x1f342, TiRHelper.getResource("drawable.emoji_1f342"));
        sEmojisMap.put(0x1f33f, TiRHelper.getResource("drawable.emoji_1f33f"));
        sEmojisMap.put(0x1f33e, TiRHelper.getResource("drawable.emoji_1f33e"));
        sEmojisMap.put(0x1f344, TiRHelper.getResource("drawable.emoji_1f344"));
        sEmojisMap.put(0x1f335, TiRHelper.getResource("drawable.emoji_1f335"));
        sEmojisMap.put(0x1f334, TiRHelper.getResource("drawable.emoji_1f334"));
        sEmojisMap.put(0x1f332, TiRHelper.getResource("drawable.emoji_1f332"));
        sEmojisMap.put(0x1f333, TiRHelper.getResource("drawable.emoji_1f333"));
        sEmojisMap.put(0x1f330, TiRHelper.getResource("drawable.emoji_1f330"));
        sEmojisMap.put(0x1f331, TiRHelper.getResource("drawable.emoji_1f331"));
        sEmojisMap.put(0x1f33c, TiRHelper.getResource("drawable.emoji_1f33c"));
        sEmojisMap.put(0x1f310, TiRHelper.getResource("drawable.emoji_1f310"));
        sEmojisMap.put(0x1f31e, TiRHelper.getResource("drawable.emoji_1f31e"));
        sEmojisMap.put(0x1f31d, TiRHelper.getResource("drawable.emoji_1f31d"));
        sEmojisMap.put(0x1f31a, TiRHelper.getResource("drawable.emoji_1f31a"));
        sEmojisMap.put(0x1f311, TiRHelper.getResource("drawable.emoji_1f311"));
        sEmojisMap.put(0x1f312, TiRHelper.getResource("drawable.emoji_1f312"));
        sEmojisMap.put(0x1f313, TiRHelper.getResource("drawable.emoji_1f313"));
        sEmojisMap.put(0x1f314, TiRHelper.getResource("drawable.emoji_1f314"));
        sEmojisMap.put(0x1f315, TiRHelper.getResource("drawable.emoji_1f315"));
        sEmojisMap.put(0x1f316, TiRHelper.getResource("drawable.emoji_1f316"));
        sEmojisMap.put(0x1f317, TiRHelper.getResource("drawable.emoji_1f317"));
        sEmojisMap.put(0x1f318, TiRHelper.getResource("drawable.emoji_1f318"));
        sEmojisMap.put(0x1f31c, TiRHelper.getResource("drawable.emoji_1f31c"));
        sEmojisMap.put(0x1f31b, TiRHelper.getResource("drawable.emoji_1f31b"));
        sEmojisMap.put(0x1f319, TiRHelper.getResource("drawable.emoji_1f319"));
        sEmojisMap.put(0x1f30d, TiRHelper.getResource("drawable.emoji_1f30d"));
        sEmojisMap.put(0x1f30e, TiRHelper.getResource("drawable.emoji_1f30e"));
        sEmojisMap.put(0x1f30f, TiRHelper.getResource("drawable.emoji_1f30f"));
        sEmojisMap.put(0x1f30b, TiRHelper.getResource("drawable.emoji_1f30b"));
        sEmojisMap.put(0x1f30c, TiRHelper.getResource("drawable.emoji_1f30c"));
        sEmojisMap.put(0x1f320, TiRHelper.getResource("drawable.emoji_1f303")); // TODO (rockerhieu) review this emoji
        sEmojisMap.put(0x2b50, TiRHelper.getResource("drawable.emoji_2b50"));
        sEmojisMap.put(0x2600, TiRHelper.getResource("drawable.emoji_2600"));
        sEmojisMap.put(0x26c5, TiRHelper.getResource("drawable.emoji_26c5"));
        sEmojisMap.put(0x2601, TiRHelper.getResource("drawable.emoji_2601"));
        sEmojisMap.put(0x26a1, TiRHelper.getResource("drawable.emoji_26a1"));
        sEmojisMap.put(0x2614, TiRHelper.getResource("drawable.emoji_2614"));
        sEmojisMap.put(0x2744, TiRHelper.getResource("drawable.emoji_2744"));
        sEmojisMap.put(0x26c4, TiRHelper.getResource("drawable.emoji_26c4"));
        sEmojisMap.put(0x1f300, TiRHelper.getResource("drawable.emoji_1f300"));
        sEmojisMap.put(0x1f301, TiRHelper.getResource("drawable.emoji_1f301"));
        sEmojisMap.put(0x1f308, TiRHelper.getResource("drawable.emoji_1f308"));
        sEmojisMap.put(0x1f30a, TiRHelper.getResource("drawable.emoji_1f30a"));

        // Objects
        sEmojisMap.put(0x1f38d, TiRHelper.getResource("drawable.emoji_1f38d"));
        sEmojisMap.put(0x1f49d, TiRHelper.getResource("drawable.emoji_1f49d"));
        sEmojisMap.put(0x1f38e, TiRHelper.getResource("drawable.emoji_1f38e"));
        sEmojisMap.put(0x1f392, TiRHelper.getResource("drawable.emoji_1f392"));
        sEmojisMap.put(0x1f393, TiRHelper.getResource("drawable.emoji_1f393"));
        sEmojisMap.put(0x1f38f, TiRHelper.getResource("drawable.emoji_1f38f"));
        sEmojisMap.put(0x1f386, TiRHelper.getResource("drawable.emoji_1f386"));
        sEmojisMap.put(0x1f387, TiRHelper.getResource("drawable.emoji_1f387"));
        sEmojisMap.put(0x1f390, TiRHelper.getResource("drawable.emoji_1f390"));
        sEmojisMap.put(0x1f391, TiRHelper.getResource("drawable.emoji_1f391"));
        sEmojisMap.put(0x1f383, TiRHelper.getResource("drawable.emoji_1f383"));
        sEmojisMap.put(0x1f47b, TiRHelper.getResource("drawable.emoji_1f47b"));
        sEmojisMap.put(0x1f385, TiRHelper.getResource("drawable.emoji_1f385"));
        sEmojisMap.put(0x1f384, TiRHelper.getResource("drawable.emoji_1f384"));
        sEmojisMap.put(0x1f381, TiRHelper.getResource("drawable.emoji_1f381"));
        sEmojisMap.put(0x1f38b, TiRHelper.getResource("drawable.emoji_1f38b"));
        sEmojisMap.put(0x1f389, TiRHelper.getResource("drawable.emoji_1f389"));
        sEmojisMap.put(0x1f38a, TiRHelper.getResource("drawable.emoji_1f38a"));
        sEmojisMap.put(0x1f388, TiRHelper.getResource("drawable.emoji_1f388"));
        sEmojisMap.put(0x1f38c, TiRHelper.getResource("drawable.emoji_1f38c"));
        sEmojisMap.put(0x1f52e, TiRHelper.getResource("drawable.emoji_1f52e"));
        sEmojisMap.put(0x1f3a5, TiRHelper.getResource("drawable.emoji_1f3a5"));
        sEmojisMap.put(0x1f4f7, TiRHelper.getResource("drawable.emoji_1f4f7"));
        sEmojisMap.put(0x1f4f9, TiRHelper.getResource("drawable.emoji_1f4f9"));
        sEmojisMap.put(0x1f4fc, TiRHelper.getResource("drawable.emoji_1f4fc"));
        sEmojisMap.put(0x1f4bf, TiRHelper.getResource("drawable.emoji_1f4bf"));
        sEmojisMap.put(0x1f4c0, TiRHelper.getResource("drawable.emoji_1f4c0"));
        sEmojisMap.put(0x1f4bd, TiRHelper.getResource("drawable.emoji_1f4bd"));
        sEmojisMap.put(0x1f4be, TiRHelper.getResource("drawable.emoji_1f4be"));
        sEmojisMap.put(0x1f4bb, TiRHelper.getResource("drawable.emoji_1f4bb"));
        sEmojisMap.put(0x1f4f1, TiRHelper.getResource("drawable.emoji_1f4f1"));
        sEmojisMap.put(0x260e, TiRHelper.getResource("drawable.emoji_260e"));
        sEmojisMap.put(0x1f4de, TiRHelper.getResource("drawable.emoji_1f4de"));
        sEmojisMap.put(0x1f4df, TiRHelper.getResource("drawable.emoji_1f4df"));
        sEmojisMap.put(0x1f4e0, TiRHelper.getResource("drawable.emoji_1f4e0"));
        sEmojisMap.put(0x1f4e1, TiRHelper.getResource("drawable.emoji_1f4e1"));
        sEmojisMap.put(0x1f4fa, TiRHelper.getResource("drawable.emoji_1f4fa"));
        sEmojisMap.put(0x1f4fb, TiRHelper.getResource("drawable.emoji_1f4fb"));
        sEmojisMap.put(0x1f50a, TiRHelper.getResource("drawable.emoji_1f50a"));
        sEmojisMap.put(0x1f509, TiRHelper.getResource("drawable.emoji_1f509"));
        sEmojisMap.put(0x1f508, TiRHelper.getResource("drawable.emoji_1f508")); // TODO (rockerhieu): review this emoji
        sEmojisMap.put(0x1f507, TiRHelper.getResource("drawable.emoji_1f507"));
        sEmojisMap.put(0x1f514, TiRHelper.getResource("drawable.emoji_1f514"));
        sEmojisMap.put(0x1f515, TiRHelper.getResource("drawable.emoji_1f515"));
        sEmojisMap.put(0x1f4e2, TiRHelper.getResource("drawable.emoji_1f4e2"));
        sEmojisMap.put(0x1f4e3, TiRHelper.getResource("drawable.emoji_1f4e3"));
        sEmojisMap.put(0x23f3, TiRHelper.getResource("drawable.emoji_23f3"));
        sEmojisMap.put(0x231b, TiRHelper.getResource("drawable.emoji_231b"));
        sEmojisMap.put(0x23f0, TiRHelper.getResource("drawable.emoji_23f0"));
        sEmojisMap.put(0x231a, TiRHelper.getResource("drawable.emoji_231a"));
        sEmojisMap.put(0x1f513, TiRHelper.getResource("drawable.emoji_1f513"));
        sEmojisMap.put(0x1f512, TiRHelper.getResource("drawable.emoji_1f512"));
        sEmojisMap.put(0x1f50f, TiRHelper.getResource("drawable.emoji_1f50f"));
        sEmojisMap.put(0x1f510, TiRHelper.getResource("drawable.emoji_1f510"));
        sEmojisMap.put(0x1f511, TiRHelper.getResource("drawable.emoji_1f511"));
        sEmojisMap.put(0x1f50e, TiRHelper.getResource("drawable.emoji_1f50e"));
        sEmojisMap.put(0x1f4a1, TiRHelper.getResource("drawable.emoji_1f4a1"));
        sEmojisMap.put(0x1f526, TiRHelper.getResource("drawable.emoji_1f526"));
        sEmojisMap.put(0x1f506, TiRHelper.getResource("drawable.emoji_1f506"));
        sEmojisMap.put(0x1f505, TiRHelper.getResource("drawable.emoji_1f505"));
        sEmojisMap.put(0x1f50c, TiRHelper.getResource("drawable.emoji_1f50c"));
        sEmojisMap.put(0x1f50b, TiRHelper.getResource("drawable.emoji_1f50b"));
        sEmojisMap.put(0x1f50d, TiRHelper.getResource("drawable.emoji_1f50d"));
        sEmojisMap.put(0x1f6c1, TiRHelper.getResource("drawable.emoji_1f6c1"));
        sEmojisMap.put(0x1f6c0, TiRHelper.getResource("drawable.emoji_1f6c0"));
        sEmojisMap.put(0x1f6bf, TiRHelper.getResource("drawable.emoji_1f6bf"));
        sEmojisMap.put(0x1f6bd, TiRHelper.getResource("drawable.emoji_1f6bd"));
        sEmojisMap.put(0x1f527, TiRHelper.getResource("drawable.emoji_1f527"));
        sEmojisMap.put(0x1f529, TiRHelper.getResource("drawable.emoji_1f529"));
        sEmojisMap.put(0x1f528, TiRHelper.getResource("drawable.emoji_1f528"));
        sEmojisMap.put(0x1f6aa, TiRHelper.getResource("drawable.emoji_1f6aa"));
        sEmojisMap.put(0x1f6ac, TiRHelper.getResource("drawable.emoji_1f6ac"));
        sEmojisMap.put(0x1f4a3, TiRHelper.getResource("drawable.emoji_1f4a3"));
        sEmojisMap.put(0x1f52b, TiRHelper.getResource("drawable.emoji_1f52b"));
        sEmojisMap.put(0x1f52a, TiRHelper.getResource("drawable.emoji_1f52a"));
        sEmojisMap.put(0x1f48a, TiRHelper.getResource("drawable.emoji_1f48a"));
        sEmojisMap.put(0x1f489, TiRHelper.getResource("drawable.emoji_1f489"));
        sEmojisMap.put(0x1f4b0, TiRHelper.getResource("drawable.emoji_1f4b0"));
        sEmojisMap.put(0x1f4b4, TiRHelper.getResource("drawable.emoji_1f4b4"));
        sEmojisMap.put(0x1f4b5, TiRHelper.getResource("drawable.emoji_1f4b5"));
        sEmojisMap.put(0x1f4b7, TiRHelper.getResource("drawable.emoji_1f4b7"));
        sEmojisMap.put(0x1f4b6, TiRHelper.getResource("drawable.emoji_1f4b6"));
        sEmojisMap.put(0x1f4b3, TiRHelper.getResource("drawable.emoji_1f4b3"));
        sEmojisMap.put(0x1f4b8, TiRHelper.getResource("drawable.emoji_1f4b8"));
        sEmojisMap.put(0x1f4f2, TiRHelper.getResource("drawable.emoji_1f4f2"));
        sEmojisMap.put(0x1f4e7, TiRHelper.getResource("drawable.emoji_1f4e7"));
        sEmojisMap.put(0x1f4e5, TiRHelper.getResource("drawable.emoji_1f4e5"));
        sEmojisMap.put(0x1f4e4, TiRHelper.getResource("drawable.emoji_1f4e4"));
        sEmojisMap.put(0x2709, TiRHelper.getResource("drawable.emoji_2709"));
        sEmojisMap.put(0x1f4e9, TiRHelper.getResource("drawable.emoji_1f4e9"));
        sEmojisMap.put(0x1f4e8, TiRHelper.getResource("drawable.emoji_1f4e8"));
        sEmojisMap.put(0x1f4ef, TiRHelper.getResource("drawable.emoji_1f4ef"));
        sEmojisMap.put(0x1f4eb, TiRHelper.getResource("drawable.emoji_1f4eb"));
        sEmojisMap.put(0x1f4ea, TiRHelper.getResource("drawable.emoji_1f4ea"));
        sEmojisMap.put(0x1f4ec, TiRHelper.getResource("drawable.emoji_1f4ec"));
        sEmojisMap.put(0x1f4ed, TiRHelper.getResource("drawable.emoji_1f4ed"));
        sEmojisMap.put(0x1f4ee, TiRHelper.getResource("drawable.emoji_1f4ee"));
        sEmojisMap.put(0x1f4e6, TiRHelper.getResource("drawable.emoji_1f4e6"));
        sEmojisMap.put(0x1f4dd, TiRHelper.getResource("drawable.emoji_1f4dd"));
        sEmojisMap.put(0x1f4c4, TiRHelper.getResource("drawable.emoji_1f4c4"));
        sEmojisMap.put(0x1f4c3, TiRHelper.getResource("drawable.emoji_1f4c3"));
        sEmojisMap.put(0x1f4d1, TiRHelper.getResource("drawable.emoji_1f4d1"));
        sEmojisMap.put(0x1f4ca, TiRHelper.getResource("drawable.emoji_1f4ca"));
        sEmojisMap.put(0x1f4c8, TiRHelper.getResource("drawable.emoji_1f4c8"));
        sEmojisMap.put(0x1f4c9, TiRHelper.getResource("drawable.emoji_1f4c9"));
        sEmojisMap.put(0x1f4dc, TiRHelper.getResource("drawable.emoji_1f4dc"));
        sEmojisMap.put(0x1f4cb, TiRHelper.getResource("drawable.emoji_1f4cb"));
        sEmojisMap.put(0x1f4c5, TiRHelper.getResource("drawable.emoji_1f4c5"));
        sEmojisMap.put(0x1f4c6, TiRHelper.getResource("drawable.emoji_1f4c6"));
        sEmojisMap.put(0x1f4c7, TiRHelper.getResource("drawable.emoji_1f4c7"));
        sEmojisMap.put(0x1f4c1, TiRHelper.getResource("drawable.emoji_1f4c1"));
        sEmojisMap.put(0x1f4c2, TiRHelper.getResource("drawable.emoji_1f4c2"));
        sEmojisMap.put(0x2702, TiRHelper.getResource("drawable.emoji_2702"));
        sEmojisMap.put(0x1f4cc, TiRHelper.getResource("drawable.emoji_1f4cc"));
        sEmojisMap.put(0x1f4ce, TiRHelper.getResource("drawable.emoji_1f4ce"));
        sEmojisMap.put(0x2712, TiRHelper.getResource("drawable.emoji_2712"));
        sEmojisMap.put(0x270f, TiRHelper.getResource("drawable.emoji_270f"));
        sEmojisMap.put(0x1f4cf, TiRHelper.getResource("drawable.emoji_1f4cf"));
        sEmojisMap.put(0x1f4d0, TiRHelper.getResource("drawable.emoji_1f4d0"));
        sEmojisMap.put(0x1f4d5, TiRHelper.getResource("drawable.emoji_1f4d5"));
        sEmojisMap.put(0x1f4d7, TiRHelper.getResource("drawable.emoji_1f4d7"));
        sEmojisMap.put(0x1f4d8, TiRHelper.getResource("drawable.emoji_1f4d8"));
        sEmojisMap.put(0x1f4d9, TiRHelper.getResource("drawable.emoji_1f4d9"));
        sEmojisMap.put(0x1f4d3, TiRHelper.getResource("drawable.emoji_1f4d3"));
        sEmojisMap.put(0x1f4d4, TiRHelper.getResource("drawable.emoji_1f4d4"));
        sEmojisMap.put(0x1f4d2, TiRHelper.getResource("drawable.emoji_1f4d2"));
        sEmojisMap.put(0x1f4da, TiRHelper.getResource("drawable.emoji_1f4da"));
        sEmojisMap.put(0x1f4d6, TiRHelper.getResource("drawable.emoji_1f4d6"));
        sEmojisMap.put(0x1f516, TiRHelper.getResource("drawable.emoji_1f516"));
        sEmojisMap.put(0x1f4db, TiRHelper.getResource("drawable.emoji_1f4db"));
        sEmojisMap.put(0x1f52c, TiRHelper.getResource("drawable.emoji_1f52c"));
        sEmojisMap.put(0x1f52d, TiRHelper.getResource("drawable.emoji_1f52d"));
        sEmojisMap.put(0x1f4f0, TiRHelper.getResource("drawable.emoji_1f4f0"));
        sEmojisMap.put(0x1f3a8, TiRHelper.getResource("drawable.emoji_1f3a8"));
        sEmojisMap.put(0x1f3ac, TiRHelper.getResource("drawable.emoji_1f3ac"));
        sEmojisMap.put(0x1f3a4, TiRHelper.getResource("drawable.emoji_1f3a4"));
        sEmojisMap.put(0x1f3a7, TiRHelper.getResource("drawable.emoji_1f3a7"));
        sEmojisMap.put(0x1f3bc, TiRHelper.getResource("drawable.emoji_1f3bc"));
        sEmojisMap.put(0x1f3b5, TiRHelper.getResource("drawable.emoji_1f3b5"));
        sEmojisMap.put(0x1f3b6, TiRHelper.getResource("drawable.emoji_1f3b6"));
        sEmojisMap.put(0x1f3b9, TiRHelper.getResource("drawable.emoji_1f3b9"));
        sEmojisMap.put(0x1f3bb, TiRHelper.getResource("drawable.emoji_1f3bb"));
        sEmojisMap.put(0x1f3ba, TiRHelper.getResource("drawable.emoji_1f3ba"));
        sEmojisMap.put(0x1f3b7, TiRHelper.getResource("drawable.emoji_1f3b7"));
        sEmojisMap.put(0x1f3b8, TiRHelper.getResource("drawable.emoji_1f3b8"));
        sEmojisMap.put(0x1f47e, TiRHelper.getResource("drawable.emoji_1f47e"));
        sEmojisMap.put(0x1f3ae, TiRHelper.getResource("drawable.emoji_1f3ae"));
        sEmojisMap.put(0x1f0cf, TiRHelper.getResource("drawable.emoji_1f0cf"));
        sEmojisMap.put(0x1f3b4, TiRHelper.getResource("drawable.emoji_1f3b4"));
        sEmojisMap.put(0x1f004, TiRHelper.getResource("drawable.emoji_1f004"));
        sEmojisMap.put(0x1f3b2, TiRHelper.getResource("drawable.emoji_1f3b2"));
        sEmojisMap.put(0x1f3af, TiRHelper.getResource("drawable.emoji_1f3af"));
        sEmojisMap.put(0x1f3c8, TiRHelper.getResource("drawable.emoji_1f3c8"));
        sEmojisMap.put(0x1f3c0, TiRHelper.getResource("drawable.emoji_1f3c0"));
        sEmojisMap.put(0x26bd, TiRHelper.getResource("drawable.emoji_26bd"));
        sEmojisMap.put(0x26be, TiRHelper.getResource("drawable.emoji_26be"));
        sEmojisMap.put(0x1f3be, TiRHelper.getResource("drawable.emoji_1f3be"));
        sEmojisMap.put(0x1f3b1, TiRHelper.getResource("drawable.emoji_1f3b1"));
        sEmojisMap.put(0x1f3c9, TiRHelper.getResource("drawable.emoji_1f3c9"));
        sEmojisMap.put(0x1f3b3, TiRHelper.getResource("drawable.emoji_1f3b3"));
        sEmojisMap.put(0x26f3, TiRHelper.getResource("drawable.emoji_26f3"));
        sEmojisMap.put(0x1f6b5, TiRHelper.getResource("drawable.emoji_1f6b5"));
        sEmojisMap.put(0x1f6b4, TiRHelper.getResource("drawable.emoji_1f6b4"));
        sEmojisMap.put(0x1f3c1, TiRHelper.getResource("drawable.emoji_1f3c1"));
        sEmojisMap.put(0x1f3c7, TiRHelper.getResource("drawable.emoji_1f3c7"));
        sEmojisMap.put(0x1f3c6, TiRHelper.getResource("drawable.emoji_1f3c6"));
        sEmojisMap.put(0x1f3bf, TiRHelper.getResource("drawable.emoji_1f3bf"));
        sEmojisMap.put(0x1f3c2, TiRHelper.getResource("drawable.emoji_1f3c2"));
        sEmojisMap.put(0x1f3ca, TiRHelper.getResource("drawable.emoji_1f3ca"));
        sEmojisMap.put(0x1f3c4, TiRHelper.getResource("drawable.emoji_1f3c4"));
        sEmojisMap.put(0x1f3a3, TiRHelper.getResource("drawable.emoji_1f3a3"));
        sEmojisMap.put(0x2615, TiRHelper.getResource("drawable.emoji_2615"));
        sEmojisMap.put(0x1f375, TiRHelper.getResource("drawable.emoji_1f375"));
        sEmojisMap.put(0x1f376, TiRHelper.getResource("drawable.emoji_1f376"));
        sEmojisMap.put(0x1f37c, TiRHelper.getResource("drawable.emoji_1f37c"));
        sEmojisMap.put(0x1f37a, TiRHelper.getResource("drawable.emoji_1f37a"));
        sEmojisMap.put(0x1f37b, TiRHelper.getResource("drawable.emoji_1f37b"));
        sEmojisMap.put(0x1f378, TiRHelper.getResource("drawable.emoji_1f378"));
        sEmojisMap.put(0x1f379, TiRHelper.getResource("drawable.emoji_1f379"));
        sEmojisMap.put(0x1f377, TiRHelper.getResource("drawable.emoji_1f377"));
        sEmojisMap.put(0x1f374, TiRHelper.getResource("drawable.emoji_1f374"));
        sEmojisMap.put(0x1f355, TiRHelper.getResource("drawable.emoji_1f355"));
        sEmojisMap.put(0x1f354, TiRHelper.getResource("drawable.emoji_1f354"));
        sEmojisMap.put(0x1f35f, TiRHelper.getResource("drawable.emoji_1f35f"));
        sEmojisMap.put(0x1f357, TiRHelper.getResource("drawable.emoji_1f357"));
        sEmojisMap.put(0x1f356, TiRHelper.getResource("drawable.emoji_1f356"));
        sEmojisMap.put(0x1f35d, TiRHelper.getResource("drawable.emoji_1f35d"));
        sEmojisMap.put(0x1f35b, TiRHelper.getResource("drawable.emoji_1f35b"));
        sEmojisMap.put(0x1f364, TiRHelper.getResource("drawable.emoji_1f364"));
        sEmojisMap.put(0x1f371, TiRHelper.getResource("drawable.emoji_1f371"));
        sEmojisMap.put(0x1f363, TiRHelper.getResource("drawable.emoji_1f363"));
        sEmojisMap.put(0x1f365, TiRHelper.getResource("drawable.emoji_1f365"));
        sEmojisMap.put(0x1f359, TiRHelper.getResource("drawable.emoji_1f359"));
        sEmojisMap.put(0x1f358, TiRHelper.getResource("drawable.emoji_1f358"));
        sEmojisMap.put(0x1f35a, TiRHelper.getResource("drawable.emoji_1f35a"));
        sEmojisMap.put(0x1f35c, TiRHelper.getResource("drawable.emoji_1f35c"));
        sEmojisMap.put(0x1f372, TiRHelper.getResource("drawable.emoji_1f372"));
        sEmojisMap.put(0x1f362, TiRHelper.getResource("drawable.emoji_1f362"));
        sEmojisMap.put(0x1f361, TiRHelper.getResource("drawable.emoji_1f361"));
        sEmojisMap.put(0x1f373, TiRHelper.getResource("drawable.emoji_1f373"));
        sEmojisMap.put(0x1f35e, TiRHelper.getResource("drawable.emoji_1f35e"));
        sEmojisMap.put(0x1f369, TiRHelper.getResource("drawable.emoji_1f369"));
        sEmojisMap.put(0x1f36e, TiRHelper.getResource("drawable.emoji_1f36e"));
        sEmojisMap.put(0x1f366, TiRHelper.getResource("drawable.emoji_1f366"));
        sEmojisMap.put(0x1f368, TiRHelper.getResource("drawable.emoji_1f368"));
        sEmojisMap.put(0x1f367, TiRHelper.getResource("drawable.emoji_1f367"));
        sEmojisMap.put(0x1f382, TiRHelper.getResource("drawable.emoji_1f382"));
        sEmojisMap.put(0x1f370, TiRHelper.getResource("drawable.emoji_1f370"));
        sEmojisMap.put(0x1f36a, TiRHelper.getResource("drawable.emoji_1f36a"));
        sEmojisMap.put(0x1f36b, TiRHelper.getResource("drawable.emoji_1f36b"));
        sEmojisMap.put(0x1f36c, TiRHelper.getResource("drawable.emoji_1f36c"));
        sEmojisMap.put(0x1f36d, TiRHelper.getResource("drawable.emoji_1f36d"));
        sEmojisMap.put(0x1f36f, TiRHelper.getResource("drawable.emoji_1f36f"));
        sEmojisMap.put(0x1f34e, TiRHelper.getResource("drawable.emoji_1f34e"));
        sEmojisMap.put(0x1f34f, TiRHelper.getResource("drawable.emoji_1f34f"));
        sEmojisMap.put(0x1f34a, TiRHelper.getResource("drawable.emoji_1f34a"));
        sEmojisMap.put(0x1f34b, TiRHelper.getResource("drawable.emoji_1f34b"));
        sEmojisMap.put(0x1f352, TiRHelper.getResource("drawable.emoji_1f352"));
        sEmojisMap.put(0x1f347, TiRHelper.getResource("drawable.emoji_1f347"));
        sEmojisMap.put(0x1f349, TiRHelper.getResource("drawable.emoji_1f349"));
        sEmojisMap.put(0x1f353, TiRHelper.getResource("drawable.emoji_1f353"));
        sEmojisMap.put(0x1f351, TiRHelper.getResource("drawable.emoji_1f351"));
        sEmojisMap.put(0x1f348, TiRHelper.getResource("drawable.emoji_1f348"));
        sEmojisMap.put(0x1f34c, TiRHelper.getResource("drawable.emoji_1f34c"));
        sEmojisMap.put(0x1f350, TiRHelper.getResource("drawable.emoji_1f350"));
        sEmojisMap.put(0x1f34d, TiRHelper.getResource("drawable.emoji_1f34d"));
        sEmojisMap.put(0x1f360, TiRHelper.getResource("drawable.emoji_1f360"));
        sEmojisMap.put(0x1f346, TiRHelper.getResource("drawable.emoji_1f346"));
        sEmojisMap.put(0x1f345, TiRHelper.getResource("drawable.emoji_1f345"));
        sEmojisMap.put(0x1f33d, TiRHelper.getResource("drawable.emoji_1f33d"));

        // Places
        sEmojisMap.put(0x1f3e0, TiRHelper.getResource("drawable.emoji_1f3e0"));
        sEmojisMap.put(0x1f3e1, TiRHelper.getResource("drawable.emoji_1f3e1"));
        sEmojisMap.put(0x1f3eb, TiRHelper.getResource("drawable.emoji_1f3eb"));
        sEmojisMap.put(0x1f3e2, TiRHelper.getResource("drawable.emoji_1f3e2"));
        sEmojisMap.put(0x1f3e3, TiRHelper.getResource("drawable.emoji_1f3e3"));
        sEmojisMap.put(0x1f3e5, TiRHelper.getResource("drawable.emoji_1f3e5"));
        sEmojisMap.put(0x1f3e6, TiRHelper.getResource("drawable.emoji_1f3e6"));
        sEmojisMap.put(0x1f3ea, TiRHelper.getResource("drawable.emoji_1f3ea"));
        sEmojisMap.put(0x1f3e9, TiRHelper.getResource("drawable.emoji_1f3e9"));
        sEmojisMap.put(0x1f3e8, TiRHelper.getResource("drawable.emoji_1f3e8"));
        sEmojisMap.put(0x1f492, TiRHelper.getResource("drawable.emoji_1f492"));
        sEmojisMap.put(0x26ea, TiRHelper.getResource("drawable.emoji_26ea"));
        sEmojisMap.put(0x1f3ec, TiRHelper.getResource("drawable.emoji_1f3ec"));
        sEmojisMap.put(0x1f3e4, TiRHelper.getResource("drawable.emoji_1f3e4"));
        sEmojisMap.put(0x1f307, TiRHelper.getResource("drawable.emoji_1f307"));
        sEmojisMap.put(0x1f306, TiRHelper.getResource("drawable.emoji_1f306"));
        sEmojisMap.put(0x1f3ef, TiRHelper.getResource("drawable.emoji_1f3ef"));
        sEmojisMap.put(0x1f3f0, TiRHelper.getResource("drawable.emoji_1f3f0"));
        sEmojisMap.put(0x26fa, TiRHelper.getResource("drawable.emoji_26fa"));
        sEmojisMap.put(0x1f3ed, TiRHelper.getResource("drawable.emoji_1f3ed"));
        sEmojisMap.put(0x1f5fc, TiRHelper.getResource("drawable.emoji_1f5fc"));
        sEmojisMap.put(0x1f5fe, TiRHelper.getResource("drawable.emoji_1f5fe"));
        sEmojisMap.put(0x1f5fb, TiRHelper.getResource("drawable.emoji_1f5fb"));
        sEmojisMap.put(0x1f304, TiRHelper.getResource("drawable.emoji_1f304"));
        sEmojisMap.put(0x1f305, TiRHelper.getResource("drawable.emoji_1f305"));
        sEmojisMap.put(0x1f303, TiRHelper.getResource("drawable.emoji_1f303"));
        sEmojisMap.put(0x1f5fd, TiRHelper.getResource("drawable.emoji_1f5fd"));
        sEmojisMap.put(0x1f309, TiRHelper.getResource("drawable.emoji_1f309"));
        sEmojisMap.put(0x1f3a0, TiRHelper.getResource("drawable.emoji_1f3a0"));
        sEmojisMap.put(0x1f3a1, TiRHelper.getResource("drawable.emoji_1f3a1"));
        sEmojisMap.put(0x26f2, TiRHelper.getResource("drawable.emoji_26f2"));
        sEmojisMap.put(0x1f3a2, TiRHelper.getResource("drawable.emoji_1f3a2"));
        sEmojisMap.put(0x1f6a2, TiRHelper.getResource("drawable.emoji_1f6a2"));
        sEmojisMap.put(0x26f5, TiRHelper.getResource("drawable.emoji_26f5"));
        sEmojisMap.put(0x1f6a4, TiRHelper.getResource("drawable.emoji_1f6a4"));
        sEmojisMap.put(0x1f6a3, TiRHelper.getResource("drawable.emoji_1f6a3"));
        sEmojisMap.put(0x2693, TiRHelper.getResource("drawable.emoji_2693"));
        sEmojisMap.put(0x1f680, TiRHelper.getResource("drawable.emoji_1f680"));
        sEmojisMap.put(0x2708, TiRHelper.getResource("drawable.emoji_2708"));
        sEmojisMap.put(0x1f4ba, TiRHelper.getResource("drawable.emoji_1f4ba"));
        sEmojisMap.put(0x1f681, TiRHelper.getResource("drawable.emoji_1f681"));
        sEmojisMap.put(0x1f682, TiRHelper.getResource("drawable.emoji_1f682"));
        sEmojisMap.put(0x1f68a, TiRHelper.getResource("drawable.emoji_1f68a"));
        sEmojisMap.put(0x1f689, TiRHelper.getResource("drawable.emoji_1f689"));
        sEmojisMap.put(0x1f69e, TiRHelper.getResource("drawable.emoji_1f69e"));
        sEmojisMap.put(0x1f686, TiRHelper.getResource("drawable.emoji_1f686"));
        sEmojisMap.put(0x1f684, TiRHelper.getResource("drawable.emoji_1f684"));
        sEmojisMap.put(0x1f685, TiRHelper.getResource("drawable.emoji_1f685"));
        sEmojisMap.put(0x1f688, TiRHelper.getResource("drawable.emoji_1f688"));
        sEmojisMap.put(0x1f687, TiRHelper.getResource("drawable.emoji_1f687"));
        sEmojisMap.put(0x1f69d, TiRHelper.getResource("drawable.emoji_1f69d"));
        sEmojisMap.put(0x1f68b, TiRHelper.getResource("drawable.emoji_1f68b")); // TODO (rockerhieu) review this emoji
        sEmojisMap.put(0x1f683, TiRHelper.getResource("drawable.emoji_1f683"));
        sEmojisMap.put(0x1f68e, TiRHelper.getResource("drawable.emoji_1f68e"));
        sEmojisMap.put(0x1f68c, TiRHelper.getResource("drawable.emoji_1f68c"));
        sEmojisMap.put(0x1f68d, TiRHelper.getResource("drawable.emoji_1f68d"));
        sEmojisMap.put(0x1f699, TiRHelper.getResource("drawable.emoji_1f699"));
        sEmojisMap.put(0x1f698, TiRHelper.getResource("drawable.emoji_1f698"));
        sEmojisMap.put(0x1f697, TiRHelper.getResource("drawable.emoji_1f697"));
        sEmojisMap.put(0x1f695, TiRHelper.getResource("drawable.emoji_1f695"));
        sEmojisMap.put(0x1f696, TiRHelper.getResource("drawable.emoji_1f696"));
        sEmojisMap.put(0x1f69b, TiRHelper.getResource("drawable.emoji_1f69b"));
        sEmojisMap.put(0x1f69a, TiRHelper.getResource("drawable.emoji_1f69a"));
        sEmojisMap.put(0x1f6a8, TiRHelper.getResource("drawable.emoji_1f6a8"));
        sEmojisMap.put(0x1f693, TiRHelper.getResource("drawable.emoji_1f693"));
        sEmojisMap.put(0x1f694, TiRHelper.getResource("drawable.emoji_1f694"));
        sEmojisMap.put(0x1f692, TiRHelper.getResource("drawable.emoji_1f692"));
        sEmojisMap.put(0x1f691, TiRHelper.getResource("drawable.emoji_1f691"));
        sEmojisMap.put(0x1f690, TiRHelper.getResource("drawable.emoji_1f690"));
        sEmojisMap.put(0x1f6b2, TiRHelper.getResource("drawable.emoji_1f6b2"));
        sEmojisMap.put(0x1f6a1, TiRHelper.getResource("drawable.emoji_1f6a1"));
        sEmojisMap.put(0x1f69f, TiRHelper.getResource("drawable.emoji_1f69f"));
        sEmojisMap.put(0x1f6a0, TiRHelper.getResource("drawable.emoji_1f6a0"));
        sEmojisMap.put(0x1f69c, TiRHelper.getResource("drawable.emoji_1f69c"));
        sEmojisMap.put(0x1f488, TiRHelper.getResource("drawable.emoji_1f488"));
        sEmojisMap.put(0x1f68f, TiRHelper.getResource("drawable.emoji_1f68f"));
        sEmojisMap.put(0x1f3ab, TiRHelper.getResource("drawable.emoji_1f3ab"));
        sEmojisMap.put(0x1f6a6, TiRHelper.getResource("drawable.emoji_1f6a6"));
        sEmojisMap.put(0x1f6a5, TiRHelper.getResource("drawable.emoji_1f6a5"));
        sEmojisMap.put(0x26a0, TiRHelper.getResource("drawable.emoji_26a0"));
        sEmojisMap.put(0x1f6a7, TiRHelper.getResource("drawable.emoji_1f6a7"));
        sEmojisMap.put(0x1f530, TiRHelper.getResource("drawable.emoji_1f530"));
        sEmojisMap.put(0x26fd, TiRHelper.getResource("drawable.emoji_26fd"));
        sEmojisMap.put(0x1f3ee, TiRHelper.getResource("drawable.emoji_1f3ee"));
        sEmojisMap.put(0x1f3b0, TiRHelper.getResource("drawable.emoji_1f3b0"));
        sEmojisMap.put(0x2668, TiRHelper.getResource("drawable.emoji_2668"));
        sEmojisMap.put(0x1f5ff, TiRHelper.getResource("drawable.emoji_1f5ff"));
        sEmojisMap.put(0x1f3aa, TiRHelper.getResource("drawable.emoji_1f3aa"));
        sEmojisMap.put(0x1f3ad, TiRHelper.getResource("drawable.emoji_1f3ad"));
        sEmojisMap.put(0x1f4cd, TiRHelper.getResource("drawable.emoji_1f4cd"));
        sEmojisMap.put(0x1f6a9, TiRHelper.getResource("drawable.emoji_1f6a9"));
//        Emoji.fromChars("\ud83c\uddef\ud83c\uddf5""));
//        Emoji.fromChars("\ud83c\uddf0\ud83c\uddf7""));
//        Emoji.fromChars("\ud83c\udde9\ud83c\uddea""));
//        Emoji.fromChars("\ud83c\udde8\ud83c\uddf3""));
//        Emoji.fromChars("\ud83c\uddfa\ud83c\uddf8""));
//        Emoji.fromChars("\ud83c\uddeb\ud83c\uddf7""));
//        Emoji.fromChars("\ud83c\uddea\ud83c\uddf8""));
//        Emoji.fromChars("\ud83c\uddee\ud83c\uddf9""));
//        Emoji.fromChars("\ud83c\uddf7\ud83c\uddfa""));
//        Emoji.fromChars("\ud83c\uddec\ud83c\udde7""));

        // Symbols
//        Emoji.fromChars("\u0031\u20e3"),
//        Emoji.fromChars("\u0032\u20e3"),
//        Emoji.fromChars("\u0033\u20e3"),
//        Emoji.fromChars("\u0034\u20e3"),
//        Emoji.fromChars("\u0035\u20e3"),
//        Emoji.fromChars("\u0036\u20e3"),
//        Emoji.fromChars("\u0037\u20e3"),
//        Emoji.fromChars("\u0038\u20e3"),
//        Emoji.fromChars("\u0039\u20e3"),
//        Emoji.fromChars("\u0030\u20e3"),
        sEmojisMap.put(0x1f51f, TiRHelper.getResource("drawable.emoji_1f51f"));
        sEmojisMap.put(0x1f522, TiRHelper.getResource("drawable.emoji_1f522"));
//        Emoji.fromChars("\u0023\u20e3"),
        sEmojisMap.put(0x1f523, TiRHelper.getResource("drawable.emoji_1f523"));
        sEmojisMap.put(0x2b06, TiRHelper.getResource("drawable.emoji_2b06"));
        sEmojisMap.put(0x2b07, TiRHelper.getResource("drawable.emoji_2b07"));
        sEmojisMap.put(0x2b05, TiRHelper.getResource("drawable.emoji_2b05"));
        sEmojisMap.put(0x27a1, TiRHelper.getResource("drawable.emoji_27a1"));
        sEmojisMap.put(0x1f520, TiRHelper.getResource("drawable.emoji_1f520"));
        sEmojisMap.put(0x1f521, TiRHelper.getResource("drawable.emoji_1f521"));
        sEmojisMap.put(0x1f524, TiRHelper.getResource("drawable.emoji_1f524"));
        sEmojisMap.put(0x2197, TiRHelper.getResource("drawable.emoji_2197"));
        sEmojisMap.put(0x2196, TiRHelper.getResource("drawable.emoji_2196"));
        sEmojisMap.put(0x2198, TiRHelper.getResource("drawable.emoji_2198"));
        sEmojisMap.put(0x2199, TiRHelper.getResource("drawable.emoji_2199"));
        sEmojisMap.put(0x2194, TiRHelper.getResource("drawable.emoji_2194"));
        sEmojisMap.put(0x2195, TiRHelper.getResource("drawable.emoji_2195"));
        sEmojisMap.put(0x1f504, TiRHelper.getResource("drawable.emoji_1f504"));
        sEmojisMap.put(0x25c0, TiRHelper.getResource("drawable.emoji_25c0"));
        sEmojisMap.put(0x25b6, TiRHelper.getResource("drawable.emoji_25b6"));
        sEmojisMap.put(0x1f53c, TiRHelper.getResource("drawable.emoji_1f53c"));
        sEmojisMap.put(0x1f53d, TiRHelper.getResource("drawable.emoji_1f53d"));
        sEmojisMap.put(0x21a9, TiRHelper.getResource("drawable.emoji_21a9"));
        sEmojisMap.put(0x21aa, TiRHelper.getResource("drawable.emoji_21aa"));
        sEmojisMap.put(0x2139, TiRHelper.getResource("drawable.emoji_2139"));
        sEmojisMap.put(0x23ea, TiRHelper.getResource("drawable.emoji_23ea"));
        sEmojisMap.put(0x23e9, TiRHelper.getResource("drawable.emoji_23e9"));
        sEmojisMap.put(0x23eb, TiRHelper.getResource("drawable.emoji_23eb"));
        sEmojisMap.put(0x23ec, TiRHelper.getResource("drawable.emoji_23ec"));
        sEmojisMap.put(0x2935, TiRHelper.getResource("drawable.emoji_2935"));
        sEmojisMap.put(0x2934, TiRHelper.getResource("drawable.emoji_2934"));
        sEmojisMap.put(0x1f197, TiRHelper.getResource("drawable.emoji_1f197"));
        sEmojisMap.put(0x1f500, TiRHelper.getResource("drawable.emoji_1f500"));
        sEmojisMap.put(0x1f501, TiRHelper.getResource("drawable.emoji_1f501"));
        sEmojisMap.put(0x1f502, TiRHelper.getResource("drawable.emoji_1f502"));
        sEmojisMap.put(0x1f195, TiRHelper.getResource("drawable.emoji_1f195"));
        sEmojisMap.put(0x1f199, TiRHelper.getResource("drawable.emoji_1f199"));
        sEmojisMap.put(0x1f192, TiRHelper.getResource("drawable.emoji_1f192"));
        sEmojisMap.put(0x1f193, TiRHelper.getResource("drawable.emoji_1f193"));
        sEmojisMap.put(0x1f196, TiRHelper.getResource("drawable.emoji_1f196"));
        sEmojisMap.put(0x1f4f6, TiRHelper.getResource("drawable.emoji_1f4f6"));
        sEmojisMap.put(0x1f3a6, TiRHelper.getResource("drawable.emoji_1f3a6"));
        sEmojisMap.put(0x1f201, TiRHelper.getResource("drawable.emoji_1f201"));
        sEmojisMap.put(0x1f22f, TiRHelper.getResource("drawable.emoji_1f22f"));
        sEmojisMap.put(0x1f233, TiRHelper.getResource("drawable.emoji_1f233"));
        sEmojisMap.put(0x1f235, TiRHelper.getResource("drawable.emoji_1f235"));
        sEmojisMap.put(0x1f234, TiRHelper.getResource("drawable.emoji_1f234"));
        sEmojisMap.put(0x1f232, TiRHelper.getResource("drawable.emoji_1f232"));
        sEmojisMap.put(0x1f250, TiRHelper.getResource("drawable.emoji_1f250"));
        sEmojisMap.put(0x1f239, TiRHelper.getResource("drawable.emoji_1f239"));
        sEmojisMap.put(0x1f23a, TiRHelper.getResource("drawable.emoji_1f23a"));
        sEmojisMap.put(0x1f236, TiRHelper.getResource("drawable.emoji_1f236"));
        sEmojisMap.put(0x1f21a, TiRHelper.getResource("drawable.emoji_1f21a"));
        sEmojisMap.put(0x1f6bb, TiRHelper.getResource("drawable.emoji_1f6bb"));
        sEmojisMap.put(0x1f6b9, TiRHelper.getResource("drawable.emoji_1f6b9"));
        sEmojisMap.put(0x1f6ba, TiRHelper.getResource("drawable.emoji_1f6ba"));
        sEmojisMap.put(0x1f6bc, TiRHelper.getResource("drawable.emoji_1f6bc"));
        sEmojisMap.put(0x1f6be, TiRHelper.getResource("drawable.emoji_1f6be"));
        sEmojisMap.put(0x1f6b0, TiRHelper.getResource("drawable.emoji_1f6b0"));
        sEmojisMap.put(0x1f6ae, TiRHelper.getResource("drawable.emoji_1f6ae"));
        sEmojisMap.put(0x1f17f, TiRHelper.getResource("drawable.emoji_1f17f"));
        sEmojisMap.put(0x267f, TiRHelper.getResource("drawable.emoji_267f"));
        sEmojisMap.put(0x1f6ad, TiRHelper.getResource("drawable.emoji_1f6ad"));
        sEmojisMap.put(0x1f237, TiRHelper.getResource("drawable.emoji_1f237"));
        sEmojisMap.put(0x1f238, TiRHelper.getResource("drawable.emoji_1f238"));
        sEmojisMap.put(0x1f202, TiRHelper.getResource("drawable.emoji_1f202"));
        sEmojisMap.put(0x24c2, TiRHelper.getResource("drawable.emoji_24c2"));
        sEmojisMap.put(0x1f6c2, TiRHelper.getResource("drawable.emoji_1f6c2"));
        sEmojisMap.put(0x1f6c4, TiRHelper.getResource("drawable.emoji_1f6c4"));
        sEmojisMap.put(0x1f6c5, TiRHelper.getResource("drawable.emoji_1f6c5"));
        sEmojisMap.put(0x1f6c3, TiRHelper.getResource("drawable.emoji_1f6c3"));
        sEmojisMap.put(0x1f251, TiRHelper.getResource("drawable.emoji_1f251"));
        sEmojisMap.put(0x3299, TiRHelper.getResource("drawable.emoji_3299"));
        sEmojisMap.put(0x3297, TiRHelper.getResource("drawable.emoji_3297"));
        sEmojisMap.put(0x1f191, TiRHelper.getResource("drawable.emoji_1f191"));
        sEmojisMap.put(0x1f198, TiRHelper.getResource("drawable.emoji_1f198"));
        sEmojisMap.put(0x1f194, TiRHelper.getResource("drawable.emoji_1f194"));
        sEmojisMap.put(0x1f6ab, TiRHelper.getResource("drawable.emoji_1f6ab"));
        sEmojisMap.put(0x1f51e, TiRHelper.getResource("drawable.emoji_1f51e"));
        sEmojisMap.put(0x1f4f5, TiRHelper.getResource("drawable.emoji_1f4f5"));
        sEmojisMap.put(0x1f6af, TiRHelper.getResource("drawable.emoji_1f6af"));
        sEmojisMap.put(0x1f6b1, TiRHelper.getResource("drawable.emoji_1f6b1"));
        sEmojisMap.put(0x1f6b3, TiRHelper.getResource("drawable.emoji_1f6b3"));
        sEmojisMap.put(0x1f6b7, TiRHelper.getResource("drawable.emoji_1f6b7"));
        sEmojisMap.put(0x1f6b8, TiRHelper.getResource("drawable.emoji_1f6b8"));
        sEmojisMap.put(0x26d4, TiRHelper.getResource("drawable.emoji_26d4"));
        sEmojisMap.put(0x2733, TiRHelper.getResource("drawable.emoji_2733"));
        sEmojisMap.put(0x2747, TiRHelper.getResource("drawable.emoji_2747"));
        sEmojisMap.put(0x274e, TiRHelper.getResource("drawable.emoji_274e"));
        sEmojisMap.put(0x2705, TiRHelper.getResource("drawable.emoji_2705"));
        sEmojisMap.put(0x2734, TiRHelper.getResource("drawable.emoji_2734"));
        sEmojisMap.put(0x1f49f, TiRHelper.getResource("drawable.emoji_1f49f"));
        sEmojisMap.put(0x1f19a, TiRHelper.getResource("drawable.emoji_1f19a"));
        sEmojisMap.put(0x1f4f3, TiRHelper.getResource("drawable.emoji_1f4f3"));
        sEmojisMap.put(0x1f4f4, TiRHelper.getResource("drawable.emoji_1f4f4"));
        sEmojisMap.put(0x1f170, TiRHelper.getResource("drawable.emoji_1f170"));
        sEmojisMap.put(0x1f171, TiRHelper.getResource("drawable.emoji_1f171"));
        sEmojisMap.put(0x1f18e, TiRHelper.getResource("drawable.emoji_1f18e"));
        sEmojisMap.put(0x1f17e, TiRHelper.getResource("drawable.emoji_1f17e"));
        sEmojisMap.put(0x1f4a0, TiRHelper.getResource("drawable.emoji_1f4a0"));
        sEmojisMap.put(0x27bf, TiRHelper.getResource("drawable.emoji_27bf"));
        sEmojisMap.put(0x267b, TiRHelper.getResource("drawable.emoji_267b"));
        sEmojisMap.put(0x2648, TiRHelper.getResource("drawable.emoji_2648"));
        sEmojisMap.put(0x2649, TiRHelper.getResource("drawable.emoji_2649"));
        sEmojisMap.put(0x264a, TiRHelper.getResource("drawable.emoji_264a"));
        sEmojisMap.put(0x264b, TiRHelper.getResource("drawable.emoji_264b"));
        sEmojisMap.put(0x264c, TiRHelper.getResource("drawable.emoji_264c"));
        sEmojisMap.put(0x264d, TiRHelper.getResource("drawable.emoji_264d"));
        sEmojisMap.put(0x264e, TiRHelper.getResource("drawable.emoji_264e"));
        sEmojisMap.put(0x264f, TiRHelper.getResource("drawable.emoji_264f"));
        sEmojisMap.put(0x2650, TiRHelper.getResource("drawable.emoji_2650"));
        sEmojisMap.put(0x2651, TiRHelper.getResource("drawable.emoji_2651"));
        sEmojisMap.put(0x2652, TiRHelper.getResource("drawable.emoji_2652"));
        sEmojisMap.put(0x2653, TiRHelper.getResource("drawable.emoji_2653"));
        sEmojisMap.put(0x26ce, TiRHelper.getResource("drawable.emoji_26ce"));
        sEmojisMap.put(0x1f52f, TiRHelper.getResource("drawable.emoji_1f52f"));
        sEmojisMap.put(0x1f3e7, TiRHelper.getResource("drawable.emoji_1f3e7"));
        sEmojisMap.put(0x1f4b9, TiRHelper.getResource("drawable.emoji_1f4b9"));
        sEmojisMap.put(0x1f4b2, TiRHelper.getResource("drawable.emoji_1f4b2"));
        sEmojisMap.put(0x1f4b1, TiRHelper.getResource("drawable.emoji_1f4b1"));
        sEmojisMap.put(0x00a9, TiRHelper.getResource("drawable.emoji_00a9"));
        sEmojisMap.put(0x00ae, TiRHelper.getResource("drawable.emoji_00ae"));
        sEmojisMap.put(0x2122, TiRHelper.getResource("drawable.emoji_2122"));
        sEmojisMap.put(0x274c, TiRHelper.getResource("drawable.emoji_274c"));
        sEmojisMap.put(0x203c, TiRHelper.getResource("drawable.emoji_203c"));
        sEmojisMap.put(0x2049, TiRHelper.getResource("drawable.emoji_2049"));
        sEmojisMap.put(0x2757, TiRHelper.getResource("drawable.emoji_2757"));
        sEmojisMap.put(0x2753, TiRHelper.getResource("drawable.emoji_2753"));
        sEmojisMap.put(0x2755, TiRHelper.getResource("drawable.emoji_2755"));
        sEmojisMap.put(0x2754, TiRHelper.getResource("drawable.emoji_2754"));
        sEmojisMap.put(0x2b55, TiRHelper.getResource("drawable.emoji_2b55"));
        sEmojisMap.put(0x1f51d, TiRHelper.getResource("drawable.emoji_1f51d"));
        sEmojisMap.put(0x1f51a, TiRHelper.getResource("drawable.emoji_1f51a"));
        sEmojisMap.put(0x1f519, TiRHelper.getResource("drawable.emoji_1f519"));
        sEmojisMap.put(0x1f51b, TiRHelper.getResource("drawable.emoji_1f51b"));
        sEmojisMap.put(0x1f51c, TiRHelper.getResource("drawable.emoji_1f51c"));
        sEmojisMap.put(0x1f503, TiRHelper.getResource("drawable.emoji_1f503"));
        sEmojisMap.put(0x1f55b, TiRHelper.getResource("drawable.emoji_1f55b"));
        sEmojisMap.put(0x1f567, TiRHelper.getResource("drawable.emoji_1f567"));
        sEmojisMap.put(0x1f550, TiRHelper.getResource("drawable.emoji_1f550"));
        sEmojisMap.put(0x1f55c, TiRHelper.getResource("drawable.emoji_1f55c"));
        sEmojisMap.put(0x1f551, TiRHelper.getResource("drawable.emoji_1f551"));
        sEmojisMap.put(0x1f55d, TiRHelper.getResource("drawable.emoji_1f55d"));
        sEmojisMap.put(0x1f552, TiRHelper.getResource("drawable.emoji_1f552"));
        sEmojisMap.put(0x1f55e, TiRHelper.getResource("drawable.emoji_1f55e"));
        sEmojisMap.put(0x1f553, TiRHelper.getResource("drawable.emoji_1f553"));
        sEmojisMap.put(0x1f55f, TiRHelper.getResource("drawable.emoji_1f55f"));
        sEmojisMap.put(0x1f554, TiRHelper.getResource("drawable.emoji_1f554"));
        sEmojisMap.put(0x1f560, TiRHelper.getResource("drawable.emoji_1f560"));
        sEmojisMap.put(0x1f555, TiRHelper.getResource("drawable.emoji_1f555"));
        sEmojisMap.put(0x1f556, TiRHelper.getResource("drawable.emoji_1f556"));
        sEmojisMap.put(0x1f557, TiRHelper.getResource("drawable.emoji_1f557"));
        sEmojisMap.put(0x1f558, TiRHelper.getResource("drawable.emoji_1f558"));
        sEmojisMap.put(0x1f559, TiRHelper.getResource("drawable.emoji_1f559"));
        sEmojisMap.put(0x1f55a, TiRHelper.getResource("drawable.emoji_1f55a"));
        sEmojisMap.put(0x1f561, TiRHelper.getResource("drawable.emoji_1f561"));
        sEmojisMap.put(0x1f562, TiRHelper.getResource("drawable.emoji_1f562"));
        sEmojisMap.put(0x1f563, TiRHelper.getResource("drawable.emoji_1f563"));
        sEmojisMap.put(0x1f564, TiRHelper.getResource("drawable.emoji_1f564"));
        sEmojisMap.put(0x1f565, TiRHelper.getResource("drawable.emoji_1f565"));
        sEmojisMap.put(0x1f566, TiRHelper.getResource("drawable.emoji_1f566"));
        sEmojisMap.put(0x2716, TiRHelper.getResource("drawable.emoji_2716"));
        sEmojisMap.put(0x2795, TiRHelper.getResource("drawable.emoji_2795"));
        sEmojisMap.put(0x2796, TiRHelper.getResource("drawable.emoji_2796"));
        sEmojisMap.put(0x2797, TiRHelper.getResource("drawable.emoji_2797"));
        sEmojisMap.put(0x2660, TiRHelper.getResource("drawable.emoji_2660"));
        sEmojisMap.put(0x2665, TiRHelper.getResource("drawable.emoji_2665"));
        sEmojisMap.put(0x2663, TiRHelper.getResource("drawable.emoji_2663"));
        sEmojisMap.put(0x2666, TiRHelper.getResource("drawable.emoji_2666"));
        sEmojisMap.put(0x1f4ae, TiRHelper.getResource("drawable.emoji_1f4ae"));
        sEmojisMap.put(0x1f4af, TiRHelper.getResource("drawable.emoji_1f4af"));
        sEmojisMap.put(0x2714, TiRHelper.getResource("drawable.emoji_2714"));
        sEmojisMap.put(0x2611, TiRHelper.getResource("drawable.emoji_2611"));
        sEmojisMap.put(0x1f518, TiRHelper.getResource("drawable.emoji_1f518"));
        sEmojisMap.put(0x1f517, TiRHelper.getResource("drawable.emoji_1f517"));
        sEmojisMap.put(0x27b0, TiRHelper.getResource("drawable.emoji_27b0"));
        sEmojisMap.put(0x3030, TiRHelper.getResource("drawable.emoji_3030"));
        sEmojisMap.put(0x303d, TiRHelper.getResource("drawable.emoji_303d"));
        sEmojisMap.put(0x1f531, TiRHelper.getResource("drawable.emoji_1f531"));
        sEmojisMap.put(0x25fc, TiRHelper.getResource("drawable.emoji_25fc"));
        sEmojisMap.put(0x25fb, TiRHelper.getResource("drawable.emoji_25fb"));
        sEmojisMap.put(0x25fe, TiRHelper.getResource("drawable.emoji_25fe"));
        sEmojisMap.put(0x25fd, TiRHelper.getResource("drawable.emoji_25fd"));
        sEmojisMap.put(0x25aa, TiRHelper.getResource("drawable.emoji_25aa"));
        sEmojisMap.put(0x25ab, TiRHelper.getResource("drawable.emoji_25ab"));
        sEmojisMap.put(0x1f53a, TiRHelper.getResource("drawable.emoji_1f53a"));
        sEmojisMap.put(0x1f532, TiRHelper.getResource("drawable.emoji_1f532"));
        sEmojisMap.put(0x1f533, TiRHelper.getResource("drawable.emoji_1f533"));
        sEmojisMap.put(0x26ab, TiRHelper.getResource("drawable.emoji_26ab"));
        sEmojisMap.put(0x26aa, TiRHelper.getResource("drawable.emoji_26aa"));
        sEmojisMap.put(0x1f534, TiRHelper.getResource("drawable.emoji_1f534"));
        sEmojisMap.put(0x1f535, TiRHelper.getResource("drawable.emoji_1f535"));
        sEmojisMap.put(0x1f53b, TiRHelper.getResource("drawable.emoji_1f53b"));
        sEmojisMap.put(0x2b1c, TiRHelper.getResource("drawable.emoji_2b1c"));
        sEmojisMap.put(0x2b1b, TiRHelper.getResource("drawable.emoji_2b1b"));
        sEmojisMap.put(0x1f536, TiRHelper.getResource("drawable.emoji_1f536"));
        sEmojisMap.put(0x1f537, TiRHelper.getResource("drawable.emoji_1f537"));
        sEmojisMap.put(0x1f538, TiRHelper.getResource("drawable.emoji_1f538"));
        sEmojisMap.put(0x1f539, TiRHelper.getResource("drawable.emoji_1f539"));


        sSoftbanksMap.put(0xe001, TiRHelper.getResource("drawable.emoji_1f466"));
        sSoftbanksMap.put(0xe002, TiRHelper.getResource("drawable.emoji_1f467"));
        sSoftbanksMap.put(0xe003, TiRHelper.getResource("drawable.emoji_1f48b"));
        sSoftbanksMap.put(0xe004, TiRHelper.getResource("drawable.emoji_1f468"));
        sSoftbanksMap.put(0xe005, TiRHelper.getResource("drawable.emoji_1f469"));
        sSoftbanksMap.put(0xe006, TiRHelper.getResource("drawable.emoji_1f455"));
        sSoftbanksMap.put(0xe007, TiRHelper.getResource("drawable.emoji_1f45e"));
        sSoftbanksMap.put(0xe008, TiRHelper.getResource("drawable.emoji_1f4f7"));
        sSoftbanksMap.put(0xe009, TiRHelper.getResource("drawable.emoji_1f4de"));
        sSoftbanksMap.put(0xe00a, TiRHelper.getResource("drawable.emoji_1f4f1"));
        sSoftbanksMap.put(0xe00b, TiRHelper.getResource("drawable.emoji_1f4e0"));
        sSoftbanksMap.put(0xe00c, TiRHelper.getResource("drawable.emoji_1f4bb"));
        sSoftbanksMap.put(0xe00d, TiRHelper.getResource("drawable.emoji_1f44a"));
        sSoftbanksMap.put(0xe00e, TiRHelper.getResource("drawable.emoji_1f44d"));
        sSoftbanksMap.put(0xe00f, TiRHelper.getResource("drawable.emoji_261d"));
        sSoftbanksMap.put(0xe010, TiRHelper.getResource("drawable.emoji_270a"));
        sSoftbanksMap.put(0xe011, TiRHelper.getResource("drawable.emoji_270c"));
        sSoftbanksMap.put(0xe012, TiRHelper.getResource("drawable.emoji_1f64b"));
        sSoftbanksMap.put(0xe013, TiRHelper.getResource("drawable.emoji_1f3bf"));
        sSoftbanksMap.put(0xe014, TiRHelper.getResource("drawable.emoji_26f3"));
        sSoftbanksMap.put(0xe015, TiRHelper.getResource("drawable.emoji_1f3be"));
        sSoftbanksMap.put(0xe016, TiRHelper.getResource("drawable.emoji_26be"));
        sSoftbanksMap.put(0xe017, TiRHelper.getResource("drawable.emoji_1f3c4"));
        sSoftbanksMap.put(0xe018, TiRHelper.getResource("drawable.emoji_26bd"));
        sSoftbanksMap.put(0xe019, TiRHelper.getResource("drawable.emoji_1f3a3"));
        sSoftbanksMap.put(0xe01a, TiRHelper.getResource("drawable.emoji_1f434"));
        sSoftbanksMap.put(0xe01b, TiRHelper.getResource("drawable.emoji_1f697"));
        sSoftbanksMap.put(0xe01c, TiRHelper.getResource("drawable.emoji_26f5"));
        sSoftbanksMap.put(0xe01d, TiRHelper.getResource("drawable.emoji_2708"));
        sSoftbanksMap.put(0xe01e, TiRHelper.getResource("drawable.emoji_1f683"));
        sSoftbanksMap.put(0xe01f, TiRHelper.getResource("drawable.emoji_1f685"));
        sSoftbanksMap.put(0xe020, TiRHelper.getResource("drawable.emoji_2753"));
        sSoftbanksMap.put(0xe021, TiRHelper.getResource("drawable.emoji_2757"));
        sSoftbanksMap.put(0xe022, TiRHelper.getResource("drawable.emoji_2764"));
        sSoftbanksMap.put(0xe023, TiRHelper.getResource("drawable.emoji_1f494"));
        sSoftbanksMap.put(0xe024, TiRHelper.getResource("drawable.emoji_1f550"));
        sSoftbanksMap.put(0xe025, TiRHelper.getResource("drawable.emoji_1f551"));
        sSoftbanksMap.put(0xe026, TiRHelper.getResource("drawable.emoji_1f552"));
        sSoftbanksMap.put(0xe027, TiRHelper.getResource("drawable.emoji_1f553"));
        sSoftbanksMap.put(0xe028, TiRHelper.getResource("drawable.emoji_1f554"));
        sSoftbanksMap.put(0xe029, TiRHelper.getResource("drawable.emoji_1f555"));
        sSoftbanksMap.put(0xe02a, TiRHelper.getResource("drawable.emoji_1f556"));
        sSoftbanksMap.put(0xe02b, TiRHelper.getResource("drawable.emoji_1f557"));
        sSoftbanksMap.put(0xe02c, TiRHelper.getResource("drawable.emoji_1f558"));
        sSoftbanksMap.put(0xe02d, TiRHelper.getResource("drawable.emoji_1f559"));
        sSoftbanksMap.put(0xe02e, TiRHelper.getResource("drawable.emoji_1f55a"));
        sSoftbanksMap.put(0xe02f, TiRHelper.getResource("drawable.emoji_1f55b"));
        sSoftbanksMap.put(0xe030, TiRHelper.getResource("drawable.emoji_1f338"));
        sSoftbanksMap.put(0xe031, TiRHelper.getResource("drawable.emoji_1f531"));
        sSoftbanksMap.put(0xe032, TiRHelper.getResource("drawable.emoji_1f339"));
        sSoftbanksMap.put(0xe033, TiRHelper.getResource("drawable.emoji_1f384"));
        sSoftbanksMap.put(0xe034, TiRHelper.getResource("drawable.emoji_1f48d"));
        sSoftbanksMap.put(0xe035, TiRHelper.getResource("drawable.emoji_1f48e"));
        sSoftbanksMap.put(0xe036, TiRHelper.getResource("drawable.emoji_1f3e0"));
        sSoftbanksMap.put(0xe037, TiRHelper.getResource("drawable.emoji_26ea"));
        sSoftbanksMap.put(0xe038, TiRHelper.getResource("drawable.emoji_1f3e2"));
        sSoftbanksMap.put(0xe039, TiRHelper.getResource("drawable.emoji_1f689"));
        sSoftbanksMap.put(0xe03a, TiRHelper.getResource("drawable.emoji_26fd"));
        sSoftbanksMap.put(0xe03b, TiRHelper.getResource("drawable.emoji_1f5fb"));
        sSoftbanksMap.put(0xe03c, TiRHelper.getResource("drawable.emoji_1f3a4"));
        sSoftbanksMap.put(0xe03d, TiRHelper.getResource("drawable.emoji_1f3a5"));
        sSoftbanksMap.put(0xe03e, TiRHelper.getResource("drawable.emoji_1f3b5"));
        sSoftbanksMap.put(0xe03f, TiRHelper.getResource("drawable.emoji_1f511"));
        sSoftbanksMap.put(0xe040, TiRHelper.getResource("drawable.emoji_1f3b7"));
        sSoftbanksMap.put(0xe041, TiRHelper.getResource("drawable.emoji_1f3b8"));
        sSoftbanksMap.put(0xe042, TiRHelper.getResource("drawable.emoji_1f3ba"));
        sSoftbanksMap.put(0xe043, TiRHelper.getResource("drawable.emoji_1f374"));
        sSoftbanksMap.put(0xe044, TiRHelper.getResource("drawable.emoji_1f377"));
        sSoftbanksMap.put(0xe045, TiRHelper.getResource("drawable.emoji_2615"));
        sSoftbanksMap.put(0xe046, TiRHelper.getResource("drawable.emoji_1f370"));
        sSoftbanksMap.put(0xe047, TiRHelper.getResource("drawable.emoji_1f37a"));
        sSoftbanksMap.put(0xe048, TiRHelper.getResource("drawable.emoji_26c4"));
        sSoftbanksMap.put(0xe049, TiRHelper.getResource("drawable.emoji_2601"));
        sSoftbanksMap.put(0xe04a, TiRHelper.getResource("drawable.emoji_2600"));
        sSoftbanksMap.put(0xe04b, TiRHelper.getResource("drawable.emoji_2614"));
        sSoftbanksMap.put(0xe04c, TiRHelper.getResource("drawable.emoji_1f313"));
        sSoftbanksMap.put(0xe04d, TiRHelper.getResource("drawable.emoji_1f304"));
        sSoftbanksMap.put(0xe04e, TiRHelper.getResource("drawable.emoji_1f47c"));
        sSoftbanksMap.put(0xe04f, TiRHelper.getResource("drawable.emoji_1f431"));
        sSoftbanksMap.put(0xe050, TiRHelper.getResource("drawable.emoji_1f42f"));
        sSoftbanksMap.put(0xe051, TiRHelper.getResource("drawable.emoji_1f43b"));
        sSoftbanksMap.put(0xe052, TiRHelper.getResource("drawable.emoji_1f429"));
        sSoftbanksMap.put(0xe053, TiRHelper.getResource("drawable.emoji_1f42d"));
        sSoftbanksMap.put(0xe054, TiRHelper.getResource("drawable.emoji_1f433"));
        sSoftbanksMap.put(0xe055, TiRHelper.getResource("drawable.emoji_1f427"));
        sSoftbanksMap.put(0xe056, TiRHelper.getResource("drawable.emoji_1f60a"));
        sSoftbanksMap.put(0xe057, TiRHelper.getResource("drawable.emoji_1f603"));
        sSoftbanksMap.put(0xe058, TiRHelper.getResource("drawable.emoji_1f61e"));
        sSoftbanksMap.put(0xe059, TiRHelper.getResource("drawable.emoji_1f620"));
        sSoftbanksMap.put(0xe05a, TiRHelper.getResource("drawable.emoji_1f4a9"));
        sSoftbanksMap.put(0xe101, TiRHelper.getResource("drawable.emoji_1f4ea"));
        sSoftbanksMap.put(0xe102, TiRHelper.getResource("drawable.emoji_1f4ee"));
        sSoftbanksMap.put(0xe103, TiRHelper.getResource("drawable.emoji_1f4e7"));
        sSoftbanksMap.put(0xe104, TiRHelper.getResource("drawable.emoji_1f4f2"));
        sSoftbanksMap.put(0xe105, TiRHelper.getResource("drawable.emoji_1f61c"));
        sSoftbanksMap.put(0xe106, TiRHelper.getResource("drawable.emoji_1f60d"));
        sSoftbanksMap.put(0xe107, TiRHelper.getResource("drawable.emoji_1f631"));
        sSoftbanksMap.put(0xe108, TiRHelper.getResource("drawable.emoji_1f613"));
        sSoftbanksMap.put(0xe109, TiRHelper.getResource("drawable.emoji_1f435"));
        sSoftbanksMap.put(0xe10a, TiRHelper.getResource("drawable.emoji_1f419"));
        sSoftbanksMap.put(0xe10b, TiRHelper.getResource("drawable.emoji_1f437"));
        sSoftbanksMap.put(0xe10c, TiRHelper.getResource("drawable.emoji_1f47d"));
        sSoftbanksMap.put(0xe10d, TiRHelper.getResource("drawable.emoji_1f680"));
        sSoftbanksMap.put(0xe10e, TiRHelper.getResource("drawable.emoji_1f451"));
        sSoftbanksMap.put(0xe10f, TiRHelper.getResource("drawable.emoji_1f4a1"));
        sSoftbanksMap.put(0xe110, TiRHelper.getResource("drawable.emoji_1f331"));
        sSoftbanksMap.put(0xe111, TiRHelper.getResource("drawable.emoji_1f48f"));
        sSoftbanksMap.put(0xe112, TiRHelper.getResource("drawable.emoji_1f381"));
        sSoftbanksMap.put(0xe113, TiRHelper.getResource("drawable.emoji_1f52b"));
        sSoftbanksMap.put(0xe114, TiRHelper.getResource("drawable.emoji_1f50d"));
        sSoftbanksMap.put(0xe115, TiRHelper.getResource("drawable.emoji_1f3c3"));
        sSoftbanksMap.put(0xe116, TiRHelper.getResource("drawable.emoji_1f528"));
        sSoftbanksMap.put(0xe117, TiRHelper.getResource("drawable.emoji_1f386"));
        sSoftbanksMap.put(0xe118, TiRHelper.getResource("drawable.emoji_1f341"));
        sSoftbanksMap.put(0xe119, TiRHelper.getResource("drawable.emoji_1f342"));
        sSoftbanksMap.put(0xe11a, TiRHelper.getResource("drawable.emoji_1f47f"));
        sSoftbanksMap.put(0xe11b, TiRHelper.getResource("drawable.emoji_1f47b"));
        sSoftbanksMap.put(0xe11c, TiRHelper.getResource("drawable.emoji_1f480"));
        sSoftbanksMap.put(0xe11d, TiRHelper.getResource("drawable.emoji_1f525"));
        sSoftbanksMap.put(0xe11e, TiRHelper.getResource("drawable.emoji_1f4bc"));
        sSoftbanksMap.put(0xe11f, TiRHelper.getResource("drawable.emoji_1f4ba"));
        sSoftbanksMap.put(0xe120, TiRHelper.getResource("drawable.emoji_1f354"));
        sSoftbanksMap.put(0xe121, TiRHelper.getResource("drawable.emoji_26f2"));
        sSoftbanksMap.put(0xe122, TiRHelper.getResource("drawable.emoji_26fa"));
        sSoftbanksMap.put(0xe123, TiRHelper.getResource("drawable.emoji_2668"));
        sSoftbanksMap.put(0xe124, TiRHelper.getResource("drawable.emoji_1f3a1"));
        sSoftbanksMap.put(0xe125, TiRHelper.getResource("drawable.emoji_1f3ab"));
        sSoftbanksMap.put(0xe126, TiRHelper.getResource("drawable.emoji_1f4bf"));
        sSoftbanksMap.put(0xe127, TiRHelper.getResource("drawable.emoji_1f4c0"));
        sSoftbanksMap.put(0xe128, TiRHelper.getResource("drawable.emoji_1f4fb"));
        sSoftbanksMap.put(0xe129, TiRHelper.getResource("drawable.emoji_1f4fc"));
        sSoftbanksMap.put(0xe12a, TiRHelper.getResource("drawable.emoji_1f4fa"));
        sSoftbanksMap.put(0xe12b, TiRHelper.getResource("drawable.emoji_1f47e"));
        sSoftbanksMap.put(0xe12c, TiRHelper.getResource("drawable.emoji_303d"));
        sSoftbanksMap.put(0xe12d, TiRHelper.getResource("drawable.emoji_1f004"));
        sSoftbanksMap.put(0xe12e, TiRHelper.getResource("drawable.emoji_1f19a"));
        sSoftbanksMap.put(0xe12f, TiRHelper.getResource("drawable.emoji_1f4b0"));
        sSoftbanksMap.put(0xe130, TiRHelper.getResource("drawable.emoji_1f3af"));
        sSoftbanksMap.put(0xe131, TiRHelper.getResource("drawable.emoji_1f3c6"));
        sSoftbanksMap.put(0xe132, TiRHelper.getResource("drawable.emoji_1f3c1"));
        sSoftbanksMap.put(0xe133, TiRHelper.getResource("drawable.emoji_1f3b0"));
        sSoftbanksMap.put(0xe134, TiRHelper.getResource("drawable.emoji_1f40e"));
        sSoftbanksMap.put(0xe135, TiRHelper.getResource("drawable.emoji_1f6a4"));
        sSoftbanksMap.put(0xe136, TiRHelper.getResource("drawable.emoji_1f6b2"));
        sSoftbanksMap.put(0xe137, TiRHelper.getResource("drawable.emoji_1f6a7"));
        sSoftbanksMap.put(0xe138, TiRHelper.getResource("drawable.emoji_1f6b9"));
        sSoftbanksMap.put(0xe139, TiRHelper.getResource("drawable.emoji_1f6ba"));
        sSoftbanksMap.put(0xe13a, TiRHelper.getResource("drawable.emoji_1f6bc"));
        sSoftbanksMap.put(0xe13b, TiRHelper.getResource("drawable.emoji_1f489"));
        sSoftbanksMap.put(0xe13c, TiRHelper.getResource("drawable.emoji_1f4a4"));
        sSoftbanksMap.put(0xe13d, TiRHelper.getResource("drawable.emoji_26a1"));
        sSoftbanksMap.put(0xe13e, TiRHelper.getResource("drawable.emoji_1f460"));
        sSoftbanksMap.put(0xe13f, TiRHelper.getResource("drawable.emoji_1f6c0"));
        sSoftbanksMap.put(0xe140, TiRHelper.getResource("drawable.emoji_1f6bd"));
        sSoftbanksMap.put(0xe141, TiRHelper.getResource("drawable.emoji_1f50a"));
        sSoftbanksMap.put(0xe142, TiRHelper.getResource("drawable.emoji_1f4e2"));
        sSoftbanksMap.put(0xe143, TiRHelper.getResource("drawable.emoji_1f38c"));
        sSoftbanksMap.put(0xe144, TiRHelper.getResource("drawable.emoji_1f50f"));
        sSoftbanksMap.put(0xe145, TiRHelper.getResource("drawable.emoji_1f513"));
        sSoftbanksMap.put(0xe146, TiRHelper.getResource("drawable.emoji_1f306"));
        sSoftbanksMap.put(0xe147, TiRHelper.getResource("drawable.emoji_1f373"));
        sSoftbanksMap.put(0xe148, TiRHelper.getResource("drawable.emoji_1f4c7"));
        sSoftbanksMap.put(0xe149, TiRHelper.getResource("drawable.emoji_1f4b1"));
        sSoftbanksMap.put(0xe14a, TiRHelper.getResource("drawable.emoji_1f4b9"));
        sSoftbanksMap.put(0xe14b, TiRHelper.getResource("drawable.emoji_1f4e1"));
        sSoftbanksMap.put(0xe14c, TiRHelper.getResource("drawable.emoji_1f4aa"));
        sSoftbanksMap.put(0xe14d, TiRHelper.getResource("drawable.emoji_1f3e6"));
        sSoftbanksMap.put(0xe14e, TiRHelper.getResource("drawable.emoji_1f6a5"));
        sSoftbanksMap.put(0xe14f, TiRHelper.getResource("drawable.emoji_1f17f"));
        sSoftbanksMap.put(0xe150, TiRHelper.getResource("drawable.emoji_1f68f"));
        sSoftbanksMap.put(0xe151, TiRHelper.getResource("drawable.emoji_1f6bb"));
        sSoftbanksMap.put(0xe152, TiRHelper.getResource("drawable.emoji_1f46e"));
        sSoftbanksMap.put(0xe153, TiRHelper.getResource("drawable.emoji_1f3e3"));
        sSoftbanksMap.put(0xe154, TiRHelper.getResource("drawable.emoji_1f3e7"));
        sSoftbanksMap.put(0xe155, TiRHelper.getResource("drawable.emoji_1f3e5"));
        sSoftbanksMap.put(0xe156, TiRHelper.getResource("drawable.emoji_1f3ea"));
        sSoftbanksMap.put(0xe157, TiRHelper.getResource("drawable.emoji_1f3eb"));
        sSoftbanksMap.put(0xe158, TiRHelper.getResource("drawable.emoji_1f3e8"));
        sSoftbanksMap.put(0xe159, TiRHelper.getResource("drawable.emoji_1f68c"));
        sSoftbanksMap.put(0xe15a, TiRHelper.getResource("drawable.emoji_1f695"));
        sSoftbanksMap.put(0xe201, TiRHelper.getResource("drawable.emoji_1f6b6"));
        sSoftbanksMap.put(0xe202, TiRHelper.getResource("drawable.emoji_1f6a2"));
        sSoftbanksMap.put(0xe203, TiRHelper.getResource("drawable.emoji_1f201"));
        sSoftbanksMap.put(0xe204, TiRHelper.getResource("drawable.emoji_1f49f"));
        sSoftbanksMap.put(0xe205, TiRHelper.getResource("drawable.emoji_2734"));
        sSoftbanksMap.put(0xe206, TiRHelper.getResource("drawable.emoji_2733"));
        sSoftbanksMap.put(0xe207, TiRHelper.getResource("drawable.emoji_1f51e"));
        sSoftbanksMap.put(0xe208, TiRHelper.getResource("drawable.emoji_1f6ad"));
        sSoftbanksMap.put(0xe209, TiRHelper.getResource("drawable.emoji_1f530"));
        sSoftbanksMap.put(0xe20a, TiRHelper.getResource("drawable.emoji_267f"));
        sSoftbanksMap.put(0xe20b, TiRHelper.getResource("drawable.emoji_1f4f6"));
        sSoftbanksMap.put(0xe20c, TiRHelper.getResource("drawable.emoji_2665"));
        sSoftbanksMap.put(0xe20d, TiRHelper.getResource("drawable.emoji_2666"));
        sSoftbanksMap.put(0xe20e, TiRHelper.getResource("drawable.emoji_2660"));
        sSoftbanksMap.put(0xe20f, TiRHelper.getResource("drawable.emoji_2663"));
        sSoftbanksMap.put(0xe210, TiRHelper.getResource("drawable.emoji_0023"));
        sSoftbanksMap.put(0xe211, TiRHelper.getResource("drawable.emoji_27bf"));
        sSoftbanksMap.put(0xe212, TiRHelper.getResource("drawable.emoji_1f195"));
        sSoftbanksMap.put(0xe213, TiRHelper.getResource("drawable.emoji_1f199"));
        sSoftbanksMap.put(0xe214, TiRHelper.getResource("drawable.emoji_1f192"));
        sSoftbanksMap.put(0xe215, TiRHelper.getResource("drawable.emoji_1f236"));
        sSoftbanksMap.put(0xe216, TiRHelper.getResource("drawable.emoji_1f21a"));
        sSoftbanksMap.put(0xe217, TiRHelper.getResource("drawable.emoji_1f237"));
        sSoftbanksMap.put(0xe218, TiRHelper.getResource("drawable.emoji_1f238"));
        sSoftbanksMap.put(0xe219, TiRHelper.getResource("drawable.emoji_1f534"));
        sSoftbanksMap.put(0xe21a, TiRHelper.getResource("drawable.emoji_1f532"));
        sSoftbanksMap.put(0xe21b, TiRHelper.getResource("drawable.emoji_1f533"));
        sSoftbanksMap.put(0xe21c, TiRHelper.getResource("drawable.emoji_0031"));
        sSoftbanksMap.put(0xe21d, TiRHelper.getResource("drawable.emoji_0032"));
        sSoftbanksMap.put(0xe21e, TiRHelper.getResource("drawable.emoji_0033"));
        sSoftbanksMap.put(0xe21f, TiRHelper.getResource("drawable.emoji_0034"));
        sSoftbanksMap.put(0xe220, TiRHelper.getResource("drawable.emoji_0035"));
        sSoftbanksMap.put(0xe221, TiRHelper.getResource("drawable.emoji_0036"));
        sSoftbanksMap.put(0xe222, TiRHelper.getResource("drawable.emoji_0037"));
        sSoftbanksMap.put(0xe223, TiRHelper.getResource("drawable.emoji_0038"));
        sSoftbanksMap.put(0xe224, TiRHelper.getResource("drawable.emoji_0039"));
        sSoftbanksMap.put(0xe225, TiRHelper.getResource("drawable.emoji_0030"));
        sSoftbanksMap.put(0xe226, TiRHelper.getResource("drawable.emoji_1f250"));
        sSoftbanksMap.put(0xe227, TiRHelper.getResource("drawable.emoji_1f239"));
        sSoftbanksMap.put(0xe228, TiRHelper.getResource("drawable.emoji_1f202"));
        sSoftbanksMap.put(0xe229, TiRHelper.getResource("drawable.emoji_1f194"));
        sSoftbanksMap.put(0xe22a, TiRHelper.getResource("drawable.emoji_1f235"));
        sSoftbanksMap.put(0xe22b, TiRHelper.getResource("drawable.emoji_1f233"));
        sSoftbanksMap.put(0xe22c, TiRHelper.getResource("drawable.emoji_1f22f"));
        sSoftbanksMap.put(0xe22d, TiRHelper.getResource("drawable.emoji_1f23a"));
        sSoftbanksMap.put(0xe22e, TiRHelper.getResource("drawable.emoji_1f446"));
        sSoftbanksMap.put(0xe22f, TiRHelper.getResource("drawable.emoji_1f447"));
        sSoftbanksMap.put(0xe230, TiRHelper.getResource("drawable.emoji_1f448"));
        sSoftbanksMap.put(0xe231, TiRHelper.getResource("drawable.emoji_1f449"));
        sSoftbanksMap.put(0xe232, TiRHelper.getResource("drawable.emoji_2b06"));
        sSoftbanksMap.put(0xe233, TiRHelper.getResource("drawable.emoji_2b07"));
        sSoftbanksMap.put(0xe234, TiRHelper.getResource("drawable.emoji_27a1"));
        sSoftbanksMap.put(0xe235, TiRHelper.getResource("drawable.emoji_1f519"));
        sSoftbanksMap.put(0xe236, TiRHelper.getResource("drawable.emoji_2197"));
        sSoftbanksMap.put(0xe237, TiRHelper.getResource("drawable.emoji_2196"));
        sSoftbanksMap.put(0xe238, TiRHelper.getResource("drawable.emoji_2198"));
        sSoftbanksMap.put(0xe239, TiRHelper.getResource("drawable.emoji_2199"));
        sSoftbanksMap.put(0xe23a, TiRHelper.getResource("drawable.emoji_25b6"));
        sSoftbanksMap.put(0xe23b, TiRHelper.getResource("drawable.emoji_25c0"));
        sSoftbanksMap.put(0xe23c, TiRHelper.getResource("drawable.emoji_23e9"));
        sSoftbanksMap.put(0xe23d, TiRHelper.getResource("drawable.emoji_23ea"));
        sSoftbanksMap.put(0xe23e, TiRHelper.getResource("drawable.emoji_1f52e"));
        sSoftbanksMap.put(0xe23f, TiRHelper.getResource("drawable.emoji_2648"));
        sSoftbanksMap.put(0xe240, TiRHelper.getResource("drawable.emoji_2649"));
        sSoftbanksMap.put(0xe241, TiRHelper.getResource("drawable.emoji_264a"));
        sSoftbanksMap.put(0xe242, TiRHelper.getResource("drawable.emoji_264b"));
        sSoftbanksMap.put(0xe243, TiRHelper.getResource("drawable.emoji_264c"));
        sSoftbanksMap.put(0xe244, TiRHelper.getResource("drawable.emoji_264d"));
        sSoftbanksMap.put(0xe245, TiRHelper.getResource("drawable.emoji_264e"));
        sSoftbanksMap.put(0xe246, TiRHelper.getResource("drawable.emoji_264f"));
        sSoftbanksMap.put(0xe247, TiRHelper.getResource("drawable.emoji_2650"));
        sSoftbanksMap.put(0xe248, TiRHelper.getResource("drawable.emoji_2651"));
        sSoftbanksMap.put(0xe249, TiRHelper.getResource("drawable.emoji_2652"));
        sSoftbanksMap.put(0xe24a, TiRHelper.getResource("drawable.emoji_2653"));
        sSoftbanksMap.put(0xe24b, TiRHelper.getResource("drawable.emoji_26ce"));
        sSoftbanksMap.put(0xe24c, TiRHelper.getResource("drawable.emoji_1f51d"));
        sSoftbanksMap.put(0xe24d, TiRHelper.getResource("drawable.emoji_1f197"));
        sSoftbanksMap.put(0xe24e, TiRHelper.getResource("drawable.emoji_00a9"));
        sSoftbanksMap.put(0xe24f, TiRHelper.getResource("drawable.emoji_00ae"));
        sSoftbanksMap.put(0xe250, TiRHelper.getResource("drawable.emoji_1f4f3"));
        sSoftbanksMap.put(0xe251, TiRHelper.getResource("drawable.emoji_1f4f4"));
        sSoftbanksMap.put(0xe252, TiRHelper.getResource("drawable.emoji_26a0"));
        sSoftbanksMap.put(0xe253, TiRHelper.getResource("drawable.emoji_1f481"));
        sSoftbanksMap.put(0xe301, TiRHelper.getResource("drawable.emoji_1f4c3"));
        sSoftbanksMap.put(0xe302, TiRHelper.getResource("drawable.emoji_1f454"));
        sSoftbanksMap.put(0xe303, TiRHelper.getResource("drawable.emoji_1f33a"));
        sSoftbanksMap.put(0xe304, TiRHelper.getResource("drawable.emoji_1f337"));
        sSoftbanksMap.put(0xe305, TiRHelper.getResource("drawable.emoji_1f33b"));
        sSoftbanksMap.put(0xe306, TiRHelper.getResource("drawable.emoji_1f490"));
        sSoftbanksMap.put(0xe307, TiRHelper.getResource("drawable.emoji_1f334"));
        sSoftbanksMap.put(0xe308, TiRHelper.getResource("drawable.emoji_1f335"));
        sSoftbanksMap.put(0xe309, TiRHelper.getResource("drawable.emoji_1f6be"));
        sSoftbanksMap.put(0xe30a, TiRHelper.getResource("drawable.emoji_1f3a7"));
        sSoftbanksMap.put(0xe30b, TiRHelper.getResource("drawable.emoji_1f376"));
        sSoftbanksMap.put(0xe30c, TiRHelper.getResource("drawable.emoji_1f37b"));
        sSoftbanksMap.put(0xe30d, TiRHelper.getResource("drawable.emoji_3297"));
        sSoftbanksMap.put(0xe30e, TiRHelper.getResource("drawable.emoji_1f6ac"));
        sSoftbanksMap.put(0xe30f, TiRHelper.getResource("drawable.emoji_1f48a"));
        sSoftbanksMap.put(0xe310, TiRHelper.getResource("drawable.emoji_1f388"));
        sSoftbanksMap.put(0xe311, TiRHelper.getResource("drawable.emoji_1f4a3"));
        sSoftbanksMap.put(0xe312, TiRHelper.getResource("drawable.emoji_1f389"));
        sSoftbanksMap.put(0xe313, TiRHelper.getResource("drawable.emoji_2702"));
        sSoftbanksMap.put(0xe314, TiRHelper.getResource("drawable.emoji_1f380"));
        sSoftbanksMap.put(0xe315, TiRHelper.getResource("drawable.emoji_3299"));
        sSoftbanksMap.put(0xe316, TiRHelper.getResource("drawable.emoji_1f4bd"));
        sSoftbanksMap.put(0xe317, TiRHelper.getResource("drawable.emoji_1f4e3"));
        sSoftbanksMap.put(0xe318, TiRHelper.getResource("drawable.emoji_1f452"));
        sSoftbanksMap.put(0xe319, TiRHelper.getResource("drawable.emoji_1f457"));
        sSoftbanksMap.put(0xe31a, TiRHelper.getResource("drawable.emoji_1f461"));
        sSoftbanksMap.put(0xe31b, TiRHelper.getResource("drawable.emoji_1f462"));
        sSoftbanksMap.put(0xe31c, TiRHelper.getResource("drawable.emoji_1f484"));
        sSoftbanksMap.put(0xe31d, TiRHelper.getResource("drawable.emoji_1f485"));
        sSoftbanksMap.put(0xe31e, TiRHelper.getResource("drawable.emoji_1f486"));
        sSoftbanksMap.put(0xe31f, TiRHelper.getResource("drawable.emoji_1f487"));
        sSoftbanksMap.put(0xe320, TiRHelper.getResource("drawable.emoji_1f488"));
        sSoftbanksMap.put(0xe321, TiRHelper.getResource("drawable.emoji_1f458"));
        sSoftbanksMap.put(0xe322, TiRHelper.getResource("drawable.emoji_1f459"));
        sSoftbanksMap.put(0xe323, TiRHelper.getResource("drawable.emoji_1f45c"));
        sSoftbanksMap.put(0xe324, TiRHelper.getResource("drawable.emoji_1f3ac"));
        sSoftbanksMap.put(0xe325, TiRHelper.getResource("drawable.emoji_1f514"));
        sSoftbanksMap.put(0xe326, TiRHelper.getResource("drawable.emoji_1f3b6"));
        sSoftbanksMap.put(0xe327, TiRHelper.getResource("drawable.emoji_1f493"));
        sSoftbanksMap.put(0xe328, TiRHelper.getResource("drawable.emoji_1f48c"));
        sSoftbanksMap.put(0xe329, TiRHelper.getResource("drawable.emoji_1f498"));
        sSoftbanksMap.put(0xe32a, TiRHelper.getResource("drawable.emoji_1f499"));
        sSoftbanksMap.put(0xe32b, TiRHelper.getResource("drawable.emoji_1f49a"));
        sSoftbanksMap.put(0xe32c, TiRHelper.getResource("drawable.emoji_1f49b"));
        sSoftbanksMap.put(0xe32d, TiRHelper.getResource("drawable.emoji_1f49c"));
        sSoftbanksMap.put(0xe32e, TiRHelper.getResource("drawable.emoji_2728"));
        sSoftbanksMap.put(0xe32f, TiRHelper.getResource("drawable.emoji_2b50"));
        sSoftbanksMap.put(0xe330, TiRHelper.getResource("drawable.emoji_1f4a8"));
        sSoftbanksMap.put(0xe331, TiRHelper.getResource("drawable.emoji_1f4a6"));
        sSoftbanksMap.put(0xe332, TiRHelper.getResource("drawable.emoji_2b55"));
        sSoftbanksMap.put(0xe333, TiRHelper.getResource("drawable.emoji_2716"));
        sSoftbanksMap.put(0xe334, TiRHelper.getResource("drawable.emoji_1f4a2"));
        sSoftbanksMap.put(0xe335, TiRHelper.getResource("drawable.emoji_1f31f"));
        sSoftbanksMap.put(0xe336, TiRHelper.getResource("drawable.emoji_2754"));
        sSoftbanksMap.put(0xe337, TiRHelper.getResource("drawable.emoji_2755"));
        sSoftbanksMap.put(0xe338, TiRHelper.getResource("drawable.emoji_1f375"));
        sSoftbanksMap.put(0xe339, TiRHelper.getResource("drawable.emoji_1f35e"));
        sSoftbanksMap.put(0xe33a, TiRHelper.getResource("drawable.emoji_1f366"));
        sSoftbanksMap.put(0xe33b, TiRHelper.getResource("drawable.emoji_1f35f"));
        sSoftbanksMap.put(0xe33c, TiRHelper.getResource("drawable.emoji_1f361"));
        sSoftbanksMap.put(0xe33d, TiRHelper.getResource("drawable.emoji_1f358"));
        sSoftbanksMap.put(0xe33e, TiRHelper.getResource("drawable.emoji_1f35a"));
        sSoftbanksMap.put(0xe33f, TiRHelper.getResource("drawable.emoji_1f35d"));
        sSoftbanksMap.put(0xe340, TiRHelper.getResource("drawable.emoji_1f35c"));
        sSoftbanksMap.put(0xe341, TiRHelper.getResource("drawable.emoji_1f35b"));
        sSoftbanksMap.put(0xe342, TiRHelper.getResource("drawable.emoji_1f359"));
        sSoftbanksMap.put(0xe343, TiRHelper.getResource("drawable.emoji_1f362"));
        sSoftbanksMap.put(0xe344, TiRHelper.getResource("drawable.emoji_1f363"));
        sSoftbanksMap.put(0xe345, TiRHelper.getResource("drawable.emoji_1f34e"));
        sSoftbanksMap.put(0xe346, TiRHelper.getResource("drawable.emoji_1f34a"));
        sSoftbanksMap.put(0xe347, TiRHelper.getResource("drawable.emoji_1f353"));
        sSoftbanksMap.put(0xe348, TiRHelper.getResource("drawable.emoji_1f349"));
        sSoftbanksMap.put(0xe349, TiRHelper.getResource("drawable.emoji_1f345"));
        sSoftbanksMap.put(0xe34a, TiRHelper.getResource("drawable.emoji_1f346"));
        sSoftbanksMap.put(0xe34b, TiRHelper.getResource("drawable.emoji_1f382"));
        sSoftbanksMap.put(0xe34c, TiRHelper.getResource("drawable.emoji_1f371"));
        sSoftbanksMap.put(0xe34d, TiRHelper.getResource("drawable.emoji_1f372"));
        sSoftbanksMap.put(0xe401, TiRHelper.getResource("drawable.emoji_1f625"));
        sSoftbanksMap.put(0xe402, TiRHelper.getResource("drawable.emoji_1f60f"));
        sSoftbanksMap.put(0xe403, TiRHelper.getResource("drawable.emoji_1f614"));
        sSoftbanksMap.put(0xe404, TiRHelper.getResource("drawable.emoji_1f601"));
        sSoftbanksMap.put(0xe405, TiRHelper.getResource("drawable.emoji_1f609"));
        sSoftbanksMap.put(0xe406, TiRHelper.getResource("drawable.emoji_1f623"));
        sSoftbanksMap.put(0xe407, TiRHelper.getResource("drawable.emoji_1f616"));
        sSoftbanksMap.put(0xe408, TiRHelper.getResource("drawable.emoji_1f62a"));
        sSoftbanksMap.put(0xe409, TiRHelper.getResource("drawable.emoji_1f445"));
        sSoftbanksMap.put(0xe40a, TiRHelper.getResource("drawable.emoji_1f606"));
        sSoftbanksMap.put(0xe40b, TiRHelper.getResource("drawable.emoji_1f628"));
        sSoftbanksMap.put(0xe40c, TiRHelper.getResource("drawable.emoji_1f637"));
        sSoftbanksMap.put(0xe40d, TiRHelper.getResource("drawable.emoji_1f633"));
        sSoftbanksMap.put(0xe40e, TiRHelper.getResource("drawable.emoji_1f612"));
        sSoftbanksMap.put(0xe40f, TiRHelper.getResource("drawable.emoji_1f630"));
        sSoftbanksMap.put(0xe410, TiRHelper.getResource("drawable.emoji_1f632"));
        sSoftbanksMap.put(0xe411, TiRHelper.getResource("drawable.emoji_1f62d"));
        sSoftbanksMap.put(0xe412, TiRHelper.getResource("drawable.emoji_1f602"));
        sSoftbanksMap.put(0xe413, TiRHelper.getResource("drawable.emoji_1f622"));
        sSoftbanksMap.put(0xe414, TiRHelper.getResource("drawable.emoji_263a"));
        sSoftbanksMap.put(0xe415, TiRHelper.getResource("drawable.emoji_1f605"));
        sSoftbanksMap.put(0xe416, TiRHelper.getResource("drawable.emoji_1f621"));
        sSoftbanksMap.put(0xe417, TiRHelper.getResource("drawable.emoji_1f61a"));
        sSoftbanksMap.put(0xe418, TiRHelper.getResource("drawable.emoji_1f618"));
        sSoftbanksMap.put(0xe419, TiRHelper.getResource("drawable.emoji_1f440"));
        sSoftbanksMap.put(0xe41a, TiRHelper.getResource("drawable.emoji_1f443"));
        sSoftbanksMap.put(0xe41b, TiRHelper.getResource("drawable.emoji_1f442"));
        sSoftbanksMap.put(0xe41c, TiRHelper.getResource("drawable.emoji_1f444"));
        sSoftbanksMap.put(0xe41d, TiRHelper.getResource("drawable.emoji_1f64f"));
        sSoftbanksMap.put(0xe41e, TiRHelper.getResource("drawable.emoji_1f44b"));
        sSoftbanksMap.put(0xe41f, TiRHelper.getResource("drawable.emoji_1f44f"));
        sSoftbanksMap.put(0xe420, TiRHelper.getResource("drawable.emoji_1f44c"));
        sSoftbanksMap.put(0xe421, TiRHelper.getResource("drawable.emoji_1f44e"));
        sSoftbanksMap.put(0xe422, TiRHelper.getResource("drawable.emoji_1f450"));
        sSoftbanksMap.put(0xe423, TiRHelper.getResource("drawable.emoji_1f645"));
        sSoftbanksMap.put(0xe424, TiRHelper.getResource("drawable.emoji_1f646"));
        sSoftbanksMap.put(0xe425, TiRHelper.getResource("drawable.emoji_1f491"));
        sSoftbanksMap.put(0xe426, TiRHelper.getResource("drawable.emoji_1f647"));
        sSoftbanksMap.put(0xe427, TiRHelper.getResource("drawable.emoji_1f64c"));
        sSoftbanksMap.put(0xe428, TiRHelper.getResource("drawable.emoji_1f46b"));
        sSoftbanksMap.put(0xe429, TiRHelper.getResource("drawable.emoji_1f46f"));
        sSoftbanksMap.put(0xe42a, TiRHelper.getResource("drawable.emoji_1f3c0"));
        sSoftbanksMap.put(0xe42b, TiRHelper.getResource("drawable.emoji_1f3c8"));
        sSoftbanksMap.put(0xe42c, TiRHelper.getResource("drawable.emoji_1f3b1"));
        sSoftbanksMap.put(0xe42d, TiRHelper.getResource("drawable.emoji_1f3ca"));
        sSoftbanksMap.put(0xe42e, TiRHelper.getResource("drawable.emoji_1f699"));
        sSoftbanksMap.put(0xe42f, TiRHelper.getResource("drawable.emoji_1f69a"));
        sSoftbanksMap.put(0xe430, TiRHelper.getResource("drawable.emoji_1f692"));
        sSoftbanksMap.put(0xe431, TiRHelper.getResource("drawable.emoji_1f691"));
        sSoftbanksMap.put(0xe432, TiRHelper.getResource("drawable.emoji_1f693"));
        sSoftbanksMap.put(0xe433, TiRHelper.getResource("drawable.emoji_1f3a2"));
        sSoftbanksMap.put(0xe434, TiRHelper.getResource("drawable.emoji_1f687"));
        sSoftbanksMap.put(0xe435, TiRHelper.getResource("drawable.emoji_1f684"));
        sSoftbanksMap.put(0xe436, TiRHelper.getResource("drawable.emoji_1f38d"));
        sSoftbanksMap.put(0xe437, TiRHelper.getResource("drawable.emoji_1f49d"));
        sSoftbanksMap.put(0xe438, TiRHelper.getResource("drawable.emoji_1f38e"));
        sSoftbanksMap.put(0xe439, TiRHelper.getResource("drawable.emoji_1f393"));
        sSoftbanksMap.put(0xe43a, TiRHelper.getResource("drawable.emoji_1f392"));
        sSoftbanksMap.put(0xe43b, TiRHelper.getResource("drawable.emoji_1f38f"));
        sSoftbanksMap.put(0xe43c, TiRHelper.getResource("drawable.emoji_1f302"));
        sSoftbanksMap.put(0xe43d, TiRHelper.getResource("drawable.emoji_1f492"));
        sSoftbanksMap.put(0xe43e, TiRHelper.getResource("drawable.emoji_1f30a"));
        sSoftbanksMap.put(0xe43f, TiRHelper.getResource("drawable.emoji_1f367"));
        sSoftbanksMap.put(0xe440, TiRHelper.getResource("drawable.emoji_1f387"));
        sSoftbanksMap.put(0xe441, TiRHelper.getResource("drawable.emoji_1f41a"));
        sSoftbanksMap.put(0xe442, TiRHelper.getResource("drawable.emoji_1f390"));
        sSoftbanksMap.put(0xe443, TiRHelper.getResource("drawable.emoji_1f300"));
        sSoftbanksMap.put(0xe444, TiRHelper.getResource("drawable.emoji_1f33e"));
        sSoftbanksMap.put(0xe445, TiRHelper.getResource("drawable.emoji_1f383"));
        sSoftbanksMap.put(0xe446, TiRHelper.getResource("drawable.emoji_1f391"));
        sSoftbanksMap.put(0xe447, TiRHelper.getResource("drawable.emoji_1f343"));
        sSoftbanksMap.put(0xe448, TiRHelper.getResource("drawable.emoji_1f385"));
        sSoftbanksMap.put(0xe449, TiRHelper.getResource("drawable.emoji_1f305"));
        sSoftbanksMap.put(0xe44a, TiRHelper.getResource("drawable.emoji_1f307"));
        sSoftbanksMap.put(0xe44b, TiRHelper.getResource("drawable.emoji_1f303"));
        sSoftbanksMap.put(0xe44b, TiRHelper.getResource("drawable.emoji_1f30c"));
        sSoftbanksMap.put(0xe44c, TiRHelper.getResource("drawable.emoji_1f308"));
        sSoftbanksMap.put(0xe501, TiRHelper.getResource("drawable.emoji_1f3e9"));
        sSoftbanksMap.put(0xe502, TiRHelper.getResource("drawable.emoji_1f3a8"));
        sSoftbanksMap.put(0xe503, TiRHelper.getResource("drawable.emoji_1f3a9"));
        sSoftbanksMap.put(0xe504, TiRHelper.getResource("drawable.emoji_1f3ec"));
        sSoftbanksMap.put(0xe505, TiRHelper.getResource("drawable.emoji_1f3ef"));
        sSoftbanksMap.put(0xe506, TiRHelper.getResource("drawable.emoji_1f3f0"));
        sSoftbanksMap.put(0xe507, TiRHelper.getResource("drawable.emoji_1f3a6"));
        sSoftbanksMap.put(0xe508, TiRHelper.getResource("drawable.emoji_1f3ed"));
        sSoftbanksMap.put(0xe509, TiRHelper.getResource("drawable.emoji_1f5fc"));
        sSoftbanksMap.put(0xe50b, TiRHelper.getResource("drawable.emoji_1f1ef_1f1f5"));
        sSoftbanksMap.put(0xe50c, TiRHelper.getResource("drawable.emoji_1f1fa_1f1f8"));
        sSoftbanksMap.put(0xe50d, TiRHelper.getResource("drawable.emoji_1f1eb_1f1f7"));
        sSoftbanksMap.put(0xe50e, TiRHelper.getResource("drawable.emoji_1f1e9_1f1ea"));
        sSoftbanksMap.put(0xe50f, TiRHelper.getResource("drawable.emoji_1f1ee_1f1f9"));
        sSoftbanksMap.put(0xe510, TiRHelper.getResource("drawable.emoji_1f1ec_1f1e7"));
        sSoftbanksMap.put(0xe511, TiRHelper.getResource("drawable.emoji_1f1ea_1f1f8"));
        sSoftbanksMap.put(0xe512, TiRHelper.getResource("drawable.emoji_1f1f7_1f1fa"));
        sSoftbanksMap.put(0xe513, TiRHelper.getResource("drawable.emoji_1f1e8_1f1f3"));
        sSoftbanksMap.put(0xe514, TiRHelper.getResource("drawable.emoji_1f1f0_1f1f7"));
        sSoftbanksMap.put(0xe515, TiRHelper.getResource("drawable.emoji_1f471"));
        sSoftbanksMap.put(0xe516, TiRHelper.getResource("drawable.emoji_1f472"));
        sSoftbanksMap.put(0xe517, TiRHelper.getResource("drawable.emoji_1f473"));
        sSoftbanksMap.put(0xe518, TiRHelper.getResource("drawable.emoji_1f474"));
        sSoftbanksMap.put(0xe519, TiRHelper.getResource("drawable.emoji_1f475"));
        sSoftbanksMap.put(0xe51a, TiRHelper.getResource("drawable.emoji_1f476"));
        sSoftbanksMap.put(0xe51b, TiRHelper.getResource("drawable.emoji_1f477"));
        sSoftbanksMap.put(0xe51c, TiRHelper.getResource("drawable.emoji_1f478"));
        sSoftbanksMap.put(0xe51d, TiRHelper.getResource("drawable.emoji_1f5fd"));
        sSoftbanksMap.put(0xe51e, TiRHelper.getResource("drawable.emoji_1f482"));
        sSoftbanksMap.put(0xe51f, TiRHelper.getResource("drawable.emoji_1f483"));
        sSoftbanksMap.put(0xe520, TiRHelper.getResource("drawable.emoji_1f42c"));
        sSoftbanksMap.put(0xe521, TiRHelper.getResource("drawable.emoji_1f426"));
        sSoftbanksMap.put(0xe522, TiRHelper.getResource("drawable.emoji_1f420"));
        sSoftbanksMap.put(0xe523, TiRHelper.getResource("drawable.emoji_1f423"));
        sSoftbanksMap.put(0xe524, TiRHelper.getResource("drawable.emoji_1f439"));
        sSoftbanksMap.put(0xe525, TiRHelper.getResource("drawable.emoji_1f41b"));
        sSoftbanksMap.put(0xe526, TiRHelper.getResource("drawable.emoji_1f418"));
        sSoftbanksMap.put(0xe527, TiRHelper.getResource("drawable.emoji_1f428"));
        sSoftbanksMap.put(0xe528, TiRHelper.getResource("drawable.emoji_1f412"));
        sSoftbanksMap.put(0xe529, TiRHelper.getResource("drawable.emoji_1f411"));
        sSoftbanksMap.put(0xe52a, TiRHelper.getResource("drawable.emoji_1f43a"));
        sSoftbanksMap.put(0xe52b, TiRHelper.getResource("drawable.emoji_1f42e"));
        sSoftbanksMap.put(0xe52c, TiRHelper.getResource("drawable.emoji_1f430"));
        sSoftbanksMap.put(0xe52d, TiRHelper.getResource("drawable.emoji_1f40d"));
        sSoftbanksMap.put(0xe52e, TiRHelper.getResource("drawable.emoji_1f414"));
        sSoftbanksMap.put(0xe52f, TiRHelper.getResource("drawable.emoji_1f417"));
        sSoftbanksMap.put(0xe530, TiRHelper.getResource("drawable.emoji_1f42b"));
        sSoftbanksMap.put(0xe531, TiRHelper.getResource("drawable.emoji_1f438"));
        sSoftbanksMap.put(0xe532, TiRHelper.getResource("drawable.emoji_1f170"));
        sSoftbanksMap.put(0xe533, TiRHelper.getResource("drawable.emoji_1f171"));
        sSoftbanksMap.put(0xe534, TiRHelper.getResource("drawable.emoji_1f18e"));
        sSoftbanksMap.put(0xe535, TiRHelper.getResource("drawable.emoji_1f17e"));
        sSoftbanksMap.put(0xe536, TiRHelper.getResource("drawable.emoji_1f43e"));
        sSoftbanksMap.put(0xe537, TiRHelper.getResource("drawable.emoji_2122"));
        }
        catch(Exception e) {
        }
    }

    private static boolean isSoftBankEmoji(char c) {
        return ((c >> 12) == 0xe);
    }

    private static int getEmojiResource(Context context, int codePoint) {
        return sEmojisMap.get(codePoint);
    }

    private static int getSoftbankEmojiResource(char c) {
        return sSoftbanksMap.get(c);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param index
     * @param length
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, index, length, false);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, boolean useSystemDefault) {
        addEmojis(context, text, emojiSize, emojiAlignment, textSize, 0, -1, useSystemDefault);
    }

    /**
     * Convert emoji characters of the given Spannable to the according emojicon.
     *
     * @param context
     * @param text
     * @param emojiSize
     * @param emojiAlignment
     * @param textSize
     * @param index
     * @param length
     * @param useSystemDefault
     */
    public static void addEmojis(Context context, Spannable text, int emojiSize, int emojiAlignment, int textSize, int index, int length, boolean useSystemDefault) {
        if (useSystemDefault) {
            return;
        }
		
		try{
	        int textLength = text.length();
	        int textLengthToProcessMax = textLength - index;
	        int textLengthToProcess = length < 0 || length >= textLengthToProcessMax ? textLength : (length+index);
	
			// remove spans throughout all text
	        EmojiconSpan[] oldSpans = text.getSpans(0, textLength, EmojiconSpan.class);
	        for (int i = 0; i < oldSpans.length; i++) {
	            text.removeSpan(oldSpans[i]);
	        }
	        int skip;
	        for (int i = index; i < textLengthToProcess; i += skip) {
	            skip = 0;
	            int icon = 0;
	            char c = text.charAt(i);
	            if (isSoftBankEmoji(c)) {
	            	
	                icon = getSoftbankEmojiResource(c);
	                skip = icon == 0 ? 0 : 1;
	            }
	
	            if (icon == 0) {
	                int unicode = Character.codePointAt(text, i);
	                skip = Character.charCount(unicode);
	
	                if (unicode > 0xff) {
	                    icon = getEmojiResource(context, unicode);
	                    
	                }
	
	                if (icon == 0 && i + skip < textLengthToProcess) {
	                    int followUnicode = Character.codePointAt(text, i + skip);
	                    if (followUnicode == 0x20e3) {
	                        int followSkip = Character.charCount(followUnicode);
	                        switch (unicode) {
	                            case 0x0031:
	                                icon = TiRHelper.getResource("drawable.emoji_0031");
	                                break;
	                            case 0x0032:
	                                icon = TiRHelper.getResource("drawable.emoji_0032");
	                                break;
	                            case 0x0033:
	                                icon = TiRHelper.getResource("drawable.emoji_0033");
	                                break;
	                            case 0x0034:
	                                icon = TiRHelper.getResource("drawable.emoji_0034");
	                                break;
	                            case 0x0035:
	                                icon = TiRHelper.getResource("drawable.emoji_0035");
	                                break;
	                            case 0x0036:
	                                icon = TiRHelper.getResource("drawable.emoji_0036");
	                                break;
	                            case 0x0037:
	                                icon = TiRHelper.getResource("drawable.emoji_0037");
	                                break;
	                            case 0x0038:
	                                icon = TiRHelper.getResource("drawable.emoji_0038");
	                                break;
	                            case 0x0039:
	                                icon = TiRHelper.getResource("drawable.emoji_0039");
	                                break;
	                            case 0x0030:
	                                icon = TiRHelper.getResource("drawable.emoji_0030");
	                                break;
	                            case 0x0023:
	                                icon = TiRHelper.getResource("drawable.emoji_0023");
	                                break;
	                            default:
	                                followSkip = 0;
	                                break;
	                        }
	                        skip += followSkip;
	                    } else {
	                        int followSkip = Character.charCount(followUnicode);
	                        switch (unicode) {
	                            case 0x1f1ef:
	                                icon = (followUnicode == 0x1f1f5) ? TiRHelper.getResource("drawable.emoji_1f1ef_1f1f5") : 0;
	                                break;
	                            case 0x1f1fa:
	                                icon = (followUnicode == 0x1f1f8) ? TiRHelper.getResource("drawable.emoji_1f1fa_1f1f8") : 0;
	                                break;
	                            case 0x1f1eb:
	                                icon = (followUnicode == 0x1f1f7) ? TiRHelper.getResource("drawable.emoji_1f1eb_1f1f7") : 0;
	                                break;
	                            case 0x1f1e9:
	                                icon = (followUnicode == 0x1f1ea) ? TiRHelper.getResource("drawable.emoji_1f1e9_1f1ea") : 0;
	                                break;
	                            case 0x1f1ee:
	                                icon = (followUnicode == 0x1f1f9) ? TiRHelper.getResource("drawable.emoji_1f1ee_1f1f9") : 0;
	                                break;
	                            case 0x1f1ec:
	                                icon = (followUnicode == 0x1f1e7) ? TiRHelper.getResource("drawable.emoji_1f1ec_1f1e7") : 0;
	                                break;
	                            case 0x1f1ea:
	                                icon = (followUnicode == 0x1f1f8) ? TiRHelper.getResource("drawable.emoji_1f1ea_1f1f8") : 0;
	                                break;
	                            case 0x1f1f7:
	                                icon = (followUnicode == 0x1f1fa) ? TiRHelper.getResource("drawable.emoji_1f1f7_1f1fa") : 0;
	                                break;
	                            case 0x1f1e8:
	                                icon = (followUnicode == 0x1f1f3) ? TiRHelper.getResource("drawable.emoji_1f1e8_1f1f3") : 0;
	                                break;
	                            case 0x1f1f0:
	                                icon = (followUnicode == 0x1f1f7) ? TiRHelper.getResource("drawable.emoji_1f1f0_1f1f7") : 0;
	                                break;
	                            default:
	                                followSkip = 0;
	                                break;
	                        }
	                        skip += followSkip;
	                    }
	                }
	            }
	
	            if (icon > 0) {
	                text.setSpan(new EmojiconSpan(context, icon, emojiSize, emojiAlignment, textSize), i, i + skip, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
	            }
	        }
	    }
        catch(Exception e){
        }
    }
}