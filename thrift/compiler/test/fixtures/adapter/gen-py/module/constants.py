#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from __future__ import absolute_import
import sys
from thrift.util.Recursive import fix_spec
from thrift.Thrift import TType, TMessageType, TPriority, TRequestContext, TProcessorEventHandler, TServerInterface, TProcessor, TException, TApplicationException, UnimplementedTypedef
from thrift.protocol.TProtocol import TProtocolException

from json import loads
import sys
if sys.version_info[0] >= 3:
  long = int

import ::my
import my


from .ttypes import UTF8STRINGS, Color, ThriftAdaptedEnum, MyAnnotation, Foo, Baz, Bar, DirectlyAdapted, IndependentDirectlyAdapted, StructWithFieldAdapter, TerseAdaptedFields, B, A, Config, MyStruct, AdaptTestStruct, AdaptTemplatedTestStruct, AdaptTemplatedNestedTestStruct, AdaptTestUnion, AdaptedStruct, DirectlyAdaptedStruct, StructFieldAdaptedStruct, CircularAdaptee, CircularStruct, ReorderedStruct, DeclaredAfterStruct, RenamedStruct, SameNamespaceStruct, HeapAllocated, MoveOnly, AlsoMoveOnly, ApplyAdapter, TransitiveAdapted, CountingStruct, Person, Person2, SetWithAdapter, StringWithAdapter, ListWithElemAdapter, ListWithElemAdapter_withAdapter, MyI64, DoubleTypedefI64, MyI32, FooWithAdapter, StructWithAdapter, UnionWithAdapter, AdaptedA, DurationMs, AdaptedBool, AdaptedByte, AdaptedShort, AdaptedInteger, AdaptedLong, AdaptedDouble, AdaptedString, DoubleTypedefBool, CustomProtocolType, IndirectionString, AdaptedEnum, AdaptedTypedef, TypedefOfDirect, AdaptedCircularAdaptee, CountingInt, FooWithAdapter_9317, ListWithElemAdapter_withAdapter_2312, MyI32_4873, StringWithAdapter_7208

var1 = 10

var2 = "20"

var3 = MyStruct(**{
  "field" : 30,
  "set_string" : set([
    "10",
    "20",
  ]),
})

var4 = 40

var5 = "50"

var6 = MyStruct(**{
  "field" : 60,
  "set_string" : set([
    "30",
    "40",
  ]),
})

timeout = 42

msg = "hello, world"

person = Person2(**{
  "name" : "DefaultName",
})

timeout_no_transitive = 420

msg_no_transitive = "hello, world 2"

person_no_transitive = Person2(**{
  "name" : "DefaultName 2",
})

type_adapted = True

nested_adapted = MoveOnly(**{
  "ptr" : HeapAllocated(**{
  }),
})

container_of_adapted = [
  1,
  2,
  3,
]

