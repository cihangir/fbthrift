/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "src/gen-py3/module/metadata.h"

#include <thrift/lib/py3/metadata.h>

namespace cpp2 {
::apache::thrift::metadata::ThriftMetadata module_getThriftModuleMetadata() {
  ::apache::thrift::metadata::ThriftMetadata metadata;
  ::apache::thrift::metadata::ThriftServiceContext serviceContext;
  ::apache::thrift::detail::md::ExceptionMetadata<Fiery>::gen(metadata);
  ::apache::thrift::detail::md::ExceptionMetadata<Serious>::gen(metadata);
  ::apache::thrift::detail::md::ExceptionMetadata<ComplexFieldNames>::gen(metadata);
  ::apache::thrift::detail::md::ExceptionMetadata<CustomFieldNames>::gen(metadata);
  ::apache::thrift::detail::md::ExceptionMetadata<Banal>::gen(metadata);
  ::apache::thrift::detail::md::ServiceMetadata<RaiserSvIf>::gen(metadata, serviceContext);
  ::thrift::py3::extractMetadataFromServiceContext(metadata, serviceContext);
  return metadata;
}
} // namespace cpp2
