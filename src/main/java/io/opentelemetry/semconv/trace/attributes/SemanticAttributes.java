/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.trace.attributes;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/semantic-convention/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class SemanticAttributes {
  /** The URL of the OpenTelemetry schema for these keys and values. */
  public static final String SCHEMA_URL = "https://opentelemetry.io/schemas/1.21.0";

  /**
   * Client address - unix domain socket name, IPv4 or IPv6 address.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the server side, and when communicating through an intermediary,
   *       {@code client.address} SHOULD represent client address behind any intermediaries (e.g.
   *       proxies) if it's available.
   * </ul>
   */
  public static final AttributeKey<String> CLIENT_ADDRESS = stringKey("client.address");

  /**
   * Client port number
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the server side, and when communicating through an intermediary,
   *       {@code client.port} SHOULD represent client port behind any intermediaries (e.g. proxies)
   *       if it's available.
   * </ul>
   */
  public static final AttributeKey<Long> CLIENT_PORT = longKey("client.port");

  /** Immediate client peer address - unix domain socket name, IPv4 or IPv6 address. */
  public static final AttributeKey<String> CLIENT_SOCKET_ADDRESS =
      stringKey("client.socket.address");

  /** Immediate client peer port number */
  public static final AttributeKey<Long> CLIENT_SOCKET_PORT = longKey("client.socket.port");

  /**
   * Deprecated, use {@code http.request.method} instead.
   *
   * @deprecated Deprecated, use `http.request.method` instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_METHOD = stringKey("http.method");

  /**
   * Deprecated, use {@code http.response.status_code} instead.
   *
   * @deprecated Deprecated, use `http.response.status_code` instead.
   */
  @Deprecated public static final AttributeKey<Long> HTTP_STATUS_CODE = longKey("http.status_code");

  /**
   * Deprecated, use {@code url.scheme} instead.
   *
   * @deprecated Deprecated, use `url.scheme` instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_SCHEME = stringKey("http.scheme");

  /**
   * Deprecated, use {@code url.full} instead.
   *
   * @deprecated Deprecated, use `url.full` instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_URL = stringKey("http.url");

  /**
   * Deprecated, use {@code url.path} and {@code url.query} instead.
   *
   * @deprecated Deprecated, use `url.path` and `url.query` instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_TARGET = stringKey("http.target");

  /**
   * Deprecated, use {@code http.request.body.size} instead.
   *
   * @deprecated Deprecated, use `http.request.body.size` instead.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH =
      longKey("http.request_content_length");

  /**
   * Deprecated, use {@code http.response.body.size} instead.
   *
   * @deprecated Deprecated, use `http.response.body.size` instead.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH =
      longKey("http.response_content_length");

  /**
   * Deprecated, use {@code server.socket.domain} on client spans.
   *
   * @deprecated Deprecated, use `server.socket.domain` on client spans.
   */
  @Deprecated
  public static final AttributeKey<String> NET_SOCK_PEER_NAME = stringKey("net.sock.peer.name");

  /**
   * Deprecated, use {@code server.socket.address} on client spans and {@code client.socket.address}
   * on server spans.
   *
   * @deprecated Deprecated, use `server.socket.address` on client spans and `client.socket.address`
   *     on server spans.
   */
  @Deprecated
  public static final AttributeKey<String> NET_SOCK_PEER_ADDR = stringKey("net.sock.peer.addr");

  /**
   * Deprecated, use {@code server.socket.port} on client spans and {@code client.socket.port} on
   * server spans.
   *
   * @deprecated Deprecated, use `server.socket.port` on client spans and `client.socket.port` on
   *     server spans.
   */
  @Deprecated
  public static final AttributeKey<Long> NET_SOCK_PEER_PORT = longKey("net.sock.peer.port");

  /**
   * Deprecated, use {@code server.address} on client spans and {@code client.address} on server
   * spans.
   *
   * @deprecated Deprecated, use `server.address` on client spans and `client.address` on server
   *     spans.
   */
  @Deprecated public static final AttributeKey<String> NET_PEER_NAME = stringKey("net.peer.name");

  /**
   * Deprecated, use {@code server.port} on client spans and {@code client.port} on server spans.
   *
   * @deprecated Deprecated, use `server.port` on client spans and `client.port` on server spans.
   */
  @Deprecated public static final AttributeKey<Long> NET_PEER_PORT = longKey("net.peer.port");

  /**
   * Deprecated, use {@code server.address}.
   *
   * @deprecated Deprecated, use `server.address`.
   */
  @Deprecated public static final AttributeKey<String> NET_HOST_NAME = stringKey("net.host.name");

  /**
   * Deprecated, use {@code server.port}.
   *
   * @deprecated Deprecated, use `server.port`.
   */
  @Deprecated public static final AttributeKey<Long> NET_HOST_PORT = longKey("net.host.port");

  /**
   * Deprecated, use {@code server.socket.address}.
   *
   * @deprecated Deprecated, use `server.socket.address`.
   */
  @Deprecated
  public static final AttributeKey<String> NET_SOCK_HOST_ADDR = stringKey("net.sock.host.addr");

  /**
   * Deprecated, use {@code server.socket.port}.
   *
   * @deprecated Deprecated, use `server.socket.port`.
   */
  @Deprecated
  public static final AttributeKey<Long> NET_SOCK_HOST_PORT = longKey("net.sock.host.port");

  /**
   * Deprecated, use {@code network.transport}.
   *
   * @deprecated Deprecated, use `network.transport`.
   */
  @Deprecated public static final AttributeKey<String> NET_TRANSPORT = stringKey("net.transport");

  /**
   * Deprecated, use {@code network.protocol.name}.
   *
   * @deprecated Deprecated, use `network.protocol.name`.
   */
  @Deprecated
  public static final AttributeKey<String> NET_PROTOCOL_NAME = stringKey("net.protocol.name");

  /**
   * Deprecated, use {@code network.protocol.version}.
   *
   * @deprecated Deprecated, use `network.protocol.version`.
   */
  @Deprecated
  public static final AttributeKey<String> NET_PROTOCOL_VERSION = stringKey("net.protocol.version");

  /**
   * Deprecated, use {@code network.transport} and {@code network.type}.
   *
   * @deprecated Deprecated, use `network.transport` and `network.type`.
   */
  @Deprecated
  public static final AttributeKey<String> NET_SOCK_FAMILY = stringKey("net.sock.family");

  /**
   * The domain name of the destination system.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This value may be a host name, a fully qualified domain name, or another host naming
   *       format.
   * </ul>
   */
  public static final AttributeKey<String> DESTINATION_DOMAIN = stringKey("destination.domain");

  /** Peer address, for example IP address or UNIX socket name. */
  public static final AttributeKey<String> DESTINATION_ADDRESS = stringKey("destination.address");

  /** Peer port number */
  public static final AttributeKey<Long> DESTINATION_PORT = longKey("destination.port");

  /**
   * The type of the exception (its fully-qualified class name, if applicable). The dynamic type of
   * the exception should be preferred over the static type in languages that support it.
   */
  public static final AttributeKey<String> EXCEPTION_TYPE = stringKey("exception.type");

  /** The exception message. */
  public static final AttributeKey<String> EXCEPTION_MESSAGE = stringKey("exception.message");

  /**
   * A stacktrace as a string in the natural representation for the language runtime. The
   * representation is to be determined and documented by each language SIG.
   */
  public static final AttributeKey<String> EXCEPTION_STACKTRACE = stringKey("exception.stacktrace");

  /**
   * HTTP request method.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>HTTP request method value SHOULD be &quot;known&quot; to the instrumentation. By default,
   *       this convention defines &quot;known&quot; methods as the ones listed in <a
   *       href="https://www.rfc-editor.org/rfc/rfc9110.html#name-methods">RFC9110</a> and the PATCH
   *       method defined in <a href="https://www.rfc-editor.org/rfc/rfc5789.html">RFC5789</a>.
   *   <li>If the HTTP request method is not known to instrumentation, it MUST set the {@code
   *       http.request.method} attribute to {@code _OTHER} and, except if reporting a metric, MUST
   *       set the exact method received in the request line as value of the {@code
   *       http.request.method_original} attribute.
   *   <li>If the HTTP instrumentation could end up converting valid HTTP request methods to {@code
   *       _OTHER}, then it MUST provide a way to override the list of known HTTP methods. If this
   *       override is done via environment variable, then the environment variable MUST be named
   *       OTEL_INSTRUMENTATION_HTTP_KNOWN_METHODS and support a comma-separated list of
   *       case-sensitive known HTTP methods (this list MUST be a full override of the default known
   *       method, it is not a list of known methods in addition to the defaults).
   *   <li>HTTP method names are case-sensitive and {@code http.request.method} attribute value MUST
   *       match a known HTTP method name exactly. Instrumentations for specific web frameworks that
   *       consider HTTP methods to be case insensitive, SHOULD populate a canonical equivalent.
   *       Tracing instrumentations that do so, MUST also set {@code http.request.method_original}
   *       to the original value.
   * </ul>
   */
  public static final AttributeKey<String> HTTP_REQUEST_METHOD = stringKey("http.request.method");

  /** <a href="https://tools.ietf.org/html/rfc7231#section-6">HTTP response status code</a>. */
  public static final AttributeKey<Long> HTTP_RESPONSE_STATUS_CODE =
      longKey("http.response.status_code");

  /**
   * The matched route (path template in the format used by the respective server framework). See
   * note below
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>MUST NOT be populated when this is not supported by the HTTP server framework as the
   *       route attribute should have low-cardinality and the URI path can NOT substitute it.
   *       SHOULD include the <a href="/docs/http/http-spans.md#http-server-definitions">application
   *       root</a> if there is one.
   * </ul>
   */
  public static final AttributeKey<String> HTTP_ROUTE = stringKey("http.route");

  /** The name identifies the event. */
  public static final AttributeKey<String> EVENT_NAME = stringKey("event.name");

  /**
   * The domain identifies the business context for the events.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Events across different domains may have same {@code event.name}, yet be unrelated
   *       events.
   * </ul>
   */
  public static final AttributeKey<String> EVENT_DOMAIN = stringKey("event.domain");

  /**
   * A unique identifier for the Log Record.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If an id is provided, other log records with the same id will be considered duplicates
   *       and can be removed safely. This means, that two distinguishable log records MUST have
   *       different values. The id MAY be an <a href="https://github.com/ulid/spec">Universally
   *       Unique Lexicographically Sortable Identifier (ULID)</a>, but other identifiers (e.g.
   *       UUID) may be used as needed.
   * </ul>
   */
  public static final AttributeKey<String> LOG_RECORD_UID = stringKey("log.record.uid");

  /** The stream associated with the log. See below for a list of well-known values. */
  public static final AttributeKey<String> LOG_IOSTREAM = stringKey("log.iostream");

  /** The basename of the file. */
  public static final AttributeKey<String> LOG_FILE_NAME = stringKey("log.file.name");

  /** The full path to the file. */
  public static final AttributeKey<String> LOG_FILE_PATH = stringKey("log.file.path");

  /** The basename of the file, with symlinks resolved. */
  public static final AttributeKey<String> LOG_FILE_NAME_RESOLVED =
      stringKey("log.file.name_resolved");

  /** The full path to the file, with symlinks resolved. */
  public static final AttributeKey<String> LOG_FILE_PATH_RESOLVED =
      stringKey("log.file.path_resolved");

  /** The type of memory. */
  public static final AttributeKey<String> TYPE = stringKey("type");

  /**
   * Name of the memory pool.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Pool names are generally obtained via <a
   *       href="https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryPoolMXBean.html#getName()">MemoryPoolMXBean#getName()</a>.
   * </ul>
   */
  public static final AttributeKey<String> POOL = stringKey("pool");

  /**
   * Logical server hostname, matches server FQDN if available, and IP or socket address if FQDN is
   * not known.
   */
  public static final AttributeKey<String> SERVER_ADDRESS = stringKey("server.address");

  /** Logical server port number */
  public static final AttributeKey<Long> SERVER_PORT = longKey("server.port");

  /**
   * The domain name of an immediate peer.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Typically observed from the client side, and represents a proxy or other intermediary
   *       domain name.
   * </ul>
   */
  public static final AttributeKey<String> SERVER_SOCKET_DOMAIN = stringKey("server.socket.domain");

  /**
   * Physical server IP address or Unix socket address. If set from the client, should simply use
   * the socket's peer address, and not attempt to find any actual server IP (i.e., if set from
   * client, this may represent some proxy server instead of the logical server).
   */
  public static final AttributeKey<String> SERVER_SOCKET_ADDRESS =
      stringKey("server.socket.address");

  /** Physical server port. */
  public static final AttributeKey<Long> SERVER_SOCKET_PORT = longKey("server.socket.port");

  /**
   * The domain name of the source system.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This value may be a host name, a fully qualified domain name, or another host naming
   *       format.
   * </ul>
   */
  public static final AttributeKey<String> SOURCE_DOMAIN = stringKey("source.domain");

  /** Source address, for example IP address or Unix socket name. */
  public static final AttributeKey<String> SOURCE_ADDRESS = stringKey("source.address");

  /** Source port number */
  public static final AttributeKey<Long> SOURCE_PORT = longKey("source.port");

  /**
   * The full invoked ARN as provided on the {@code Context} passed to the function ({@code
   * Lambda-Runtime-Invoked-Function-Arn} header on the {@code /runtime/invocation/next}
   * applicable).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This may be different from {@code cloud.resource_id} if an alias is involved.
   * </ul>
   */
  public static final AttributeKey<String> AWS_LAMBDA_INVOKED_ARN =
      stringKey("aws.lambda.invoked_arn");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#id">event_id</a>
   * uniquely identifies the event.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_ID = stringKey("cloudevents.event_id");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#source-1">source</a>
   * identifies the context in which an event happened.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SOURCE =
      stringKey("cloudevents.event_source");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#specversion">version
   * of the CloudEvents specification</a> which the event uses.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SPEC_VERSION =
      stringKey("cloudevents.event_spec_version");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#type">event_type</a>
   * contains a value describing the type of event related to the originating occurrence.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_TYPE =
      stringKey("cloudevents.event_type");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#subject">subject</a>
   * of the event in the context of the event producer (identified by source).
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SUBJECT =
      stringKey("cloudevents.event_subject");

  /**
   * Parent-child Reference type
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The causal relationship between a child Span and a parent Span.
   * </ul>
   */
  public static final AttributeKey<String> OPENTRACING_REF_TYPE = stringKey("opentracing.ref_type");

  /**
   * An identifier for the database management system (DBMS) product being used. See below for a
   * list of well-known identifiers.
   */
  public static final AttributeKey<String> DB_SYSTEM = stringKey("db.system");

  /**
   * The connection string used to connect to the database. It is recommended to remove embedded
   * credentials.
   */
  public static final AttributeKey<String> DB_CONNECTION_STRING = stringKey("db.connection_string");

  /** Username for accessing the database. */
  public static final AttributeKey<String> DB_USER = stringKey("db.user");

  /**
   * The fully-qualified class name of the <a
   * href="https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/">Java Database Connectivity
   * (JDBC)</a> driver used to connect.
   */
  public static final AttributeKey<String> DB_JDBC_DRIVER_CLASSNAME =
      stringKey("db.jdbc.driver_classname");

  /**
   * This attribute is used to report the name of the database being accessed. For commands that
   * switch the database, this should be set to the target database (even if the command fails).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>In some SQL databases, the database name to be used is called &quot;schema name&quot;. In
   *       case there are multiple layers that could be considered for database name (e.g. Oracle
   *       instance name and schema name), the database name to be used is the more specific layer
   *       (e.g. Oracle schema name).
   * </ul>
   */
  public static final AttributeKey<String> DB_NAME = stringKey("db.name");

  /** The database statement being executed. */
  public static final AttributeKey<String> DB_STATEMENT = stringKey("db.statement");

  /**
   * The name of the operation being executed, e.g. the <a
   * href="https://docs.mongodb.com/manual/reference/command/#database-operations">MongoDB command
   * name</a> such as {@code findAndModify}, or the SQL keyword.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When setting this to an SQL keyword, it is not recommended to attempt any client-side
   *       parsing of {@code db.statement} just to get this property, but it should be set if the
   *       operation name is provided by the library being instrumented. If the SQL statement has an
   *       ambiguous operation, or performs more than one operation, this value may be omitted.
   * </ul>
   */
  public static final AttributeKey<String> DB_OPERATION = stringKey("db.operation");

  /**
   * The Microsoft SQL Server <a
   * href="https://docs.microsoft.com/en-us/sql/connect/jdbc/building-the-connection-url?view=sql-server-ver15">instance
   * name</a> connecting to. This name is used to determine the port of a named instance.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If setting a {@code db.mssql.instance_name}, {@code server.port} is no longer required
   *       (but still recommended if non-standard).
   * </ul>
   */
  public static final AttributeKey<String> DB_MSSQL_INSTANCE_NAME =
      stringKey("db.mssql.instance_name");

  /** The fetch size used for paging, i.e. how many rows will be returned at once. */
  public static final AttributeKey<Long> DB_CASSANDRA_PAGE_SIZE = longKey("db.cassandra.page_size");

  /**
   * The consistency level of the query. Based on consistency values from <a
   * href="https://docs.datastax.com/en/cassandra-oss/3.0/cassandra/dml/dmlConfigConsistency.html">CQL</a>.
   */
  public static final AttributeKey<String> DB_CASSANDRA_CONSISTENCY_LEVEL =
      stringKey("db.cassandra.consistency_level");

  /**
   * The name of the primary table that the operation is acting upon, including the keyspace name
   * (if applicable).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This mirrors the db.sql.table attribute but references cassandra rather than sql. It is
   *       not recommended to attempt any client-side parsing of {@code db.statement} just to get
   *       this property, but it should be set if it is provided by the library being instrumented.
   *       If the operation is acting upon an anonymous table, or more than one table, this value
   *       MUST NOT be set.
   * </ul>
   */
  public static final AttributeKey<String> DB_CASSANDRA_TABLE = stringKey("db.cassandra.table");

  /** Whether or not the query is idempotent. */
  public static final AttributeKey<Boolean> DB_CASSANDRA_IDEMPOTENCE =
      booleanKey("db.cassandra.idempotence");

  /**
   * The number of times a query was speculatively executed. Not set or {@code 0} if the query was
   * not executed speculatively.
   */
  public static final AttributeKey<Long> DB_CASSANDRA_SPECULATIVE_EXECUTION_COUNT =
      longKey("db.cassandra.speculative_execution_count");

  /** The ID of the coordinating node for a query. */
  public static final AttributeKey<String> DB_CASSANDRA_COORDINATOR_ID =
      stringKey("db.cassandra.coordinator.id");

  /** The data center of the coordinating node for a query. */
  public static final AttributeKey<String> DB_CASSANDRA_COORDINATOR_DC =
      stringKey("db.cassandra.coordinator.dc");

  /**
   * The index of the database being accessed as used in the <a
   * href="https://redis.io/commands/select">{@code SELECT} command</a>, provided as an integer. To
   * be used instead of the generic {@code db.name} attribute.
   */
  public static final AttributeKey<Long> DB_REDIS_DATABASE_INDEX =
      longKey("db.redis.database_index");

  /** The collection being accessed within the database stated in {@code db.name}. */
  public static final AttributeKey<String> DB_MONGODB_COLLECTION =
      stringKey("db.mongodb.collection");

  /**
   * The name of the primary table that the operation is acting upon, including the database name
   * (if applicable).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It is not recommended to attempt any client-side parsing of {@code db.statement} just to
   *       get this property, but it should be set if it is provided by the library being
   *       instrumented. If the operation is acting upon an anonymous table, or more than one table,
   *       this value MUST NOT be set.
   * </ul>
   */
  public static final AttributeKey<String> DB_SQL_TABLE = stringKey("db.sql.table");

  /** Unique Cosmos client instance id. */
  public static final AttributeKey<String> DB_COSMOSDB_CLIENT_ID =
      stringKey("db.cosmosdb.client_id");

  /** CosmosDB Operation Type. */
  public static final AttributeKey<String> DB_COSMOSDB_OPERATION_TYPE =
      stringKey("db.cosmosdb.operation_type");

  /** Cosmos client connection mode. */
  public static final AttributeKey<String> DB_COSMOSDB_CONNECTION_MODE =
      stringKey("db.cosmosdb.connection_mode");

  /** Cosmos DB container name. */
  public static final AttributeKey<String> DB_COSMOSDB_CONTAINER =
      stringKey("db.cosmosdb.container");

  /** Request payload size in bytes */
  public static final AttributeKey<Long> DB_COSMOSDB_REQUEST_CONTENT_LENGTH =
      longKey("db.cosmosdb.request_content_length");

  /** Cosmos DB status code. */
  public static final AttributeKey<Long> DB_COSMOSDB_STATUS_CODE =
      longKey("db.cosmosdb.status_code");

  /** Cosmos DB sub status code. */
  public static final AttributeKey<Long> DB_COSMOSDB_SUB_STATUS_CODE =
      longKey("db.cosmosdb.sub_status_code");

  /** RU consumed for that operation */
  public static final AttributeKey<Double> DB_COSMOSDB_REQUEST_CHARGE =
      doubleKey("db.cosmosdb.request_charge");

  /**
   * Name of the code, either &quot;OK&quot; or &quot;ERROR&quot;. MUST NOT be set if the status
   * code is UNSET.
   */
  public static final AttributeKey<String> OTEL_STATUS_CODE = stringKey("otel.status_code");

  /** Description of the Status if it has a value, otherwise not set. */
  public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION =
      stringKey("otel.status_description");

  /**
   * Type of the trigger which caused this function invocation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>For the server/consumer span on the incoming side, {@code faas.trigger} MUST be set.
   *   <li>Clients invoking FaaS instances usually cannot set {@code faas.trigger}, since they would
   *       typically need to look in the payload to determine the event type. If clients set it, it
   *       should be the same as the trigger that corresponding incoming would have (i.e., this has
   *       nothing to do with the underlying transport used to make the API call to invoke the
   *       lambda, which is often HTTP).
   * </ul>
   */
  public static final AttributeKey<String> FAAS_TRIGGER = stringKey("faas.trigger");

  /** The invocation ID of the current function invocation. */
  public static final AttributeKey<String> FAAS_INVOCATION_ID = stringKey("faas.invocation_id");

  /**
   * The name of the source on which the triggering operation was performed. For example, in Cloud
   * Storage or S3 corresponds to the bucket name, and in Cosmos DB to the database name.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_COLLECTION =
      stringKey("faas.document.collection");

  /** Describes the type of the operation that was performed on the data. */
  public static final AttributeKey<String> FAAS_DOCUMENT_OPERATION =
      stringKey("faas.document.operation");

  /**
   * A string containing the time when the data was accessed in the <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format expressed in
   * <a href="https://www.w3.org/TR/NOTE-datetime">UTC</a>.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_TIME = stringKey("faas.document.time");

  /**
   * The document name/table subjected to the operation. For example, in Cloud Storage or S3 is the
   * name of the file, and in Cosmos DB the table name.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_NAME = stringKey("faas.document.name");

  /**
   * A string containing the function invocation time in the <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format expressed in
   * <a href="https://www.w3.org/TR/NOTE-datetime">UTC</a>.
   */
  public static final AttributeKey<String> FAAS_TIME = stringKey("faas.time");

  /**
   * A string containing the schedule period as <a
   * href="https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm">Cron
   * Expression</a>.
   */
  public static final AttributeKey<String> FAAS_CRON = stringKey("faas.cron");

  /**
   * A boolean that is true if the serverless function is executed for the first time (aka
   * cold-start).
   */
  public static final AttributeKey<Boolean> FAAS_COLDSTART = booleanKey("faas.coldstart");

  /**
   * The name of the invoked function.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>SHOULD be equal to the {@code faas.name} resource attribute of the invoked function.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_INVOKED_NAME = stringKey("faas.invoked_name");

  /**
   * The cloud provider of the invoked function.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>SHOULD be equal to the {@code cloud.provider} resource attribute of the invoked function.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_INVOKED_PROVIDER =
      stringKey("faas.invoked_provider");

  /**
   * The cloud region of the invoked function.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>SHOULD be equal to the {@code cloud.region} resource attribute of the invoked function.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_INVOKED_REGION = stringKey("faas.invoked_region");

  /** The unique identifier of the feature flag. */
  public static final AttributeKey<String> FEATURE_FLAG_KEY = stringKey("feature_flag.key");

  /** The name of the service provider that performs the flag evaluation. */
  public static final AttributeKey<String> FEATURE_FLAG_PROVIDER_NAME =
      stringKey("feature_flag.provider_name");

  /**
   * SHOULD be a semantic identifier for a value. If one is unavailable, a stringified version of
   * the value can be used.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>A semantic identifier, commonly referred to as a variant, provides a means for referring
   *       to a value without including the value itself. This can provide additional context for
   *       understanding the meaning behind a value. For example, the variant {@code red} maybe be
   *       used for the value {@code #c05543}.
   *   <li>A stringified version of the value can be used in situations where a semantic identifier
   *       is unavailable. String representation of the value should be determined by the
   *       implementer.
   * </ul>
   */
  public static final AttributeKey<String> FEATURE_FLAG_VARIANT = stringKey("feature_flag.variant");

  /**
   * <a href="https://osi-model.com/transport-layer/">OSI Transport Layer</a> or <a
   * href="https://en.wikipedia.org/wiki/Inter-process_communication">Inter-process Communication
   * method</a>. The value SHOULD be normalized to lowercase.
   */
  public static final AttributeKey<String> NETWORK_TRANSPORT = stringKey("network.transport");

  /**
   * <a href="https://osi-model.com/network-layer/">OSI Network Layer</a> or non-OSI equivalent. The
   * value SHOULD be normalized to lowercase.
   */
  public static final AttributeKey<String> NETWORK_TYPE = stringKey("network.type");

  /**
   * <a href="https://osi-model.com/application-layer/">OSI Application Layer</a> or non-OSI
   * equivalent. The value SHOULD be normalized to lowercase.
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_NAME =
      stringKey("network.protocol.name");

  /**
   * Version of the application layer protocol used. See note below.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>{@code network.protocol.version} refers to the version of the protocol used and might be
   *       different from the protocol client's version. If the HTTP client used has a version of
   *       {@code 0.27.2}, but sends HTTP version {@code 1.1}, this attribute should be set to
   *       {@code 1.1}.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_VERSION =
      stringKey("network.protocol.version");

  /** The internet connection type. */
  public static final AttributeKey<String> NETWORK_CONNECTION_TYPE =
      stringKey("network.connection.type");

  /**
   * This describes more details regarding the connection.type. It may be the type of cell
   * technology connection, but it could be used for describing details about a wifi connection.
   */
  public static final AttributeKey<String> NETWORK_CONNECTION_SUBTYPE =
      stringKey("network.connection.subtype");

  /** The name of the mobile carrier. */
  public static final AttributeKey<String> NETWORK_CARRIER_NAME = stringKey("network.carrier.name");

  /** The mobile carrier country code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MCC = stringKey("network.carrier.mcc");

  /** The mobile carrier network code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MNC = stringKey("network.carrier.mnc");

  /** The ISO 3166-1 alpha-2 2-character country code associated with the mobile carrier network. */
  public static final AttributeKey<String> NETWORK_CARRIER_ICC = stringKey("network.carrier.icc");

  /**
   * The <a href="/docs/resource/README.md#service">{@code service.name}</a> of the remote service.
   * SHOULD be equal to the actual {@code service.name} resource attribute of the remote service if
   * any.
   */
  public static final AttributeKey<String> PEER_SERVICE = stringKey("peer.service");

  /**
   * Username or client_id extracted from the access token or <a
   * href="https://tools.ietf.org/html/rfc7235#section-4.2">Authorization</a> header in the inbound
   * request from outside the system.
   */
  public static final AttributeKey<String> ENDUSER_ID = stringKey("enduser.id");

  /**
   * Actual/assumed role the client is making the request under extracted from token or application
   * security context.
   */
  public static final AttributeKey<String> ENDUSER_ROLE = stringKey("enduser.role");

  /**
   * Scopes or granted authorities the client currently possesses extracted from token or
   * application security context. The value would come from the scope associated with an <a
   * href="https://tools.ietf.org/html/rfc6749#section-3.3">OAuth 2.0 Access Token</a> or an
   * attribute value in a <a
   * href="http://docs.oasis-open.org/security/saml/Post2.0/sstc-saml-tech-overview-2.0.html">SAML
   * 2.0 Assertion</a>.
   */
  public static final AttributeKey<String> ENDUSER_SCOPE = stringKey("enduser.scope");

  /** Current &quot;managed&quot; thread ID (as opposed to OS thread ID). */
  public static final AttributeKey<Long> THREAD_ID = longKey("thread.id");

  /** Current thread name. */
  public static final AttributeKey<String> THREAD_NAME = stringKey("thread.name");

  /**
   * The method or function name, or equivalent (usually rightmost part of the code unit's name).
   */
  public static final AttributeKey<String> CODE_FUNCTION = stringKey("code.function");

  /**
   * The &quot;namespace&quot; within which {@code code.function} is defined. Usually the qualified
   * class or module name, such that {@code code.namespace} + some separator + {@code code.function}
   * form a unique identifier for the code unit.
   */
  public static final AttributeKey<String> CODE_NAMESPACE = stringKey("code.namespace");

  /**
   * The source code file name that identifies the code unit as uniquely as possible (preferably an
   * absolute file path).
   */
  public static final AttributeKey<String> CODE_FILEPATH = stringKey("code.filepath");

  /**
   * The line number in {@code code.filepath} best representing the operation. It SHOULD point
   * within the code unit named in {@code code.function}.
   */
  public static final AttributeKey<Long> CODE_LINENO = longKey("code.lineno");

  /**
   * The column number in {@code code.filepath} best representing the operation. It SHOULD point
   * within the code unit named in {@code code.function}.
   */
  public static final AttributeKey<Long> CODE_COLUMN = longKey("code.column");

  /** Original HTTP method sent by the client in the request line. */
  public static final AttributeKey<String> HTTP_REQUEST_METHOD_ORIGINAL =
      stringKey("http.request.method_original");

  /**
   * The size of the request payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_BODY_SIZE = longKey("http.request.body.size");

  /**
   * The size of the response payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_BODY_SIZE =
      longKey("http.response.body.size");

  /**
   * The ordinal number of request resending attempt (for any reason, including redirects).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The resend count SHOULD be updated each time an HTTP request gets resent by the client,
   *       regardless of what was the cause of the resending (e.g. redirection, authorization
   *       failure, 503 Server Unavailable, network issues, or any other).
   * </ul>
   */
  public static final AttributeKey<Long> HTTP_RESEND_COUNT = longKey("http.resend_count");

  /**
   * The AWS request ID as returned in the response headers {@code x-amz-request-id} or {@code
   * x-amz-requestid}.
   */
  public static final AttributeKey<String> AWS_REQUEST_ID = stringKey("aws.request_id");

  /** The keys in the {@code RequestItems} object field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_TABLE_NAMES =
      stringArrayKey("aws.dynamodb.table_names");

  /** The JSON-serialized value of each item in the {@code ConsumedCapacity} response field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_CONSUMED_CAPACITY =
      stringArrayKey("aws.dynamodb.consumed_capacity");

  /** The JSON-serialized value of the {@code ItemCollectionMetrics} response field. */
  public static final AttributeKey<String> AWS_DYNAMODB_ITEM_COLLECTION_METRICS =
      stringKey("aws.dynamodb.item_collection_metrics");

  /** The value of the {@code ProvisionedThroughput.ReadCapacityUnits} request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_READ_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_read_capacity");

  /** The value of the {@code ProvisionedThroughput.WriteCapacityUnits} request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_write_capacity");

  /** The value of the {@code ConsistentRead} request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_CONSISTENT_READ =
      booleanKey("aws.dynamodb.consistent_read");

  /** The value of the {@code ProjectionExpression} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_PROJECTION =
      stringKey("aws.dynamodb.projection");

  /** The value of the {@code Limit} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_LIMIT = longKey("aws.dynamodb.limit");

  /** The value of the {@code AttributesToGet} request parameter. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTES_TO_GET =
      stringArrayKey("aws.dynamodb.attributes_to_get");

  /** The value of the {@code IndexName} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_INDEX_NAME =
      stringKey("aws.dynamodb.index_name");

  /** The value of the {@code Select} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_SELECT = stringKey("aws.dynamodb.select");

  /** The JSON-serialized value of each item of the {@code GlobalSecondaryIndexes} request field */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.global_secondary_indexes");

  /** The JSON-serialized value of each item of the {@code LocalSecondaryIndexes} request field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.local_secondary_indexes");

  /** The value of the {@code ExclusiveStartTableName} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_EXCLUSIVE_START_TABLE =
      stringKey("aws.dynamodb.exclusive_start_table");

  /** The the number of items in the {@code TableNames} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_TABLE_COUNT =
      longKey("aws.dynamodb.table_count");

  /** The value of the {@code ScanIndexForward} request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_SCAN_FORWARD =
      booleanKey("aws.dynamodb.scan_forward");

  /** The value of the {@code Segment} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SEGMENT = longKey("aws.dynamodb.segment");

  /** The value of the {@code TotalSegments} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_TOTAL_SEGMENTS =
      longKey("aws.dynamodb.total_segments");

  /** The value of the {@code Count} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_COUNT = longKey("aws.dynamodb.count");

  /** The value of the {@code ScannedCount} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SCANNED_COUNT =
      longKey("aws.dynamodb.scanned_count");

  /** The JSON-serialized value of each item in the {@code AttributeDefinitions} request field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS =
      stringArrayKey("aws.dynamodb.attribute_definitions");

  /**
   * The JSON-serialized value of each item in the the {@code GlobalSecondaryIndexUpdates} request
   * field.
   */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES =
      stringArrayKey("aws.dynamodb.global_secondary_index_updates");

  /**
   * The S3 bucket name the request refers to. Corresponds to the {@code --bucket} parameter of the
   * <a href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a>
   * operations.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code bucket} attribute is applicable to all S3 operations that reference a bucket,
   *       i.e. that require the bucket name as a mandatory parameter. This applies to almost all S3
   *       operations except {@code list-buckets}.
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_BUCKET = stringKey("aws.s3.bucket");

  /**
   * The S3 object key the request refers to. Corresponds to the {@code --key} parameter of the <a
   * href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a> operations.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code key} attribute is applicable to all object-related S3 operations, i.e. that
   *       require the object key as a mandatory parameter. This applies in particular to the
   *       following operations:
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html">copy-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html">delete-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/get-object.html">get-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/head-object.html">head-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/put-object.html">put-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/restore-object.html">restore-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/select-object-content.html">select-object-content</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html">abort-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html">complete-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/create-multipart-upload.html">create-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html">list-parts</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_KEY = stringKey("aws.s3.key");

  /**
   * The source object (in the form {@code bucket}/{@code key}) for the copy operation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code copy_source} attribute applies to S3 copy operations and corresponds to the
   *       {@code --copy-source} parameter of the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html">copy-object
   *       operation within the S3 API</a>. This applies in particular to the following operations:
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html">copy-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_COPY_SOURCE = stringKey("aws.s3.copy_source");

  /**
   * Upload ID that identifies the multipart upload.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code upload_id} attribute applies to S3 multipart-upload operations and corresponds
   *       to the {@code --upload-id} parameter of the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a>
   *       multipart operations. This applies in particular to the following operations:
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html">abort-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html">complete-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html">list-parts</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_UPLOAD_ID = stringKey("aws.s3.upload_id");

  /**
   * The delete request container that specifies the objects to be deleted.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code delete} attribute is only applicable to the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html">delete-object</a>
   *       operation. The {@code delete} attribute corresponds to the {@code --delete} parameter of
   *       the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-objects.html">delete-objects
   *       operation within the S3 API</a>.
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_DELETE = stringKey("aws.s3.delete");

  /**
   * The part number of the part being uploaded in a multipart-upload operation. This is a positive
   * integer between 1 and 10,000.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code part_number} attribute is only applicable to the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part</a>
   *       and <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   *       operations. The {@code part_number} attribute corresponds to the {@code --part-number}
   *       parameter of the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part
   *       operation within the S3 API</a>.
   * </ul>
   */
  public static final AttributeKey<Long> AWS_S3_PART_NUMBER = longKey("aws.s3.part_number");

  /** The name of the operation being executed. */
  public static final AttributeKey<String> GRAPHQL_OPERATION_NAME =
      stringKey("graphql.operation.name");

  /** The type of the operation being executed. */
  public static final AttributeKey<String> GRAPHQL_OPERATION_TYPE =
      stringKey("graphql.operation.type");

  /**
   * The GraphQL document being executed.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value may be sanitized to exclude sensitive information.
   * </ul>
   */
  public static final AttributeKey<String> GRAPHQL_DOCUMENT = stringKey("graphql.document");

  /**
   * A value used by the messaging system as an identifier for the message, represented as a string.
   */
  public static final AttributeKey<String> MESSAGING_MESSAGE_ID = stringKey("messaging.message.id");

  /**
   * The <a href="#conversations">conversation ID</a> identifying the conversation to which the
   * message belongs, represented as a string. Sometimes called &quot;Correlation ID&quot;.
   */
  public static final AttributeKey<String> MESSAGING_MESSAGE_CONVERSATION_ID =
      stringKey("messaging.message.conversation_id");

  /**
   * The (uncompressed) size of the message payload in bytes. Also use this attribute if it is
   * unknown whether the compressed or uncompressed payload size is reported.
   */
  public static final AttributeKey<Long> MESSAGING_MESSAGE_PAYLOAD_SIZE_BYTES =
      longKey("messaging.message.payload_size_bytes");

  /** The compressed size of the message payload in bytes. */
  public static final AttributeKey<Long> MESSAGING_MESSAGE_PAYLOAD_COMPRESSED_SIZE_BYTES =
      longKey("messaging.message.payload_compressed_size_bytes");

  /**
   * The message destination name
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Destination name SHOULD uniquely identify a specific queue, topic or other entity within
   *       the broker. If the broker does not have such notion, the destination name SHOULD uniquely
   *       identify the broker.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_DESTINATION_NAME =
      stringKey("messaging.destination.name");

  /**
   * Low cardinality representation of the messaging destination name
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Destination names could be constructed from templates. An example would be a destination
   *       name involving a user name or product id. Although the destination name in this case is
   *       of high cardinality, the underlying template is of low cardinality and can be effectively
   *       used for grouping and aggregation.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_DESTINATION_TEMPLATE =
      stringKey("messaging.destination.template");

  /**
   * A boolean that is true if the message destination is temporary and might not exist anymore
   * after messages are processed.
   */
  public static final AttributeKey<Boolean> MESSAGING_DESTINATION_TEMPORARY =
      booleanKey("messaging.destination.temporary");

  /**
   * A boolean that is true if the message destination is anonymous (could be unnamed or have
   * auto-generated name).
   */
  public static final AttributeKey<Boolean> MESSAGING_DESTINATION_ANONYMOUS =
      booleanKey("messaging.destination.anonymous");

  /** A string identifying the messaging system. */
  public static final AttributeKey<String> MESSAGING_SYSTEM = stringKey("messaging.system");

  /**
   * A string identifying the kind of messaging operation as defined in the <a
   * href="#operation-names">Operation names</a> section above.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If a custom value is used, it MUST be of low cardinality.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_OPERATION = stringKey("messaging.operation");

  /**
   * The number of messages sent, received, or processed in the scope of the batching operation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD NOT set {@code messaging.batch.message_count} on spans that
   *       operate with a single message. When a messaging client library supports both batch and
   *       single-message API for the same operation, instrumentations SHOULD use {@code
   *       messaging.batch.message_count} for batching APIs and SHOULD NOT use it for single-message
   *       APIs.
   * </ul>
   */
  public static final AttributeKey<Long> MESSAGING_BATCH_MESSAGE_COUNT =
      longKey("messaging.batch.message_count");

  /** A unique identifier for the client that consumes or produces a message. */
  public static final AttributeKey<String> MESSAGING_CLIENT_ID = stringKey("messaging.client_id");

  /** RabbitMQ message routing key. */
  public static final AttributeKey<String> MESSAGING_RABBITMQ_DESTINATION_ROUTING_KEY =
      stringKey("messaging.rabbitmq.destination.routing_key");

  /**
   * Message keys in Kafka are used for grouping alike messages to ensure they're processed on the
   * same partition. They differ from {@code messaging.message.id} in that they're not unique. If
   * the key is {@code null}, the attribute MUST NOT be set.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If the key type is not string, it's string representation has to be supplied for the
   *       attribute. If the key has no unambiguous, canonical string form, don't include its value.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_KAFKA_MESSAGE_KEY =
      stringKey("messaging.kafka.message.key");

  /**
   * Name of the Kafka Consumer Group that is handling the message. Only applies to consumers, not
   * producers.
   */
  public static final AttributeKey<String> MESSAGING_KAFKA_CONSUMER_GROUP =
      stringKey("messaging.kafka.consumer.group");

  /** Partition the message is sent to. */
  public static final AttributeKey<Long> MESSAGING_KAFKA_DESTINATION_PARTITION =
      longKey("messaging.kafka.destination.partition");

  /** The offset of a record in the corresponding Kafka partition. */
  public static final AttributeKey<Long> MESSAGING_KAFKA_MESSAGE_OFFSET =
      longKey("messaging.kafka.message.offset");

  /** A boolean that is true if the message is a tombstone. */
  public static final AttributeKey<Boolean> MESSAGING_KAFKA_MESSAGE_TOMBSTONE =
      booleanKey("messaging.kafka.message.tombstone");

  /** Namespace of RocketMQ resources, resources in different namespaces are individual. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_NAMESPACE =
      stringKey("messaging.rocketmq.namespace");

  /**
   * Name of the RocketMQ producer/consumer group that is handling the message. The client type is
   * identified by the SpanKind.
   */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_CLIENT_GROUP =
      stringKey("messaging.rocketmq.client_group");

  /**
   * The timestamp in milliseconds that the delay message is expected to be delivered to consumer.
   */
  public static final AttributeKey<Long> MESSAGING_ROCKETMQ_MESSAGE_DELIVERY_TIMESTAMP =
      longKey("messaging.rocketmq.message.delivery_timestamp");

  /** The delay time level for delay message, which determines the message delay time. */
  public static final AttributeKey<Long> MESSAGING_ROCKETMQ_MESSAGE_DELAY_TIME_LEVEL =
      longKey("messaging.rocketmq.message.delay_time_level");

  /**
   * It is essential for FIFO message. Messages that belong to the same message group are always
   * processed one by one within the same consumer group.
   */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_MESSAGE_GROUP =
      stringKey("messaging.rocketmq.message.group");

  /** Type of message. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_MESSAGE_TYPE =
      stringKey("messaging.rocketmq.message.type");

  /** The secondary classifier of message besides topic. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_MESSAGE_TAG =
      stringKey("messaging.rocketmq.message.tag");

  /** Key(s) of message, another way to mark message besides message id. */
  public static final AttributeKey<List<String>> MESSAGING_ROCKETMQ_MESSAGE_KEYS =
      stringArrayKey("messaging.rocketmq.message.keys");

  /** Model of message consumption. This only applies to consumer spans. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_CONSUMPTION_MODEL =
      stringKey("messaging.rocketmq.consumption_model");

  /** A string identifying the remoting system. See below for a list of well-known identifiers. */
  public static final AttributeKey<String> RPC_SYSTEM = stringKey("rpc.system");

  /**
   * The full (logical) name of the service being called, including its package name, if applicable.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This is the logical name of the service from the RPC interface perspective, which can be
   *       different from the name of any implementing class. The {@code code.namespace} attribute
   *       may be used to store the latter (despite the attribute name, it may include a class name;
   *       e.g., class with method actually executing the call on the server side, RPC client stub
   *       class on the client side).
   * </ul>
   */
  public static final AttributeKey<String> RPC_SERVICE = stringKey("rpc.service");

  /**
   * The name of the (logical) method being called, must be equal to the $method part in the span
   * name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This is the logical name of the method from the RPC interface perspective, which can be
   *       different from the name of any implementing method/function. The {@code code.function}
   *       attribute may be used to store the latter (e.g., method actually executing the call on
   *       the server side, RPC client stub method on the client side).
   * </ul>
   */
  public static final AttributeKey<String> RPC_METHOD = stringKey("rpc.method");

  /**
   * The <a href="https://github.com/grpc/grpc/blob/v1.33.2/doc/statuscodes.md">numeric status
   * code</a> of the gRPC request.
   */
  public static final AttributeKey<Long> RPC_GRPC_STATUS_CODE = longKey("rpc.grpc.status_code");

  /**
   * Protocol version as in {@code jsonrpc} property of request/response. Since JSON-RPC 1.0 does
   * not specify this, the value can be omitted.
   */
  public static final AttributeKey<String> RPC_JSONRPC_VERSION = stringKey("rpc.jsonrpc.version");

  /**
   * {@code id} property of request or response. Since protocol allows id to be int, string, {@code
   * null} or missing (for notifications), value is expected to be cast to string for simplicity.
   * Use empty string in case of {@code null} value. Omit entirely if this is a notification.
   */
  public static final AttributeKey<String> RPC_JSONRPC_REQUEST_ID =
      stringKey("rpc.jsonrpc.request_id");

  /** {@code error.code} property of response if it is an error response. */
  public static final AttributeKey<Long> RPC_JSONRPC_ERROR_CODE = longKey("rpc.jsonrpc.error_code");

  /** {@code error.message} property of response if it is an error response. */
  public static final AttributeKey<String> RPC_JSONRPC_ERROR_MESSAGE =
      stringKey("rpc.jsonrpc.error_message");

  /** Whether this is a received or sent message. */
  public static final AttributeKey<String> MESSAGE_TYPE = stringKey("message.type");

  /**
   * MUST be calculated as two different counters starting from {@code 1} one for sent messages and
   * one for received message.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This way we guarantee that the values will be consistent between different
   *       implementations.
   * </ul>
   */
  public static final AttributeKey<Long> MESSAGE_ID = longKey("message.id");

  /** Compressed size of the message in bytes. */
  public static final AttributeKey<Long> MESSAGE_COMPRESSED_SIZE =
      longKey("message.compressed_size");

  /** Uncompressed size of the message in bytes. */
  public static final AttributeKey<Long> MESSAGE_UNCOMPRESSED_SIZE =
      longKey("message.uncompressed_size");

  /**
   * The <a href="https://connect.build/docs/protocol/#error-codes">error codes</a> of the Connect
   * request. Error codes are always string values.
   */
  public static final AttributeKey<String> RPC_CONNECT_RPC_ERROR_CODE =
      stringKey("rpc.connect_rpc.error_code");

  /**
   * SHOULD be set to true if the exception event is recorded at a point where it is known that the
   * exception is escaping the scope of the span.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>An exception is considered to have escaped (or left) the scope of a span, if that span is
   *       ended while the exception is still logically &quot;in flight&quot;. This may be actually
   *       &quot;in flight&quot; in some languages (e.g. if the exception is passed to a Context
   *       manager's {@code __exit__} method in Python) but will usually be caught at the point of
   *       recording the exception in most languages.
   *   <li>It is usually not possible to determine at the point where an exception is thrown whether
   *       it will escape the scope of a span. However, it is trivial to know that an exception will
   *       escape, if one checks for an active exception just before ending the span, as done in the
   *       <a href="#recording-an-exception">example above</a>.
   *   <li>It follows that an exception may still escape the scope of the span even if the {@code
   *       exception.escaped} attribute was not set or set to false, since the event might have been
   *       recorded at a time where it was not clear whether the exception will escape.
   * </ul>
   */
  public static final AttributeKey<Boolean> EXCEPTION_ESCAPED = booleanKey("exception.escaped");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.1">URI scheme</a> component
   * identifying the used protocol.
   */
  public static final AttributeKey<String> URL_SCHEME = stringKey("url.scheme");

  /**
   * Absolute URL describing a network resource according to <a
   * href="https://www.rfc-editor.org/rfc/rfc3986">RFC3986</a>
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>For network calls, URL usually has {@code scheme://host[:port][path][?query][#fragment]}
   *       format, where the fragment is not transmitted over HTTP, but if it is known, it should be
   *       included nevertheless. {@code url.full} MUST NOT contain credentials passed via URL in
   *       form of {@code https://username:password@www.example.com/}. In such case username and
   *       password should be redacted and attribute's value should be {@code
   *       https://REDACTED:REDACTED@www.example.com/}. {@code url.full} SHOULD capture the absolute
   *       URL when it is available (or can be reconstructed) and SHOULD NOT be validated or
   *       modified except for sanitizing purposes.
   * </ul>
   */
  public static final AttributeKey<String> URL_FULL = stringKey("url.full");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.3">URI path</a> component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When missing, the value is assumed to be {@code /}
   * </ul>
   */
  public static final AttributeKey<String> URL_PATH = stringKey("url.path");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.4">URI query</a> component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Sensitive content provided in query string SHOULD be scrubbed when instrumentations can
   *       identify it.
   * </ul>
   */
  public static final AttributeKey<String> URL_QUERY = stringKey("url.query");

  /** The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.5">URI fragment</a> component */
  public static final AttributeKey<String> URL_FRAGMENT = stringKey("url.fragment");

  /**
   * Value of the <a href="https://www.rfc-editor.org/rfc/rfc9110.html#field.user-agent">HTTP
   * User-Agent</a> header sent by the client.
   */
  public static final AttributeKey<String> USER_AGENT_ORIGINAL = stringKey("user_agent.original");

  // Enum definitions
  public static final class NetTransportValues {
    /** ip_tcp. */
    public static final String IP_TCP = "ip_tcp";

    /** ip_udp. */
    public static final String IP_UDP = "ip_udp";

    /** Named or anonymous pipe. */
    public static final String PIPE = "pipe";

    /** In-process communication. */
    public static final String INPROC = "inproc";

    /** Something else (non IP-based). */
    public static final String OTHER = "other";

    private NetTransportValues() {}
  }

  public static final class NetSockFamilyValues {
    /** IPv4 address. */
    public static final String INET = "inet";

    /** IPv6 address. */
    public static final String INET6 = "inet6";

    /** Unix domain socket path. */
    public static final String UNIX = "unix";

    private NetSockFamilyValues() {}
  }

  public static final class HttpRequestMethodValues {
    /** CONNECT method. */
    public static final String CONNECT = "CONNECT";

    /** DELETE method. */
    public static final String DELETE = "DELETE";

    /** GET method. */
    public static final String GET = "GET";

    /** HEAD method. */
    public static final String HEAD = "HEAD";

    /** OPTIONS method. */
    public static final String OPTIONS = "OPTIONS";

    /** PATCH method. */
    public static final String PATCH = "PATCH";

    /** POST method. */
    public static final String POST = "POST";

    /** PUT method. */
    public static final String PUT = "PUT";

    /** TRACE method. */
    public static final String TRACE = "TRACE";

    /** Any HTTP method that the instrumentation has no prior knowledge of. */
    public static final String OTHER = "_OTHER";

    private HttpRequestMethodValues() {}
  }

  public static final class EventDomainValues {
    /** Events from browser apps. */
    public static final String BROWSER = "browser";

    /** Events from mobile apps. */
    public static final String DEVICE = "device";

    /** Events from Kubernetes. */
    public static final String K8S = "k8s";

    private EventDomainValues() {}
  }

  public static final class LogIostreamValues {
    /** Logs from stdout stream. */
    public static final String STDOUT = "stdout";

    /** Events from stderr stream. */
    public static final String STDERR = "stderr";

    private LogIostreamValues() {}
  }

  public static final class TypeValues {
    /** Heap memory. */
    public static final String HEAP = "heap";

    /** Non-heap memory. */
    public static final String NON_HEAP = "non_heap";

    private TypeValues() {}
  }

  public static final class OpentracingRefTypeValues {
    /** The parent Span depends on the child Span in some capacity. */
    public static final String CHILD_OF = "child_of";

    /** The parent Span does not depend in any way on the result of the child Span. */
    public static final String FOLLOWS_FROM = "follows_from";

    private OpentracingRefTypeValues() {}
  }

  public static final class DbSystemValues {
    /** Some other SQL database. Fallback only. See notes. */
    public static final String OTHER_SQL = "other_sql";

    /** Microsoft SQL Server. */
    public static final String MSSQL = "mssql";

    /** Microsoft SQL Server Compact. */
    public static final String MSSQLCOMPACT = "mssqlcompact";

    /** MySQL. */
    public static final String MYSQL = "mysql";

    /** Oracle Database. */
    public static final String ORACLE = "oracle";

    /** IBM Db2. */
    public static final String DB2 = "db2";

    /** PostgreSQL. */
    public static final String POSTGRESQL = "postgresql";

    /** Amazon Redshift. */
    public static final String REDSHIFT = "redshift";

    /** Apache Hive. */
    public static final String HIVE = "hive";

    /** Cloudscape. */
    public static final String CLOUDSCAPE = "cloudscape";

    /** HyperSQL DataBase. */
    public static final String HSQLDB = "hsqldb";

    /** Progress Database. */
    public static final String PROGRESS = "progress";

    /** SAP MaxDB. */
    public static final String MAXDB = "maxdb";

    /** SAP HANA. */
    public static final String HANADB = "hanadb";

    /** Ingres. */
    public static final String INGRES = "ingres";

    /** FirstSQL. */
    public static final String FIRSTSQL = "firstsql";

    /** EnterpriseDB. */
    public static final String EDB = "edb";

    /** InterSystems Caché. */
    public static final String CACHE = "cache";

    /** Adabas (Adaptable Database System). */
    public static final String ADABAS = "adabas";

    /** Firebird. */
    public static final String FIREBIRD = "firebird";

    /** Apache Derby. */
    public static final String DERBY = "derby";

    /** FileMaker. */
    public static final String FILEMAKER = "filemaker";

    /** Informix. */
    public static final String INFORMIX = "informix";

    /** InstantDB. */
    public static final String INSTANTDB = "instantdb";

    /** InterBase. */
    public static final String INTERBASE = "interbase";

    /** MariaDB. */
    public static final String MARIADB = "mariadb";

    /** Netezza. */
    public static final String NETEZZA = "netezza";

    /** Pervasive PSQL. */
    public static final String PERVASIVE = "pervasive";

    /** PointBase. */
    public static final String POINTBASE = "pointbase";

    /** SQLite. */
    public static final String SQLITE = "sqlite";

    /** Sybase. */
    public static final String SYBASE = "sybase";

    /** Teradata. */
    public static final String TERADATA = "teradata";

    /** Vertica. */
    public static final String VERTICA = "vertica";

    /** H2. */
    public static final String H2 = "h2";

    /** ColdFusion IMQ. */
    public static final String COLDFUSION = "coldfusion";

    /** Apache Cassandra. */
    public static final String CASSANDRA = "cassandra";

    /** Apache HBase. */
    public static final String HBASE = "hbase";

    /** MongoDB. */
    public static final String MONGODB = "mongodb";

    /** Redis. */
    public static final String REDIS = "redis";

    /** Couchbase. */
    public static final String COUCHBASE = "couchbase";

    /** CouchDB. */
    public static final String COUCHDB = "couchdb";

    /** Microsoft Azure Cosmos DB. */
    public static final String COSMOSDB = "cosmosdb";

    /** Amazon DynamoDB. */
    public static final String DYNAMODB = "dynamodb";

    /** Neo4j. */
    public static final String NEO4J = "neo4j";

    /** Apache Geode. */
    public static final String GEODE = "geode";

    /** Elasticsearch. */
    public static final String ELASTICSEARCH = "elasticsearch";

    /** Memcached. */
    public static final String MEMCACHED = "memcached";

    /** CockroachDB. */
    public static final String COCKROACHDB = "cockroachdb";

    /** OpenSearch. */
    public static final String OPENSEARCH = "opensearch";

    /** ClickHouse. */
    public static final String CLICKHOUSE = "clickhouse";

    /** Cloud Spanner. */
    public static final String SPANNER = "spanner";

    /** Trino. */
    public static final String TRINO = "trino";

    private DbSystemValues() {}
  }

  public static final class DbCassandraConsistencyLevelValues {
    /** all. */
    public static final String ALL = "all";

    /** each_quorum. */
    public static final String EACH_QUORUM = "each_quorum";

    /** quorum. */
    public static final String QUORUM = "quorum";

    /** local_quorum. */
    public static final String LOCAL_QUORUM = "local_quorum";

    /** one. */
    public static final String ONE = "one";

    /** two. */
    public static final String TWO = "two";

    /** three. */
    public static final String THREE = "three";

    /** local_one. */
    public static final String LOCAL_ONE = "local_one";

    /** any. */
    public static final String ANY = "any";

    /** serial. */
    public static final String SERIAL = "serial";

    /** local_serial. */
    public static final String LOCAL_SERIAL = "local_serial";

    private DbCassandraConsistencyLevelValues() {}
  }

  public static final class DbCosmosdbOperationTypeValues {
    /** invalid. */
    public static final String INVALID = "Invalid";

    /** create. */
    public static final String CREATE = "Create";

    /** patch. */
    public static final String PATCH = "Patch";

    /** read. */
    public static final String READ = "Read";

    /** read_feed. */
    public static final String READ_FEED = "ReadFeed";

    /** delete. */
    public static final String DELETE = "Delete";

    /** replace. */
    public static final String REPLACE = "Replace";

    /** execute. */
    public static final String EXECUTE = "Execute";

    /** query. */
    public static final String QUERY = "Query";

    /** head. */
    public static final String HEAD = "Head";

    /** head_feed. */
    public static final String HEAD_FEED = "HeadFeed";

    /** upsert. */
    public static final String UPSERT = "Upsert";

    /** batch. */
    public static final String BATCH = "Batch";

    /** query_plan. */
    public static final String QUERY_PLAN = "QueryPlan";

    /** execute_javascript. */
    public static final String EXECUTE_JAVASCRIPT = "ExecuteJavaScript";

    private DbCosmosdbOperationTypeValues() {}
  }

  public static final class DbCosmosdbConnectionModeValues {
    /** Gateway (HTTP) connections mode. */
    public static final String GATEWAY = "gateway";

    /** Direct connection. */
    public static final String DIRECT = "direct";

    private DbCosmosdbConnectionModeValues() {}
  }

  public static final class OtelStatusCodeValues {
    /**
     * The operation has been validated by an Application developer or Operator to have completed
     * successfully.
     */
    public static final String OK = "OK";

    /** The operation contains an error. */
    public static final String ERROR = "ERROR";

    private OtelStatusCodeValues() {}
  }

  public static final class FaasTriggerValues {
    /** A response to some data source operation such as a database or filesystem read/write. */
    public static final String DATASOURCE = "datasource";

    /** To provide an answer to an inbound HTTP request. */
    public static final String HTTP = "http";

    /** A function is set to be executed when messages are sent to a messaging system. */
    public static final String PUBSUB = "pubsub";

    /** A function is scheduled to be executed regularly. */
    public static final String TIMER = "timer";

    /** If none of the others apply. */
    public static final String OTHER = "other";

    private FaasTriggerValues() {}
  }

  public static final class FaasDocumentOperationValues {
    /** When a new object is created. */
    public static final String INSERT = "insert";

    /** When an object is modified. */
    public static final String EDIT = "edit";

    /** When an object is deleted. */
    public static final String DELETE = "delete";

    private FaasDocumentOperationValues() {}
  }

  public static final class FaasInvokedProviderValues {
    /** Alibaba Cloud. */
    public static final String ALIBABA_CLOUD = "alibaba_cloud";

    /** Amazon Web Services. */
    public static final String AWS = "aws";

    /** Microsoft Azure. */
    public static final String AZURE = "azure";

    /** Google Cloud Platform. */
    public static final String GCP = "gcp";

    /** Tencent Cloud. */
    public static final String TENCENT_CLOUD = "tencent_cloud";

    private FaasInvokedProviderValues() {}
  }

  public static final class NetworkTransportValues {
    /** TCP. */
    public static final String TCP = "tcp";

    /** UDP. */
    public static final String UDP = "udp";

    /** Named or anonymous pipe. See note below. */
    public static final String PIPE = "pipe";

    /** Unix domain socket. */
    public static final String UNIX = "unix";

    private NetworkTransportValues() {}
  }

  public static final class NetworkTypeValues {
    /** IPv4. */
    public static final String IPV4 = "ipv4";

    /** IPv6. */
    public static final String IPV6 = "ipv6";

    private NetworkTypeValues() {}
  }

  public static final class NetworkConnectionTypeValues {
    /** wifi. */
    public static final String WIFI = "wifi";

    /** wired. */
    public static final String WIRED = "wired";

    /** cell. */
    public static final String CELL = "cell";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    private NetworkConnectionTypeValues() {}
  }

  public static final class NetworkConnectionSubtypeValues {
    /** GPRS. */
    public static final String GPRS = "gprs";

    /** EDGE. */
    public static final String EDGE = "edge";

    /** UMTS. */
    public static final String UMTS = "umts";

    /** CDMA. */
    public static final String CDMA = "cdma";

    /** EVDO Rel. 0. */
    public static final String EVDO_0 = "evdo_0";

    /** EVDO Rev. A. */
    public static final String EVDO_A = "evdo_a";

    /** CDMA2000 1XRTT. */
    public static final String CDMA2000_1XRTT = "cdma2000_1xrtt";

    /** HSDPA. */
    public static final String HSDPA = "hsdpa";

    /** HSUPA. */
    public static final String HSUPA = "hsupa";

    /** HSPA. */
    public static final String HSPA = "hspa";

    /** IDEN. */
    public static final String IDEN = "iden";

    /** EVDO Rev. B. */
    public static final String EVDO_B = "evdo_b";

    /** LTE. */
    public static final String LTE = "lte";

    /** EHRPD. */
    public static final String EHRPD = "ehrpd";

    /** HSPAP. */
    public static final String HSPAP = "hspap";

    /** GSM. */
    public static final String GSM = "gsm";

    /** TD-SCDMA. */
    public static final String TD_SCDMA = "td_scdma";

    /** IWLAN. */
    public static final String IWLAN = "iwlan";

    /** 5G NR (New Radio). */
    public static final String NR = "nr";

    /** 5G NRNSA (New Radio Non-Standalone). */
    public static final String NRNSA = "nrnsa";

    /** LTE CA. */
    public static final String LTE_CA = "lte_ca";

    private NetworkConnectionSubtypeValues() {}
  }

  public static final class GraphqlOperationTypeValues {
    /** GraphQL query. */
    public static final String QUERY = "query";

    /** GraphQL mutation. */
    public static final String MUTATION = "mutation";

    /** GraphQL subscription. */
    public static final String SUBSCRIPTION = "subscription";

    private GraphqlOperationTypeValues() {}
  }

  public static final class MessagingOperationValues {
    /** publish. */
    public static final String PUBLISH = "publish";

    /** receive. */
    public static final String RECEIVE = "receive";

    /** process. */
    public static final String PROCESS = "process";

    private MessagingOperationValues() {}
  }

  public static final class MessagingRocketmqMessageTypeValues {
    /** Normal message. */
    public static final String NORMAL = "normal";

    /** FIFO message. */
    public static final String FIFO = "fifo";

    /** Delay message. */
    public static final String DELAY = "delay";

    /** Transaction message. */
    public static final String TRANSACTION = "transaction";

    private MessagingRocketmqMessageTypeValues() {}
  }

  public static final class MessagingRocketmqConsumptionModelValues {
    /** Clustering consumption model. */
    public static final String CLUSTERING = "clustering";

    /** Broadcasting consumption model. */
    public static final String BROADCASTING = "broadcasting";

    private MessagingRocketmqConsumptionModelValues() {}
  }

  public static final class RpcSystemValues {
    /** gRPC. */
    public static final String GRPC = "grpc";

    /** Java RMI. */
    public static final String JAVA_RMI = "java_rmi";

    /** .NET WCF. */
    public static final String DOTNET_WCF = "dotnet_wcf";

    /** Apache Dubbo. */
    public static final String APACHE_DUBBO = "apache_dubbo";

    /** Connect RPC. */
    public static final String CONNECT_RPC = "connect_rpc";

    private RpcSystemValues() {}
  }

  public static final class RpcGrpcStatusCodeValues {
    /** OK. */
    public static final long OK = 0;

    /** CANCELLED. */
    public static final long CANCELLED = 1;

    /** UNKNOWN. */
    public static final long UNKNOWN = 2;

    /** INVALID_ARGUMENT. */
    public static final long INVALID_ARGUMENT = 3;

    /** DEADLINE_EXCEEDED. */
    public static final long DEADLINE_EXCEEDED = 4;

    /** NOT_FOUND. */
    public static final long NOT_FOUND = 5;

    /** ALREADY_EXISTS. */
    public static final long ALREADY_EXISTS = 6;

    /** PERMISSION_DENIED. */
    public static final long PERMISSION_DENIED = 7;

    /** RESOURCE_EXHAUSTED. */
    public static final long RESOURCE_EXHAUSTED = 8;

    /** FAILED_PRECONDITION. */
    public static final long FAILED_PRECONDITION = 9;

    /** ABORTED. */
    public static final long ABORTED = 10;

    /** OUT_OF_RANGE. */
    public static final long OUT_OF_RANGE = 11;

    /** UNIMPLEMENTED. */
    public static final long UNIMPLEMENTED = 12;

    /** INTERNAL. */
    public static final long INTERNAL = 13;

    /** UNAVAILABLE. */
    public static final long UNAVAILABLE = 14;

    /** DATA_LOSS. */
    public static final long DATA_LOSS = 15;

    /** UNAUTHENTICATED. */
    public static final long UNAUTHENTICATED = 16;

    private RpcGrpcStatusCodeValues() {}
  }

  public static final class MessageTypeValues {
    /** sent. */
    public static final String SENT = "SENT";

    /** received. */
    public static final String RECEIVED = "RECEIVED";

    private MessageTypeValues() {}
  }

  public static final class RpcConnectRpcErrorCodeValues {
    /** cancelled. */
    public static final String CANCELLED = "cancelled";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    /** invalid_argument. */
    public static final String INVALID_ARGUMENT = "invalid_argument";

    /** deadline_exceeded. */
    public static final String DEADLINE_EXCEEDED = "deadline_exceeded";

    /** not_found. */
    public static final String NOT_FOUND = "not_found";

    /** already_exists. */
    public static final String ALREADY_EXISTS = "already_exists";

    /** permission_denied. */
    public static final String PERMISSION_DENIED = "permission_denied";

    /** resource_exhausted. */
    public static final String RESOURCE_EXHAUSTED = "resource_exhausted";

    /** failed_precondition. */
    public static final String FAILED_PRECONDITION = "failed_precondition";

    /** aborted. */
    public static final String ABORTED = "aborted";

    /** out_of_range. */
    public static final String OUT_OF_RANGE = "out_of_range";

    /** unimplemented. */
    public static final String UNIMPLEMENTED = "unimplemented";

    /** internal. */
    public static final String INTERNAL = "internal";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** data_loss. */
    public static final String DATA_LOSS = "data_loss";

    /** unauthenticated. */
    public static final String UNAUTHENTICATED = "unauthenticated";

    private RpcConnectRpcErrorCodeValues() {}
  }

  // Manually defined and not YET in the YAML
  /**
   * The name of an event describing an exception.
   *
   * <p>Typically an event with that name should not be manually created. Instead {@link
   * io.opentelemetry.api.trace.Span#recordException(Throwable)} should be used.
   */
  public static final String EXCEPTION_EVENT_NAME = "exception";

  /**
   * The name of the keyspace being accessed.
   *
   * @deprecated this item has been removed as of 1.8.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#DB_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_CASSANDRA_KEYSPACE =
      stringKey("db.cassandra.keyspace");

  /**
   * The <a href="https://hbase.apache.org/book.html#_namespace">HBase namespace</a> being accessed.
   *
   * @deprecated this item has been removed as of 1.8.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#DB_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_HBASE_NAMESPACE = stringKey("db.hbase.namespace");

  /**
   * The size of the uncompressed request payload body after transport decoding. Not set if
   * transport encoding not used.
   *
   * @deprecated this item has been removed as of 1.13.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#HTTP_REQUEST_CONTENT_LENGTH} instead.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH_UNCOMPRESSED =
      longKey("http.request_content_length_uncompressed");

  /**
   * @deprecated This item has been removed as of 1.13.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#HTTP_RESPONSE_CONTENT_LENGTH} instead.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH_UNCOMPRESSED =
      longKey("http.response_content_length_uncompressed");

  /**
   * @deprecated This item has been removed as of 1.13.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#NET_HOST_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_SERVER_NAME = stringKey("http.server_name");

  /**
   * @deprecated This item has been removed as of 1.13.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#NET_HOST_NAME} instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_HOST = stringKey("http.host");

  /**
   * @deprecated This item has been removed as of 1.13.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#NET_SOCK_PEER_ADDR} instead.
   */
  @Deprecated public static final AttributeKey<String> NET_PEER_IP = stringKey("net.peer.ip");

  /**
   * @deprecated This item has been removed as of 1.13.0 of the semantic conventions. Please use
   *     {@link SemanticAttributes#NET_SOCK_HOST_ADDR} instead.
   */
  @Deprecated public static final AttributeKey<String> NET_HOST_IP = stringKey("net.host.ip");

  /**
   * The ordinal number of request re-sending attempt.
   *
   * @deprecated This item has been removed as of 1.15.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#HTTP_RESEND_COUNT} instead.
   */
  @Deprecated public static final AttributeKey<Long> HTTP_RETRY_COUNT = longKey("http.retry_count");

  /**
   * A string identifying the messaging system.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_DESTINATION_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_DESTINATION =
      stringKey("messaging.destination");

  /**
   * A boolean that is true if the message destination is temporary.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_DESTINATION_TEMPORARY} instead.
   */
  @Deprecated
  public static final AttributeKey<Boolean> MESSAGING_TEMP_DESTINATION =
      booleanKey("messaging.temp_destination");

  /**
   * The name of the transport protocol.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#NET_PROTOCOL_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_PROTOCOL = stringKey("messaging.protocol");

  /**
   * The version of the transport protocol.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#NET_PROTOCOL_VERSION} instead.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_PROTOCOL_VERSION =
      stringKey("messaging.protocol_version");

  /**
   * Connection string.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. There is no
   *     replacement.
   */
  @Deprecated public static final AttributeKey<String> MESSAGING_URL = stringKey("messaging.url");

  /**
   * The <a href="#conversations">conversation ID</a> identifying the conversation to which the
   * message belongs, represented as a string. Sometimes called &quot;Correlation ID&quot;.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_MESSAGE_CONVERSATION_ID} instead.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_CONVERSATION_ID =
      stringKey("messaging.conversation_id");

  /**
   * RabbitMQ message routing key.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_RABBITMQ_DESTINATION_ROUTING_KEY} instead.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_RABBITMQ_ROUTING_KEY =
      stringKey("messaging.rabbitmq.routing_key");

  /**
   * Partition the message is received from.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_KAFKA_SOURCE_PARTITION} instead.
   */
  @Deprecated
  public static final AttributeKey<Long> MESSAGING_KAFKA_PARTITION =
      longKey("messaging.kafka.partition");

  /**
   * A boolean that is true if the message is a tombstone.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_KAFKA_MESSAGE_TOMBSTONE} instead.
   */
  @Deprecated
  public static final AttributeKey<Boolean> MESSAGING_KAFKA_TOMBSTONE =
      booleanKey("messaging.kafka.tombstone");

  /**
   * The timestamp in milliseconds that the delay message is expected to be delivered to consumer.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_ROCKETMQ_MESSAGE_DELIVERY_TIMESTAMP} instead.
   */
  @Deprecated
  public static final AttributeKey<Long> MESSAGING_ROCKETMQ_DELIVERY_TIMESTAMP =
      longKey("messaging.rocketmq.delivery_timestamp");

  /**
   * The delay time level for delay message, which determines the message delay time.
   *
   * @deprecated This item has been removed as of 1.17.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#MESSAGING_ROCKETMQ_MESSAGE_DELAY_TIME_LEVEL} instead.
   */
  @Deprecated
  public static final AttributeKey<Long> MESSAGING_ROCKETMQ_DELAY_TIME_LEVEL =
      longKey("messaging.rocketmq.delay_time_level");

  /**
   * The name of the instrumentation scope - ({@code InstrumentationScope.Name} in OTLP).
   *
   * @deprecated This item has been moved, use {@link
   *     io.opentelemetry.semconv.resource.attributes.ResourceAttributes#OTEL_SCOPE_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_NAME = stringKey("otel.scope.name");

  /**
   * The version of the instrumentation scope - ({@code InstrumentationScope.Version} in OTLP).
   *
   * @deprecated This item has been moved, use {@link
   *     io.opentelemetry.semconv.resource.attributes.ResourceAttributes#OTEL_SCOPE_VERSION}
   *     instead.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_VERSION = stringKey("otel.scope.version");

  /**
   * The execution ID of the current function execution.
   *
   * @deprecated This item has been renamed in 1.19.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#FAAS_INVOCATION_ID} instead.
   */
  @Deprecated public static final AttributeKey<String> FAAS_EXECUTION = stringKey("faas.execution");

  /**
   * Value of the <a href="https://www.rfc-editor.org/rfc/rfc9110.html#field.user-agent">HTTP
   * User-Agent</a> header sent by the client.
   *
   * @deprecated This item has been renamed in 1.19.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#USER_AGENT_ORIGINAL} instead.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_USER_AGENT = stringKey("http.user_agent");

  /**
   * Deprecated.
   *
   * @deprecated Deprecated, use the {@link
   *     io.opentelemetry.semconv.resource.attributes.ResourceAttributes#OTEL_SCOPE_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_NAME = stringKey("otel.library.name");

  /**
   * Deprecated.
   *
   * @deprecated Deprecated, use the {@link
   *     io.opentelemetry.semconv.resource.attributes.ResourceAttributes#OTEL_SCOPE_VERSION}
   *     attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_VERSION = stringKey("otel.library.version");

  /**
   * Kind of HTTP protocol used.
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions.
   */
  @Deprecated public static final AttributeKey<String> HTTP_FLAVOR = stringKey("http.flavor");

  /**
   * Enum definitions for {@link #HTTP_FLAVOR}.
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions.
   */
  @Deprecated
  public static final class HttpFlavorValues {
    /** HTTP/1.0. */
    public static final String HTTP_1_0 = "1.0";

    /** HTTP/1.1. */
    public static final String HTTP_1_1 = "1.1";

    /** HTTP/2. */
    public static final String HTTP_2_0 = "2.0";

    /** HTTP/3. */
    public static final String HTTP_3_0 = "3.0";

    /** SPDY protocol. */
    public static final String SPDY = "SPDY";

    /** QUIC protocol. */
    public static final String QUIC = "QUIC";

    private HttpFlavorValues() {}
  }

  /**
   * Application layer protocol used. The value SHOULD be normalized to lowercase.
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#NET_PROTOCOL_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_APP_PROTOCOL_NAME =
      stringKey("net.app.protocol.name");

  /**
   * Version of the application layer protocol used. See note below.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>{@code net.app.protocol.version} refers to the version of the protocol used and might be
   *       different from the protocol client's version. If the HTTP client used has a version of
   *       {@code 0.27.2}, but sends HTTP version {@code 1.1}, this attribute should be set to
   *       {@code 1.1}.
   * </ul>
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions. Use {@link
   *     SemanticAttributes#NET_PROTOCOL_VERSION} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_APP_PROTOCOL_VERSION =
      stringKey("net.app.protocol.version");

  /**
   * The kind of message destination.
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_DESTINATION_KIND =
      stringKey("messaging.destination.kind");

  /**
   * Enum values for {@link #MESSAGING_DESTINATION_KIND}.
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions.
   */
  @Deprecated
  public static final class MessagingDestinationKindValues {
    /** A message sent to a queue. */
    public static final String QUEUE = "queue";

    /** A message sent to a topic. */
    public static final String TOPIC = "topic";

    private MessagingDestinationKindValues() {}
  }

  /**
   * The kind of message source.
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_SOURCE_KIND =
      stringKey("messaging.source.kind");

  /**
   * Enum values for {@link #MESSAGING_SOURCE_KIND}.
   *
   * @deprecated This item has been removed as of 1.20.0 of the semantic conventions.
   */
  @Deprecated
  public static final class MessagingSourceKindValues {
    /** A message received from a queue. */
    public static final String QUEUE = "queue";

    /** A message received from a topic. */
    public static final String TOPIC = "topic";

    private MessagingSourceKindValues() {}
  }

  /**
   * The internet connection type currently being used by the host.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#NETWORK_CONNECTION_TYPE} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_HOST_CONNECTION_TYPE =
      stringKey("net.host.connection.type");

  /**
   * This describes more details regarding the connection.type. It may be the type of cell
   * technology connection, but it could be used for describing details about a wifi connection.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#NETWORK_CONNECTION_SUBTYPE} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_HOST_CONNECTION_SUBTYPE =
      stringKey("net.host.connection.subtype");

  /**
   * The name of the mobile carrier.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#NETWORK_CARRIER_NAME} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_HOST_CARRIER_NAME =
      stringKey("net.host.carrier.name");

  /**
   * The mobile carrier country code.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#NETWORK_CARRIER_MCC} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_HOST_CARRIER_MCC = stringKey("net.host.carrier.mcc");

  /**
   * The mobile carrier network code.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#NETWORK_CARRIER_MNC} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_HOST_CARRIER_MNC = stringKey("net.host.carrier.mnc");

  /**
   * The ISO 3166-1 alpha-2 2-character country code associated with the mobile carrier network.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#NETWORK_CARRIER_ICC} instead.
   */
  @Deprecated
  public static final AttributeKey<String> NET_HOST_CARRIER_ICC = stringKey("net.host.carrier.icc");

  /**
   * The IP address of the original client behind all proxies, if known (e.g. from <a
   * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For">X-Forwarded-For</a>).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This is not necessarily the same as {@code net.sock.peer.addr}, which would identify the
   *       network-level peer, which may be a proxy.
   *   <li>This attribute should be set when a source of information different from the one used for
   *       {@code net.sock.peer.addr}, is available even if that other source just confirms the same
   *       value as {@code net.sock.peer.addr}. Rationale: For {@code net.sock.peer.addr}, one
   *       typically does not know if it comes from a proxy, reverse proxy, or the actual client.
   *       Setting {@code http.client_ip} when it's the same as {@code net.sock.peer.addr} means
   *       that one is at least somewhat confident that the address is not that of the closest
   *       proxy.
   * </ul>
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. Use
   *     {@link SemanticAttributes#CLIENT_ADDRESS} instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_CLIENT_IP = stringKey("http.client_ip");

  /**
   * The message source name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Source name SHOULD uniquely identify a specific queue, topic, or other entity within the
   *       broker. If the broker does not have such notion, the source name SHOULD uniquely identify
   *       the broker.
   * </ul>
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_SOURCE_NAME =
      stringKey("messaging.source.name");

  /**
   * Low cardinality representation of the messaging source name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Source names could be constructed from templates. An example would be a source name
   *       involving a user name or product id. Although the source name in this case is of high
   *       cardinality, the underlying template is of low cardinality and can be effectively used
   *       for grouping and aggregation.
   * </ul>
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_SOURCE_TEMPLATE =
      stringKey("messaging.source.template");

  /**
   * A boolean that is true if the message source is temporary and might not exist anymore after
   * messages are processed.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions.
   */
  @Deprecated
  public static final AttributeKey<Boolean> MESSAGING_SOURCE_TEMPORARY =
      booleanKey("messaging.source.temporary");

  /**
   * A boolean that is true if the message source is anonymous (could be unnamed or have
   * auto-generated name).
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions.
   */
  @Deprecated
  public static final AttributeKey<Boolean> MESSAGING_SOURCE_ANONYMOUS =
      booleanKey("messaging.source.anonymous");

  /**
   * The identifier for the consumer receiving a message. For Kafka, set it to {@code
   * {messaging.kafka.consumer.group} - {messaging.kafka.client_id}}, if both are present, or only
   * {@code messaging.kafka.consumer.group}. For brokers, such as RabbitMQ and Artemis, set it to
   * the {@code client_id} of the client consuming the message.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. See
   *     {@link SemanticAttributes#MESSAGING_CLIENT_ID}.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_CONSUMER_ID =
      stringKey("messaging.consumer.id");

  /**
   * Client Id for the Consumer or Producer that is handling the message.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. See
   *     {@link SemanticAttributes#MESSAGING_CLIENT_ID}.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_KAFKA_CLIENT_ID =
      stringKey("messaging.kafka.client_id");

  /**
   * Partition the message is received from.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions.
   */
  @Deprecated
  public static final AttributeKey<Long> MESSAGING_KAFKA_SOURCE_PARTITION =
      longKey("messaging.kafka.source.partition");

  /**
   * The unique identifier for each client.
   *
   * @deprecated This item has been removed in 1.21.0 version of the semantic conventions. See
   *     {@link SemanticAttributes#MESSAGING_CLIENT_ID}.
   */
  @Deprecated
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_CLIENT_ID =
      stringKey("messaging.rocketmq.client_id");

  /**
   * Enum values for {@link #NET_HOST_CONNECTION_TYPE}.
   *
   * @deprecated This item has been removed as of 1.21.0 of the semantic conventions. Use {@link
   *     NetworkConnectionTypeValues} instead.
   */
  @Deprecated
  public static final class NetHostConnectionTypeValues {
    /** wifi. */
    public static final String WIFI = "wifi";

    /** wired. */
    public static final String WIRED = "wired";

    /** cell. */
    public static final String CELL = "cell";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    private NetHostConnectionTypeValues() {}
  }

  /**
   * Enum values for {@link #NET_HOST_CONNECTION_SUBTYPE}.
   *
   * @deprecated This item has been removed as of 1.21.0 of the semantic conventions. Use {@link
   *     NetworkConnectionSubtypeValues} instead.
   */
  @Deprecated
  public static final class NetHostConnectionSubtypeValues {
    /** GPRS. */
    public static final String GPRS = "gprs";

    /** EDGE. */
    public static final String EDGE = "edge";

    /** UMTS. */
    public static final String UMTS = "umts";

    /** CDMA. */
    public static final String CDMA = "cdma";

    /** EVDO Rel. 0. */
    public static final String EVDO_0 = "evdo_0";

    /** EVDO Rev. A. */
    public static final String EVDO_A = "evdo_a";

    /** CDMA2000 1XRTT. */
    public static final String CDMA2000_1XRTT = "cdma2000_1xrtt";

    /** HSDPA. */
    public static final String HSDPA = "hsdpa";

    /** HSUPA. */
    public static final String HSUPA = "hsupa";

    /** HSPA. */
    public static final String HSPA = "hspa";

    /** IDEN. */
    public static final String IDEN = "iden";

    /** EVDO Rev. B. */
    public static final String EVDO_B = "evdo_b";

    /** LTE. */
    public static final String LTE = "lte";

    /** EHRPD. */
    public static final String EHRPD = "ehrpd";

    /** HSPAP. */
    public static final String HSPAP = "hspap";

    /** GSM. */
    public static final String GSM = "gsm";

    /** TD-SCDMA. */
    public static final String TD_SCDMA = "td_scdma";

    /** IWLAN. */
    public static final String IWLAN = "iwlan";

    /** 5G NR (New Radio). */
    public static final String NR = "nr";

    /** 5G NRNSA (New Radio Non-Standalone). */
    public static final String NRNSA = "nrnsa";

    /** LTE CA. */
    public static final String LTE_CA = "lte_ca";

    private NetHostConnectionSubtypeValues() {}
  }

  private SemanticAttributes() {}
}
