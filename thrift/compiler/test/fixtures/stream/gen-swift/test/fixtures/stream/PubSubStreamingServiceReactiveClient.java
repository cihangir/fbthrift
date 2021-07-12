/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.stream;

import static com.facebook.swift.service.SwiftConstants.STICKY_HASH_KEY;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.protocol.*;
import org.apache.thrift.ClientPushMetadata;
import org.apache.thrift.InteractionCreate;
import org.apache.thrift.InteractionTerminate;
import com.facebook.thrift.client.ResponseWrapper;
import com.facebook.thrift.client.RpcOptions;


public class PubSubStreamingServiceReactiveClient 
  implements PubSubStreamingService.Reactive {
  private final org.apache.thrift.ProtocolId _protocolId;
  private final reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient;
  private final Map<String, String> _headers;
  private final Map<String, String> _persistentHeaders;
  private final AtomicLong _interactionCounter;
  private final Set<Long> _activeInteractions;

  private static final TField _returnstream_I32_FROM_FIELD_DESC = new TField("i32_from", TType.I32, (short)1);
  private static final TField _returnstream_I32_TO_FIELD_DESC = new TField("i32_to", TType.I32, (short)2);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _returnstream_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _returnstream_STREAM_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final TField _streamthrows_FOO_FIELD_DESC = new TField("foo", TType.I32, (short)1);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _streamthrows_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _streamthrows_STREAM_EXCEPTION_READERS = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _streamthrows_STREAM_EXCEPTION_READER0 =
  oprot -> {
            try {
              test.fixtures.stream.FooEx _r = test.fixtures.stream.FooEx.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final TField _boththrows_FOO_FIELD_DESC = new TField("foo", TType.I32, (short)1);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _boththrows_EXCEPTION_READERS = new HashMap<>();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _boththrows_STREAM_EXCEPTION_READERS = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _boththrows_EXCEPTION_READER0 =
  oprot -> {
            try {
              test.fixtures.stream.FooEx _r = test.fixtures.stream.FooEx.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final com.facebook.thrift.payload.Reader _boththrows_STREAM_EXCEPTION_READER0 =
  oprot -> {
            try {
              test.fixtures.stream.FooEx _r = test.fixtures.stream.FooEx.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final TField _responseandstreamthrows_FOO_FIELD_DESC = new TField("foo", TType.I32, (short)1);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _responseandstreamthrows_EXCEPTION_READERS = new HashMap<>();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _responseandstreamthrows_STREAM_EXCEPTION_READERS = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _responseandstreamthrows_EXCEPTION_READER0 =
  oprot -> {
            try {
              test.fixtures.stream.FooEx _r = test.fixtures.stream.FooEx.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final com.facebook.thrift.payload.Reader _responseandstreamthrows_STREAM_EXCEPTION_READER0 =
  oprot -> {
            try {
              test.fixtures.stream.FooEx _r = test.fixtures.stream.FooEx.read0(oprot);
              return _r;
            } catch (Throwable _e) {
              throw reactor.core.Exceptions.propagate(_e);
            }
          };

  private static final TField _returnstreamFast_I32_FROM_FIELD_DESC = new TField("i32_from", TType.I32, (short)1);
  private static final TField _returnstreamFast_I32_TO_FIELD_DESC = new TField("i32_to", TType.I32, (short)2);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _returnstreamFast_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _returnstreamFast_STREAM_EXCEPTION_READERS = java.util.Collections.emptyMap();

  static {
    _streamthrows_STREAM_EXCEPTION_READERS.put((short)1, _streamthrows_STREAM_EXCEPTION_READER0);
    _boththrows_EXCEPTION_READERS.put((short)1, _boththrows_EXCEPTION_READER0);
    _boththrows_STREAM_EXCEPTION_READERS.put((short)1, _boththrows_STREAM_EXCEPTION_READER0);
    _responseandstreamthrows_EXCEPTION_READERS.put((short)1, _responseandstreamthrows_EXCEPTION_READER0);
    _responseandstreamthrows_STREAM_EXCEPTION_READERS.put((short)1, _responseandstreamthrows_STREAM_EXCEPTION_READER0);
  }

  public PubSubStreamingServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = java.util.Collections.emptyMap();
    this._persistentHeaders = java.util.Collections.emptyMap();
    this._interactionCounter = new AtomicLong(0);
    this._activeInteractions = ConcurrentHashMap.newKeySet();
  }

  public PubSubStreamingServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(_protocolId, _rpcClient, _headers, _persistentHeaders, new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public PubSubStreamingServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headers = _headers;
    this._persistentHeaders = _persistentHeaders;
    this._interactionCounter = interactionCounter;
    this._activeInteractions = activeInteractions;
  }

  @java.lang.Override
  public void dispose() {}

  private com.facebook.thrift.payload.Writer _createreturnstreamWriter(final int i32From, final int i32To) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_returnstream_I32_FROM_FIELD_DESC);

          int _iter0 = i32From;

          oprot.writeI32(i32From);
          oprot.writeFieldEnd();
        }

        {
          oprot.writeFieldBegin(_returnstream_I32_TO_FIELD_DESC);

          int _iter0 = i32To;

          oprot.writeI32(i32To);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _returnstream_READER =
    oprot -> {
              try {
                int _r = oprot.readI32();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };

  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.client.ResponseWrapper<Integer>> returnstreamWrapper(final int i32From, final int i32To,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMapMany(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("returnstream")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Integer> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createreturnstreamWriter(i32From, i32To),
                    _returnstream_READER,
                    _returnstream_EXCEPTION_READERS,
                    _returnstream_STREAM_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestStreamingResponse(_crp, rpcOptions)
                .doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());})
                .filter((_p) -> ((com.facebook.thrift.model.StreamResponse)_p.getData()).isSetData())
                .map(_p -> ResponseWrapper.create(((com.facebook.thrift.model.StreamResponse<Void, Integer>)_p.getData()).getData(), _p.getHeaders(), _p.getBinaryHeaders()));
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> returnstream(final int i32From, final int i32To,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
      return returnstreamWrapper(i32From, i32To,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> returnstream(final int i32From, final int i32To) {
    return returnstream(i32From, i32To,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createstreamthrowsWriter(final int foo) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_streamthrows_FOO_FIELD_DESC);

          int _iter0 = foo;

          oprot.writeI32(foo);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _streamthrows_READER =
    oprot -> {
              try {
                int _r = oprot.readI32();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };

  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.client.ResponseWrapper<Integer>> streamthrowsWrapper(final int foo,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMapMany(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("streamthrows")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Integer> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createstreamthrowsWriter(foo),
                    _streamthrows_READER,
                    _streamthrows_EXCEPTION_READERS,
                    _streamthrows_STREAM_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestStreamingResponse(_crp, rpcOptions)
                .doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());})
                .filter((_p) -> ((com.facebook.thrift.model.StreamResponse)_p.getData()).isSetData())
                .map(_p -> ResponseWrapper.create(((com.facebook.thrift.model.StreamResponse<Void, Integer>)_p.getData()).getData(), _p.getHeaders(), _p.getBinaryHeaders()));
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> streamthrows(final int foo,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
      return streamthrowsWrapper(foo,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> streamthrows(final int foo) {
    return streamthrows(foo,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createboththrowsWriter(final int foo) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_boththrows_FOO_FIELD_DESC);

          int _iter0 = foo;

          oprot.writeI32(foo);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _boththrows_READER =
    oprot -> {
              try {
                int _r = oprot.readI32();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };

  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.client.ResponseWrapper<Integer>> boththrowsWrapper(final int foo,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMapMany(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("boththrows")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Integer> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createboththrowsWriter(foo),
                    _boththrows_READER,
                    _boththrows_EXCEPTION_READERS,
                    _boththrows_STREAM_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestStreamingResponse(_crp, rpcOptions)
                .doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());})
                .filter((_p) -> ((com.facebook.thrift.model.StreamResponse)_p.getData()).isSetData())
                .map(_p -> ResponseWrapper.create(((com.facebook.thrift.model.StreamResponse<Void, Integer>)_p.getData()).getData(), _p.getHeaders(), _p.getBinaryHeaders()));
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> boththrows(final int foo,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
      return boththrowsWrapper(foo,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> boththrows(final int foo) {
    return boththrows(foo,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createresponseandstreamthrowsWriter(final int foo) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_responseandstreamthrows_FOO_FIELD_DESC);

          int _iter0 = foo;

          oprot.writeI32(foo);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _responseandstreamthrows_READER =
    oprot -> {
              try {
                int _r = oprot.readI32();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };

    private static final com.facebook.thrift.payload.Reader _responseandstreamthrows_FIRST_READER =
    oprot -> {
              try {
                int _r = oprot.readI32();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };

  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.client.ResponseWrapper<com.facebook.thrift.model.StreamResponse<Integer,Integer>>> responseandstreamthrowsWrapper(final int foo,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMapMany(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("responseandstreamthrows")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Integer> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createresponseandstreamthrowsWriter(foo),
                    _responseandstreamthrows_READER,
                    _responseandstreamthrows_FIRST_READER,
                    _responseandstreamthrows_EXCEPTION_READERS,
                    _responseandstreamthrows_STREAM_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestStreamingResponse(_crp, rpcOptions)
                .doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());})
                .map(_p -> ResponseWrapper.create(((com.facebook.thrift.model.StreamResponse<Integer,Integer>)_p.getData()), _p.getHeaders(), _p.getBinaryHeaders()));
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.model.StreamResponse<Integer,Integer>> responseandstreamthrows(final int foo,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
      return responseandstreamthrowsWrapper(foo,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.model.StreamResponse<Integer,Integer>> responseandstreamthrows(final int foo) {
    return responseandstreamthrows(foo,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createreturnstreamFastWriter(final int i32From, final int i32To) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_returnstreamFast_I32_FROM_FIELD_DESC);

          int _iter0 = i32From;

          oprot.writeI32(i32From);
          oprot.writeFieldEnd();
        }

        {
          oprot.writeFieldBegin(_returnstreamFast_I32_TO_FIELD_DESC);

          int _iter0 = i32To;

          oprot.writeI32(i32To);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _returnstreamFast_READER =
    oprot -> {
              try {
                int _r = oprot.readI32();
                return _r;


              } catch (Throwable _e) {
                throw reactor.core.Exceptions.propagate(_e);
              }
            };

  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.client.ResponseWrapper<Integer>> returnstreamFastWrapper(final int i32From, final int i32To,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMapMany(_rpc -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("returnstreamFast")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE)
                .setOtherMetadata(getHeaders(rpcOptions))
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Integer> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    _createreturnstreamFastWriter(i32From, i32To),
                    _returnstreamFast_READER,
                    _returnstreamFast_EXCEPTION_READERS,
                    _returnstreamFast_STREAM_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestStreamingResponse(_crp, rpcOptions)
                .doOnNext(_p -> {if(_p.getException() != null) throw reactor.core.Exceptions.propagate(_p.getException());})
                .filter((_p) -> ((com.facebook.thrift.model.StreamResponse)_p.getData()).isSetData())
                .map(_p -> ResponseWrapper.create(((com.facebook.thrift.model.StreamResponse<Void, Integer>)_p.getData()).getData(), _p.getHeaders(), _p.getBinaryHeaders()));
      });
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> returnstreamFast(final int i32From, final int i32To,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
      return returnstreamFastWrapper(i32From, i32To,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<Integer> returnstreamFast(final int i32From, final int i32To) {
    return returnstreamFast(i32From, i32To,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }



  private Map<String, String> getHeaders(com.facebook.thrift.client.RpcOptions rpcOptions) {
      Map<String, String> headers = new HashMap<>();
      if (rpcOptions.getRequestHeaders() != null && !rpcOptions.getRequestHeaders().isEmpty()) {
          headers.putAll(rpcOptions.getRequestHeaders());
      }
      if (_headers != null && !_headers.isEmpty()) {
          headers.putAll(_headers);
      }
      if (_persistentHeaders != null && !_persistentHeaders.isEmpty()) {
          headers.putAll(_persistentHeaders);
      }
      return headers;
  }
}
