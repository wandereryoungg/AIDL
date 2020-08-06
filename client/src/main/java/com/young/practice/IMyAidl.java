/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.young.practice;
// Declare any non-default types here with import statements

public interface IMyAidl extends android.os.IInterface {
    /**
     * Default implementation for IMyAidl.
     */
    public static class Default implements com.young.practice.IMyAidl {
        /**
         * Demonstrates some basic types that you can use as parameters
         * and return values in AIDL.
         *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
        //            double aDouble, String aString);
        @Override
        public java.lang.String getString() throws android.os.RemoteException {
            return null;
        }

        @Override
        public android.os.IBinder asBinder() {
            return null;
        }
    }

    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.young.practice.IMyAidl {
        private static final java.lang.String DESCRIPTOR = "com.young.practice.IMyAidl";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.young.practice.IMyAidl interface,
         * generating a proxy if needed.
         */
        public static com.young.practice.IMyAidl asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.young.practice.IMyAidl))) {
                return ((com.young.practice.IMyAidl) iin);
            }
            return new com.young.practice.IMyAidl.Stub.Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            java.lang.String descriptor = DESCRIPTOR;
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(descriptor);
                    return true;
                }
                case TRANSACTION_getString: {
                    data.enforceInterface(descriptor);
                    java.lang.String _result = this.getString();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        private static class Proxy implements com.young.practice.IMyAidl {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            /**
             * Demonstrates some basic types that you can use as parameters
             * and return values in AIDL.
             *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            //            double aDouble, String aString);
            @Override
            public java.lang.String getString() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_getString, _data, _reply, 0);
                    if (!_status && getDefaultImpl() != null) {
                        return getDefaultImpl().getString();
                    }
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            public static com.young.practice.IMyAidl sDefaultImpl;
        }

        static final int TRANSACTION_getString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);

        public static boolean setDefaultImpl(com.young.practice.IMyAidl impl) {
            // Only one user of this interface can use this function
            // at a time. This is a heuristic to detect if two different
            // users in the same process use this function.
            if (Stub.Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Stub.Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }

        public static com.young.practice.IMyAidl getDefaultImpl() {
            return Stub.Proxy.sDefaultImpl;
        }
    }

    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     *///    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
    //            double aDouble, String aString);
    public java.lang.String getString() throws android.os.RemoteException;
}
