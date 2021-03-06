
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/output_protection.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface OutputProtection extends org.chromium.mojo.bindings.Interface {



    public static final class ProtectionType {


        public static final int NONE = (int) (0L);

        public static final int HDCP = (int) (1L);


        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private ProtectionType() {}

    }


    public static final class LinkType {


        public static final int NONE = (int) (0L);

        public static final int UNKNOWN = (int) (1L);

        public static final int INTERNAL = (int) (2L);

        public static final int VGA = (int) (4L);

        public static final int HDMI = (int) (8L);

        public static final int DVI = (int) (16L);

        public static final int DISPLAYPORT = (int) (32L);

        public static final int NETWORK = (int) (64L);


        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                case 4:
                case 8:
                case 16:
                case 32:
                case 64:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private LinkType() {}

    }


    public interface Proxy extends OutputProtection, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<OutputProtection, OutputProtection.Proxy> MANAGER = OutputProtection_Internal.MANAGER;


    void queryStatus(

QueryStatusResponse callback);

    interface QueryStatusResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, Integer, Integer> { }



    void enableProtection(
int desiredProtectionMask, 
EnableProtectionResponse callback);

    interface EnableProtectionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}
