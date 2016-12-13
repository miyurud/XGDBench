package org.xgdbench.workloads;


@x10.runtime.impl.java.X10Generated public class MAGWorkload extends com.yahoo.ycsb.Workload implements x10.serialization.X10JavaSerializable
{
    private static final long serialVersionUID = 1L;
    public static final x10.rtt.RuntimeType<MAGWorkload> $RTT = x10.rtt.NamedType.<MAGWorkload> make(
    "org.xgdbench.workloads.MAGWorkload", /* base class */MAGWorkload.class
    , /* parents */ new x10.rtt.Type[] {com.yahoo.ycsb.Workload.$RTT}
    );
    public x10.rtt.RuntimeType<?> $getRTT() {return $RTT;}
    
    public x10.rtt.Type<?> $getParam(int i) {return null;}
    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException { if (x10.runtime.impl.java.Runtime.TRACE_SER) { java.lang.System.out.println("Serializer: writeObject(ObjectOutputStream) of " + this + " calling"); } oos.defaultWriteObject(); }
    public static x10.serialization.X10JavaSerializable $_deserialize_body(org.xgdbench.workloads.MAGWorkload $_obj , x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + MAGWorkload.class + " calling"); } 
        com.yahoo.ycsb.Workload.$_deserialize_body($_obj, $deserializer);
        $_obj.generator = $deserializer.readRef();
        $_obj.table = $deserializer.readRef();
        $_obj.fieldcount = $deserializer.readInt();
        $_obj.randomField = $deserializer.readInt();
        $_obj.generatorThreadCount = $deserializer.readInt();
        $_obj.fieldlength = $deserializer.readInt();
        $_obj.readallfields = $deserializer.readBoolean();
        $_obj.writeallfields = $deserializer.readBoolean();
        $_obj.transactionInserts = $deserializer.readBoolean();
        $_obj.affinityMatrix = $deserializer.readRef();
        $_obj.thetaThreshold = $deserializer.readFloat();
        $_obj.edgecount = $deserializer.readInt();
        $_obj.keysequence = $deserializer.readRef();
        $_obj.operationchooser = $deserializer.readRef();
        $_obj.keychooser = $deserializer.readRef();
        $_obj.fieldchooser = $deserializer.readRef();
        $_obj.transactioninsertkeysequence = $deserializer.readRef();
        $_obj.scanlength = $deserializer.readRef();
        $_obj.traverselength = $deserializer.readRef();
        $_obj.orderedinserts = $deserializer.readBoolean();
        $_obj.recordcount = $deserializer.readInt();
        $_obj.randUserChoice = (java.util.Random) $deserializer.readRefUsingReflection();
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
    
        MAGWorkload $_obj = new MAGWorkload((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
        
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        super.$_serialize($serializer);
        if (generator instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.generator);
        } else {
        $serializer.write(this.generator);
        }
        $serializer.write(this.table);
        $serializer.write(this.fieldcount);
        $serializer.write(this.randomField);
        $serializer.write(this.generatorThreadCount);
        $serializer.write(this.fieldlength);
        $serializer.write(this.readallfields);
        $serializer.write(this.writeallfields);
        $serializer.write(this.transactionInserts);
        if (affinityMatrix instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.affinityMatrix);
        } else {
        $serializer.write(this.affinityMatrix);
        }
        $serializer.write(this.thetaThreshold);
        $serializer.write(this.edgecount);
        if (keysequence instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.keysequence);
        } else {
        $serializer.write(this.keysequence);
        }
        if (operationchooser instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.operationchooser);
        } else {
        $serializer.write(this.operationchooser);
        }
        if (keychooser instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.keychooser);
        } else {
        $serializer.write(this.keychooser);
        }
        if (fieldchooser instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.fieldchooser);
        } else {
        $serializer.write(this.fieldchooser);
        }
        if (transactioninsertkeysequence instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.transactioninsertkeysequence);
        } else {
        $serializer.write(this.transactioninsertkeysequence);
        }
        if (scanlength instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.scanlength);
        } else {
        $serializer.write(this.scanlength);
        }
        if (traverselength instanceof x10.serialization.X10JavaSerializable) {
        $serializer.write((x10.serialization.X10JavaSerializable) this.traverselength);
        } else {
        $serializer.write(this.traverselength);
        }
        $serializer.write(this.orderedinserts);
        $serializer.write(this.recordcount);
        $serializer.writeObjectUsingReflection(this.randUserChoice);
        
    }
    
    // constructor just for allocation
    public MAGWorkload(final java.lang.System[] $dummy) { 
    super($dummy);
    }
    
        
//#line 33 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public org.xgdbench.generator.MAGGenerator generator;
        
//#line 38 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the database table to run queries against.
	 */
        final public static java.lang.String TABLENAME_PROPERTY = "table";
        
//#line 43 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default name of the database table to run queries against.
	 */
        final public static java.lang.String TABLENAME_PROPERTY_DEFAULT = "usertable";
        
//#line 45 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public java.lang.String table;
        
//#line 51 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the number of fields in a record.
	 */
        final public static java.lang.String FIELD_COUNT_PROPERTY = "fieldcount";
        
//#line 56 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * Default number of fields in a record.
	 */
        final public static java.lang.String FIELD_COUNT_PROPERTY_DEFAULT = "10";
        
//#line 58 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public int fieldcount;
        
//#line 63 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the number of fields in a record.
	 */
        final public static java.lang.String RANDOM_SEED_PROPERTY = "randseed";
        
//#line 65 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String RANDOM_SEED_PROPERTY_DEFAULT = "100";
        
//#line 67 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public int randomField;
        
//#line 69 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String GENERATOR_THREAD = "genthreads";
        
//#line 71 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String GENERATOR_THREAD_COUNT = "12";
        
//#line 73 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public int generatorThreadCount;
        
//#line 78 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the length of a field in bytes.
	 */
        final public static java.lang.String FIELD_LENGTH_PROPERTY = "fieldlength";
        
//#line 83 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default length of a field in bytes.
	 */
        final public static java.lang.String FIELD_LENGTH_PROPERTY_DEFAULT = "100";
        
//#line 85 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public int fieldlength;
        
//#line 90 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for deciding whether to read one field (false) or all fields (true) of a record.
	 */
        final public static java.lang.String READ_ALL_FIELDS_PROPERTY = "readallfields";
        
//#line 95 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default value for the readallfields property.
	 */
        final public static java.lang.String READ_ALL_FIELDS_PROPERTY_DEFAULT = "true";
        
//#line 97 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean readallfields;
        
//#line 102 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for deciding whether to write one field (false) or all fields (true) of a record.
	 */
        final public static java.lang.String WRITE_ALL_FIELDS_PROPERTY = "writeallfields";
        
//#line 107 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default value for the writeallfields property.
	 */
        final public static java.lang.String WRITE_ALL_FIELDS_PROPERTY_DEFAULT = "false";
        
//#line 109 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean writeallfields;
        
//#line 115 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the proportion of transactions that are reads.
	 */
        final public static java.lang.String READ_PROPORTION_PROPERTY = "readproportion";
        
//#line 120 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default proportion of transactions that are reads.	
	 */
        final public static java.lang.String READ_PROPORTION_PROPERTY_DEFAULT = "0.95";
        
//#line 125 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the proportion of transactions that are updates.
	 */
        final public static java.lang.String UPDATE_PROPORTION_PROPERTY = "updateproportion";
        
//#line 130 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default proportion of transactions that are updates.
	 */
        final public static java.lang.String UPDATE_PROPORTION_PROPERTY_DEFAULT = "0.05";
        
//#line 135 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the proportion of transactions that are inserts.
	 */
        final public static java.lang.String INSERT_PROPORTION_PROPERTY = "insertproportion";
        
//#line 140 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default proportion of transactions that are inserts.
	 */
        final public static java.lang.String INSERT_PROPORTION_PROPERTY_DEFAULT = "0.0";
        
//#line 145 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the proportion of transactions that are scans.
	 */
        final public static java.lang.String SCAN_PROPORTION_PROPERTY = "scanproportion";
        
//#line 150 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default proportion of transactions that are scans.
	 */
        final public static java.lang.String SCAN_PROPORTION_PROPERTY_DEFAULT = "0.0";
        
//#line 155 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the proportion of transactions that are traverse operations.
	 */
        final public static java.lang.String TRAVERSE_PROPORTION_PROPERTY = "traverseproportion";
        
//#line 160 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default proportion of transactions that are traverse operations.
	 */
        final public static java.lang.String TRAVERSE_PROPORTION_PROPERTY_DEFAULT = "0.0";
        
