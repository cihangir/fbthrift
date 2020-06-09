/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "thrift/compiler/test/fixtures/includes/gen-cpp2/includes_types.h"
#include "thrift/compiler/test/fixtures/includes/gen-cpp2/includes_types.tcc"

#include <thrift/lib/cpp2/gen/module_types_cpp.h>

#include "thrift/compiler/test/fixtures/includes/gen-cpp2/includes_data.h"


namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::Included>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "MyIntField") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_I64;
  }
  else if (_fname == "MyTransitiveField") {
    fid = 2;
    _ftype = apache::thrift::protocol::T_STRUCT;
  }
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {

THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
Included::Included(apache::thrift::FragileConstructor, int64_t MyIntField__arg,  ::cpp2::Foo MyTransitiveField__arg) :
    MyIntField(std::move(MyIntField__arg)),
    MyTransitiveField(std::move(MyTransitiveField__arg)) {
  __isset.MyIntField = true;
  __isset.MyTransitiveField = true;
}
THRIFT_IGNORE_ISSET_USE_WARNING_END
void Included::__clear() {
  // clear all fields
  MyIntField = 0LL;
  ::apache::thrift::Cpp2Ops<  ::cpp2::Foo>::clear(&MyTransitiveField);
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  __isset = {};
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

bool Included::operator==(const Included& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.MyIntField == rhs.MyIntField)) {
    return false;
  }
  if (!(lhs.MyTransitiveField == rhs.MyTransitiveField)) {
    return false;
  }
  return true;
}

bool Included::operator<(const Included& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.MyIntField == rhs.MyIntField)) {
    return lhs.MyIntField < rhs.MyIntField;
  }
  if (!(lhs.MyTransitiveField == rhs.MyTransitiveField)) {
    return lhs.MyTransitiveField < rhs.MyTransitiveField;
  }
  return false;
}

const  ::cpp2::Foo& Included::get_MyTransitiveField() const& {
  return MyTransitiveField;
}

 ::cpp2::Foo Included::get_MyTransitiveField() && {
  return std::move(MyTransitiveField);
}


void swap(Included& a, Included& b) {
  using ::std::swap;
  swap(a.MyIntField, b.MyIntField);
  swap(a.MyTransitiveField, b.MyTransitiveField);
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
  swap(a.__isset, b.__isset);
THRIFT_IGNORE_ISSET_USE_WARNING_END
}

template void Included::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Included::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Included::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Included::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Included::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Included::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Included::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Included::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
