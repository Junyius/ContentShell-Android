
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/interfaces/bindings/native_struct.mojom
//

package org.chromium.mojo.native_types;

import org.chromium.mojo.bindings.DeserializationException;


public final class SerializedHandle extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class Type {


        public static final int MOJO_HANDLE = 0;

        public static final int PLATFORM_FILE = MOJO_HANDLE + 1;

        public static final int WIN_HANDLE = PLATFORM_FILE + 1;

        public static final int MACH_PORT = WIN_HANDLE + 1;

        public static final int FUCHSIA_HANDLE = MACH_PORT + 1;


        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private Type() {}

    }
    public org.chromium.mojo.system.UntypedHandle theHandle;
    public int type;

    private SerializedHandle(int version) {
        super(STRUCT_SIZE, version);
        this.theHandle = org.chromium.mojo.system.InvalidHandle.INSTANCE;
    }

    public SerializedHandle() {
        this(0);
    }

    public static SerializedHandle deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SerializedHandle deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SerializedHandle decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SerializedHandle result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SerializedHandle(elementsOrVersion);
                {
                    
                result.theHandle = decoder0.readUntypedHandle(8, false);
                }
                {
                    
                result.type = decoder0.readInt(12);
                    SerializedHandle.Type.validate(result.type);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.theHandle, 8, false);
        
        encoder0.encode(this.type, 12);
    }
}