//#line 165 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the proportion of transactions that are read-modify-write.
	 */
        final public static java.lang.String READMODIFYWRITE_PROPORTION_PROPERTY = "readmodifywriteproportion";
        
//#line 170 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default proportion of transactions that are scans.
	 */
        final public static java.lang.String READMODIFYWRITE_PROPORTION_PROPERTY_DEFAULT = "0.0";
        
//#line 175 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the the distribution of requests across the keyspace. Options are "uniform", "zipfian" and "latest"
	 */
        final public static java.lang.String REQUEST_DISTRIBUTION_PROPERTY = "requestdistribution";
        
//#line 180 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default distribution of requests across the keyspace
	 */
        final public static java.lang.String REQUEST_DISTRIBUTION_PROPERTY_DEFAULT = "uniform";
        
//#line 185 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the max scan length (number of records)
	 */
        final public static java.lang.String MAX_SCAN_LENGTH_PROPERTY = "maxscanlength";
        
//#line 190 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default max scan length.
	 */
        final public static java.lang.String MAX_SCAN_LENGTH_PROPERTY_DEFAULT = "1000";
        
//#line 195 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the scan length distribution. Options are "uniform" and "zipfian" (favoring short scans)
	 */
        final public static java.lang.String SCAN_LENGTH_DISTRIBUTION_PROPERTY = "scanlengthdistribution";
        
//#line 200 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default max scan length.
	 */
        final public static java.lang.String SCAN_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT = "uniform";
        
//#line 205 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the traverse length distribution. Options are "uniform" and "zipfian" (favoring short traversals)
	 */
        final public static java.lang.String TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY = "traverselengthdistribution";
        
//#line 210 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The default max scan length.
	 */
        final public static java.lang.String TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT = "uniform";
        
//#line 215 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The name of the property for the order to insert records. Options are "ordered" or "hashed"
	 */
        final public static java.lang.String INSERT_ORDER_PROPERTY = "insertorder";
        
//#line 220 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * Default insert order.
	 */
        final public static java.lang.String INSERT_ORDER_PROPERTY_DEFAULT = "hashed";
        
//#line 226 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * Indicator of whether the worklaod inserts vertices to the graphdb during the transaction phase 
	 */
        final public static java.lang.String TRANSACTION_PHASE_INSERTS_DEFAULT = "false";
        
//#line 228 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String TRANSACTION_PHASE_INSERTS = "transactioninsert";
        
//#line 230 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean transactionInserts;
        
//#line 232 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String AFFINITY_MATRIX_DEFAULT = "[0.99f, 0.53f, 0.53f, 0.13f]";
        
//#line 234 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String AFFINITY_MATRIX = "affinitymatrix";
        
//#line 236 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public x10.array.Array<x10.core.Float> affinityMatrix;
        
//#line 238 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String THETA_THRESHOLD_DEFAULT = "0.1";
        
//#line 240 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String THETA_THRESHOLD = "pthreshold";
        
//#line 242 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public float thetaThreshold;
        
//#line 248 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/**
	 * The graph db uri
	 */
        final public static java.lang.String DB_URI_DEFAULT = null;
        
//#line 250 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public static java.lang.String DB_URI = "uri";
        
//#line 252 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public int edgecount;
        
//#line 254 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public com.yahoo.ycsb.generator.CounterGenerator keysequence;
        
//#line 256 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public com.yahoo.ycsb.generator.DiscreteGenerator operationchooser;
        
//#line 258 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public com.yahoo.ycsb.generator.IntegerGenerator keychooser;
        
//#line 260 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public com.yahoo.ycsb.generator.Generator fieldchooser;
        
//#line 262 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public com.yahoo.ycsb.generator.CounterGenerator transactioninsertkeysequence;
        
//#line 264 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public com.yahoo.ycsb.generator.IntegerGenerator scanlength;
        
//#line 266 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public com.yahoo.ycsb.generator.IntegerGenerator traverselength;
        
//#line 268 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean orderedinserts;
        
//#line 270 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public int recordcount;
        
//#line 272 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public java.util.Random randUserChoice;
        
        
//#line 274 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
// creation method for java code (1-phase java constructor)
        public MAGWorkload(){this((java.lang.System[]) null);
                                 org$xgdbench$workloads$MAGWorkload$$init$S();}
        
        // constructor for non-virtual call
        final public org.xgdbench.workloads.MAGWorkload org$xgdbench$workloads$MAGWorkload$$init$S() { {
                                                                                                              
//#line 274 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
/*super.*/com$yahoo$ycsb$Workload$$init$S();
                                                                                                              
//#line 274 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"

                                                                                                              
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.__fieldInitializers26914();
                                                                                                              
//#line 275 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27608 =
                                                                                                                ((long)(((int)(100))));
                                                                                                              
//#line 275 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Random t27609 =
                                                                                                                ((java.util.Random)(new java.util.Random(t27608)));
                                                                                                              
//#line 275 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.randUserChoice = ((java.util.Random)(t27609));
                                                                                                          }
                                                                                                          return this;
                                                                                                          }
        
        
        
//#line 282 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              init(
                                                                                                              java.util.Properties p) throws com.yahoo.ycsb.WorkloadException{
            
//#line 284 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27610 =
              p;
            
//#line 284 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27611 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TABLENAME_PROPERTY));
            
//#line 284 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27612 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TABLENAME_PROPERTY_DEFAULT));
            
//#line 284 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27613 =
              t27610.getProperty(((java.lang.String)(t27611)),
                                 ((java.lang.String)(t27612)));
            
//#line 284 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.table = ((java.lang.String)(t27613));
            
//#line 285 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27614 =
              p;
            
//#line 285 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27615 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.FIELD_COUNT_PROPERTY));
            
//#line 285 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27616 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.FIELD_COUNT_PROPERTY_DEFAULT));
            
//#line 285 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27617 =
              t27614.getProperty(((java.lang.String)(t27615)),
                                 ((java.lang.String)(t27616)));
            
//#line 285 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27618 =
              java.lang.Integer.parseInt(t27617);
            
//#line 285 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.fieldcount = t27618;
            
//#line 286 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27619 =
              p;
            
//#line 286 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27620 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.RANDOM_SEED_PROPERTY));
            
//#line 286 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27621 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.RANDOM_SEED_PROPERTY_DEFAULT));
            
//#line 286 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27622 =
              t27619.getProperty(((java.lang.String)(t27620)),
                                 ((java.lang.String)(t27621)));
            
//#line 286 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27623 =
              java.lang.Integer.parseInt(t27622);
            
//#line 286 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.randomField = t27623;
            
//#line 287 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27624 =
              p;
            
//#line 287 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27625 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.FIELD_LENGTH_PROPERTY));
            
//#line 287 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27626 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.FIELD_LENGTH_PROPERTY_DEFAULT));
            
//#line 287 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27627 =
              t27624.getProperty(((java.lang.String)(t27625)),
                                 ((java.lang.String)(t27626)));
            
//#line 287 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27628 =
              java.lang.Integer.parseInt(t27627);
            
//#line 287 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.fieldlength = t27628;
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27629 =
              p;
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27630 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.GENERATOR_THREAD));
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27631 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.GENERATOR_THREAD_COUNT));
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27632 =
              t27629.getProperty(((java.lang.String)(t27630)),
                                 ((java.lang.String)(t27631)));
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27633 =
              java.lang.Integer.parseInt(t27632);
            
//#line 288 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.generatorThreadCount = t27633;
            
//#line 289 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27634 =
              p;
            
//#line 289 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27635 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.READ_PROPORTION_PROPERTY));
            
//#line 289 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27636 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.READ_PROPORTION_PROPERTY_DEFAULT));
            
//#line 289 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27637 =
              t27634.getProperty(((java.lang.String)(t27635)),
                                 ((java.lang.String)(t27636)));
            
//#line 289 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
double readproportion =
              java.lang.Double.parseDouble(t27637);
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27638 =
              p;
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27639 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.UPDATE_PROPORTION_PROPERTY));
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27640 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.UPDATE_PROPORTION_PROPERTY_DEFAULT));
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27641 =
              t27638.getProperty(((java.lang.String)(t27639)),
                                 ((java.lang.String)(t27640)));
            
//#line 290 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
double updateproportion =
              java.lang.Double.parseDouble(t27641);
            
//#line 291 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27642 =
              p;
            
//#line 291 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27643 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.INSERT_PROPORTION_PROPERTY));
            
//#line 291 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27644 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.INSERT_PROPORTION_PROPERTY_DEFAULT));
            
//#line 291 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27645 =
              t27642.getProperty(((java.lang.String)(t27643)),
                                 ((java.lang.String)(t27644)));
            
//#line 291 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
double insertproportion =
              java.lang.Double.parseDouble(t27645);
            
