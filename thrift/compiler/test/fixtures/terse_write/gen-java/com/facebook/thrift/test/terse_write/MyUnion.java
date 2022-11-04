/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package com.facebook.thrift.test.terse_write;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@SwiftGenerated
@ThriftUnion("MyUnion")
public final class MyUnion implements com.facebook.thrift.payload.ThriftSerializable {
    private static final TStruct STRUCT_DESC = new TStruct("MyUnion");
    private static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    private static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final MyUnion _DEFAULT = new MyUnion();

    public static final int _BOOL_FIELD = 1;
    private static final TField BOOL_FIELD_FIELD_DESC = new TField("boolField", TType.BOOL, (short)1);
    public static final int _BYTE_FIELD = 2;
    private static final TField BYTE_FIELD_FIELD_DESC = new TField("byteField", TType.BYTE, (short)2);
    public static final int _SHORT_FIELD = 3;
    private static final TField SHORT_FIELD_FIELD_DESC = new TField("shortField", TType.I16, (short)3);
    public static final int _INT_FIELD = 4;
    private static final TField INT_FIELD_FIELD_DESC = new TField("intField", TType.I32, (short)4);
    public static final int _LONG_FIELD = 5;
    private static final TField LONG_FIELD_FIELD_DESC = new TField("longField", TType.I64, (short)5);
    public static final int _FLOAT_FIELD = 6;
    private static final TField FLOAT_FIELD_FIELD_DESC = new TField("floatField", TType.FLOAT, (short)6);
    public static final int _DOUBLE_FIELD = 7;
    private static final TField DOUBLE_FIELD_FIELD_DESC = new TField("doubleField", TType.DOUBLE, (short)7);
    public static final int _STRING_FIELD = 8;
    private static final TField STRING_FIELD_FIELD_DESC = new TField("stringField", TType.STRING, (short)8);
    public static final int _BINARY_FIELD = 9;
    private static final TField BINARY_FIELD_FIELD_DESC = new TField("binaryField", TType.STRING, (short)9);
    public static final int _ENUM_FIELD = 10;
    private static final TField ENUM_FIELD_FIELD_DESC = new TField("enumField", TType.I32, (short)10);
    public static final int _LIST_FIELD = 11;
    private static final TField LIST_FIELD_FIELD_DESC = new TField("listField", TType.LIST, (short)11);
    public static final int _SET_FIELD = 12;
    private static final TField SET_FIELD_FIELD_DESC = new TField("setField", TType.SET, (short)12);
    public static final int _MAP_FIELD = 13;
    private static final TField MAP_FIELD_FIELD_DESC = new TField("mapField", TType.MAP, (short)13);
    public static final int _STRUCT_FIELD = 14;
    private static final TField STRUCT_FIELD_FIELD_DESC = new TField("structField", TType.STRUCT, (short)14);

