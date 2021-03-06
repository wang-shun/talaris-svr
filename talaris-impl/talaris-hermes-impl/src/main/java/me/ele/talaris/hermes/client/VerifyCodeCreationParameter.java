package me.ele.talaris.hermes.client;

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-22")
public class VerifyCodeCreationParameter
		implements
		org.apache.thrift.TBase<VerifyCodeCreationParameter, VerifyCodeCreationParameter._Fields>,
		java.io.Serializable, Cloneable,
		Comparable<VerifyCodeCreationParameter> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"VerifyCodeCreationParameter");

	private static final org.apache.thrift.protocol.TField SENDER_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"sender_key", org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField RECEIVER_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"receiver", org.apache.thrift.protocol.TType.STRING, (short) 2);
	private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"code", org.apache.thrift.protocol.TType.STRING, (short) 3);
	private static final org.apache.thrift.protocol.TField EXPIRE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"expire", org.apache.thrift.protocol.TType.I16, (short) 4);
	private static final org.apache.thrift.protocol.TField VIA_AUDIO_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"via_audio", org.apache.thrift.protocol.TType.BOOL, (short) 5);
	private static final org.apache.thrift.protocol.TField AUDIO_CALL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"audio_call_type", org.apache.thrift.protocol.TType.I32, (short) 6);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class,
				new VerifyCodeCreationParameterStandardSchemeFactory());
		schemes.put(TupleScheme.class,
				new VerifyCodeCreationParameterTupleSchemeFactory());
	}

	public String sender_key; // required
	public String receiver; // required
	public String code; // optional
	public short expire; // optional
	public boolean via_audio; // optional
	/**
	 *
	 * @see THermesAudioVerifyCodeCallType
	 */
	public THermesAudioVerifyCodeCallType audio_call_type; // optional

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		SENDER_KEY((short) 1, "sender_key"), RECEIVER((short) 2, "receiver"), CODE(
				(short) 3, "code"), EXPIRE((short) 4, "expire"), VIA_AUDIO(
				(short) 5, "via_audio"),
		/**
		 *
		 * @see THermesAudioVerifyCodeCallType
		 */
		AUDIO_CALL_TYPE((short) 6, "audio_call_type");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // SENDER_KEY
				return SENDER_KEY;
			case 2: // RECEIVER
				return RECEIVER;
			case 3: // CODE
				return CODE;
			case 4: // EXPIRE
				return EXPIRE;
			case 5: // VIA_AUDIO
				return VIA_AUDIO;
			case 6: // AUDIO_CALL_TYPE
				return AUDIO_CALL_TYPE;
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
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId
						+ " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
		 */
		public static _Fields findByName(String name) {
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public String getFieldName() {
			return _fieldName;
		}
	}

	// isset id assignments
	private static final int __EXPIRE_ISSET_ID = 0;
	private static final int __VIA_AUDIO_ISSET_ID = 1;
	private byte __isset_bitfield = 0;
	private static final _Fields optionals[] = { _Fields.CODE, _Fields.EXPIRE,
			_Fields.VIA_AUDIO, _Fields.AUDIO_CALL_TYPE };
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.SENDER_KEY,
				new org.apache.thrift.meta_data.FieldMetaData("sender_key",
						org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.FieldValueMetaData(
								org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.RECEIVER,
				new org.apache.thrift.meta_data.FieldMetaData("receiver",
						org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.FieldValueMetaData(
								org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData(
				"code", org.apache.thrift.TFieldRequirementType.OPTIONAL,
				new org.apache.thrift.meta_data.FieldValueMetaData(
						org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.EXPIRE,
				new org.apache.thrift.meta_data.FieldMetaData("expire",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(
								org.apache.thrift.protocol.TType.I16)));
		tmpMap.put(_Fields.VIA_AUDIO,
				new org.apache.thrift.meta_data.FieldMetaData("via_audio",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.FieldValueMetaData(
								org.apache.thrift.protocol.TType.BOOL)));
		tmpMap.put(_Fields.AUDIO_CALL_TYPE,
				new org.apache.thrift.meta_data.FieldMetaData(
						"audio_call_type",
						org.apache.thrift.TFieldRequirementType.OPTIONAL,
						new org.apache.thrift.meta_data.EnumMetaData(
								org.apache.thrift.protocol.TType.ENUM,
								THermesAudioVerifyCodeCallType.class)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
				VerifyCodeCreationParameter.class, metaDataMap);
	}

	public VerifyCodeCreationParameter() {
	}

	public VerifyCodeCreationParameter(String sender_key, String receiver) {
		this();
		this.sender_key = sender_key;
		this.receiver = receiver;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public VerifyCodeCreationParameter(VerifyCodeCreationParameter other) {
		__isset_bitfield = other.__isset_bitfield;
		if (other.isSetSender_key()) {
			this.sender_key = other.sender_key;
		}
		if (other.isSetReceiver()) {
			this.receiver = other.receiver;
		}
		if (other.isSetCode()) {
			this.code = other.code;
		}
		this.expire = other.expire;
		this.via_audio = other.via_audio;
		if (other.isSetAudio_call_type()) {
			this.audio_call_type = other.audio_call_type;
		}
	}

	public VerifyCodeCreationParameter deepCopy() {
		return new VerifyCodeCreationParameter(this);
	}

	public void clear() {
		this.sender_key = null;
		this.receiver = null;
		this.code = null;
		setExpireIsSet(false);
		this.expire = 0;
		setVia_audioIsSet(false);
		this.via_audio = false;
		this.audio_call_type = null;
	}

	public String getSender_key() {
		return this.sender_key;
	}

	public VerifyCodeCreationParameter setSender_key(String sender_key) {
		this.sender_key = sender_key;
		return this;
	}

	public void unsetSender_key() {
		this.sender_key = null;
	}

	/**
	 * Returns true if field sender_key is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetSender_key() {
		return this.sender_key != null;
	}

	public void setSender_keyIsSet(boolean value) {
		if (!value) {
			this.sender_key = null;
		}
	}

	public String getReceiver() {
		return this.receiver;
	}

	public VerifyCodeCreationParameter setReceiver(String receiver) {
		this.receiver = receiver;
		return this;
	}

	public void unsetReceiver() {
		this.receiver = null;
	}

	/**
	 * Returns true if field receiver is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetReceiver() {
		return this.receiver != null;
	}

	public void setReceiverIsSet(boolean value) {
		if (!value) {
			this.receiver = null;
		}
	}

	public String getCode() {
		return this.code;
	}

	public VerifyCodeCreationParameter setCode(String code) {
		this.code = code;
		return this;
	}

	public void unsetCode() {
		this.code = null;
	}

	/**
	 * Returns true if field code is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetCode() {
		return this.code != null;
	}

	public void setCodeIsSet(boolean value) {
		if (!value) {
			this.code = null;
		}
	}

	public short getExpire() {
		return this.expire;
	}

	public VerifyCodeCreationParameter setExpire(short expire) {
		this.expire = expire;
		setExpireIsSet(true);
		return this;
	}

	public void unsetExpire() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield,
				__EXPIRE_ISSET_ID);
	}

	/**
	 * Returns true if field expire is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetExpire() {
		return EncodingUtils.testBit(__isset_bitfield, __EXPIRE_ISSET_ID);
	}

	public void setExpireIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield,
				__EXPIRE_ISSET_ID, value);
	}

	public boolean isVia_audio() {
		return this.via_audio;
	}

	public VerifyCodeCreationParameter setVia_audio(boolean via_audio) {
		this.via_audio = via_audio;
		setVia_audioIsSet(true);
		return this;
	}

	public void unsetVia_audio() {
		__isset_bitfield = EncodingUtils.clearBit(__isset_bitfield,
				__VIA_AUDIO_ISSET_ID);
	}

	/**
	 * Returns true if field via_audio is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetVia_audio() {
		return EncodingUtils.testBit(__isset_bitfield, __VIA_AUDIO_ISSET_ID);
	}

	public void setVia_audioIsSet(boolean value) {
		__isset_bitfield = EncodingUtils.setBit(__isset_bitfield,
				__VIA_AUDIO_ISSET_ID, value);
	}

	/**
	 *
	 * @see THermesAudioVerifyCodeCallType
	 */
	public THermesAudioVerifyCodeCallType getAudio_call_type() {
		return this.audio_call_type;
	}

	/**
	 *
	 * @see THermesAudioVerifyCodeCallType
	 */
	public VerifyCodeCreationParameter setAudio_call_type(
			THermesAudioVerifyCodeCallType audio_call_type) {
		this.audio_call_type = audio_call_type;
		return this;
	}

	public void unsetAudio_call_type() {
		this.audio_call_type = null;
	}

	/**
	 * Returns true if field audio_call_type is set (has been assigned a value)
	 * and false otherwise
	 */
	public boolean isSetAudio_call_type() {
		return this.audio_call_type != null;
	}

	public void setAudio_call_typeIsSet(boolean value) {
		if (!value) {
			this.audio_call_type = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case SENDER_KEY:
			if (value == null) {
				unsetSender_key();
			} else {
				setSender_key((String) value);
			}
			break;

		case RECEIVER:
			if (value == null) {
				unsetReceiver();
			} else {
				setReceiver((String) value);
			}
			break;

		case CODE:
			if (value == null) {
				unsetCode();
			} else {
				setCode((String) value);
			}
			break;

		case EXPIRE:
			if (value == null) {
				unsetExpire();
			} else {
				setExpire((Short) value);
			}
			break;

		case VIA_AUDIO:
			if (value == null) {
				unsetVia_audio();
			} else {
				setVia_audio((Boolean) value);
			}
			break;

		case AUDIO_CALL_TYPE:
			if (value == null) {
				unsetAudio_call_type();
			} else {
				setAudio_call_type((THermesAudioVerifyCodeCallType) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case SENDER_KEY:
			return getSender_key();

		case RECEIVER:
			return getReceiver();

		case CODE:
			return getCode();

		case EXPIRE:
			return Short.valueOf(getExpire());

		case VIA_AUDIO:
			return Boolean.valueOf(isVia_audio());

		case AUDIO_CALL_TYPE:
			return getAudio_call_type();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned
	 * a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case SENDER_KEY:
			return isSetSender_key();
		case RECEIVER:
			return isSetReceiver();
		case CODE:
			return isSetCode();
		case EXPIRE:
			return isSetExpire();
		case VIA_AUDIO:
			return isSetVia_audio();
		case AUDIO_CALL_TYPE:
			return isSetAudio_call_type();
		}
		throw new IllegalStateException();
	}

	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof VerifyCodeCreationParameter)
			return this.equals((VerifyCodeCreationParameter) that);
		return false;
	}

	public boolean equals(VerifyCodeCreationParameter that) {
		if (that == null)
			return false;

		boolean this_present_sender_key = true && this.isSetSender_key();
		boolean that_present_sender_key = true && that.isSetSender_key();
		if (this_present_sender_key || that_present_sender_key) {
			if (!(this_present_sender_key && that_present_sender_key))
				return false;
			if (!this.sender_key.equals(that.sender_key))
				return false;
		}

		boolean this_present_receiver = true && this.isSetReceiver();
		boolean that_present_receiver = true && that.isSetReceiver();
		if (this_present_receiver || that_present_receiver) {
			if (!(this_present_receiver && that_present_receiver))
				return false;
			if (!this.receiver.equals(that.receiver))
				return false;
		}

		boolean this_present_code = true && this.isSetCode();
		boolean that_present_code = true && that.isSetCode();
		if (this_present_code || that_present_code) {
			if (!(this_present_code && that_present_code))
				return false;
			if (!this.code.equals(that.code))
				return false;
		}

		boolean this_present_expire = true && this.isSetExpire();
		boolean that_present_expire = true && that.isSetExpire();
		if (this_present_expire || that_present_expire) {
			if (!(this_present_expire && that_present_expire))
				return false;
			if (this.expire != that.expire)
				return false;
		}

		boolean this_present_via_audio = true && this.isSetVia_audio();
		boolean that_present_via_audio = true && that.isSetVia_audio();
		if (this_present_via_audio || that_present_via_audio) {
			if (!(this_present_via_audio && that_present_via_audio))
				return false;
			if (this.via_audio != that.via_audio)
				return false;
		}

		boolean this_present_audio_call_type = true && this
				.isSetAudio_call_type();
		boolean that_present_audio_call_type = true && that
				.isSetAudio_call_type();
		if (this_present_audio_call_type || that_present_audio_call_type) {
			if (!(this_present_audio_call_type && that_present_audio_call_type))
				return false;
			if (!this.audio_call_type.equals(that.audio_call_type))
				return false;
		}

		return true;
	}

	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_sender_key = true && (isSetSender_key());
		list.add(present_sender_key);
		if (present_sender_key)
			list.add(sender_key);

		boolean present_receiver = true && (isSetReceiver());
		list.add(present_receiver);
		if (present_receiver)
			list.add(receiver);

		boolean present_code = true && (isSetCode());
		list.add(present_code);
		if (present_code)
			list.add(code);

		boolean present_expire = true && (isSetExpire());
		list.add(present_expire);
		if (present_expire)
			list.add(expire);

		boolean present_via_audio = true && (isSetVia_audio());
		list.add(present_via_audio);
		if (present_via_audio)
			list.add(via_audio);

		boolean present_audio_call_type = true && (isSetAudio_call_type());
		list.add(present_audio_call_type);
		if (present_audio_call_type)
			list.add(audio_call_type.getValue());

		return list.hashCode();
	}

	public int compareTo(VerifyCodeCreationParameter other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetSender_key()).compareTo(
				other.isSetSender_key());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetSender_key()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.sender_key, other.sender_key);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetReceiver()).compareTo(
				other.isSetReceiver());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetReceiver()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.receiver, other.receiver);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetCode()).compareTo(
				other.isSetCode());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetCode()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code,
					other.code);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetExpire()).compareTo(
				other.isSetExpire());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetExpire()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.expire, other.expire);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetVia_audio()).compareTo(
				other.isSetVia_audio());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetVia_audio()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.via_audio, other.via_audio);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetAudio_call_type()).compareTo(
				other.isSetAudio_call_type());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetAudio_call_type()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.audio_call_type, other.audio_call_type);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot)
			throws org.apache.thrift.TException {
		schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot)
			throws org.apache.thrift.TException {
		schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("VerifyCodeCreationParameter(");
		boolean first = true;

		sb.append("sender_key:");
		if (this.sender_key == null) {
			sb.append("null");
		} else {
			sb.append(this.sender_key);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("receiver:");
		if (this.receiver == null) {
			sb.append("null");
		} else {
			sb.append(this.receiver);
		}
		first = false;
		if (isSetCode()) {
			if (!first)
				sb.append(", ");
			sb.append("code:");
			if (this.code == null) {
				sb.append("null");
			} else {
				sb.append(this.code);
			}
			first = false;
		}
		if (isSetExpire()) {
			if (!first)
				sb.append(", ");
			sb.append("expire:");
			sb.append(this.expire);
			first = false;
		}
		if (isSetVia_audio()) {
			if (!first)
				sb.append(", ");
			sb.append("via_audio:");
			sb.append(this.via_audio);
			first = false;
		}
		if (isSetAudio_call_type()) {
			if (!first)
				sb.append(", ");
			sb.append("audio_call_type:");
			if (this.audio_call_type == null) {
				sb.append("null");
			} else {
				sb.append(this.audio_call_type);
			}
			first = false;
		}
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		if (sender_key == null) {
			throw new org.apache.thrift.protocol.TProtocolException(
					"Required field 'sender_key' was not present! Struct: "
							+ toString());
		}
		if (receiver == null) {
			throw new org.apache.thrift.protocol.TProtocolException(
					"Required field 'receiver' was not present! Struct: "
							+ toString());
		}
		// check for sub-struct validity
	}

	private void writeObject(java.io.ObjectOutputStream out)
			throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in)
			throws java.io.IOException, ClassNotFoundException {
		try {
			// it doesn't seem like you should have to do this, but java
			// serialization is wacky, and doesn't call the default constructor.
			__isset_bitfield = 0;
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class VerifyCodeCreationParameterStandardSchemeFactory
			implements SchemeFactory {
		public VerifyCodeCreationParameterStandardScheme getScheme() {
			return new VerifyCodeCreationParameterStandardScheme();
		}
	}

	private static class VerifyCodeCreationParameterStandardScheme extends
			StandardScheme<VerifyCodeCreationParameter> {

		public void read(org.apache.thrift.protocol.TProtocol iprot,
				VerifyCodeCreationParameter struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // SENDER_KEY
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.sender_key = iprot.readString();
						struct.setSender_keyIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
								schemeField.type);
					}
					break;
				case 2: // RECEIVER
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.receiver = iprot.readString();
						struct.setReceiverIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
								schemeField.type);
					}
					break;
				case 3: // CODE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.code = iprot.readString();
						struct.setCodeIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
								schemeField.type);
					}
					break;
				case 4: // EXPIRE
					if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
						struct.expire = iprot.readI16();
						struct.setExpireIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
								schemeField.type);
					}
					break;
				case 5: // VIA_AUDIO
					if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
						struct.via_audio = iprot.readBool();
						struct.setVia_audioIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
								schemeField.type);
					}
					break;
				case 6: // AUDIO_CALL_TYPE
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.audio_call_type = THermesAudioVerifyCodeCallType
								.findByValue(iprot.readI32());
						struct.setAudio_call_typeIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
								schemeField.type);
					}
					break;
				default:
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							schemeField.type);
				}
				iprot.readFieldEnd();
			}
			iprot.readStructEnd();

			// check for required fields of primitive type, which can't be
			// checked in the validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot,
				VerifyCodeCreationParameter struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.sender_key != null) {
				oprot.writeFieldBegin(SENDER_KEY_FIELD_DESC);
				oprot.writeString(struct.sender_key);
				oprot.writeFieldEnd();
			}
			if (struct.receiver != null) {
				oprot.writeFieldBegin(RECEIVER_FIELD_DESC);
				oprot.writeString(struct.receiver);
				oprot.writeFieldEnd();
			}
			if (struct.code != null) {
				if (struct.isSetCode()) {
					oprot.writeFieldBegin(CODE_FIELD_DESC);
					oprot.writeString(struct.code);
					oprot.writeFieldEnd();
				}
			}
			if (struct.isSetExpire()) {
				oprot.writeFieldBegin(EXPIRE_FIELD_DESC);
				oprot.writeI16(struct.expire);
				oprot.writeFieldEnd();
			}
			if (struct.isSetVia_audio()) {
				oprot.writeFieldBegin(VIA_AUDIO_FIELD_DESC);
				oprot.writeBool(struct.via_audio);
				oprot.writeFieldEnd();
			}
			if (struct.audio_call_type != null) {
				if (struct.isSetAudio_call_type()) {
					oprot.writeFieldBegin(AUDIO_CALL_TYPE_FIELD_DESC);
					oprot.writeI32(struct.audio_call_type.getValue());
					oprot.writeFieldEnd();
				}
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class VerifyCodeCreationParameterTupleSchemeFactory
			implements SchemeFactory {
		public VerifyCodeCreationParameterTupleScheme getScheme() {
			return new VerifyCodeCreationParameterTupleScheme();
		}
	}

	private static class VerifyCodeCreationParameterTupleScheme extends
			TupleScheme<VerifyCodeCreationParameter> {

		public void write(org.apache.thrift.protocol.TProtocol prot,
				VerifyCodeCreationParameter struct)
				throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			oprot.writeString(struct.sender_key);
			oprot.writeString(struct.receiver);
			BitSet optionals = new BitSet();
			if (struct.isSetCode()) {
				optionals.set(0);
			}
			if (struct.isSetExpire()) {
				optionals.set(1);
			}
			if (struct.isSetVia_audio()) {
				optionals.set(2);
			}
			if (struct.isSetAudio_call_type()) {
				optionals.set(3);
			}
			oprot.writeBitSet(optionals, 4);
			if (struct.isSetCode()) {
				oprot.writeString(struct.code);
			}
			if (struct.isSetExpire()) {
				oprot.writeI16(struct.expire);
			}
			if (struct.isSetVia_audio()) {
				oprot.writeBool(struct.via_audio);
			}
			if (struct.isSetAudio_call_type()) {
				oprot.writeI32(struct.audio_call_type.getValue());
			}
		}

		public void read(org.apache.thrift.protocol.TProtocol prot,
				VerifyCodeCreationParameter struct)
				throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			struct.sender_key = iprot.readString();
			struct.setSender_keyIsSet(true);
			struct.receiver = iprot.readString();
			struct.setReceiverIsSet(true);
			BitSet incoming = iprot.readBitSet(4);
			if (incoming.get(0)) {
				struct.code = iprot.readString();
				struct.setCodeIsSet(true);
			}
			if (incoming.get(1)) {
				struct.expire = iprot.readI16();
				struct.setExpireIsSet(true);
			}
			if (incoming.get(2)) {
				struct.via_audio = iprot.readBool();
				struct.setVia_audioIsSet(true);
			}
			if (incoming.get(3)) {
				struct.audio_call_type = THermesAudioVerifyCodeCallType
						.findByValue(iprot.readI32());
				struct.setAudio_call_typeIsSet(true);
			}
		}
	}

}