//#line 292 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27646 =
              p;
            
//#line 292 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27647 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.SCAN_PROPORTION_PROPERTY));
            
//#line 292 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27648 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.SCAN_PROPORTION_PROPERTY_DEFAULT));
            
//#line 292 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27649 =
              t27646.getProperty(((java.lang.String)(t27647)),
                                 ((java.lang.String)(t27648)));
            
//#line 292 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
double scanproportion =
              java.lang.Double.parseDouble(t27649);
            
//#line 293 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27650 =
              p;
            
//#line 293 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27651 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TRAVERSE_PROPORTION_PROPERTY));
            
//#line 293 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27652 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TRAVERSE_PROPORTION_PROPERTY_DEFAULT));
            
//#line 293 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27653 =
              t27650.getProperty(((java.lang.String)(t27651)),
                                 ((java.lang.String)(t27652)));
            
//#line 293 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
double traverseproportion =
              java.lang.Double.parseDouble(t27653);
            
//#line 294 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27654 =
              p;
            
//#line 294 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27655 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.READMODIFYWRITE_PROPORTION_PROPERTY));
            
//#line 294 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27656 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.READMODIFYWRITE_PROPORTION_PROPERTY_DEFAULT));
            
//#line 294 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27657 =
              t27654.getProperty(((java.lang.String)(t27655)),
                                 ((java.lang.String)(t27656)));
            
//#line 294 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
double readmodifywriteproportion =
              java.lang.Double.parseDouble(t27657);
            
//#line 295 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27658 =
              p;
            
//#line 295 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27659 =
              ((java.lang.String)(com.yahoo.ycsb.Client.RECORD_COUNT_PROPERTY));
            
//#line 295 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27660 =
              t27658.getProperty(((java.lang.String)(t27659)));
            
//#line 295 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27661 =
              java.lang.Integer.parseInt(t27660);
            
//#line 295 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.recordcount = t27661;
            
//#line 296 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27662 =
              p;
            
//#line 296 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27663 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.REQUEST_DISTRIBUTION_PROPERTY));
            
//#line 296 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27664 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.REQUEST_DISTRIBUTION_PROPERTY_DEFAULT));
            
//#line 296 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String requestdistrib =
              t27662.getProperty(((java.lang.String)(t27663)),
                                 ((java.lang.String)(t27664)));
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27665 =
              p;
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27666 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.MAX_SCAN_LENGTH_PROPERTY));
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27667 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.MAX_SCAN_LENGTH_PROPERTY_DEFAULT));
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27668 =
              t27665.getProperty(((java.lang.String)(t27666)),
                                 ((java.lang.String)(t27667)));
            
//#line 297 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int maxscanlength =
              java.lang.Integer.parseInt(t27668);
            
//#line 298 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27669 =
              p;
            
//#line 298 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27670 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.SCAN_LENGTH_DISTRIBUTION_PROPERTY));
            
//#line 298 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27671 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.SCAN_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT));
            
//#line 298 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String scanlengthdistrib =
              t27669.getProperty(((java.lang.String)(t27670)),
                                 ((java.lang.String)(t27671)));
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27672 =
              p;
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27673 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY));
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27674 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TRAVERSE_LENGTH_DISTRIBUTION_PROPERTY_DEFAULT));
            
//#line 299 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String traverselengthdistrib =
              t27672.getProperty(((java.lang.String)(t27673)),
                                 ((java.lang.String)(t27674)));
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27675 =
              p;
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27676 =
              ((java.lang.String)(com.yahoo.ycsb.Workload.INSERT_START_PROPERTY));
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27677 =
              ((java.lang.String)(com.yahoo.ycsb.Workload.INSERT_START_PROPERTY_DEFAULT));
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27678 =
              t27675.getProperty(((java.lang.String)(t27676)),
                                 ((java.lang.String)(t27677)));
            
//#line 301 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int insertstart =
              java.lang.Integer.parseInt(t27678);
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27679 =
              p;
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27680 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.READ_ALL_FIELDS_PROPERTY));
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27681 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.READ_ALL_FIELDS_PROPERTY_DEFAULT));
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27682 =
              t27679.getProperty(((java.lang.String)(t27680)),
                                 ((java.lang.String)(t27681)));
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27683 =
              java.lang.Boolean.parseBoolean(t27682);
            
//#line 303 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.readallfields = t27683;
            
//#line 304 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27684 =
              p;
            
//#line 304 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27685 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.WRITE_ALL_FIELDS_PROPERTY));
            
//#line 304 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27686 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.WRITE_ALL_FIELDS_PROPERTY_DEFAULT));
            
//#line 304 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27687 =
              t27684.getProperty(((java.lang.String)(t27685)),
                                 ((java.lang.String)(t27686)));
            
//#line 304 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27688 =
              java.lang.Boolean.parseBoolean(t27687);
            
//#line 304 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.writeallfields = t27688;
            
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27689 =
              p;
            
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27690 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TRANSACTION_PHASE_INSERTS));
            
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27691 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.TRANSACTION_PHASE_INSERTS_DEFAULT));
            
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27692 =
              t27689.getProperty(((java.lang.String)(t27690)),
                                 ((java.lang.String)(t27691)));
            
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27693 =
              java.lang.Boolean.parseBoolean(t27692);
            
//#line 306 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.transactionInserts = t27693;
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27694 =
              p;
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27695 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.DB_URI));
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27696 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.DB_URI_DEFAULT));
            
//#line 308 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String URL =
              t27694.getProperty(((java.lang.String)(t27695)),
                                 ((java.lang.String)(t27696)));
            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27697 =
              p;
            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27698 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.INSERT_ORDER_PROPERTY));
            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27699 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.INSERT_ORDER_PROPERTY_DEFAULT));
            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27700 =
              t27697.getProperty(((java.lang.String)(t27698)),
                                 ((java.lang.String)(t27699)));
            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27701 =
              (t27700).compareTo("hashed");
            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27702 =
              ((int) t27701) ==
            ((int) 0);
            
//#line 310 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27702) {
                
//#line 312 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.orderedinserts = false;
            } else {
                
//#line 316 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.orderedinserts = true;
            }
            
//#line 319 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27703 =
              insertstart;
            
//#line 319 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t27704 =
              ((com.yahoo.ycsb.generator.CounterGenerator)(new com.yahoo.ycsb.generator.CounterGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$CounterGenerator$$init$S(t27703)));
            
//#line 319 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.keysequence = ((com.yahoo.ycsb.generator.CounterGenerator)(t27704));
            
//#line 320 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27705 =
              ((com.yahoo.ycsb.generator.DiscreteGenerator)(new com.yahoo.ycsb.generator.DiscreteGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$DiscreteGenerator$$init$S()));
            
//#line 320 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.operationchooser = ((com.yahoo.ycsb.generator.DiscreteGenerator)(t27705));
            
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27706 =
              readproportion;
            
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27707 =
              ((double)(int)(((int)(0))));
            
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27710 =
              ((t27706) > (((double)(t27707))));
            
//#line 321 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27710) {
                
//#line 323 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27708 =
                  ((com.yahoo.ycsb.generator.DiscreteGenerator)(operationchooser));
                
//#line 323 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27709 =
                  readproportion;
                
//#line 323 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27708.addValue((double)(t27709),
                                                                                                                                    ((java.lang.String)("READ")));
            }
            
//#line 326 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27711 =
              updateproportion;
            
//#line 326 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27712 =
              ((double)(int)(((int)(0))));
            
//#line 326 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27715 =
              ((t27711) > (((double)(t27712))));
            
//#line 326 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27715) {
                
//#line 328 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27713 =
                  ((com.yahoo.ycsb.generator.DiscreteGenerator)(operationchooser));
                
//#line 328 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27714 =
                  updateproportion;
                
//#line 328 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27713.addValue((double)(t27714),
                                                                                                                                    ((java.lang.String)("UPDATE")));
            }
            
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27716 =
              insertproportion;
            
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27717 =
              ((double)(int)(((int)(0))));
            
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27720 =
              ((t27716) > (((double)(t27717))));
            
//#line 331 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27720) {
                
//#line 333 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27718 =
                  ((com.yahoo.ycsb.generator.DiscreteGenerator)(operationchooser));
                
//#line 333 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27719 =
                  insertproportion;
                
//#line 333 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27718.addValue((double)(t27719),
                                                                                                                                    ((java.lang.String)("INSERT")));
            }
            
//#line 336 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27721 =
              scanproportion;
            
//#line 336 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27722 =
              ((double)(int)(((int)(0))));
            
//#line 336 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27725 =
              ((t27721) > (((double)(t27722))));
            
//#line 336 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27725) {
                
//#line 338 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27723 =
                  ((com.yahoo.ycsb.generator.DiscreteGenerator)(operationchooser));
                
