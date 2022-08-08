#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
cimport cython as __cython
from cpython.object cimport PyTypeObject, Py_LT, Py_LE, Py_EQ, Py_NE, Py_GT, Py_GE
from libcpp.memory cimport shared_ptr, make_shared, unique_ptr, make_unique
from libcpp.string cimport string
from libcpp cimport bool as cbool
from libcpp.iterator cimport inserter as cinserter
from cpython cimport bool as pbool
from cython.operator cimport dereference as deref, preincrement as inc, address as ptr_address
import thrift.py3.types
cimport thrift.py3.types
cimport thrift.py3.exceptions
from thrift.py3.std_libcpp cimport sv_to_str as __sv_to_str, string_view as __cstring_view
from thrift.py3.types cimport (
    cSetOp as __cSetOp,
    richcmp as __richcmp,
    set_op as __set_op,
    setcmp as __setcmp,
    list_index as __list_index,
    list_count as __list_count,
    list_slice as __list_slice,
    list_getitem as __list_getitem,
    set_iter as __set_iter,
    map_iter as __map_iter,
    map_contains as __map_contains,
    map_getitem as __map_getitem,
    reference_shared_ptr as __reference_shared_ptr,
    get_field_name_by_index as __get_field_name_by_index,
    reset_field as __reset_field,
    translate_cpp_enum_to_python,
    SetMetaClass as __SetMetaClass,
    const_pointer_cast,
    constant_shared_ptr,
    NOTSET as __NOTSET,
    EnumData as __EnumData,
    EnumFlagsData as __EnumFlagsData,
    UnionTypeEnumData as __UnionTypeEnumData,
    createEnumDataForUnionType as __createEnumDataForUnionType,
)
cimport thrift.py3.std_libcpp as std_libcpp
cimport thrift.py3.serializer as serializer
import folly.iobuf as _fbthrift_iobuf
from folly.optional cimport cOptional
from folly.memory cimport to_shared_ptr as __to_shared_ptr
from folly.range cimport Range as __cRange

import sys
from collections.abc import Sequence, Set, Mapping, Iterable
import weakref as __weakref
import builtins as _builtins
cimport facebook.thrift.annotation.thrift.types as _facebook_thrift_annotation_thrift_types
import facebook.thrift.annotation.thrift.types as _facebook_thrift_annotation_thrift_types

cimport test.fixtures.basic.module.types_reflection as _types_reflection


cdef __EnumData __MyEnum_enum_data  = __EnumData._fbthrift_create(thrift.py3.types.createEnumData[cMyEnum](), MyEnum)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __MyEnumMeta(thrift.py3.types.EnumMeta):
    def _fbthrift_get_by_value(cls, int value):
        return __MyEnum_enum_data.get_by_value(value)

    def _fbthrift_get_all_names(cls):
        return __MyEnum_enum_data.get_all_names()

    def __len__(cls):
        return __MyEnum_enum_data.size()

    def __getattribute__(cls, str name not None):
        if name.startswith("__") or name.startswith("_fbthrift_") or name == "mro":
            return super().__getattribute__(name)
        return __MyEnum_enum_data.get_by_name(name)


