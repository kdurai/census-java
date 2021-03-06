/*
 * Copyright 2016, Google Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.census;

/**
 * Census constants for collecting rpc stats.
 */
public final class RpcConstants {
  /**
   * Census defined tag keys.
   */
  public static final TagKey RPC_STATUS = new TagKey("/rpc/status");
  public static final TagKey RPC_CLIENT_METHOD = new TagKey("/rpc/client_method");
  public static final TagKey RPC_SERVER_METHOD = new TagKey("/rpc/server_method");

  /**
   * Census defined metric names.
   */
  public static final MetricName RPC_CLIENT_ERROR_COUNT = new MetricName("/rpc/client/error_count");
  public static final MetricName RPC_CLIENT_REQUEST_BYTES =
      new MetricName("/rpc/client/request_bytes");
  public static final MetricName RPC_CLIENT_RESPONSE_BYTES =
      new MetricName("/rpc/client/response_bytes");
  public static final MetricName RPC_CLIENT_ROUNDTRIP_LATENCY =
      new MetricName("/rpc/client/roundtrip_latency");
  public static final MetricName RPC_CLIENT_UNCOMPRESSED_REQUEST_BYTES =
      new MetricName("/rpc/client/uncompressed_request_bytes");
  public static final MetricName RPC_CLIENT_UNCOMPRESSED_RESPONSE_BYTES =
      new MetricName("/rpc/client/uncompressed_response_bytes");

  public static final MetricName RPC_SERVER_ERROR_COUNT = new MetricName("/rpc/server/error_count");
  public static final MetricName RPC_SERVER_REQUEST_BYTES =
      new MetricName("/rpc/server/request_bytes");
  public static final MetricName RPC_SERVER_RESPONSE_BYTES =
      new MetricName("/rpc/server/response_bytes");
  public static final MetricName RPC_SERVER_SERVER_LATENCY =
      new MetricName("/rpc/server/server_latency");
  public static final MetricName RPC_SERVER_UNCOMPRESSED_REQUEST_BYTES =
      new MetricName("/rpc/server/uncompressed_request_bytes");
  public static final MetricName RPC_SERVER_UNCOMPRESSED_RESPONSE_BYTES =
      new MetricName("/rpc/server/uncompressed_response_bytes");

  //Visible for testing
  RpcConstants() {
    throw new AssertionError();
  }
}
