// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer-service.proto

package com.fuchuan.customerservice.common;

/**
 * Protobuf type {@code com.fuchuan.customerservice.common.AccountBaseInfoReply}
 */
public  final class AccountBaseInfoReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.fuchuan.customerservice.common.AccountBaseInfoReply)
    AccountBaseInfoReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountBaseInfoReply.newBuilder() to construct.
  private AccountBaseInfoReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountBaseInfoReply() {
    code_ = 0;
    id_ = "";
    nickName_ = "";
    avatar_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccountBaseInfoReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            code_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nickName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            avatar_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.fuchuan.customerservice.common.CustomerServiceGrpc.internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.fuchuan.customerservice.common.CustomerServiceGrpc.internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.fuchuan.customerservice.common.AccountBaseInfoReply.class, com.fuchuan.customerservice.common.AccountBaseInfoReply.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>.com.fuchuan.customerservice.common.Code code = 1;</code>
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.com.fuchuan.customerservice.common.Code code = 1;</code>
   */
  public com.fuchuan.customerservice.common.Code getCode() {
    @SuppressWarnings("deprecation")
    com.fuchuan.customerservice.common.Code result = com.fuchuan.customerservice.common.Code.valueOf(code_);
    return result == null ? com.fuchuan.customerservice.common.Code.UNRECOGNIZED : result;
  }

  public static final int ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 2;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NICKNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object nickName_;
  /**
   * <code>string nickName = 3;</code>
   */
  public java.lang.String getNickName() {
    java.lang.Object ref = nickName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nickName_ = s;
      return s;
    }
  }
  /**
   * <code>string nickName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNickNameBytes() {
    java.lang.Object ref = nickName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nickName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AVATAR_FIELD_NUMBER = 4;
  private volatile java.lang.Object avatar_;
  /**
   * <code>string avatar = 4;</code>
   */
  public java.lang.String getAvatar() {
    java.lang.Object ref = avatar_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      avatar_ = s;
      return s;
    }
  }
  /**
   * <code>string avatar = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAvatarBytes() {
    java.lang.Object ref = avatar_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      avatar_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (code_ != com.fuchuan.customerservice.common.Code.OK.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (!getNickNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nickName_);
    }
    if (!getAvatarBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, avatar_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.fuchuan.customerservice.common.Code.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (!getNickNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nickName_);
    }
    if (!getAvatarBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, avatar_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.fuchuan.customerservice.common.AccountBaseInfoReply)) {
      return super.equals(obj);
    }
    com.fuchuan.customerservice.common.AccountBaseInfoReply other = (com.fuchuan.customerservice.common.AccountBaseInfoReply) obj;

    boolean result = true;
    result = result && code_ == other.code_;
    result = result && getId()
        .equals(other.getId());
    result = result && getNickName()
        .equals(other.getNickName());
    result = result && getAvatar()
        .equals(other.getAvatar());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
    hash = (53 * hash) + getNickName().hashCode();
    hash = (37 * hash) + AVATAR_FIELD_NUMBER;
    hash = (53 * hash) + getAvatar().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.fuchuan.customerservice.common.AccountBaseInfoReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.fuchuan.customerservice.common.AccountBaseInfoReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.fuchuan.customerservice.common.AccountBaseInfoReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.fuchuan.customerservice.common.AccountBaseInfoReply)
      com.fuchuan.customerservice.common.AccountBaseInfoReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fuchuan.customerservice.common.CustomerServiceGrpc.internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fuchuan.customerservice.common.CustomerServiceGrpc.internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fuchuan.customerservice.common.AccountBaseInfoReply.class, com.fuchuan.customerservice.common.AccountBaseInfoReply.Builder.class);
    }

    // Construct using com.fuchuan.customerservice.common.AccountBaseInfoReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      id_ = "";

      nickName_ = "";

      avatar_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.fuchuan.customerservice.common.CustomerServiceGrpc.internal_static_com_fuchuan_customerservice_common_AccountBaseInfoReply_descriptor;
    }

    @java.lang.Override
    public com.fuchuan.customerservice.common.AccountBaseInfoReply getDefaultInstanceForType() {
      return com.fuchuan.customerservice.common.AccountBaseInfoReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.fuchuan.customerservice.common.AccountBaseInfoReply build() {
      com.fuchuan.customerservice.common.AccountBaseInfoReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.fuchuan.customerservice.common.AccountBaseInfoReply buildPartial() {
      com.fuchuan.customerservice.common.AccountBaseInfoReply result = new com.fuchuan.customerservice.common.AccountBaseInfoReply(this);
      result.code_ = code_;
      result.id_ = id_;
      result.nickName_ = nickName_;
      result.avatar_ = avatar_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.fuchuan.customerservice.common.AccountBaseInfoReply) {
        return mergeFrom((com.fuchuan.customerservice.common.AccountBaseInfoReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.fuchuan.customerservice.common.AccountBaseInfoReply other) {
      if (other == com.fuchuan.customerservice.common.AccountBaseInfoReply.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getNickName().isEmpty()) {
        nickName_ = other.nickName_;
        onChanged();
      }
      if (!other.getAvatar().isEmpty()) {
        avatar_ = other.avatar_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.fuchuan.customerservice.common.AccountBaseInfoReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.fuchuan.customerservice.common.AccountBaseInfoReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ = 0;
    /**
     * <code>.com.fuchuan.customerservice.common.Code code = 1;</code>
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.com.fuchuan.customerservice.common.Code code = 1;</code>
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.fuchuan.customerservice.common.Code code = 1;</code>
     */
    public com.fuchuan.customerservice.common.Code getCode() {
      @SuppressWarnings("deprecation")
      com.fuchuan.customerservice.common.Code result = com.fuchuan.customerservice.common.Code.valueOf(code_);
      return result == null ? com.fuchuan.customerservice.common.Code.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.fuchuan.customerservice.common.Code code = 1;</code>
     */
    public Builder setCode(com.fuchuan.customerservice.common.Code value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.fuchuan.customerservice.common.Code code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 2;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 2;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 2;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 2;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nickName_ = "";
    /**
     * <code>string nickName = 3;</code>
     */
    public java.lang.String getNickName() {
      java.lang.Object ref = nickName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nickName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNickNameBytes() {
      java.lang.Object ref = nickName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nickName = 3;</code>
     */
    public Builder setNickName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nickName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nickName = 3;</code>
     */
    public Builder clearNickName() {
      
      nickName_ = getDefaultInstance().getNickName();
      onChanged();
      return this;
    }
    /**
     * <code>string nickName = 3;</code>
     */
    public Builder setNickNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nickName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object avatar_ = "";
    /**
     * <code>string avatar = 4;</code>
     */
    public java.lang.String getAvatar() {
      java.lang.Object ref = avatar_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        avatar_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string avatar = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAvatarBytes() {
      java.lang.Object ref = avatar_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        avatar_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string avatar = 4;</code>
     */
    public Builder setAvatar(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      avatar_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string avatar = 4;</code>
     */
    public Builder clearAvatar() {
      
      avatar_ = getDefaultInstance().getAvatar();
      onChanged();
      return this;
    }
    /**
     * <code>string avatar = 4;</code>
     */
    public Builder setAvatarBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      avatar_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.fuchuan.customerservice.common.AccountBaseInfoReply)
  }

  // @@protoc_insertion_point(class_scope:com.fuchuan.customerservice.common.AccountBaseInfoReply)
  private static final com.fuchuan.customerservice.common.AccountBaseInfoReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.fuchuan.customerservice.common.AccountBaseInfoReply();
  }

  public static com.fuchuan.customerservice.common.AccountBaseInfoReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountBaseInfoReply>
      PARSER = new com.google.protobuf.AbstractParser<AccountBaseInfoReply>() {
    @java.lang.Override
    public AccountBaseInfoReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccountBaseInfoReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccountBaseInfoReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountBaseInfoReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.fuchuan.customerservice.common.AccountBaseInfoReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

