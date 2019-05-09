/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package sr.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-05-05")
public class AccountDetails implements org.apache.thrift.TBase<AccountDetails, AccountDetails._Fields>, java.io.Serializable, Cloneable, Comparable<AccountDetails> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AccountDetails");

  private static final org.apache.thrift.protocol.TField KLUCZ_FIELD_DESC = new org.apache.thrift.protocol.TField("klucz", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TYP_KONTA_FIELD_DESC = new org.apache.thrift.protocol.TField("typKonta", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AccountDetailsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AccountDetailsTupleSchemeFactory();

  public  java.lang.String klucz; // required
  /**
   * 
   * @see AccountType
   */
  public  AccountType typKonta; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KLUCZ((short)1, "klucz"),
    /**
     * 
     * @see AccountType
     */
    TYP_KONTA((short)2, "typKonta");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KLUCZ
          return KLUCZ;
        case 2: // TYP_KONTA
          return TYP_KONTA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */

    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KLUCZ, new org.apache.thrift.meta_data.FieldMetaData("klucz", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TYP_KONTA, new org.apache.thrift.meta_data.FieldMetaData("typKonta", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AccountType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AccountDetails.class, metaDataMap);
  }

  public AccountDetails() {
  }

  public AccountDetails(
    java.lang.String klucz,
    AccountType typKonta)
  {
    this();
    this.klucz = klucz;
    this.typKonta = typKonta;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AccountDetails(AccountDetails other) {
    if (other.isSetKlucz()) {
      this.klucz = other.klucz;
    }
    if (other.isSetTypKonta()) {
      this.typKonta = other.typKonta;
    }
  }

  public AccountDetails deepCopy() {
    return new AccountDetails(this);
  }


  public void clear() {
    this.klucz = null;
    this.typKonta = null;
  }


  public java.lang.String getKlucz() {
    return this.klucz;
  }

  public AccountDetails setKlucz( java.lang.String klucz) {
    this.klucz = klucz;
    return this;
  }

  public void unsetKlucz() {
    this.klucz = null;
  }

  /** Returns true if field klucz is set (has been assigned a value) and false otherwise */
  public boolean isSetKlucz() {
    return this.klucz != null;
  }

  public void setKluczIsSet(boolean value) {
    if (!value) {
      this.klucz = null;
    }
  }

  /**
   * 
   * @see AccountType
   */

  public AccountType getTypKonta() {
    return this.typKonta;
  }

  /**
   * 
   * @see AccountType
   */
  public AccountDetails setTypKonta( AccountType typKonta) {
    this.typKonta = typKonta;
    return this;
  }

  public void unsetTypKonta() {
    this.typKonta = null;
  }

  /** Returns true if field typKonta is set (has been assigned a value) and false otherwise */
  public boolean isSetTypKonta() {
    return this.typKonta != null;
  }

  public void setTypKontaIsSet(boolean value) {
    if (!value) {
      this.typKonta = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case KLUCZ:
      if (value == null) {
        unsetKlucz();
      } else {
        setKlucz((java.lang.String)value);
      }
      break;

    case TYP_KONTA:
      if (value == null) {
        unsetTypKonta();
      } else {
        setTypKonta((AccountType)value);
      }
      break;

    }
  }


  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KLUCZ:
      return getKlucz();

    case TYP_KONTA:
      return getTypKonta();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KLUCZ:
      return isSetKlucz();
    case TYP_KONTA:
      return isSetTypKonta();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AccountDetails)
      return this.equals((AccountDetails)that);
    return false;
  }

  public boolean equals(AccountDetails that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_klucz = true && this.isSetKlucz();
    boolean that_present_klucz = true && that.isSetKlucz();
    if (this_present_klucz || that_present_klucz) {
      if (!(this_present_klucz && that_present_klucz))
        return false;
      if (!this.klucz.equals(that.klucz))
        return false;
    }

    boolean this_present_typKonta = true && this.isSetTypKonta();
    boolean that_present_typKonta = true && that.isSetTypKonta();
    if (this_present_typKonta || that_present_typKonta) {
      if (!(this_present_typKonta && that_present_typKonta))
        return false;
      if (!this.typKonta.equals(that.typKonta))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKlucz()) ? 131071 : 524287);
    if (isSetKlucz())
      hashCode = hashCode * 8191 + klucz.hashCode();

    hashCode = hashCode * 8191 + ((isSetTypKonta()) ? 131071 : 524287);
    if (isSetTypKonta())
      hashCode = hashCode * 8191 + typKonta.getValue();

    return hashCode;
  }


  public int compareTo(AccountDetails other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetKlucz()).compareTo(other.isSetKlucz());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKlucz()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.klucz, other.klucz);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTypKonta()).compareTo(other.isSetTypKonta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypKonta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typKonta, other.typKonta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }


  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountDetails(");
    boolean first = true;

    sb.append("klucz:");
    if (this.klucz == null) {
      sb.append("null");
    } else {
      sb.append(this.klucz);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("typKonta:");
    if (this.typKonta == null) {
      sb.append("null");
    } else {
      sb.append(this.typKonta);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AccountDetailsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AccountDetailsStandardScheme getScheme() {
      return new AccountDetailsStandardScheme();
    }
  }

  private static class AccountDetailsStandardScheme extends org.apache.thrift.scheme.StandardScheme<AccountDetails> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AccountDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KLUCZ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.klucz = iprot.readString();
              struct.setKluczIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYP_KONTA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.typKonta = sr.rpc.thrift.AccountType.findByValue(iprot.readI32());
              struct.setTypKontaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AccountDetails struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.klucz != null) {
        oprot.writeFieldBegin(KLUCZ_FIELD_DESC);
        oprot.writeString(struct.klucz);
        oprot.writeFieldEnd();
      }
      if (struct.typKonta != null) {
        oprot.writeFieldBegin(TYP_KONTA_FIELD_DESC);
        oprot.writeI32(struct.typKonta.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AccountDetailsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AccountDetailsTupleScheme getScheme() {
      return new AccountDetailsTupleScheme();
    }
  }

  private static class AccountDetailsTupleScheme extends org.apache.thrift.scheme.TupleScheme<AccountDetails> {


    public void write(org.apache.thrift.protocol.TProtocol prot, AccountDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKlucz()) {
        optionals.set(0);
      }
      if (struct.isSetTypKonta()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetKlucz()) {
        oprot.writeString(struct.klucz);
      }
      if (struct.isSetTypKonta()) {
        oprot.writeI32(struct.typKonta.getValue());
      }
    }


    public void read(org.apache.thrift.protocol.TProtocol prot, AccountDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.klucz = iprot.readString();
        struct.setKluczIsSet(true);
      }
      if (incoming.get(1)) {
        struct.typKonta = sr.rpc.thrift.AccountType.findByValue(iprot.readI32());
        struct.setTypKontaIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