//#line 338 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27724 =
                  scanproportion;
                
//#line 338 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27723.addValue((double)(t27724),
                                                                                                                                    ((java.lang.String)("SCAN")));
            }
            
//#line 341 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27726 =
              traverseproportion;
            
//#line 341 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27727 =
              ((double)(int)(((int)(0))));
            
//#line 341 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27730 =
              ((t27726) > (((double)(t27727))));
            
//#line 341 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27730) {
                
//#line 342 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27728 =
                  ((com.yahoo.ycsb.generator.DiscreteGenerator)(operationchooser));
                
//#line 342 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27729 =
                  traverseproportion;
                
//#line 342 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27728.addValue((double)(t27729),
                                                                                                                                    ((java.lang.String)("TRAVERSE")));
            }
            
//#line 345 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27731 =
              readmodifywriteproportion;
            
//#line 345 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27732 =
              ((double)(int)(((int)(0))));
            
//#line 345 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27735 =
              ((t27731) > (((double)(t27732))));
            
//#line 345 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27735) {
                
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27733 =
                  ((com.yahoo.ycsb.generator.DiscreteGenerator)(operationchooser));
                
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27734 =
                  readmodifywriteproportion;
                
//#line 347 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27733.addValue((double)(t27734),
                                                                                                                                    ((java.lang.String)("READMODIFYWRITE")));
            }
            
//#line 350 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27736 =
              recordcount;
            
//#line 350 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t27737 =
              ((com.yahoo.ycsb.generator.CounterGenerator)(new com.yahoo.ycsb.generator.CounterGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$CounterGenerator$$init$S(t27736)));
            
//#line 350 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.transactioninsertkeysequence = ((com.yahoo.ycsb.generator.CounterGenerator)(t27737));
            
//#line 351 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27738 =
              requestdistrib;
            
//#line 351 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27739 =
              (t27738).compareTo("uniform");
            
//#line 351 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27768 =
              ((int) t27739) ==
            ((int) 0);
            
//#line 351 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27768) {
                
//#line 353 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27740 =
                  recordcount;
                
//#line 353 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27741 =
                  ((t27740) - (((int)(1))));
                
//#line 353 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.UniformIntegerGenerator t27742 =
                  ((com.yahoo.ycsb.generator.UniformIntegerGenerator)(new com.yahoo.ycsb.generator.UniformIntegerGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$UniformIntegerGenerator$$init$S(((int)(0)),
                                                                                                                                                                                                               t27741)));
                
//#line 353 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.keychooser = ((com.yahoo.ycsb.generator.IntegerGenerator)(t27742));
            } else {
                
//#line 355 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27743 =
                  requestdistrib;
                
//#line 355 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27744 =
                  (t27743).compareTo("zipfian");
                
//#line 355 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27767 =
                  ((int) t27744) ==
                ((int) 0);
                
//#line 355 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27767) {
                    
//#line 364 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27745 =
                      p;
                    
//#line 364 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27746 =
                      ((java.lang.String)(com.yahoo.ycsb.Client.OPERATION_COUNT_PROPERTY));
                    
//#line 364 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27747 =
                      t27745.getProperty(((java.lang.String)(t27746)));
                    
//#line 364 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int opcount =
                      java.lang.Integer.parseInt(t27747);
                    
//#line 365 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27748 =
                      opcount;
                    
//#line 365 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27749 =
                      ((double)(int)(((int)(t27748))));
                    
//#line 365 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27750 =
                      insertproportion;
                    
//#line 365 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27751 =
                      ((t27749) * (((double)(t27750))));
                    
//#line 365 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final double t27752 =
                      ((t27751) * (((double)(2.0))));
                    
//#line 365 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int expectednewkeys =
                      ((int)(double)(((double)(t27752))));
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27753 =
                      recordcount;
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27754 =
                      expectednewkeys;
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27755 =
                      ((t27753) + (((int)(t27754))));
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27756 =
                      ((long)(((int)(t27755))));
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.ScrambledZipfianGenerator t27757 =
                      ((com.yahoo.ycsb.generator.ScrambledZipfianGenerator)(new com.yahoo.ycsb.generator.ScrambledZipfianGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$ScrambledZipfianGenerator$$init$S(t27756)));
                    
//#line 367 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.keychooser = ((com.yahoo.ycsb.generator.IntegerGenerator)(t27757));
                } else {
                    
//#line 369 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27758 =
                      requestdistrib;
                    
//#line 369 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27759 =
                      (t27758).compareTo("latest");
                    
//#line 369 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27766 =
                      ((int) t27759) ==
                    ((int) 0);
                    
//#line 369 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27766) {
                        
//#line 371 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t27760 =
                          ((com.yahoo.ycsb.generator.CounterGenerator)(transactioninsertkeysequence));
                        
//#line 371 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.SkewedLatestGenerator t27761 =
                          ((com.yahoo.ycsb.generator.SkewedLatestGenerator)(new com.yahoo.ycsb.generator.SkewedLatestGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$SkewedLatestGenerator$$init$S(t27760)));
                        
//#line 371 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.keychooser = ((com.yahoo.ycsb.generator.IntegerGenerator)(t27761));
                    } else {
                        
//#line 375 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27762 =
                          requestdistrib;
                        
//#line 375 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27763 =
                          (("Unknown distribution \"") + (t27762));
                        
//#line 375 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27764 =
                          ((t27763) + ("\""));
                        
//#line 375 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.WorkloadException t27765 =
                          ((com.yahoo.ycsb.WorkloadException)(new com.yahoo.ycsb.WorkloadException(t27764)));
                        
//#line 375 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
throw t27765;
                    }
                }
            }
            
//#line 378 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27769 =
              fieldcount;
            
//#line 378 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.UniformIntegerGenerator t27770 =
              ((com.yahoo.ycsb.generator.UniformIntegerGenerator)(new com.yahoo.ycsb.generator.UniformIntegerGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$UniformIntegerGenerator$$init$S(((int)(1)),
                                                                                                                                                                                                           t27769)));
            
//#line 378 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.fieldchooser = ((com.yahoo.ycsb.generator.Generator)(t27770));
            
//#line 380 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27771 =
              scanlengthdistrib;
            
//#line 380 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27772 =
              (t27771).compareTo("uniform");
            
//#line 380 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27785 =
              ((int) t27772) ==
            ((int) 0);
            
//#line 380 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27785) {
                
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27773 =
                  maxscanlength;
                
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.UniformIntegerGenerator t27774 =
                  ((com.yahoo.ycsb.generator.UniformIntegerGenerator)(new com.yahoo.ycsb.generator.UniformIntegerGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$UniformIntegerGenerator$$init$S(((int)(1)),
                                                                                                                                                                                                               t27773)));
                
//#line 382 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.scanlength = ((com.yahoo.ycsb.generator.IntegerGenerator)(t27774));
            } else {
                
//#line 384 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27775 =
                  scanlengthdistrib;
                
//#line 384 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27776 =
                  (t27775).compareTo("zipfian");
                
//#line 384 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27784 =
                  ((int) t27776) ==
                ((int) 0);
                
//#line 384 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27784) {
                    
//#line 386 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27777 =
                      maxscanlength;
                    
//#line 386 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27778 =
                      ((long)(((int)(t27777))));
                    
//#line 386 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.ZipfianGenerator t27779 =
                      ((com.yahoo.ycsb.generator.ZipfianGenerator)(new com.yahoo.ycsb.generator.ZipfianGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$ZipfianGenerator$$init$S(((long)(1L)),
                                                                                                                                                                                              t27778)));
                    
//#line 386 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.scanlength = ((com.yahoo.ycsb.generator.IntegerGenerator)(t27779));
                } else {
                    
//#line 390 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27780 =
                      scanlengthdistrib;
                    
//#line 390 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27781 =
                      (("Distribution \"") + (t27780));
                    
//#line 390 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27782 =
                      ((t27781) + ("\" not allowed for scan length"));
                    
//#line 390 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.WorkloadException t27783 =
                      ((com.yahoo.ycsb.WorkloadException)(new com.yahoo.ycsb.WorkloadException(t27782)));
                    
//#line 390 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
throw t27783;
                }
            }
            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27786 =
              traverselengthdistrib;
            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27787 =
              (t27786).compareTo("uniform");
            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27800 =
              ((int) t27787) ==
            ((int) 0);
            
//#line 393 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27800) {
                
//#line 395 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27788 =
                  maxscanlength;
                
//#line 395 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.UniformIntegerGenerator t27789 =
                  ((com.yahoo.ycsb.generator.UniformIntegerGenerator)(new com.yahoo.ycsb.generator.UniformIntegerGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$UniformIntegerGenerator$$init$S(((int)(1)),
                                                                                                                                                                                                               t27788)));
                