    static {
      NAMES_TO_IDS.put("boolField", 1);
      THRIFT_NAMES_TO_IDS.put("bool_field", 1);
      FIELD_METADATA.put(1, BOOL_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("byteField", 2);
      THRIFT_NAMES_TO_IDS.put("byte_field", 2);
      FIELD_METADATA.put(2, BYTE_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("shortField", 3);
      THRIFT_NAMES_TO_IDS.put("short_field", 3);
      FIELD_METADATA.put(3, SHORT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("intField", 4);
      THRIFT_NAMES_TO_IDS.put("int_field", 4);
      FIELD_METADATA.put(4, INT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("longField", 5);
      THRIFT_NAMES_TO_IDS.put("long_field", 5);
      FIELD_METADATA.put(5, LONG_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("floatField", 6);
      THRIFT_NAMES_TO_IDS.put("float_field", 6);
      FIELD_METADATA.put(6, FLOAT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("doubleField", 7);
      THRIFT_NAMES_TO_IDS.put("double_field", 7);
      FIELD_METADATA.put(7, DOUBLE_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("stringField", 8);
      THRIFT_NAMES_TO_IDS.put("string_field", 8);
      FIELD_METADATA.put(8, STRING_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("binaryField", 9);
      THRIFT_NAMES_TO_IDS.put("binary_field", 9);
      FIELD_METADATA.put(9, BINARY_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("enumField", 10);
      THRIFT_NAMES_TO_IDS.put("enum_field", 10);
      FIELD_METADATA.put(10, ENUM_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("listField", 11);
      THRIFT_NAMES_TO_IDS.put("list_field", 11);
      FIELD_METADATA.put(11, LIST_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("setField", 12);
      THRIFT_NAMES_TO_IDS.put("set_field", 12);
      FIELD_METADATA.put(12, SET_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("mapField", 13);
      THRIFT_NAMES_TO_IDS.put("map_field", 13);
      FIELD_METADATA.put(13, MAP_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("structField", 14);
      THRIFT_NAMES_TO_IDS.put("struct_field", 14);
      FIELD_METADATA.put(14, STRUCT_FIELD_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("facebook.com/thrift/test/terse_write/MyUnion"),
        MyUnion.class, MyUnion::read0));
    }

    private java.lang.Object value;
    private short id;

    public static MyUnion from(int _id, java.lang.Object _field) {
        return from((short) _id, _field);
    }

    public static MyUnion from(short _id, java.lang.Object _field) {
        java.util.Objects.requireNonNull(_field);
        if (!FIELD_METADATA.containsKey(Integer.valueOf(_id))) {
            throw new java.lang.IllegalArgumentException("unknown field " + _id);
        }

        MyUnion _u = new  MyUnion();

        try {
            switch(_id) {
                case 1:
                    _u.id = _id;
                    _u.value = (boolean) _field;
                    return _u;
                case 2:
                    _u.id = _id;
                    _u.value = (byte) _field;
                    return _u;
                case 3:
                    _u.id = _id;
                    _u.value = (short) _field;
                    return _u;
                case 4:
                    _u.id = _id;
                    _u.value = (int) _field;
                    return _u;
                case 5:
                    _u.id = _id;
                    _u.value = (long) _field;
                    return _u;
                case 6:
                    _u.id = _id;
                    _u.value = (float) _field;
                    return _u;
                case 7:
                    _u.id = _id;
                    _u.value = (double) _field;
                    return _u;
                case 8:
                    _u.id = _id;
                    _u.value = (String) _field;
                    return _u;
                case 9:
                    _u.id = _id;
                    _u.value = (byte[]) _field;
                    return _u;
                case 10:
                    _u.id = _id;
                    _u.value = (com.facebook.thrift.test.terse_write.MyEnum) _field;
                    return _u;
                case 11:
                    _u.id = _id;
                    _u.value = (List<Short>) _field;
                    return _u;
                case 12:
                    _u.id = _id;
                    _u.value = (Set<Short>) _field;
                    return _u;
                case 13:
                    _u.id = _id;
                    _u.value = (Map<Short, Short>) _field;
                    return _u;
                case 14:
                    _u.id = _id;
                    _u.value = (com.facebook.thrift.test.terse_write.MyStruct) _field;
                    return _u;
                default:
                throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
            }
        } catch (Exception t) {
            throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
        }
    }

    @ThriftConstructor
    public MyUnion() {
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final boolean boolField) {
        this.value = boolField;
        this.id = 1;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final byte byteField) {
        this.value = byteField;
        this.id = 2;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final short shortField) {
        this.value = shortField;
        this.id = 3;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final int intField) {
        this.value = intField;
        this.id = 4;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final long longField) {
        this.value = longField;
        this.id = 5;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final float floatField) {
        this.value = floatField;
        this.id = 6;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final double doubleField) {
        this.value = doubleField;
        this.id = 7;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final String stringField) {
        this.value = stringField;
        this.id = 8;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final byte[] binaryField) {
        this.value = binaryField;
        this.id = 9;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final com.facebook.thrift.test.terse_write.MyEnum enumField) {
        this.value = enumField;
        this.id = 10;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final List<Short> listField) {
        this.value = listField;
        this.id = 11;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final Set<Short> setField) {
        this.value = setField;
        this.id = 12;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final Map<Short, Short> mapField) {
        this.value = mapField;
        this.id = 13;
    }
    
    @ThriftConstructor
    @Deprecated
    public MyUnion(final com.facebook.thrift.test.terse_write.MyStruct structField) {
        this.value = structField;
        this.id = 14;
    }
    
    public static MyUnion fromBoolField(final boolean boolField) {
        MyUnion res = new MyUnion();
        res.value = boolField;
        res.id = 1;
        return res;
    }
    
    public static MyUnion fromByteField(final byte byteField) {
        MyUnion res = new MyUnion();
        res.value = byteField;
        res.id = 2;
        return res;
    }
    
    public static MyUnion fromShortField(final short shortField) {
        MyUnion res = new MyUnion();
        res.value = shortField;
        res.id = 3;
        return res;
    }
    
    public static MyUnion fromIntField(final int intField) {
        MyUnion res = new MyUnion();
        res.value = intField;
        res.id = 4;
        return res;
    }
    
    public static MyUnion fromLongField(final long longField) {
        MyUnion res = new MyUnion();
        res.value = longField;
        res.id = 5;
        return res;
    }
    
    public static MyUnion fromFloatField(final float floatField) {
        MyUnion res = new MyUnion();
        res.value = floatField;
        res.id = 6;
        return res;
    }
    
    public static MyUnion fromDoubleField(final double doubleField) {
        MyUnion res = new MyUnion();
        res.value = doubleField;
        res.id = 7;
        return res;
    }
    
    public static MyUnion fromStringField(final String stringField) {
        MyUnion res = new MyUnion();
        res.value = stringField;
        res.id = 8;
        return res;
    }
    
    public static MyUnion fromBinaryField(final byte[] binaryField) {
        MyUnion res = new MyUnion();
        res.value = binaryField;
        res.id = 9;
        return res;
    }
    
    public static MyUnion fromEnumField(final com.facebook.thrift.test.terse_write.MyEnum enumField) {
        MyUnion res = new MyUnion();
        res.value = enumField;
        res.id = 10;
        return res;
    }
    
    public static MyUnion fromListField(final List<Short> listField) {
        MyUnion res = new MyUnion();
        res.value = listField;
        res.id = 11;
        return res;
    }
    
    public static MyUnion fromSetField(final Set<Short> setField) {
        MyUnion res = new MyUnion();
        res.value = setField;
        res.id = 12;
        return res;
    }
    
    public static MyUnion fromMapField(final Map<Short, Short> mapField) {
        MyUnion res = new MyUnion();
        res.value = mapField;
        res.id = 13;
        return res;
    }
    
    public static MyUnion fromStructField(final com.facebook.thrift.test.terse_write.MyStruct structField) {
        MyUnion res = new MyUnion();
        res.value = structField;
        res.id = 14;
        return res;
    }
    

    @com.facebook.swift.codec.ThriftField(value=1, name="bool_field", requiredness=Requiredness.NONE)
    public boolean isBoolField() {
        if (this.id != 1) {
            throw new IllegalStateException("Not a bool_field element!");
        }
        return (boolean) value;
    }

    public boolean isSetBoolField() {
        return this.id == 1;
    }

    @com.facebook.swift.codec.ThriftField(value=2, name="byte_field", requiredness=Requiredness.NONE)
    public byte getByteField() {
        if (this.id != 2) {
            throw new IllegalStateException("Not a byte_field element!");
        }
        return (byte) value;
    }

    public boolean isSetByteField() {
        return this.id == 2;
    }

    @com.facebook.swift.codec.ThriftField(value=3, name="short_field", requiredness=Requiredness.NONE)
    public short getShortField() {
        if (this.id != 3) {
            throw new IllegalStateException("Not a short_field element!");
        }
        return (short) value;
    }

    public boolean isSetShortField() {
        return this.id == 3;
    }

    @com.facebook.swift.codec.ThriftField(value=4, name="int_field", requiredness=Requiredness.NONE)
    public int getIntField() {
        if (this.id != 4) {
            throw new IllegalStateException("Not a int_field element!");
        }
        return (int) value;
    }

    public boolean isSetIntField() {
        return this.id == 4;
    }

    @com.facebook.swift.codec.ThriftField(value=5, name="long_field", requiredness=Requiredness.NONE)
    public long getLongField() {
        if (this.id != 5) {
            throw new IllegalStateException("Not a long_field element!");
        }
        return (long) value;
    }

    public boolean isSetLongField() {
        return this.id == 5;
    }

    @com.facebook.swift.codec.ThriftField(value=6, name="float_field", requiredness=Requiredness.NONE)
    public float getFloatField() {
        if (this.id != 6) {
            throw new IllegalStateException("Not a float_field element!");
        }
        return (float) value;
    }

    public boolean isSetFloatField() {
        return this.id == 6;
    }

    @com.facebook.swift.codec.ThriftField(value=7, name="double_field", requiredness=Requiredness.NONE)
    public double getDoubleField() {
        if (this.id != 7) {
            throw new IllegalStateException("Not a double_field element!");
        }
        return (double) value;
    }

    public boolean isSetDoubleField() {
        return this.id == 7;
    }

    @com.facebook.swift.codec.ThriftField(value=8, name="string_field", requiredness=Requiredness.NONE)
    public String getStringField() {
        if (this.id != 8) {
            throw new IllegalStateException("Not a string_field element!");
        }
        return (String) value;
    }

    public boolean isSetStringField() {
        return this.id == 8;
    }

    @com.facebook.swift.codec.ThriftField(value=9, name="binary_field", requiredness=Requiredness.NONE)
    public byte[] getBinaryField() {
        if (this.id != 9) {
            throw new IllegalStateException("Not a binary_field element!");
        }
        return (byte[]) value;
    }

    public boolean isSetBinaryField() {
        return this.id == 9;
    }

    @com.facebook.swift.codec.ThriftField(value=10, name="enum_field", requiredness=Requiredness.NONE)
    public com.facebook.thrift.test.terse_write.MyEnum getEnumField() {
        if (this.id != 10) {
            throw new IllegalStateException("Not a enum_field element!");
        }
        return (com.facebook.thrift.test.terse_write.MyEnum) value;
    }

    public boolean isSetEnumField() {
        return this.id == 10;
    }

    @com.facebook.swift.codec.ThriftField(value=11, name="list_field", requiredness=Requiredness.NONE)
    public List<Short> getListField() {
        if (this.id != 11) {
            throw new IllegalStateException("Not a list_field element!");
        }
        return (List<Short>) value;
    }

    public boolean isSetListField() {
        return this.id == 11;
    }

    @com.facebook.swift.codec.ThriftField(value=12, name="set_field", requiredness=Requiredness.NONE)
    public Set<Short> getSetField() {
        if (this.id != 12) {
            throw new IllegalStateException("Not a set_field element!");
        }
        return (Set<Short>) value;
    }

    public boolean isSetSetField() {
        return this.id == 12;
    }

    @com.facebook.swift.codec.ThriftField(value=13, name="map_field", requiredness=Requiredness.NONE)
    public Map<Short, Short> getMapField() {
        if (this.id != 13) {
            throw new IllegalStateException("Not a map_field element!");
        }
        return (Map<Short, Short>) value;
    }

    public boolean isSetMapField() {
        return this.id == 13;
    }

    @com.facebook.swift.codec.ThriftField(value=14, name="struct_field", requiredness=Requiredness.NONE)
    public com.facebook.thrift.test.terse_write.MyStruct getStructField() {
        if (this.id != 14) {
            throw new IllegalStateException("Not a struct_field element!");
        }
        return (com.facebook.thrift.test.terse_write.MyStruct) value;
    }

    public boolean isSetStructField() {
        return this.id == 14;
    }

    @ThriftUnionId
    public short getThriftId() {
        return this.id;
    }

    public String getThriftName() {
        TField tField = (TField) FIELD_METADATA.get((int) this.id);
        if (tField == null) {
            return "null";
        } else {
            return tField.name;
        }
    }

    public void accept(Visitor visitor) {
        if (isSetBoolField()) {
            visitor.visitBoolField(isBoolField());
            return;
        }
        if (isSetByteField()) {
            visitor.visitByteField(getByteField());
            return;
        }
        if (isSetShortField()) {
            visitor.visitShortField(getShortField());
            return;
        }
        if (isSetIntField()) {
            visitor.visitIntField(getIntField());
            return;
        }
        if (isSetLongField()) {
            visitor.visitLongField(getLongField());
            return;
        }
        if (isSetFloatField()) {
            visitor.visitFloatField(getFloatField());
            return;
        }
        if (isSetDoubleField()) {
            visitor.visitDoubleField(getDoubleField());
            return;
        }
        if (isSetStringField()) {
            visitor.visitStringField(getStringField());
            return;
        }
        if (isSetBinaryField()) {
            visitor.visitBinaryField(getBinaryField());
            return;
        }
        if (isSetEnumField()) {
            visitor.visitEnumField(getEnumField());
            return;
        }
        if (isSetListField()) {
            visitor.visitListField(getListField());
            return;
        }
        if (isSetSetField()) {
            visitor.visitSetField(getSetField());
            return;
        }
        if (isSetMapField()) {
            visitor.visitMapField(getMapField());
            return;
        }
        if (isSetStructField()) {
            visitor.visitStructField(getStructField());
            return;
        }
    }

    @java.lang.Override
    public String toString() {
        return toStringHelper(this)
            .add("value", value)
            .add("id", id)
            .add("name", getThriftName())
            .add("type", value == null ? "<null>" : value.getClass().getSimpleName())
            .toString();
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MyUnion other = (MyUnion)o;

        return Objects.equals(this.id, other.id)
                && Objects.deepEquals(this.value, other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            id,
            value,
        });
    }

    public interface Visitor {
        void visitBoolField(boolean boolField);
        void visitByteField(byte byteField);
        void visitShortField(short shortField);
        void visitIntField(int intField);
        void visitLongField(long longField);
        void visitFloatField(float floatField);
        void visitDoubleField(double doubleField);
        void visitStringField(String stringField);
        void visitBinaryField(byte[] binaryField);
        void visitEnumField(com.facebook.thrift.test.terse_write.MyEnum enumField);
        void visitListField(List<Short> listField);
        void visitSetField(Set<Short> setField);
        void visitMapField(Map<Short, Short> mapField);
        void visitStructField(com.facebook.thrift.test.terse_write.MyStruct structField);
    }

    public void write0(TProtocol oprot) throws TException {
      if (this.id != 0 && this.value == null ){
         return;
      }
      oprot.writeStructBegin(STRUCT_DESC);
      switch (this.id) {
      case _BOOL_FIELD: {
        oprot.writeFieldBegin(BOOL_FIELD_FIELD_DESC);
        boolean boolField = (boolean)this.value;
        oprot.writeBool(boolField);
        oprot.writeFieldEnd();
        break;
      }
      case _BYTE_FIELD: {
        oprot.writeFieldBegin(BYTE_FIELD_FIELD_DESC);
        byte byteField = (byte)this.value;
        oprot.writeByte(byteField);
        oprot.writeFieldEnd();
        break;
      }
      case _SHORT_FIELD: {
        oprot.writeFieldBegin(SHORT_FIELD_FIELD_DESC);
        short shortField = (short)this.value;
        oprot.writeI16(shortField);
        oprot.writeFieldEnd();
        break;
      }
      case _INT_FIELD: {
        oprot.writeFieldBegin(INT_FIELD_FIELD_DESC);
        int intField = (int)this.value;
        oprot.writeI32(intField);
        oprot.writeFieldEnd();
        break;
      }
      case _LONG_FIELD: {
        oprot.writeFieldBegin(LONG_FIELD_FIELD_DESC);
        long longField = (long)this.value;
        oprot.writeI64(longField);
        oprot.writeFieldEnd();
        break;
      }
      case _FLOAT_FIELD: {
        oprot.writeFieldBegin(FLOAT_FIELD_FIELD_DESC);
        float floatField = (float)this.value;
        oprot.writeFloat(floatField);
        oprot.writeFieldEnd();
        break;
      }
      case _DOUBLE_FIELD: {
        oprot.writeFieldBegin(DOUBLE_FIELD_FIELD_DESC);
        double doubleField = (double)this.value;
        oprot.writeDouble(doubleField);
        oprot.writeFieldEnd();
        break;
      }
      case _STRING_FIELD: {
        oprot.writeFieldBegin(STRING_FIELD_FIELD_DESC);
        String stringField = (String)this.value;
        oprot.writeString(stringField);
        oprot.writeFieldEnd();
        break;
      }
      case _BINARY_FIELD: {
        oprot.writeFieldBegin(BINARY_FIELD_FIELD_DESC);
        byte[] binaryField = (byte[])this.value;
        oprot.writeBinary(java.nio.ByteBuffer.wrap(binaryField));
        oprot.writeFieldEnd();
        break;
      }
      case _ENUM_FIELD: {
        oprot.writeFieldBegin(ENUM_FIELD_FIELD_DESC);
        com.facebook.thrift.test.terse_write.MyEnum enumField = (com.facebook.thrift.test.terse_write.MyEnum)this.value;
        oprot.writeI32(enumField == null ? 0 : enumField.getValue());
        oprot.writeFieldEnd();
        break;
      }
      case _LIST_FIELD: {
        oprot.writeFieldBegin(LIST_FIELD_FIELD_DESC);
        List<Short> _iter0 = (List<Short>)this.value;
        oprot.writeListBegin(new TList(TType.I16, _iter0.size()));
        for (short _iter1 : _iter0) {
          oprot.writeI16(_iter1);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
        break;
      }
      case _SET_FIELD: {
        oprot.writeFieldBegin(SET_FIELD_FIELD_DESC);
        Set<Short> _iter0 = (Set<Short>)this.value;
        oprot.writeSetBegin(new TSet(TType.I16, _iter0.size()));
        for (short _iter1 : _iter0) {
          oprot.writeI16(_iter1);
        }
        oprot.writeSetEnd();
        oprot.writeFieldEnd();
        break;
      }
      case _MAP_FIELD: {
        oprot.writeFieldBegin(MAP_FIELD_FIELD_DESC);
        Map<Short, Short> _iter0 = (Map<Short, Short>)this.value;
        oprot.writeMapBegin(new TMap(TType.I16, TType.I16, _iter0.size()));
        for (Map.Entry<Short, Short> _iter1 : _iter0.entrySet()) {
          oprot.writeI16(_iter1.getKey());
          oprot.writeI16(_iter1.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
        break;
      }
      case _STRUCT_FIELD: {
        oprot.writeFieldBegin(STRUCT_FIELD_FIELD_DESC);
        com.facebook.thrift.test.terse_write.MyStruct structField = (com.facebook.thrift.test.terse_write.MyStruct)this.value;
        structField.write0(oprot);
        oprot.writeFieldEnd();
        break;
      }
      default:
          // ignore unknown field
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    
    public static com.facebook.thrift.payload.Reader<MyUnion> asReader() {
      return MyUnion::read0;
    }
    
    public static MyUnion read0(TProtocol oprot) throws TException {
      MyUnion res = new MyUnion();
      res.value = null;
      res.id = (short) 0;
      oprot.readStructBegin(MyUnion.NAMES_TO_IDS, MyUnion.THRIFT_NAMES_TO_IDS, MyUnion.FIELD_METADATA);
      TField __field = oprot.readFieldBegin();
      if (__field.type != TType.STOP) {
          switch (__field.id) {
          case _BOOL_FIELD:
            if (__field.type == BOOL_FIELD_FIELD_DESC.type) {
              boolean boolField = oprot.readBool();
              res.value = boolField;
            }
            break;
          case _BYTE_FIELD:
            if (__field.type == BYTE_FIELD_FIELD_DESC.type) {
              byte byteField = oprot.readByte();
              res.value = byteField;
            }
            break;
          case _SHORT_FIELD:
            if (__field.type == SHORT_FIELD_FIELD_DESC.type) {
              short shortField = oprot.readI16();
              res.value = shortField;
            }
            break;
          case _INT_FIELD:
            if (__field.type == INT_FIELD_FIELD_DESC.type) {
              int intField = oprot.readI32();
              res.value = intField;
            }
            break;
          case _LONG_FIELD:
            if (__field.type == LONG_FIELD_FIELD_DESC.type) {
              long longField = oprot.readI64();
              res.value = longField;
            }
            break;
          case _FLOAT_FIELD:
            if (__field.type == FLOAT_FIELD_FIELD_DESC.type) {
              float floatField = oprot.readFloat();
              res.value = floatField;
            }
            break;
          case _DOUBLE_FIELD:
            if (__field.type == DOUBLE_FIELD_FIELD_DESC.type) {
              double doubleField = oprot.readDouble();
              res.value = doubleField;
            }
            break;
          case _STRING_FIELD:
            if (__field.type == STRING_FIELD_FIELD_DESC.type) {
              String stringField = oprot.readString();
              res.value = stringField;
            }
            break;
          case _BINARY_FIELD:
            if (__field.type == BINARY_FIELD_FIELD_DESC.type) {
              byte[] binaryField = oprot.readBinary().array();
              res.value = binaryField;
            }
            break;
          case _ENUM_FIELD:
            if (__field.type == ENUM_FIELD_FIELD_DESC.type) {
              com.facebook.thrift.test.terse_write.MyEnum enumField = com.facebook.thrift.test.terse_write.MyEnum.fromInteger(oprot.readI32());
              res.value = enumField;
            }
            break;
          case _LIST_FIELD:
            if (__field.type == LIST_FIELD_FIELD_DESC.type) {
              List<Short> listField;
            {
            TList _list = oprot.readListBegin();
            listField = new ArrayList<Short>(Math.max(0, _list.size));
            for (int _i = 0; (_list.size < 0) ? oprot.peekList() : (_i < _list.size); _i++) {
                
                short _value1 = oprot.readI16();
                listField.add(_value1);
            }
            oprot.readListEnd();
            }
              res.value = listField;
            }
            break;
          case _SET_FIELD:
            if (__field.type == SET_FIELD_FIELD_DESC.type) {
              Set<Short> setField;
            {
            TSet _set = oprot.readSetBegin();
            setField = new HashSet<Short>(Math.max(0, _set.size));
            for (int _i = 0; (_set.size < 0) ? oprot.peekSet() : (_i < _set.size); _i++) {
                
                short _value1 = oprot.readI16();
                setField.add(_value1);
            }
            oprot.readSetEnd();
            }
              res.value = setField;
            }
            break;
          case _MAP_FIELD:
            if (__field.type == MAP_FIELD_FIELD_DESC.type) {
              Map<Short, Short> mapField;
            {
            TMap _map = oprot.readMapBegin();
            mapField = new HashMap<Short, Short>(Math.max(0, _map.size));
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                short _key1 = oprot.readI16();
                short _value1 = oprot.readI16();
                mapField.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
              res.value = mapField;
            }
            break;
          case _STRUCT_FIELD:
            if (__field.type == STRUCT_FIELD_FIELD_DESC.type) {
              com.facebook.thrift.test.terse_write.MyStruct structField = com.facebook.thrift.test.terse_write.MyStruct.read0(oprot);
              res.value = structField;
            }
            break;
          default:
            TProtocolUtil.skip(oprot, __field.type);
          }
        if (res.value != null) {
          res.id = __field.id;
        }
        oprot.readFieldEnd();
        TField __stopField = oprot.readFieldBegin(); // Consume the STOP byte
        if (__stopField.type != TType.STOP) {
          throw new TProtocolException(TProtocolException.INVALID_DATA, "Union 'MyUnion' is missing a STOP byte");
        }
      }
      oprot.readStructEnd();
      return res;
    }
    public static MyUnion defaultInstance() {
        return _DEFAULT;
    }

}
