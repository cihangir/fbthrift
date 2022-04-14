/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.inheritance;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.facebook.thrift.client.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;

@SwiftGenerated
@com.facebook.swift.service.ThriftService("MyLeaf")
public interface MyLeaf extends java.io.Closeable, test.fixtures.inheritance.MyNode {
    static MyLeaf createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId) {
        MyLeaf.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId);
        return new MyLeafReactiveBlockingWrapper(_delegate);
    }

    static MyLeaf createClient(
      final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
      final java.net.SocketAddress _socketAddress,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        MyLeaf.Reactive _delegate = Reactive.createClient(
            _rpcClientFactory,
            _socketAddress,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new MyLeafReactiveBlockingWrapper(_delegate);
    }

    static MyLeaf createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId) {
        MyLeaf.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId);
        return new MyLeafReactiveBlockingWrapper(_delegate);
    }

    static MyLeaf createClient(
      final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
      final org.apache.thrift.ProtocolId _protocolId,
      final java.util.Map<String, String> _headers,
      final java.util.Map<String, String> _persistentHeaders) {
        MyLeaf.Reactive _delegate = Reactive.createClient(
            _rpcClientMono,
            _protocolId,
            _headers,
            _persistentHeaders);
        return new MyLeafReactiveBlockingWrapper(_delegate);
    }

    @com.facebook.swift.service.ThriftService("MyLeaf")
    public interface Async extends java.io.Closeable, test.fixtures.inheritance.MyNode.Async {
        static MyLeaf.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                MyLeaf.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId);
                return new MyLeafReactiveAsyncWrapper(_delegate);
        }

        static MyLeaf.Async createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                MyLeaf.Reactive _delegate = Reactive.createClient(
                    _rpcClientFactory,
                    _socketAddress,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new MyLeafReactiveAsyncWrapper(_delegate);
        }

        static MyLeaf.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                MyLeaf.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId);
                return new MyLeafReactiveAsyncWrapper(_delegate);
        }

        static MyLeaf.Async createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders) {
                MyLeaf.Reactive _delegate = Reactive.createClient(
                    _rpcClientMono,
                    _protocolId,
                    _headers,
                    _persistentHeaders);
                return new MyLeafReactiveAsyncWrapper(_delegate);
        }

        @java.lang.Override void close();

        @ThriftMethod(value = "do_leaf")
        ListenableFuture<Void> doLeaf();

        default ListenableFuture<Void> doLeaf(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> doLeafWrapper(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }
    }
    @java.lang.Override void close();

    @ThriftMethod(value = "do_leaf")
    void doLeaf() throws org.apache.thrift.TException;

    default void doLeaf(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> doLeafWrapper(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @com.facebook.swift.service.ThriftService("MyLeaf")
    interface Reactive extends reactor.core.Disposable, test.fixtures.inheritance.MyNode.Reactive {
        static MyLeaf.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new MyLeafReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        static MyLeaf.Reactive createClient(
            final com.facebook.thrift.client.RpcClientFactory _rpcClientFactory,
            final java.net.SocketAddress _socketAddress,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new MyLeafReactiveClient(
                    _protocolId,
                    _rpcClientFactory.createRpcClient(_socketAddress),
                    _headers,
                    _persistentHeaders);
        }

        static MyLeaf.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId) {
                return new MyLeafReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    java.util.Collections.emptyMap(),
                    java.util.Collections.emptyMap());
        }

        static MyLeaf.Reactive createClient(
            final reactor.core.publisher.Mono<com.facebook.thrift.client.RpcClient> _rpcClientMono,
            final org.apache.thrift.ProtocolId _protocolId,
            final java.util.Map<String, String> _headers,
            final java.util.Map<String, String> _persistentHeaders
            ) {
                return new MyLeafReactiveClient(
                    _protocolId,
                    _rpcClientMono,
                    _headers,
                    _persistentHeaders);
        }

        @ThriftMethod(value = "do_leaf")
        reactor.core.publisher.Mono<Void> doLeaf();

        default reactor.core.publisher.Mono<Void> doLeaf(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> doLeafWrapper(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

    }
}