@__cython.final
@__cython.auto_pickle(False)
cdef class MyEnum(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __MyEnum_enum_data.get_by_name(name)


    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftMetadata meta
        EnumMetadata[cMyEnum].gen(meta)
        return __MetadataBox.box(cmove(meta))

    @staticmethod
    def __get_thrift_name__():
        return "module.MyEnum"


__SetMetaClass(<PyTypeObject*> MyEnum, <PyTypeObject*> __MyEnumMeta)



cdef __UnionTypeEnumData __MyUnion_union_type_enum_data  = __UnionTypeEnumData._fbthrift_create(
    __createEnumDataForUnionType[cMyUnion](),
    __MyUnionType,
)


@__cython.internal
@__cython.auto_pickle(False)
cdef class __MyUnion_Union_TypeMeta(thrift.py3.types.EnumMeta):
    def _fbthrift_get_by_value(cls, int value):
        return __MyUnion_union_type_enum_data.get_by_value(value)

    def _fbthrift_get_all_names(cls):
        return __MyUnion_union_type_enum_data.get_all_names()

    def __len__(cls):
        return __MyUnion_union_type_enum_data.size()

    def __getattribute__(cls, str name not None):
        if name.startswith("__") or name.startswith("_fbthrift_") or name == "mro":
            return super().__getattribute__(name)
        return __MyUnion_union_type_enum_data.get_by_name(name)


@__cython.final
@__cython.auto_pickle(False)
cdef class __MyUnionType(thrift.py3.types.CompiledEnum):
    cdef get_by_name(self, str name):
        return __MyUnion_union_type_enum_data.get_by_name(name)


__SetMetaClass(<PyTypeObject*> __MyUnionType, <PyTypeObject*> __MyUnion_Union_TypeMeta)


@__cython.auto_pickle(False)
cdef class MyStruct(thrift.py3.types.Struct):
    def __init__(MyStruct self, **kwargs):
        self._cpp_obj = make_shared[cMyStruct]()
        self._fields_setter = _fbthrift_types_fields.__MyStruct_FieldsSetter._fbthrift_create(self._cpp_obj.get())
        super().__init__(**kwargs)

    def __call__(MyStruct self, **kwargs):
        if not kwargs:
            return self
        cdef MyStruct __fbthrift_inst = MyStruct.__new__(MyStruct)
        __fbthrift_inst._cpp_obj = make_shared[cMyStruct](deref(self._cpp_obj))
        __fbthrift_inst._fields_setter = _fbthrift_types_fields.__MyStruct_FieldsSetter._fbthrift_create(__fbthrift_inst._cpp_obj.get())
        for __fbthrift_name, _fbthrift_value in kwargs.items():
            __fbthrift_inst._fbthrift_set_field(__fbthrift_name, _fbthrift_value)
        return __fbthrift_inst

    cdef void _fbthrift_set_field(self, str name, object value) except *:
        self._fields_setter.set_field(name.encode("utf-8"), value)

    cdef object _fbthrift_isset(self):
        return thrift.py3.types._IsSet("MyStruct", {
          "myIntField": deref(self._cpp_obj).myIntField_ref().has_value(),
          "myStringField": deref(self._cpp_obj).myStringField_ref().has_value(),
        })

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cMyStruct] cpp_obj):
        __fbthrift_inst = <MyStruct>MyStruct.__new__(MyStruct)
        __fbthrift_inst._cpp_obj = cmove(cpp_obj)
        return __fbthrift_inst

    cdef inline myIntField_impl(self):

        return deref(self._cpp_obj).myIntField_ref().value()

    @property
    def myIntField(self):
        return self.myIntField_impl()

    cdef inline myStringField_impl(self):

        return (<bytes>deref(self._cpp_obj).myStringField_ref().value()).decode('UTF-8')

    @property
    def myStringField(self):
        return self.myStringField_impl()


    def __hash__(MyStruct self):
        return super().__hash__()

    def __repr__(MyStruct self):
        return super().__repr__()

    def __str__(MyStruct self):
        return super().__str__()


    def __copy__(MyStruct self):
        cdef shared_ptr[cMyStruct] cpp_obj = make_shared[cMyStruct](
            deref(self._cpp_obj)
        )
        return MyStruct._fbthrift_create(cmove(cpp_obj))

    def __richcmp__(self, other, int op):
        r = self._fbthrift_cmp_sametype(other, op)
        return __richcmp[cMyStruct](
            self._cpp_obj,
            (<MyStruct>other)._cpp_obj,
            op,
        ) if r is None else r

    @staticmethod
    def __get_reflection__():
        return _types_reflection.get_reflection__MyStruct()

    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftMetadata meta
        StructMetadata[cMyStruct].gen(meta)
        return __MetadataBox.box(cmove(meta))

    @staticmethod
    def __get_thrift_name__():
        return "module.MyStruct"

    @classmethod
    def _fbthrift_get_field_name_by_index(cls, idx):
        return __sv_to_str(__get_field_name_by_index[cMyStruct](idx))

    @classmethod
    def _fbthrift_get_struct_size(cls):
        return 2

    cdef _fbthrift_iobuf.IOBuf _fbthrift_serialize(MyStruct self, __Protocol proto):
        cdef unique_ptr[_fbthrift_iobuf.cIOBuf] data
        with nogil:
            data = cmove(serializer.cserialize[cMyStruct](self._cpp_obj.get(), proto))
        return _fbthrift_iobuf.from_unique_ptr(cmove(data))

    cdef cuint32_t _fbthrift_deserialize(MyStruct self, const _fbthrift_iobuf.cIOBuf* buf, __Protocol proto) except? 0:
        cdef cuint32_t needed
        self._cpp_obj = make_shared[cMyStruct]()
        with nogil:
            needed = serializer.cdeserialize[cMyStruct](buf, self._cpp_obj.get(), proto)
        return needed

    def _to_python(self):
        import importlib
        import thrift.python.converter
        python_types = importlib.import_module(
            "test.fixtures.basic.module.thrift_types"
        )
        return thrift.python.converter.to_python_struct(python_types.MyStruct, self)

    def _to_py3(self):
        return self

    def _to_py_deprecated(self):
        import importlib
        import thrift.util.converter
        py_deprecated_types = importlib.import_module("module.ttypes")
        return thrift.util.converter.to_py_struct(py_deprecated_types.MyStruct, self)


