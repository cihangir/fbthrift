/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@SwiftGenerated
@ThriftUnion("UnionToBeRenamed")
public final class UnionToBeRenamed implements com.facebook.thrift.payload.ThriftSerializable {
    
    private static final TStruct STRUCT_DESC = new TStruct("UnionToBeRenamed");
    private static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    private static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final UnionToBeRenamed _DEFAULT = new UnionToBeRenamed();

    public static final int _RESERVED_FIELD = 1;
    private static final TField RESERVED_FIELD_FIELD_DESC = new TField("reservedField", TType.I32, (short)1);

    static {
      NAMES_TO_IDS.put("reservedField", 1);
      THRIFT_NAMES_TO_IDS.put("reserved_field", 1);
      FIELD_METADATA.put(1, RESERVED_FIELD_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/basic/UnionToBeRenamed"),
        UnionToBeRenamed.class, UnionToBeRenamed::read0));
    }

    private java.lang.Object value;
    private short id;

    public static UnionToBeRenamed from(int _id, java.lang.Object _field) {
        return from((short) _id, _field);
    }

    public static UnionToBeRenamed from(short _id, java.lang.Object _field) {
        java.util.Objects.requireNonNull(_field);
        if (!FIELD_METADATA.containsKey(Integer.valueOf(_id))) {
            throw new java.lang.IllegalArgumentException("unknown field " + _id);
        }

        UnionToBeRenamed _u = new  UnionToBeRenamed();

        try {
            switch(_id) {
                case 1:
                    _u.id = _id;
                    _u.value = (int) _field;
                    return _u;
                default:
                throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
            }
        } catch (Exception t) {
            throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
        }
    }

    @ThriftConstructor
    public UnionToBeRenamed() {
    }
    
    @ThriftConstructor
    @Deprecated
    public UnionToBeRenamed(final int reservedField) {
        this.value = reservedField;
        this.id = 1;
    }
    
    public static UnionToBeRenamed fromReservedField(final int reservedField) {
        UnionToBeRenamed res = new UnionToBeRenamed();
        res.value = reservedField;
        res.id = 1;
        return res;
    }
    

    @com.facebook.swift.codec.ThriftField(value=1, name="reserved_field", requiredness=Requiredness.NONE)
    public int getReservedField() {
        if (this.id != 1) {
            throw new IllegalStateException("Not a reserved_field element!");
        }
        return (int) value;
    }

    public boolean isSetReservedField() {
        return this.id == 1;
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
        if (isSetReservedField()) {
            visitor.visitReservedField(getReservedField());
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

        UnionToBeRenamed other = (UnionToBeRenamed)o;

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
        void visitReservedField(int reservedField);
    }

    public void write0(TProtocol oprot) throws TException {
      if (this.id != 0 && this.value == null ){
         return;
      }
      oprot.writeStructBegin(STRUCT_DESC);
      switch (this.id) {
      case _RESERVED_FIELD: {
        oprot.writeFieldBegin(RESERVED_FIELD_FIELD_DESC);
        int reservedField = (int)this.value;
        oprot.writeI32(reservedField);
        oprot.writeFieldEnd();
        break;
      }
      default:
          // ignore unknown field
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    
    public static com.facebook.thrift.payload.Reader<UnionToBeRenamed> asReader() {
      return UnionToBeRenamed::read0;
    }
    
    public static UnionToBeRenamed read0(TProtocol oprot) throws TException {
      UnionToBeRenamed res = new UnionToBeRenamed();
      res.value = null;
      res.id = (short) 0;
      oprot.readStructBegin(UnionToBeRenamed.NAMES_TO_IDS, UnionToBeRenamed.THRIFT_NAMES_TO_IDS, UnionToBeRenamed.FIELD_METADATA);
      TField __field = oprot.readFieldBegin();
      if (__field.type != TType.STOP) {
          switch (__field.id) {
          case _RESERVED_FIELD:
            if (__field.type == RESERVED_FIELD_FIELD_DESC.type) {
              int reservedField = oprot.readI32();
              res.value = reservedField;
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
          throw new TProtocolException(TProtocolException.INVALID_DATA, "Union 'UnionToBeRenamed' is missing a STOP byte");
        }
      }
      oprot.readStructEnd();
      return res;
    }
    public static UnionToBeRenamed defaultInstance() {
        return _DEFAULT;
    }

}