//#line 395 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.traverselength = ((com.yahoo.ycsb.generator.IntegerGenerator)(t27789));
            } else {
                
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27790 =
                  traverselengthdistrib;
                
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27791 =
                  (t27790).compareTo("zipfian");
                
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27799 =
                  ((int) t27791) ==
                ((int) 0);
                
//#line 397 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27799) {
                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27792 =
                      maxscanlength;
                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27793 =
                      ((long)(((int)(t27792))));
                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.ZipfianGenerator t27794 =
                      ((com.yahoo.ycsb.generator.ZipfianGenerator)(new com.yahoo.ycsb.generator.ZipfianGenerator((java.lang.System[]) null).com$yahoo$ycsb$generator$ZipfianGenerator$$init$S(((long)(1L)),
                                                                                                                                                                                              t27793)));
                    
//#line 399 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.traverselength = ((com.yahoo.ycsb.generator.IntegerGenerator)(t27794));
                } else {
                    
//#line 403 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27795 =
                      scanlengthdistrib;
                    
//#line 403 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27796 =
                      (("Distribution \"") + (t27795));
                    
//#line 403 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27797 =
                      ((t27796) + ("\" not allowed for traverse length"));
                    
//#line 403 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.WorkloadException t27798 =
                      ((com.yahoo.ycsb.WorkloadException)(new com.yahoo.ycsb.WorkloadException(t27797)));
                    
//#line 403 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
throw t27798;
                }
            }
            
//#line 412 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27801 =
              p;
            
//#line 412 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27802 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.AFFINITY_MATRIX));
            
//#line 412 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27803 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.AFFINITY_MATRIX_DEFAULT));
            
//#line 412 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String aff =
              t27801.getProperty(((java.lang.String)(t27802)),
                                 ((java.lang.String)(t27803)));
            
//#line 414 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27806 =
              aff;
            
//#line 414 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27804 =
              aff;
            
//#line 414 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27805 =
              (t27804).length();
            
//#line 414 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27807 =
              ((t27805) - (((int)(1))));
            
//#line 414 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27808 =
              (t27806).substring(((int)(1)), ((int)(t27807)));
            
//#line 414 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
aff = t27808;
            
//#line 415 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27809 =
              aff;
            
//#line 415 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
x10.array.Array iterm =
              x10.lang.StringHelper.split(",", t27809);
            
//#line 416 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.array.Array t27810 =
              iterm;
            
//#line 416 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27811 =
              ((x10.array.Array<java.lang.String>)t27810).
                size;
            
//#line 416 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
x10.array.Array param =
              new x10.array.Array<x10.core.Float>((java.lang.System[]) null, x10.rtt.Types.FLOAT).x10$array$Array$$init$S(t27811);
            
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27531min28066 =
              0;
            
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.array.Array t28067 =
              param;
            
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28068 =
              ((x10.array.Array<x10.core.Float>)t28067).
                size;
            
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27531max28069 =
              ((t28068) - (((int)(1))));
            
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int i28063 =
              i27531min28066;
            
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
for (;
                                                                                                                     true;
                                                                                                                     ) {
                
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28064 =
                  i28063;
                
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28065 =
                  ((t28064) <= (((int)(i27531max28069))));
                
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (!(t28065)) {
                    
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
break;
                }
                
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i28060 =
                  i28063;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.array.Array p$28051 =
                  ((x10.array.Array)(param));
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int p$28052 =
                  i28060;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.array.Array p$28053 =
                  ((x10.array.Array)(iterm));
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int p$28054 =
                  i28060;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String ret28055 =
                   null;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.array.Array x$28034 =
                  p$28053;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int x$i28035 =
                  p$28054;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28036 =
                  ((x10.array.Array<java.lang.String>)x$28034).
                    rank;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28037 =
                  ((int) t28036) ==
                ((int) 1);
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28038 =
                  !(t28037);
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t28038) {
                    
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28039 =
                      true;
                    
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t28039) {
                        
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.lang.FailedDynamicCheckException t28040 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
throw t28040;
                    }
                }
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28041 =
                  ((x10.array.Array<java.lang.String>)x$28034).$apply$G((int)(x$i28035));
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
ret28055 = t28041;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28056 =
                  ret28055;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28057 =
                  (t28056).trim();
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final float p$28058 =
                  java.lang.Float.parseFloat(t28057);
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
float ret28059 =
                   0;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.array.Array x$28042 =
                  p$28051;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int x$i28043 =
                  p$28052;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final float x$v28044 =
                  p$28058;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28045 =
                  ((x10.array.Array<x10.core.Float>)x$28042).
                    rank;
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28046 =
                  ((int) t28045) ==
                ((int) 1);
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28047 =
                  !(t28046);
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t28047) {
                    
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28048 =
                      true;
                    
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t28048) {
                        
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.lang.FailedDynamicCheckException t28049 =
                          ((x10.lang.FailedDynamicCheckException)(new x10.lang.FailedDynamicCheckException(((java.lang.String)("!(x$0.rank == 1)")))));
                        
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
throw t28049;
                    }
                }
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final float t28050 =
                  x10.core.Float.$unbox(((x10.array.Array<x10.core.Float>)x$28042).$set__1x10$array$Array$$T$G((int)(x$i28043),
                                                                                                               x10.core.Float.$box(x$v28044)));
                
//#line 419 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
ret28059 = t28050;
                
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28061 =
                  i28063;
                
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28062 =
                  ((t28061) + (((int)(1))));
                
//#line 418 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
i28063 = t28062;
            }
            
//#line 422 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Properties t27833 =
              p;
            
//#line 422 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27834 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.THETA_THRESHOLD));
            
//#line 422 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27835 =
              ((java.lang.String)(org.xgdbench.workloads.MAGWorkload.THETA_THRESHOLD_DEFAULT));
            
//#line 422 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String thetaThreash =
              t27833.getProperty(((java.lang.String)(t27834)),
                                 ((java.lang.String)(t27835)));
            
//#line 424 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27836 =
              thetaThreash;
            
//#line 424 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final float t27837 =
              java.lang.Float.parseFloat(t27836);
            
//#line 424 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.thetaThreshold = t27837;
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27838 =
              fieldcount;
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27839 =
              recordcount;
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.array.Array t27840 =
              param;
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final float t27841 =
              thetaThreshold;
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27842 =
              randomField;
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27843 =
              generatorThreadCount;
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final org.xgdbench.generator.MAGGenerator t27844 =
              ((org.xgdbench.generator.MAGGenerator)(new org.xgdbench.generator.MAGGenerator((java.lang.System[]) null).org$xgdbench$generator$MAGGenerator$$init$S(t27838,
                                                                                                                                                                    t27839,
                                                                                                                                                                    t27840,
                                                                                                                                                                    t27841,
                                                                                                                                                                    t27842,
                                                                                                                                                                    t27843, (org.xgdbench.generator.MAGGenerator.__2$1x10$lang$Float$2) null)));
            
//#line 426 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.generator = ((org.xgdbench.generator.MAGGenerator)(t27844));
            
//#line 427 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final org.xgdbench.generator.MAGGenerator t27845 =
              ((org.xgdbench.generator.MAGGenerator)(generator));
            
//#line 427 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27846 =
              t27845.getEntityCount$O();
            
//#line 427 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27847 =
              ((int)(long)(((long)(t27846))));
            
//#line 427 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.recordcount = t27847;
            
//#line 428 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final org.xgdbench.generator.MAGGenerator t27848 =
              ((org.xgdbench.generator.MAGGenerator)(generator));
            
//#line 428 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27849 =
              t27848.getEdgeCount$O();
            
//#line 428 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27850 =
              t27849;
            
//#line 428 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.edgecount = t27850;
        }
        
        
//#line 432 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean
                                                                                                              doInsert$O(
                                                                                                              com.yahoo.ycsb.DB db,
                                                                                                              java.lang.Object threadstate){
            
//#line 433 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String nodeRelationshipStr =
              null;
            
//#line 434 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.io.Printer t27851 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 434 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27851.println(((java.lang.Object)("AAAAAAAAAAAA")));
            
//#line 438 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final org.xgdbench.generator.MAGGenerator t27852 =
              ((org.xgdbench.generator.MAGGenerator)(generator));
            
//#line 438 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27853 =
              t27852.nextString();
            
//#line 438 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
nodeRelationshipStr = t27853;
            
//#line 441 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.io.Printer t27855 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 441 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27854 =
              nodeRelationshipStr;
            
//#line 441 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27856 =
              (("BBBBB : ") + (t27854));
            
//#line 441 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27855.println(((java.lang.Object)(t27856)));
            
//#line 443 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27857 =
              nodeRelationshipStr;
            
//#line 443 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27858 =
              (t27857).equals("");
            
//#line 443 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27858) {
                
//#line 444 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return false;
            }
            