@__cython.auto_pickle(False)
cdef class MyUnion(thrift.py3.types.Union):
    Type = __MyUnionType

    def __init__(
        self, *,
        MyEnum myEnum=None,
        MyStruct myDataItem=None
    ):
        self._cpp_obj = __to_shared_ptr(cmove(MyUnion._make_instance(
          NULL,
          myEnum,
          myDataItem,
        )))
        self._load_cache()

    @staticmethod
    def fromValue(value):
        if value is None:
            return MyUnion()
        if isinstance(value, MyEnum):
            return MyUnion(myEnum=value)
        if isinstance(value, MyStruct):
            return MyUnion(myDataItem=value)
        raise ValueError(f"Unable to derive correct union field for value: {value}")

    @staticmethod
    cdef unique_ptr[cMyUnion] _make_instance(
        cMyUnion* base_instance,
        MyEnum myEnum,
        MyStruct myDataItem
    ) except *:
        cdef unique_ptr[cMyUnion] c_inst = make_unique[cMyUnion]()
        cdef bint any_set = False
        if myEnum is not None:
            if any_set:
                raise TypeError("At most one field may be set when initializing a union")
            deref(c_inst).myEnum_ref().assign(<cMyEnum><int>myEnum)
            any_set = True
        if myDataItem is not None:
            if any_set:
                raise TypeError("At most one field may be set when initializing a union")
            deref(c_inst).myDataItem_ref().assign(deref((<MyStruct?> myDataItem)._cpp_obj))
            any_set = True
        # in C++ you don't have to call move(), but this doesn't translate
        # into a C++ return statement, so you do here
        return cmove(c_inst)

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cMyUnion] cpp_obj):
        __fbthrift_inst = <MyUnion>MyUnion.__new__(MyUnion)
        __fbthrift_inst._cpp_obj = cmove(cpp_obj)
        __fbthrift_inst._load_cache()
        return __fbthrift_inst

    @property
    def myEnum(self):
        if self.type.value != 1:
            raise AttributeError(f'Union contains a value of type {self.type.name}, not myEnum')
        return self.value

    @property
    def myDataItem(self):
        if self.type.value != 2:
            raise AttributeError(f'Union contains a value of type {self.type.name}, not myDataItem')
        return self.value


    def __hash__(MyUnion self):
        return  super().__hash__()

    cdef _load_cache(MyUnion self):
        self.type = MyUnion.Type(<int>(deref(self._cpp_obj).getType()))
        cdef int type = self.type.value
        if type == 0:    # Empty
            self.value = None
        elif type == 1:
            self.value = translate_cpp_enum_to_python(MyEnum, <int>deref(self._cpp_obj).myEnum_ref().value())
        elif type == 2:
            self.value = MyStruct._fbthrift_create(make_shared[cMyStruct](deref(self._cpp_obj).myDataItem_ref().value()))

    def __copy__(MyUnion self):
        cdef shared_ptr[cMyUnion] cpp_obj = make_shared[cMyUnion](
            deref(self._cpp_obj)
        )
        return MyUnion._fbthrift_create(cmove(cpp_obj))

    def __richcmp__(self, other, int op):
        r = self._fbthrift_cmp_sametype(other, op)
        return __richcmp[cMyUnion](
            self._cpp_obj,
            (<MyUnion>other)._cpp_obj,
            op,
        ) if r is None else r

    @staticmethod
    def __get_reflection__():
        return _types_reflection.get_reflection__MyUnion()

    @staticmethod
    def __get_metadata__():
        cdef __fbthrift_cThriftMetadata meta
        StructMetadata[cMyUnion].gen(meta)
        return __MetadataBox.box(cmove(meta))

    @staticmethod
    def __get_thrift_name__():
        return "module.MyUnion"

    @classmethod
    def _fbthrift_get_field_name_by_index(cls, idx):
        return __sv_to_str(__get_field_name_by_index[cMyUnion](idx))

    @classmethod
    def _fbthrift_get_struct_size(cls):
        return 2

    cdef _fbthrift_iobuf.IOBuf _fbthrift_serialize(MyUnion self, __Protocol proto):
        cdef unique_ptr[_fbthrift_iobuf.cIOBuf] data
        with nogil:
            data = cmove(serializer.cserialize[cMyUnion](self._cpp_obj.get(), proto))
        return _fbthrift_iobuf.from_unique_ptr(cmove(data))

    cdef cuint32_t _fbthrift_deserialize(MyUnion self, const _fbthrift_iobuf.cIOBuf* buf, __Protocol proto) except? 0:
        cdef cuint32_t needed
        self._cpp_obj = make_shared[cMyUnion]()
        with nogil:
            needed = serializer.cdeserialize[cMyUnion](buf, self._cpp_obj.get(), proto)
        # force a cache reload since the underlying data's changed
        self._load_cache()
        return needed

    def _to_python(self):
        import importlib
        import thrift.python.converter
        python_types = importlib.import_module(
            "test.fixtures.basic.module.thrift_types"
        )
        return thrift.python.converter.to_python_struct(python_types.MyUnion, self)

    def _to_py3(self):
        return self

    def _to_py_deprecated(self):
        import importlib
        import thrift.util.converter
        py_deprecated_types = importlib.import_module("module.ttypes")
        return thrift.util.converter.to_py_struct(py_deprecated_types.MyUnion, self)
