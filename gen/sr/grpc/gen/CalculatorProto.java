// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: currency.proto

package sr.grpc.gen;

public final class CalculatorProto {
  private CalculatorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_currency_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_currency_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_currency_CurrencyDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_currency_CurrencyDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_currency_CurrencyDetails_CurrenciesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_currency_CurrencyDetails_CurrenciesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016currency.proto\022\010currency\"\007\n\005Empty\"\203\001\n\017" +
      "CurrencyDetails\022=\n\ncurrencies\030\001 \003(\0132).cu" +
      "rrency.CurrencyDetails.CurrenciesEntry\0321" +
      "\n\017CurrenciesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030" +
      "\002 \001(\t:\0028\0012N\n\010Currency\022B\n\022getCurrentCurre" +
      "ncy\022\017.currency.Empty\032\031.currency.Currency" +
      "Details\"\000B&\n\013sr.grpc.genB\017CalculatorProt" +
      "oP\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_currency_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_currency_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_currency_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_currency_CurrencyDetails_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_currency_CurrencyDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_currency_CurrencyDetails_descriptor,
        new java.lang.String[] { "Currencies", });
    internal_static_currency_CurrencyDetails_CurrenciesEntry_descriptor =
      internal_static_currency_CurrencyDetails_descriptor.getNestedTypes().get(0);
    internal_static_currency_CurrencyDetails_CurrenciesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_currency_CurrencyDetails_CurrenciesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
