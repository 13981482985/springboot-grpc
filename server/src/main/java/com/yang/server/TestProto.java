// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Test.proto

package com.yang.server;

public final class TestProto {
  private TestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TestRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code TestRequest}
   */
  public static final class TestRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TestRequest)
      TestRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestRequest.newBuilder() to construct.
    private TestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestRequest() {
      name_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new TestRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TestProto.internal_static_TestRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TestProto.internal_static_TestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TestProto.TestRequest.class, TestProto.TestRequest.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof TestProto.TestRequest)) {
        return super.equals(obj);
      }
      TestProto.TestRequest other = (TestProto.TestRequest) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TestProto.TestRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestProto.TestRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestProto.TestRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestProto.TestRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestProto.TestRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestProto.TestRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestProto.TestRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TestProto.TestRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TestProto.TestRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TestProto.TestRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TestProto.TestRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TestProto.TestRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(TestProto.TestRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TestRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TestRequest)
        TestProto.TestRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TestProto.internal_static_TestRequest_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TestProto.internal_static_TestRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TestProto.TestRequest.class, TestProto.TestRequest.Builder.class);
      }

      // Construct using com.yang.TestProto.TestRequest.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        name_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TestProto.internal_static_TestRequest_descriptor;
      }

      @Override
      public TestProto.TestRequest getDefaultInstanceForType() {
        return TestProto.TestRequest.getDefaultInstance();
      }

      @Override
      public TestProto.TestRequest build() {
        TestProto.TestRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public TestProto.TestRequest buildPartial() {
        TestProto.TestRequest result = new TestProto.TestRequest(this);
        result.name_ = name_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TestProto.TestRequest) {
          return mergeFrom((TestProto.TestRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TestProto.TestRequest other) {
        if (other == TestProto.TestRequest.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TestRequest)
    }

    // @@protoc_insertion_point(class_scope:TestRequest)
    private static final TestProto.TestRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TestProto.TestRequest();
    }

    public static TestProto.TestRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TestRequest>
        PARSER = new com.google.protobuf.AbstractParser<TestRequest>() {
      @Override
      public TestRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<TestRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<TestRequest> getParserForType() {
      return PARSER;
    }

    @Override
    public TestProto.TestRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TestResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TestResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string result = 1;</code>
     * @return The result.
     */
    String getResult();
    /**
     * <code>string result = 1;</code>
     * @return The bytes for result.
     */
    com.google.protobuf.ByteString
        getResultBytes();
  }
  /**
   * Protobuf type {@code TestResponse}
   */
  public static final class TestResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TestResponse)
      TestResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestResponse.newBuilder() to construct.
    private TestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TestResponse() {
      result_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new TestResponse();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TestProto.internal_static_TestResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TestProto.internal_static_TestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TestProto.TestResponse.class, TestProto.TestResponse.Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private volatile Object result_;
    /**
     * <code>string result = 1;</code>
     * @return The result.
     */
    @Override
    public String getResult() {
      Object ref = result_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        result_ = s;
        return s;
      }
    }
    /**
     * <code>string result = 1;</code>
     * @return The bytes for result.
     */
    @Override
    public com.google.protobuf.ByteString
        getResultBytes() {
      Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, result_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, result_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof TestProto.TestResponse)) {
        return super.equals(obj);
      }
      TestProto.TestResponse other = (TestProto.TestResponse) obj;

      if (!getResult()
          .equals(other.getResult())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TestProto.TestResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestProto.TestResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestProto.TestResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestProto.TestResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestProto.TestResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestProto.TestResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestProto.TestResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TestProto.TestResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static TestProto.TestResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static TestProto.TestResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TestProto.TestResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static TestProto.TestResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(TestProto.TestResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TestResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TestResponse)
        TestProto.TestResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TestProto.internal_static_TestResponse_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TestProto.internal_static_TestResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TestProto.TestResponse.class, TestProto.TestResponse.Builder.class);
      }

      // Construct using com.yang.TestProto.TestResponse.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        result_ = "";

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TestProto.internal_static_TestResponse_descriptor;
      }

      @Override
      public TestProto.TestResponse getDefaultInstanceForType() {
        return TestProto.TestResponse.getDefaultInstance();
      }

      @Override
      public TestProto.TestResponse build() {
        TestProto.TestResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public TestProto.TestResponse buildPartial() {
        TestProto.TestResponse result = new TestProto.TestResponse(this);
        result.result_ = result_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TestProto.TestResponse) {
          return mergeFrom((TestProto.TestResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TestProto.TestResponse other) {
        if (other == TestProto.TestResponse.getDefaultInstance()) return this;
        if (!other.getResult().isEmpty()) {
          result_ = other.result_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                result_ = input.readStringRequireUtf8();

                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private Object result_ = "";
      /**
       * <code>string result = 1;</code>
       * @return The result.
       */
      public String getResult() {
        Object ref = result_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          result_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string result = 1;</code>
       * @return The bytes for result.
       */
      public com.google.protobuf.ByteString
          getResultBytes() {
        Object ref = result_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          result_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string result = 1;</code>
       * @param value The result to set.
       * @return This builder for chaining.
       */
      public Builder setResult(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string result = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearResult() {
        
        result_ = getDefaultInstance().getResult();
        onChanged();
        return this;
      }
      /**
       * <code>string result = 1;</code>
       * @param value The bytes for result to set.
       * @return This builder for chaining.
       */
      public Builder setResultBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        result_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TestResponse)
    }

    // @@protoc_insertion_point(class_scope:TestResponse)
    private static final TestProto.TestResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TestProto.TestResponse();
    }

    public static TestProto.TestResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TestResponse>
        PARSER = new com.google.protobuf.AbstractParser<TestResponse>() {
      @Override
      public TestResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<TestResponse> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<TestResponse> getParserForType() {
      return PARSER;
    }

    @Override
    public TestProto.TestResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nTest.proto\"\033\n\013TestRequest\022\014\n\004name\030\001 \001(" +
      "\t\"\036\n\014TestResponse\022\016\n\006result\030\001 \001(\t28\n\013Tes" +
      "tService\022)\n\010testSuns\022\014.TestRequest\032\r.Tes" +
      "tResponse\"\000B\027\n\010com.yangB\tTestProtoP\000b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TestRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TestRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestRequest_descriptor,
        new String[] { "Name", });
    internal_static_TestResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestResponse_descriptor,
        new String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