//#line 447 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.io.Printer t27859 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 447 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27859.println(((java.lang.Object)("CCCC")));
            
//#line 449 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27860 =
              db;
            
//#line 449 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27861 =
              nodeRelationshipStr;
            
//#line 449 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int retval =
              t27860.insert__2$1x10$lang$String$3x10$lang$String$2$O(((java.lang.String)(t27861)),
                                                                     ((java.lang.String)(null)),
                                                                     ((x10.util.HashMap)(null)));
            
//#line 451 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.io.Printer t27862 =
              ((x10.io.Printer)(x10.io.Console.get$OUT()));
            
//#line 451 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27862.println(((java.lang.Object)("dddd")));
            
//#line 453 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27863 =
              retval;
            
//#line 453 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
boolean t27865 =
              ((int) t27863) ==
            ((int) 0);
            
//#line 453 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (!(t27865)) {
                
//#line 453 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27864 =
                  retval;
                
//#line 453 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27865 = ((int) t27864) ==
                ((int) -1);
            }
            
//#line 453 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27866 =
              t27865;
            
//#line 453 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27866) {
                
//#line 454 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return true;
            } else {
                
//#line 456 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return false;
            }
        }
        
        
//#line 460 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean
                                                                                                              doInsertEdge$O(
                                                                                                              com.yahoo.ycsb.DB db,
                                                                                                              java.lang.Object threadstate){
            
//#line 461 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String edgeRelationshipStr =
              null;
            
//#line 465 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final org.xgdbench.generator.MAGGenerator t27867 =
              ((org.xgdbench.generator.MAGGenerator)(generator));
            
//#line 465 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27868 =
              t27867.nextEdgeString();
            
//#line 465 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
edgeRelationshipStr = t27868;
            
//#line 468 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27869 =
              db;
            
//#line 468 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27870 =
              edgeRelationshipStr;
            
//#line 468 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27871 =
              t27869.insertEdge__2$1x10$lang$String$3x10$lang$String$2$O(((java.lang.String)(t27870)),
                                                                         ((java.lang.String)(null)),
                                                                         ((x10.util.HashMap)(null)));
            
//#line 468 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27872 =
              ((int) t27871) ==
            ((int) 0);
            
//#line 468 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27872) {
                
//#line 469 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return true;
            } else {
                
//#line 471 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return false;
            }
        }
        
        
//#line 481 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean
                                                                                                              doTransaction$O(
                                                                                                              com.yahoo.ycsb.DB db,
                                                                                                              java.lang.Object threadstate){
            
//#line 483 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.DiscreteGenerator t27873 =
              ((com.yahoo.ycsb.generator.DiscreteGenerator)(operationchooser));
            
//#line 483 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String op =
              t27873.nextString();
            
//#line 485 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27874 =
              op;
            
//#line 485 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27875 =
              (t27874).compareTo("READ");
            
//#line 485 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27894 =
              ((int) t27875) ==
            ((int) 0);
            
//#line 485 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27894) {
                
//#line 487 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27876 =
                  db;
                
//#line 487 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.doTransactionRead(((com.yahoo.ycsb.DB)(t27876)));
            } else {
                
//#line 489 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27877 =
                  op;
                
//#line 489 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27878 =
                  (t27877).compareTo("UPDATE");
                
//#line 489 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27893 =
                  ((int) t27878) ==
                ((int) 0);
                
//#line 489 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27893) {
                    
//#line 491 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27879 =
                      db;
                    
//#line 491 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.doTransactionUpdate(((com.yahoo.ycsb.DB)(t27879)));
                } else {
                    
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27880 =
                      op;
                    
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27881 =
                      (t27880).compareTo("INSERT");
                    
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27892 =
                      ((int) t27881) ==
                    ((int) 0);
                    
//#line 493 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27892) {
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27882 =
                          db;
                        
//#line 496 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.doTransactionInsert(((com.yahoo.ycsb.DB)(t27882)));
                    } else {
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27883 =
                          op;
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27884 =
                          (t27883).compareTo("SCAN");
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27891 =
                          ((int) t27884) ==
                        ((int) 0);
                        
//#line 498 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27891) {
                            
//#line 500 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27885 =
                              db;
                            
//#line 500 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.doTransactionScan(((com.yahoo.ycsb.DB)(t27885)));
                        } else {
                            
//#line 502 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27886 =
                              op;
                            
//#line 502 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27887 =
                              (t27886).compareTo("TRAVERSE");
                            
//#line 502 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27890 =
                              ((int) t27887) ==
                            ((int) 0);
                            
//#line 502 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27890) {
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27888 =
                                  db;
                                
//#line 504 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.doTransactionTraverse(((com.yahoo.ycsb.DB)(t27888)));
                            } else {
                                
//#line 508 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27889 =
                                  db;
                                
//#line 508 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.doTransactionReadModifyWrite(((com.yahoo.ycsb.DB)(t27889)));
                            }
                        }
                    }
                }
            }
            
//#line 511 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return true;
        }
        
        
//#line 518 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
private int
                                                                                                              getRandomChoice$O(
                                                                                                              ){
            
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.util.Random t27895 =
              ((java.util.Random)(randUserChoice));
            
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27896 =
              t27895.nextBoolean();
            
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int t27897 =
               0;
            
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27896) {
                
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27897 = 1;
            } else {
                
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27897 = 0;
            }
            
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27898 =
              t27897;
            
//#line 519 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return t27898;
        }
        
        public static int
          getRandomChoice$P$O(
          final org.xgdbench.workloads.MAGWorkload MAGWorkload){
            return MAGWorkload.getRandomChoice$O();
        }
        
        
//#line 522 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              doTransactionRead(
                                                                                                              com.yahoo.ycsb.DB db){
            
//#line 525 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int keynum =
               0;
            
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
boolean t28083 =
              false;
            
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
do  {
                
//#line 529 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.IntegerGenerator t28070 =
                  ((com.yahoo.ycsb.generator.IntegerGenerator)(keychooser));
                
//#line 529 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28071 =
                  t28070.nextInt$O();
                
//#line 529 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
keynum = t28071;
                
//#line 531 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28084 =
                  keynum;
                
//#line 531 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t28085 =
                  ((com.yahoo.ycsb.generator.CounterGenerator)(transactioninsertkeysequence));
                
//#line 531 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28086 =
                  t28085.lastInt$O();
                
//#line 531 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28087 =
                  ((t28084) > (((int)(t28086))));
                
//#line 527 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28083 = t28087;
            }while(t28083); 
            
//#line 542 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27906 =
              keynum;
            
//#line 542 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String keyname =
              (("") + ((x10.core.Int.$box(t27906))));
            
//#line 544 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
x10.util.HashSet fields =
              null;
            
//#line 546 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27907 =
              readallfields;
            
//#line 546 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27922 =
              !(t27907);
            
//#line 546 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27922) {
                
//#line 549 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.Generator t27908 =
                  ((com.yahoo.ycsb.generator.Generator)(fieldchooser));
                
//#line 549 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27909 =
                  t27908.nextString();
                
//#line 549 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String fieldname =
                  (("attrib") + (t27909));
                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27910 =
                  ((x10.util.HashSet)(new x10.util.HashSet<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$HashSet$$init$S()));
                
//#line 553 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
fields = t27910;
                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27911 =
                  fields;
                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27912 =
                  fieldname;
                
//#line 554 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
((x10.util.MapSet<java.lang.String>)t27911).add__0x10$util$MapSet$$T$O(((java.lang.String)(t27912)));
            } else {
                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27913 =
                  ((x10.util.HashSet)(new x10.util.HashSet<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$HashSet$$init$S()));
                
//#line 556 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
fields = t27913;
                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27547min28080 =
                  1;
                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28081 =
                  fieldcount;
                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27547max28082 =
                  ((t28081) - (((int)(1))));
                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int i28077 =
                  i27547min28080;
                
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28078 =
                      i28077;
                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28079 =
                      ((t28078) <= (((int)(i27547max28082))));
                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (!(t28079)) {
                        
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
break;
                    }
                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i28074 =
                      i28077;
                    
//#line 559 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t28072 =
                      fields;
                    
//#line 559 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28073 =
                      (("attrib") + ((x10.core.Int.$box(i28074))));
                    
//#line 559 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
((x10.util.MapSet<java.lang.String>)t28072).add__0x10$util$MapSet$$T$O(((java.lang.String)(t28073)));
                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28075 =
                      i28077;
                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28076 =
                      ((t28075) + (((int)(1))));
                    
//#line 557 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
i28077 = t28076;
                }
            }
            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27923 =
              db;
            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27924 =
              ((java.lang.String)(table));
            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27925 =
              keyname;
            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27926 =
              fields;
            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashMap t27927 =
              ((x10.util.HashMap)(new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S()));
            
