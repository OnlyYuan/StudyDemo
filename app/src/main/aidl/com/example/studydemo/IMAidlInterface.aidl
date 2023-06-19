// IMAidlInterface.aidl
package com.example.studydemo;

// Declare any non-default types here with import statements

interface IMAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    void setName(String name);

    void setAge(String age);

    String getName();

    String getAge();

}