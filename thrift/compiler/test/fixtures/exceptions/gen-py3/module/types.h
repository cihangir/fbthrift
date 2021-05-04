/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#pragma once

#include <functional>
#include <folly/Range.h>

#include <thrift/lib/py3/enums.h>
#include "src/gen-cpp2/module_data.h"
#include "src/gen-cpp2/module_types.h"
#include "src/gen-cpp2/module_metadata.h"
namespace thrift {
namespace py3 {



template<>
void reset_field<::cpp2::Fiery>(
    ::cpp2::Fiery& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.message_ref().copy_from(default_inst<::cpp2::Fiery>().message_ref());
      return;
  }
}

template<>
void reset_field<::cpp2::Serious>(
    ::cpp2::Serious& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.sonnet_ref().copy_from(default_inst<::cpp2::Serious>().sonnet_ref());
      return;
  }
}

template<>
void reset_field<::cpp2::ComplexFieldNames>(
    ::cpp2::ComplexFieldNames& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.error_message_ref().copy_from(default_inst<::cpp2::ComplexFieldNames>().error_message_ref());
      return;
    case 1:
      obj.internal_error_message_ref().copy_from(default_inst<::cpp2::ComplexFieldNames>().internal_error_message_ref());
      return;
  }
}

template<>
void reset_field<::cpp2::CustomFieldNames>(
    ::cpp2::CustomFieldNames& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.error_message_ref().copy_from(default_inst<::cpp2::CustomFieldNames>().error_message_ref());
      return;
    case 1:
      obj.internal_error_message_ref().copy_from(default_inst<::cpp2::CustomFieldNames>().internal_error_message_ref());
      return;
  }
}

template<>
void reset_field<::cpp2::Banal>(
    ::cpp2::Banal& obj, uint16_t index) {
  switch (index) {
  }
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::Fiery>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::Serious>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::ComplexFieldNames>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::CustomFieldNames>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::Banal>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}
} // namespace py3
} // namespace thrift