//#line 563 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27923.read__2$1x10$lang$String$2__3$1x10$lang$String$3x10$lang$String$2$O(((java.lang.String)(t27924)),
                                                                                                                                                                                           ((java.lang.String)(t27925)),
                                                                                                                                                                                           ((x10.util.Set)(t27926)),
                                                                                                                                                                                           ((x10.util.HashMap)(t27927)));
        }
        
        
//#line 566 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              doTransactionReadModifyWrite(
                                                                                                              com.yahoo.ycsb.DB db){
            
//#line 570 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int keynum =
               0;
            
//#line 572 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
boolean t28113 =
              false;
            
//#line 572 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
do  {
                
//#line 574 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.IntegerGenerator t28088 =
                  ((com.yahoo.ycsb.generator.IntegerGenerator)(keychooser));
                
//#line 574 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28089 =
                  t28088.nextInt$O();
                
//#line 574 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
keynum = t28089;
                
//#line 576 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28114 =
                  keynum;
                
//#line 576 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t28115 =
                  ((com.yahoo.ycsb.generator.CounterGenerator)(transactioninsertkeysequence));
                
//#line 576 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28116 =
                  t28115.lastInt$O();
                
//#line 576 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28117 =
                  ((t28114) > (((int)(t28116))));
                
//#line 572 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28113 = t28117;
            }while(t28113); 
            
//#line 583 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27935 =
              keynum;
            
//#line 583 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String keyname =
              (("") + ((x10.core.Int.$box(t27935))));
            
//#line 585 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
x10.util.HashSet fields =
              null;
            
//#line 587 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27936 =
              readallfields;
            
//#line 587 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27951 =
              !(t27936);
            
//#line 587 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27951) {
                
//#line 590 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.Generator t27937 =
                  ((com.yahoo.ycsb.generator.Generator)(fieldchooser));
                
//#line 590 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27938 =
                  t27937.nextString();
                
//#line 590 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String fieldname =
                  (("attrib") + (t27938));
                
//#line 594 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27939 =
                  ((x10.util.HashSet)(new x10.util.HashSet<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$HashSet$$init$S()));
                
//#line 594 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
fields = t27939;
                
//#line 595 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27940 =
                  fields;
                
//#line 595 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27941 =
                  fieldname;
                
//#line 595 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
((x10.util.MapSet<java.lang.String>)t27940).add__0x10$util$MapSet$$T$O(((java.lang.String)(t27941)));
            } else {
                
//#line 597 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27942 =
                  ((x10.util.HashSet)(new x10.util.HashSet<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$HashSet$$init$S()));
                
//#line 597 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
fields = t27942;
                
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27563min28098 =
                  1;
                
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28099 =
                  fieldcount;
                
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27563max28100 =
                  ((t28099) - (((int)(1))));
                
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int i28095 =
                  i27563min28098;
                
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28096 =
                      i28095;
                    
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28097 =
                      ((t28096) <= (((int)(i27563max28100))));
                    
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (!(t28097)) {
                        
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
break;
                    }
                    
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i28092 =
                      i28095;
                    
//#line 600 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t28090 =
                      fields;
                    
//#line 600 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28091 =
                      (("attrib") + ((x10.core.Int.$box(i28092))));
                    
//#line 600 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
((x10.util.MapSet<java.lang.String>)t28090).add__0x10$util$MapSet$$T$O(((java.lang.String)(t28091)));
                    
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28093 =
                      i28095;
                    
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28094 =
                      ((t28093) + (((int)(1))));
                    
//#line 598 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
i28095 = t28094;
                }
            }
            
//#line 619 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
x10.util.HashMap values =
              new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
            
//#line 621 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t27968 =
              writeallfields;
            
//#line 621 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t27968) {
                
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27579min27580 =
                  1;
                
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27952 =
                  fieldcount;
                
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i27579max27581 =
                  ((t27952) - (((int)(1))));
                
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int i28110 =
                  i27579min27580;
                
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
for (;
                                                                                                                         true;
                                                                                                                         ) {
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28111 =
                      i28110;
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28112 =
                      ((t28111) <= (((int)(i27579max27581))));
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (!(t28112)) {
                        
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
break;
                    }
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int i28107 =
                      i28110;
                    
//#line 626 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String fieldname28101 =
                      (("attrib") + ((x10.core.Int.$box(i28107))));
                    
//#line 627 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28102 =
                      this.getRandomChoice$O();
                    
//#line 627 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String data28103 =
                      (("") + ((x10.core.Int.$box(t28102))));
                    
//#line 628 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashMap t28104 =
                      values;
                    
//#line 628 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28105 =
                      fieldname28101;
                    
//#line 628 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28106 =
                      data28103;
                    
//#line 628 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t28104).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t28105)),
                                                                                                                                                                                                                                       ((java.lang.String)(t28106)));
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28108 =
                      i28110;
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28109 =
                      ((t28108) + (((int)(1))));
                    
//#line 624 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
i28110 = t28109;
                }
            } else {
                
//#line 634 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.Generator t27962 =
                  ((com.yahoo.ycsb.generator.Generator)(fieldchooser));
                
//#line 634 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27963 =
                  t27962.nextString();
                
//#line 634 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String fieldname =
                  (("attrib") + (t27963));
                
//#line 635 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27964 =
                  this.getRandomChoice$O();
                
//#line 635 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String data =
                  (("") + ((x10.core.Int.$box(t27964))));
                
//#line 636 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashMap t27965 =
                  values;
                
//#line 636 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27966 =
                  fieldname;
                
//#line 636 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27967 =
                  data;
                
//#line 636 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
((x10.util.HashMap<java.lang.String, java.lang.String>)t27965).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.String)(t27966)),
                                                                                                                                                                                                                                   ((java.lang.String)(t27967)));
            }
            
//#line 659 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
long st =
              x10.lang.System.currentTimeMillis$O();
            
//#line 661 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27969 =
              db;
            
//#line 661 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27970 =
              ((java.lang.String)(table));
            
//#line 661 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27971 =
              keyname;
            
//#line 661 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27972 =
              fields;
            
//#line 661 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashMap t27973 =
              ((x10.util.HashMap)(new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S()));
            
//#line 661 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27969.read__2$1x10$lang$String$2__3$1x10$lang$String$3x10$lang$String$2$O(((java.lang.String)(t27970)),
                                                                                                                                                                                           ((java.lang.String)(t27971)),
                                                                                                                                                                                           ((x10.util.Set)(t27972)),
                                                                                                                                                                                           ((x10.util.HashMap)(t27973)));
            
//#line 663 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27974 =
              db;
            
//#line 663 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27975 =
              ((java.lang.String)(table));
            
//#line 663 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27976 =
              keyname;
            
//#line 663 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashMap t27977 =
              values;
            
//#line 663 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27974.update__2$1x10$lang$String$3x10$lang$String$2$O(((java.lang.String)(t27975)),
                                                                                                                                                                       ((java.lang.String)(t27976)),
                                                                                                                                                                       ((x10.util.HashMap)(t27977)));
            
//#line 665 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
long en =
              x10.lang.System.currentTimeMillis$O();
            
//#line 667 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.measurements.Measurements t27981 =
              com.yahoo.ycsb.measurements.Measurements.getMeasurements();
            
//#line 667 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27978 =
              en;
            
//#line 667 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27979 =
              st;
            
//#line 667 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final long t27980 =
              ((t27978) - (((long)(t27979))));
            
//#line 667 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27982 =
              ((int)(long)(((long)(t27980))));
            
//#line 667 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27981.measure(((java.lang.String)("READ-MODIFY-WRITE")),
                                                                                                                               (int)(t27982));
        }
        
        
