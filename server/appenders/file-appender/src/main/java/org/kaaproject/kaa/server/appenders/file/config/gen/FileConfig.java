/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.file.config.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FileConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FileConfig\",\"namespace\":\"org.kaaproject.kaa.server.appenders.file.config.gen\",\"fields\":[{\"name\":\"publicKey\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Public Key\",\"maxLength\":1000,\"by_default\":\"\"},{\"name\":\"logsRootPath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Logs root path\",\"by_default\":\"/kaa_log_uploads\"},{\"name\":\"rollingFileNamePatern\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Rolling file name pattern\",\"by_default\":\"logFile.%d{yyyy-MM-dd}.log\"},{\"name\":\"rollingMaxHistory\",\"type\":\"int\",\"displayName\":\"Rolling max history\",\"by_default\":30},{\"name\":\"triggerMaxFileSize\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Trigger max file size\",\"by_default\":\"1GB\"},{\"name\":\"encoderPattern\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Encoder pattern\",\"by_default\":\"%-4relative [%thread] %-5level %logger{35} - %msg%n\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String publicKey;
   private java.lang.String logsRootPath;
   private java.lang.String rollingFileNamePatern;
   private int rollingMaxHistory;
   private java.lang.String triggerMaxFileSize;
   private java.lang.String encoderPattern;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public FileConfig() {}

  /**
   * All-args constructor.
   */
  public FileConfig(java.lang.String publicKey, java.lang.String logsRootPath, java.lang.String rollingFileNamePatern, java.lang.Integer rollingMaxHistory, java.lang.String triggerMaxFileSize, java.lang.String encoderPattern) {
    this.publicKey = publicKey;
    this.logsRootPath = logsRootPath;
    this.rollingFileNamePatern = rollingFileNamePatern;
    this.rollingMaxHistory = rollingMaxHistory;
    this.triggerMaxFileSize = triggerMaxFileSize;
    this.encoderPattern = encoderPattern;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return publicKey;
    case 1: return logsRootPath;
    case 2: return rollingFileNamePatern;
    case 3: return rollingMaxHistory;
    case 4: return triggerMaxFileSize;
    case 5: return encoderPattern;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: publicKey = (java.lang.String)value$; break;
    case 1: logsRootPath = (java.lang.String)value$; break;
    case 2: rollingFileNamePatern = (java.lang.String)value$; break;
    case 3: rollingMaxHistory = (java.lang.Integer)value$; break;
    case 4: triggerMaxFileSize = (java.lang.String)value$; break;
    case 5: encoderPattern = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'publicKey' field.
   */
  public java.lang.String getPublicKey() {
    return publicKey;
  }

  /**
   * Sets the value of the 'publicKey' field.
   * @param value the value to set.
   */
  public void setPublicKey(java.lang.String value) {
    this.publicKey = value;
  }

  /**
   * Gets the value of the 'logsRootPath' field.
   */
  public java.lang.String getLogsRootPath() {
    return logsRootPath;
  }

  /**
   * Sets the value of the 'logsRootPath' field.
   * @param value the value to set.
   */
  public void setLogsRootPath(java.lang.String value) {
    this.logsRootPath = value;
  }

  /**
   * Gets the value of the 'rollingFileNamePatern' field.
   */
  public java.lang.String getRollingFileNamePatern() {
    return rollingFileNamePatern;
  }

  /**
   * Sets the value of the 'rollingFileNamePatern' field.
   * @param value the value to set.
   */
  public void setRollingFileNamePatern(java.lang.String value) {
    this.rollingFileNamePatern = value;
  }

  /**
   * Gets the value of the 'rollingMaxHistory' field.
   */
  public java.lang.Integer getRollingMaxHistory() {
    return rollingMaxHistory;
  }

  /**
   * Sets the value of the 'rollingMaxHistory' field.
   * @param value the value to set.
   */
  public void setRollingMaxHistory(java.lang.Integer value) {
    this.rollingMaxHistory = value;
  }

  /**
   * Gets the value of the 'triggerMaxFileSize' field.
   */
  public java.lang.String getTriggerMaxFileSize() {
    return triggerMaxFileSize;
  }

  /**
   * Sets the value of the 'triggerMaxFileSize' field.
   * @param value the value to set.
   */
  public void setTriggerMaxFileSize(java.lang.String value) {
    this.triggerMaxFileSize = value;
  }

  /**
   * Gets the value of the 'encoderPattern' field.
   */
  public java.lang.String getEncoderPattern() {
    return encoderPattern;
  }

  /**
   * Sets the value of the 'encoderPattern' field.
   * @param value the value to set.
   */
  public void setEncoderPattern(java.lang.String value) {
    this.encoderPattern = value;
  }

  /** Creates a new FileConfig RecordBuilder */
  public static org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder();
  }
  
  /** Creates a new FileConfig RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder other) {
    return new org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder(other);
  }
  
  /** Creates a new FileConfig RecordBuilder by copying an existing FileConfig instance */
  public static org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig other) {
    return new org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for FileConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FileConfig>
    implements org.apache.avro.data.RecordBuilder<FileConfig> {

    private java.lang.String publicKey;
    private java.lang.String logsRootPath;
    private java.lang.String rollingFileNamePatern;
    private int rollingMaxHistory;
    private java.lang.String triggerMaxFileSize;
    private java.lang.String encoderPattern;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.publicKey)) {
        this.publicKey = data().deepCopy(fields()[0].schema(), other.publicKey);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.logsRootPath)) {
        this.logsRootPath = data().deepCopy(fields()[1].schema(), other.logsRootPath);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rollingFileNamePatern)) {
        this.rollingFileNamePatern = data().deepCopy(fields()[2].schema(), other.rollingFileNamePatern);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.rollingMaxHistory)) {
        this.rollingMaxHistory = data().deepCopy(fields()[3].schema(), other.rollingMaxHistory);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.triggerMaxFileSize)) {
        this.triggerMaxFileSize = data().deepCopy(fields()[4].schema(), other.triggerMaxFileSize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.encoderPattern)) {
        this.encoderPattern = data().deepCopy(fields()[5].schema(), other.encoderPattern);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FileConfig instance */
    private Builder(org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig other) {
            super(org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.publicKey)) {
        this.publicKey = data().deepCopy(fields()[0].schema(), other.publicKey);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.logsRootPath)) {
        this.logsRootPath = data().deepCopy(fields()[1].schema(), other.logsRootPath);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rollingFileNamePatern)) {
        this.rollingFileNamePatern = data().deepCopy(fields()[2].schema(), other.rollingFileNamePatern);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.rollingMaxHistory)) {
        this.rollingMaxHistory = data().deepCopy(fields()[3].schema(), other.rollingMaxHistory);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.triggerMaxFileSize)) {
        this.triggerMaxFileSize = data().deepCopy(fields()[4].schema(), other.triggerMaxFileSize);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.encoderPattern)) {
        this.encoderPattern = data().deepCopy(fields()[5].schema(), other.encoderPattern);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'publicKey' field */
    public java.lang.String getPublicKey() {
      return publicKey;
    }
    
    /** Sets the value of the 'publicKey' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder setPublicKey(java.lang.String value) {
      validate(fields()[0], value);
      this.publicKey = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'publicKey' field has been set */
    public boolean hasPublicKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'publicKey' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder clearPublicKey() {
      publicKey = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'logsRootPath' field */
    public java.lang.String getLogsRootPath() {
      return logsRootPath;
    }
    
    /** Sets the value of the 'logsRootPath' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder setLogsRootPath(java.lang.String value) {
      validate(fields()[1], value);
      this.logsRootPath = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'logsRootPath' field has been set */
    public boolean hasLogsRootPath() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'logsRootPath' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder clearLogsRootPath() {
      logsRootPath = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'rollingFileNamePatern' field */
    public java.lang.String getRollingFileNamePatern() {
      return rollingFileNamePatern;
    }
    
    /** Sets the value of the 'rollingFileNamePatern' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder setRollingFileNamePatern(java.lang.String value) {
      validate(fields()[2], value);
      this.rollingFileNamePatern = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'rollingFileNamePatern' field has been set */
    public boolean hasRollingFileNamePatern() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'rollingFileNamePatern' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder clearRollingFileNamePatern() {
      rollingFileNamePatern = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'rollingMaxHistory' field */
    public java.lang.Integer getRollingMaxHistory() {
      return rollingMaxHistory;
    }
    
    /** Sets the value of the 'rollingMaxHistory' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder setRollingMaxHistory(int value) {
      validate(fields()[3], value);
      this.rollingMaxHistory = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'rollingMaxHistory' field has been set */
    public boolean hasRollingMaxHistory() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'rollingMaxHistory' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder clearRollingMaxHistory() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'triggerMaxFileSize' field */
    public java.lang.String getTriggerMaxFileSize() {
      return triggerMaxFileSize;
    }
    
    /** Sets the value of the 'triggerMaxFileSize' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder setTriggerMaxFileSize(java.lang.String value) {
      validate(fields()[4], value);
      this.triggerMaxFileSize = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'triggerMaxFileSize' field has been set */
    public boolean hasTriggerMaxFileSize() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'triggerMaxFileSize' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder clearTriggerMaxFileSize() {
      triggerMaxFileSize = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'encoderPattern' field */
    public java.lang.String getEncoderPattern() {
      return encoderPattern;
    }
    
    /** Sets the value of the 'encoderPattern' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder setEncoderPattern(java.lang.String value) {
      validate(fields()[5], value);
      this.encoderPattern = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'encoderPattern' field has been set */
    public boolean hasEncoderPattern() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'encoderPattern' field */
    public org.kaaproject.kaa.server.appenders.file.config.gen.FileConfig.Builder clearEncoderPattern() {
      encoderPattern = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public FileConfig build() {
      try {
        FileConfig record = new FileConfig();
        record.publicKey = fieldSetFlags()[0] ? this.publicKey : (java.lang.String) defaultValue(fields()[0]);
        record.logsRootPath = fieldSetFlags()[1] ? this.logsRootPath : (java.lang.String) defaultValue(fields()[1]);
        record.rollingFileNamePatern = fieldSetFlags()[2] ? this.rollingFileNamePatern : (java.lang.String) defaultValue(fields()[2]);
        record.rollingMaxHistory = fieldSetFlags()[3] ? this.rollingMaxHistory : (java.lang.Integer) defaultValue(fields()[3]);
        record.triggerMaxFileSize = fieldSetFlags()[4] ? this.triggerMaxFileSize : (java.lang.String) defaultValue(fields()[4]);
        record.encoderPattern = fieldSetFlags()[5] ? this.encoderPattern : (java.lang.String) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
