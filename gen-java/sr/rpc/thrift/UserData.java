/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package sr.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-05-05")
public class UserData implements org.apache.thrift.TBase<UserData, UserData._Fields>, java.io.Serializable, Cloneable, Comparable<UserData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserData");

  private static final org.apache.thrift.protocol.TField IMIE_FIELD_DESC = new org.apache.thrift.protocol.TField("imie", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAZWISKO_FIELD_DESC = new org.apache.thrift.protocol.TField("nazwisko", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PESEL_FIELD_DESC = new org.apache.thrift.protocol.TField("pesel", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MIESIECZNY_DOCHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("miesiecznyDochod", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserDataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserDataTupleSchemeFactory();

  public  java.lang.String imie; // required
  public  java.lang.String nazwisko; // required
  public  java.lang.String pesel; // required
  public int miesiecznyDochod; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IMIE((short)1, "imie"),
    NAZWISKO((short)2, "nazwisko"),
    PESEL((short)3, "pesel"),
    MIESIECZNY_DOCHOD((short)4, "miesiecznyDochod");

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
        case 1: // IMIE
          return IMIE;
        case 2: // NAZWISKO
          return NAZWISKO;
        case 3: // PESEL
          return PESEL;
        case 4: // MIESIECZNY_DOCHOD
          return MIESIECZNY_DOCHOD;
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
  private static final int __MIESIECZNYDOCHOD_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IMIE, new org.apache.thrift.meta_data.FieldMetaData("imie", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAZWISKO, new org.apache.thrift.meta_data.FieldMetaData("nazwisko", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PESEL, new org.apache.thrift.meta_data.FieldMetaData("pesel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MIESIECZNY_DOCHOD, new org.apache.thrift.meta_data.FieldMetaData("miesiecznyDochod", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserData.class, metaDataMap);
  }

  public UserData() {
  }

  public UserData(
    java.lang.String imie,
    java.lang.String nazwisko,
    java.lang.String pesel,
    int miesiecznyDochod)
  {
    this();
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.pesel = pesel;
    this.miesiecznyDochod = miesiecznyDochod;
    setMiesiecznyDochodIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserData(UserData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetImie()) {
      this.imie = other.imie;
    }
    if (other.isSetNazwisko()) {
      this.nazwisko = other.nazwisko;
    }
    if (other.isSetPesel()) {
      this.pesel = other.pesel;
    }
    this.miesiecznyDochod = other.miesiecznyDochod;
  }

  public UserData deepCopy() {
    return new UserData(this);
  }


  public void clear() {
    this.imie = null;
    this.nazwisko = null;
    this.pesel = null;
    setMiesiecznyDochodIsSet(false);
    this.miesiecznyDochod = 0;
  }


  public java.lang.String getImie() {
    return this.imie;
  }

  public UserData setImie(java.lang.String imie) {
    this.imie = imie;
    return this;
  }

  public void unsetImie() {
    this.imie = null;
  }

  /** Returns true if field imie is set (has been assigned a value) and false otherwise */
  public boolean isSetImie() {
    return this.imie != null;
  }

  public void setImieIsSet(boolean value) {
    if (!value) {
      this.imie = null;
    }
  }


  public java.lang.String getNazwisko() {
    return this.nazwisko;
  }

  public UserData setNazwisko( java.lang.String nazwisko) {
    this.nazwisko = nazwisko;
    return this;
  }

  public void unsetNazwisko() {
    this.nazwisko = null;
  }

  /** Returns true if field nazwisko is set (has been assigned a value) and false otherwise */
  public boolean isSetNazwisko() {
    return this.nazwisko != null;
  }

  public void setNazwiskoIsSet(boolean value) {
    if (!value) {
      this.nazwisko = null;
    }
  }


  public java.lang.String getPesel() {
    return this.pesel;
  }

  public UserData setPesel( java.lang.String pesel) {
    this.pesel = pesel;
    return this;
  }

  public void unsetPesel() {
    this.pesel = null;
  }

  /** Returns true if field pesel is set (has been assigned a value) and false otherwise */
  public boolean isSetPesel() {
    return this.pesel != null;
  }

  public void setPeselIsSet(boolean value) {
    if (!value) {
      this.pesel = null;
    }
  }

  public int getMiesiecznyDochod() {
    return this.miesiecznyDochod;
  }

  public UserData setMiesiecznyDochod(int miesiecznyDochod) {
    this.miesiecznyDochod = miesiecznyDochod;
    setMiesiecznyDochodIsSet(true);
    return this;
  }

  public void unsetMiesiecznyDochod() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MIESIECZNYDOCHOD_ISSET_ID);
  }

  /** Returns true if field miesiecznyDochod is set (has been assigned a value) and false otherwise */
  public boolean isSetMiesiecznyDochod() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MIESIECZNYDOCHOD_ISSET_ID);
  }

  public void setMiesiecznyDochodIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MIESIECZNYDOCHOD_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field,  java.lang.Object value) {
    switch (field) {
    case IMIE:
      if (value == null) {
        unsetImie();
      } else {
        setImie((java.lang.String)value);
      }
      break;

    case NAZWISKO:
      if (value == null) {
        unsetNazwisko();
      } else {
        setNazwisko((java.lang.String)value);
      }
      break;

    case PESEL:
      if (value == null) {
        unsetPesel();
      } else {
        setPesel((java.lang.String)value);
      }
      break;

    case MIESIECZNY_DOCHOD:
      if (value == null) {
        unsetMiesiecznyDochod();
      } else {
        setMiesiecznyDochod((java.lang.Integer)value);
      }
      break;

    }
  }


  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case IMIE:
      return getImie();

    case NAZWISKO:
      return getNazwisko();

    case PESEL:
      return getPesel();

    case MIESIECZNY_DOCHOD:
      return getMiesiecznyDochod();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case IMIE:
      return isSetImie();
    case NAZWISKO:
      return isSetNazwisko();
    case PESEL:
      return isSetPesel();
    case MIESIECZNY_DOCHOD:
      return isSetMiesiecznyDochod();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserData)
      return this.equals((UserData)that);
    return false;
  }

  public boolean equals(UserData that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_imie = true && this.isSetImie();
    boolean that_present_imie = true && that.isSetImie();
    if (this_present_imie || that_present_imie) {
      if (!(this_present_imie && that_present_imie))
        return false;
      if (!this.imie.equals(that.imie))
        return false;
    }

    boolean this_present_nazwisko = true && this.isSetNazwisko();
    boolean that_present_nazwisko = true && that.isSetNazwisko();
    if (this_present_nazwisko || that_present_nazwisko) {
      if (!(this_present_nazwisko && that_present_nazwisko))
        return false;
      if (!this.nazwisko.equals(that.nazwisko))
        return false;
    }

    boolean this_present_pesel = true && this.isSetPesel();
    boolean that_present_pesel = true && that.isSetPesel();
    if (this_present_pesel || that_present_pesel) {
      if (!(this_present_pesel && that_present_pesel))
        return false;
      if (!this.pesel.equals(that.pesel))
        return false;
    }

    boolean this_present_miesiecznyDochod = true;
    boolean that_present_miesiecznyDochod = true;
    if (this_present_miesiecznyDochod || that_present_miesiecznyDochod) {
      if (!(this_present_miesiecznyDochod && that_present_miesiecznyDochod))
        return false;
      if (this.miesiecznyDochod != that.miesiecznyDochod)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetImie()) ? 131071 : 524287);
    if (isSetImie())
      hashCode = hashCode * 8191 + imie.hashCode();

    hashCode = hashCode * 8191 + ((isSetNazwisko()) ? 131071 : 524287);
    if (isSetNazwisko())
      hashCode = hashCode * 8191 + nazwisko.hashCode();

    hashCode = hashCode * 8191 + ((isSetPesel()) ? 131071 : 524287);
    if (isSetPesel())
      hashCode = hashCode * 8191 + pesel.hashCode();

    hashCode = hashCode * 8191 + miesiecznyDochod;

    return hashCode;
  }


  public int compareTo(UserData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetImie()).compareTo(other.isSetImie());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImie()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imie, other.imie);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNazwisko()).compareTo(other.isSetNazwisko());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNazwisko()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nazwisko, other.nazwisko);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPesel()).compareTo(other.isSetPesel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPesel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pesel, other.pesel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMiesiecznyDochod()).compareTo(other.isSetMiesiecznyDochod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMiesiecznyDochod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.miesiecznyDochod, other.miesiecznyDochod);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserData(");
    boolean first = true;

    sb.append("imie:");
    if (this.imie == null) {
      sb.append("null");
    } else {
      sb.append(this.imie);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nazwisko:");
    if (this.nazwisko == null) {
      sb.append("null");
    } else {
      sb.append(this.nazwisko);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pesel:");
    if (this.pesel == null) {
      sb.append("null");
    } else {
      sb.append(this.pesel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("miesiecznyDochod:");
    sb.append(this.miesiecznyDochod);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserDataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserDataStandardScheme getScheme() {
      return new UserDataStandardScheme();
    }
  }

  private static class UserDataStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IMIE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.imie = iprot.readString();
              struct.setImieIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAZWISKO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nazwisko = iprot.readString();
              struct.setNazwiskoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PESEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pesel = iprot.readString();
              struct.setPeselIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MIESIECZNY_DOCHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.miesiecznyDochod = iprot.readI32();
              struct.setMiesiecznyDochodIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.imie != null) {
        oprot.writeFieldBegin(IMIE_FIELD_DESC);
        oprot.writeString(struct.imie);
        oprot.writeFieldEnd();
      }
      if (struct.nazwisko != null) {
        oprot.writeFieldBegin(NAZWISKO_FIELD_DESC);
        oprot.writeString(struct.nazwisko);
        oprot.writeFieldEnd();
      }
      if (struct.pesel != null) {
        oprot.writeFieldBegin(PESEL_FIELD_DESC);
        oprot.writeString(struct.pesel);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MIESIECZNY_DOCHOD_FIELD_DESC);
      oprot.writeI32(struct.miesiecznyDochod);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserDataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserDataTupleScheme getScheme() {
      return new UserDataTupleScheme();
    }
  }

  private static class UserDataTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserData> {


    public void write(org.apache.thrift.protocol.TProtocol prot, UserData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetImie()) {
        optionals.set(0);
      }
      if (struct.isSetNazwisko()) {
        optionals.set(1);
      }
      if (struct.isSetPesel()) {
        optionals.set(2);
      }
      if (struct.isSetMiesiecznyDochod()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetImie()) {
        oprot.writeString(struct.imie);
      }
      if (struct.isSetNazwisko()) {
        oprot.writeString(struct.nazwisko);
      }
      if (struct.isSetPesel()) {
        oprot.writeString(struct.pesel);
      }
      if (struct.isSetMiesiecznyDochod()) {
        oprot.writeI32(struct.miesiecznyDochod);
      }
    }


    public void read(org.apache.thrift.protocol.TProtocol prot, UserData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.imie = iprot.readString();
        struct.setImieIsSet(true);
      }
      if (incoming.get(1)) {
        struct.nazwisko = iprot.readString();
        struct.setNazwiskoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pesel = iprot.readString();
        struct.setPeselIsSet(true);
      }
      if (incoming.get(3)) {
        struct.miesiecznyDochod = iprot.readI32();
        struct.setMiesiecznyDochodIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