//#line 670 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              doTransactionScan(
                                                                                                              com.yahoo.ycsb.DB db){
            
//#line 673 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int keynum =
               0;
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
boolean t28120 =
              false;
            
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
do  {
                
//#line 677 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.IntegerGenerator t28118 =
                  ((com.yahoo.ycsb.generator.IntegerGenerator)(keychooser));
                
//#line 677 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28119 =
                  t28118.nextInt$O();
                
//#line 677 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
keynum = t28119;
                
//#line 679 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28121 =
                  keynum;
                
//#line 679 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t28122 =
                  ((com.yahoo.ycsb.generator.CounterGenerator)(transactioninsertkeysequence));
                
//#line 679 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28123 =
                  t28122.lastInt$O();
                
//#line 679 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28124 =
                  ((t28121) > (((int)(t28123))));
                
//#line 675 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28120 = t28124;
            }while(t28120); 
            
//#line 686 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27990 =
              keynum;
            
//#line 686 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String startkeyname =
              (("") + ((x10.core.Int.$box(t27990))));
            
//#line 688 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int len =
              -1;
            
//#line 690 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
x10.util.HashSet fields =
              null;
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t27991 =
              db;
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27992 =
              ((java.lang.String)(table));
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t27993 =
              startkeyname;
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t27994 =
              len;
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashSet t27995 =
              fields;
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.ArrayList t27996 =
              ((x10.util.ArrayList)(new x10.util.ArrayList<x10.util.HashMap<java.lang.String, java.lang.String>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.Types.STRING, x10.rtt.Types.STRING)).x10$util$ArrayList$$init$S()));
            
//#line 706 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t27991.scan__3$1x10$lang$String$2__4$1x10$util$HashMap$1x10$lang$String$3x10$lang$String$2$2$O(((java.lang.String)(t27992)),
                                                                                                                                                                                                               ((java.lang.String)(t27993)),
                                                                                                                                                                                                               (int)(t27994),
                                                                                                                                                                                                               ((x10.util.Set)(t27995)),
                                                                                                                                                                                                               ((x10.util.ArrayList)(t27996)));
        }
        
        
//#line 709 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              doTransactionTraverse(
                                                                                                              com.yahoo.ycsb.DB db){
            
//#line 712 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int keynum =
               0;
            
//#line 713 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
boolean t28127 =
              false;
            
//#line 713 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
do  {
                
//#line 715 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.IntegerGenerator t28125 =
                  ((com.yahoo.ycsb.generator.IntegerGenerator)(keychooser));
                
//#line 715 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28126 =
                  t28125.nextInt$O();
                
//#line 715 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
keynum = t28126;
                
//#line 717 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28128 =
                  keynum;
                
//#line 717 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t28129 =
                  ((com.yahoo.ycsb.generator.CounterGenerator)(transactioninsertkeysequence));
                
//#line 717 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28130 =
                  t28129.lastInt$O();
                
//#line 717 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28131 =
                  ((t28128) > (((int)(t28130))));
                
//#line 713 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28127 = t28131;
            }while(t28127); 
            
//#line 719 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28004 =
              keynum;
            
//#line 719 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String startkeyname =
              (("") + ((x10.core.Int.$box(t28004))));
            
//#line 721 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int len =
              2;
            
//#line 723 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t28005 =
              db;
            
//#line 723 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28006 =
              startkeyname;
            
//#line 723 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28007 =
              len;
            
//#line 723 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.ArrayList t28008 =
              ((x10.util.ArrayList)(new x10.util.ArrayList<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING).x10$util$ArrayList$$init$S()));
            
//#line 723 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28005.traverse__2$1x10$lang$String$2$O(((java.lang.String)(t28006)),
                                                                                                                                                        (int)(t28007),
                                                                                                                                                        ((x10.util.ArrayList)(t28008)));
        }
        
        
//#line 726 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              doTransactionUpdate(
                                                                                                              com.yahoo.ycsb.DB db){
            
//#line 730 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int keynum =
               0;
            
//#line 732 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
boolean t28134 =
              false;
            
//#line 732 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
do  {
                
//#line 734 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.IntegerGenerator t28132 =
                  ((com.yahoo.ycsb.generator.IntegerGenerator)(keychooser));
                
//#line 734 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28133 =
                  t28132.nextInt$O();
                
//#line 734 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
keynum = t28133;
                
//#line 736 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28135 =
                  keynum;
                
//#line 736 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.generator.CounterGenerator t28136 =
                  ((com.yahoo.ycsb.generator.CounterGenerator)(transactioninsertkeysequence));
                
//#line 736 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28137 =
                  t28136.lastInt$O();
                
//#line 736 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28138 =
                  ((t28135) > (((int)(t28137))));
                
//#line 732 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28134 = t28138;
            }while(t28134); 
            
//#line 738 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28016 =
              keynum;
            
//#line 738 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String keyname =
              (("") + ((x10.core.Int.$box(t28016))));
            
//#line 740 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
x10.util.HashMap values =
              new x10.util.HashMap<java.lang.String, java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING, x10.rtt.Types.STRING).x10$util$HashMap$$init$S();
            
//#line 763 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t28017 =
              db;
            
//#line 763 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28018 =
              ((java.lang.String)(table));
            
//#line 763 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28019 =
              keyname;
            
//#line 763 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final x10.util.HashMap t28020 =
              values;
            
//#line 763 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28017.update__2$1x10$lang$String$3x10$lang$String$2$O(((java.lang.String)(t28018)),
                                                                                                                                                                       ((java.lang.String)(t28019)),
                                                                                                                                                                       ((x10.util.HashMap)(t28020)));
        }
        
        
//#line 766 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              doTransactionInsert(
                                                                                                              com.yahoo.ycsb.DB db){
            
//#line 785 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
java.lang.String nodeRelationshipStr =
              "transact-insert";
            
//#line 787 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t28021 =
              db;
            
//#line 787 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28022 =
              nodeRelationshipStr;
            
//#line 787 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28021.insert__2$1x10$lang$String$3x10$lang$String$2$O(((java.lang.String)(t28022)),
                                                                                                                                                                       ((java.lang.String)(null)),
                                                                                                                                                                       ((x10.util.HashMap)(null)));
        }
        
        
//#line 790 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public boolean
                                                                                                              hasEdges$O(
                                                                                                              ){
            
//#line 791 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final org.xgdbench.generator.MAGGenerator t28023 =
              ((org.xgdbench.generator.MAGGenerator)(generator));
            
//#line 791 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28024 =
              t28023.gotNextEdge$O();
            
//#line 791 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return t28024;
        }
        
        
//#line 794 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public void
                                                                                                              releaseEdges(
                                                                                                              com.yahoo.ycsb.DB db){
            
//#line 795 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
int counter =
              0;
            
//#line 796 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
while (true) {
                
//#line 796 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28028 =
                  this.hasEdges$O();
                
//#line 796 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (!(t28028)) {
                    
//#line 796 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
break;
                }
                
//#line 797 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final com.yahoo.ycsb.DB t28139 =
                  db;
                
//#line 797 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.doInsertEdge$O(((com.yahoo.ycsb.DB)(t28139)),
                                                                                                                                        ((java.lang.Object)(null)));
                
//#line 798 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28140 =
                  counter;
                
//#line 798 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28141 =
                  ((t28140) + (((int)(1))));
                
//#line 798 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
counter = t28141;
            }
            
//#line 801 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28029 =
              counter;
            
//#line 801 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final boolean t28032 =
              ((int) t28029) ==
            ((int) 0);
            
//#line 801 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
if (t28032) {
                
//#line 803 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final java.lang.String t28030 =
                  ((java.lang.String)(org.xgdbench.util.Conts.XGDBENCH_LOGGER_NAME));
                
//#line 803 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final org.apache.log4j.Logger t28031 =
                  org.apache.log4j.Logger.getLogger(((java.lang.String)(t28030)));
                
//#line 803 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
t28031.info(((java.lang.Object)("No edges released.")));
            }
        }
        
        
//#line 808 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
public int
                                                                                                              getEdgeCount$O(
                                                                                                              ){
            
//#line 809 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final int t28033 =
              edgecount;
            
//#line 809 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return t28033;
        }
        
        
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public org.xgdbench.workloads.MAGWorkload
                                                                                                             org$xgdbench$workloads$MAGWorkload$$this$org$xgdbench$workloads$MAGWorkload(
                                                                                                             ){
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
return org.xgdbench.workloads.MAGWorkload.this;
        }
        
        
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
final public void
                                                                                                             __fieldInitializers26914(
                                                                                                             ){
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.generator = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.table = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.fieldcount = 0;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.randomField = 0;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.generatorThreadCount = 0;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.fieldlength = 0;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.readallfields = false;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.writeallfields = false;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.transactionInserts = false;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.affinityMatrix = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.thetaThreshold = 0.1F;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.edgecount = 0;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.keysequence = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.operationchooser = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.keychooser = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.fieldchooser = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.transactioninsertkeysequence = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.scanlength = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.traverselength = null;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.orderedinserts = false;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.recordcount = 0;
            
//#line 32 "/nfs/home/miyuru/workspace-x10-2/XGDBench/src/org/xgdbench/workloads/MAGWorkload.x10"
this.randUserChoice = null;
        }
        
        public static java.lang.String
          get$DB_URI_DEFAULT(
          ){
            return org.xgdbench.workloads.MAGWorkload.DB_URI_DEFAULT;
        }
    
}

